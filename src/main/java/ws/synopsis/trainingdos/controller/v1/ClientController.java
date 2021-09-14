package ws.synopsis.trainingdos.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.synopsis.trainingdos.exception.ClientExistException;
import ws.synopsis.trainingdos.exception.ClientNotExistException;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.request.ClientDelRequest;
import ws.synopsis.trainingdos.request.ClientRequest;
import ws.synopsis.trainingdos.response.IndexResponse;
import ws.synopsis.trainingdos.response.TrainingResponse;
import ws.synopsis.trainingdos.response.TrainingStatus;
import ws.synopsis.trainingdos.service.ClientService;
import ws.synopsis.trainingdos.service.TrainingService;

import java.util.List;

@RestController
@RequestMapping("/client/v1")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping
    public TrainingResponse<?> add(@RequestBody ClientRequest beanReq) throws ClientExistException {
        service.add(beanReq);
        TrainingResponse<?> response = new TrainingResponse<>();
        response.setStatus(new TrainingStatus("0000", "Ejecutado de manera exitosa."));
        return response;
    }

    @PutMapping
    public TrainingResponse<?> edit(@RequestBody ClientRequest beanReq) throws ClientNotExistException {
        service.edit(beanReq);
        TrainingResponse<?> response = new TrainingResponse<>();
        response.setStatus(new TrainingStatus("0000", "Ejecutado de manera exitosa."));
        return response;
    }

    @DeleteMapping
    public TrainingResponse<?> remove(@RequestBody ClientDelRequest beanReq) {
        service.remove(beanReq);
        TrainingResponse<?> response = new TrainingResponse<>();
        response.setStatus(new TrainingStatus("0000", "Ejecutado de manera exitosa."));
        return response;
    }

    @GetMapping
    public TrainingResponse<List<Client>> list(){
        TrainingResponse<List<Client>> response = new TrainingResponse<>();
        response.setData(service.list());
        response.setStatus(new TrainingStatus("0000", "Ejecutado de manera exitosa."));
        return response;
    }

}
