package ws.synopsis.trainingdos.repository.impl;

import org.springframework.stereotype.Component;
import ws.synopsis.trainingdos.enumeration.TrainingStatusEnum;
import ws.synopsis.trainingdos.exception.TrainingException;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.repository.ClientRespository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ClientRepositoryImpl implements ClientRespository {

    public final Map<Long, Client> data;

    ClientRepositoryImpl(){
        this.data = new HashMap<>();
    }

    @Override
    public void add(Client client) throws TrainingException {
        if(this.data.containsKey(client.getClientId()))
        {
            throw new TrainingException(TrainingStatusEnum.ERROR_CLIENT_EXIST);
        }
        this.data.put(client.getClientId(), client);
    }

    @Override
    public void edit(Client client) throws TrainingException {
        if(!this.data.containsKey(client.getClientId()))
        {
            throw new TrainingException(TrainingStatusEnum.ERROR_CLIENT_NOT_EXIST);
        }
        this.data.put(client.getClientId(), client);
    }

    @Override
    public void remove(Long clientId) {
        this.data.remove(clientId);
    }

    @Override
    public List<Client> list() {
        return (List<Client>) this.data.entrySet()
                .stream().map(row -> row.getValue())
                .collect(Collectors.toList());
    }
}
