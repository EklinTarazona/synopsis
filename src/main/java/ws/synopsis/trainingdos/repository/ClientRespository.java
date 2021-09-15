package ws.synopsis.trainingdos.repository;

import ws.synopsis.trainingdos.exception.TrainingException;
import ws.synopsis.trainingdos.model.Client;

import java.util.List;

public interface ClientRespository {

    public void add(Client client) throws TrainingException;
    public void edit(Client client) throws TrainingException;
    public void remove(Long clientId);
    public List<Client> list();

}
