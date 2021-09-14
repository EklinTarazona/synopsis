package ws.synopsis.trainingdos.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.request.ClientRequest;

@Component
public class ClientRequestToModel implements Converter<ClientRequest, Client> {
    @Override
    public Client convert(ClientRequest source) {
        Client client = new Client();
        BeanUtils.copyProperties(source, client, "typeDoc");
        client.setRole("OPERATOR");
        return client;
    }
}
