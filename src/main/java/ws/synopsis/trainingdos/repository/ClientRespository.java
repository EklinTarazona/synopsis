package ws.synopsis.trainingdos.repository;

import org.springframework.stereotype.Component;
import ws.synopsis.trainingdos.exception.ClientExistException;
import ws.synopsis.trainingdos.exception.ClientNotExistException;
import ws.synopsis.trainingdos.model.Client;

import java.util.List;

public interface ClientRespository {

    public void add(Client client) throws ClientExistException;
    public void edit(Client client) throws ClientNotExistException;
    public void remove(Long clientId);
    public List<Client> list();

}
