package ws.synopsis.trainingdos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.synopsis.trainingdos.converter.ClientRequestToModel;
import ws.synopsis.trainingdos.exception.ClientExistException;
import ws.synopsis.trainingdos.exception.ClientNotExistException;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.repository.ClientRespository;
import ws.synopsis.trainingdos.request.ClientDelRequest;
import ws.synopsis.trainingdos.request.ClientRequest;
import ws.synopsis.trainingdos.service.ClientService;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRespository repository;

    @Autowired
    private ClientRequestToModel clientRequestConverter;

    @Override
    public void add(ClientRequest client) throws ClientExistException {
        Client clientModel = clientRequestConverter.convert(client);
        repository.add(clientModel);
    }

    @Override
    public void edit(ClientRequest client) throws ClientNotExistException {
        Client clientModel = clientRequestConverter.convert(client);
        repository.edit(clientModel);
    }

    @Override
    public void remove(ClientDelRequest clientId) {
        repository.remove(clientId.getClientId());
    }

    @Override
    public List<Client> list() {
        return repository.list();
    }
}
