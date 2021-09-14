package ws.synopsis.trainingdos.service;

import ws.synopsis.trainingdos.exception.ClientExistException;
import ws.synopsis.trainingdos.exception.ClientNotExistException;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.request.ClientDelRequest;
import ws.synopsis.trainingdos.request.ClientRequest;
import ws.synopsis.trainingdos.response.IndexResponse;

import java.util.List;

public interface ClientService {

    public void add(ClientRequest client) throws ClientExistException;
    public void edit(ClientRequest client) throws ClientNotExistException;
    public void remove(ClientDelRequest clientId);
    public List<Client> list();

}
