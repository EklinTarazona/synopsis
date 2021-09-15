package ws.synopsis.trainingdos.service;

import ws.synopsis.trainingdos.exception.TrainingException;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.request.ClientDelRequest;
import ws.synopsis.trainingdos.request.ClientRequest;

import java.util.List;

public interface ClientService {

    public void add(ClientRequest client) throws TrainingException;
    public void edit(ClientRequest client) throws TrainingException;
    public void remove(ClientDelRequest clientId);
    public List<Client> list();

}
