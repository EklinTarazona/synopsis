package ws.synopsis.trainingdos.controller.v1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ws.synopsis.trainingdos.enumeration.TrainingStatusEnum;
import ws.synopsis.trainingdos.exception.TrainingException;
import ws.synopsis.trainingdos.model.Client;
import ws.synopsis.trainingdos.request.ClientDelRequest;
import ws.synopsis.trainingdos.request.ClientRequest;
import ws.synopsis.trainingdos.response.TrainingResponse;
import ws.synopsis.trainingdos.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client/v1")
public class ClientController {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private ClientService service;

    @PostMapping
    public TrainingResponse<?> add(@RequestBody ClientRequest beanReq) throws TrainingException {
        if(logger.isDebugEnabled()) {
            logger.debug(String.format("Request: clientId(%s), name(%s)", beanReq.getClientId(), beanReq.getName()));
            logger.debug("Ingreso a metodo add");
            logger.debug("Ingreso a metodo add");
        }
        service.add(beanReq);
        TrainingResponse<?> response = TrainingStatusEnum.OK.createResponse(Object.class);
        return response;
    }

    @PutMapping
    public TrainingResponse<?> edit(@RequestBody ClientRequest beanReq) throws TrainingException {
        if(logger.isInfoEnabled()) {
            logger.info("Ingreso a metodo edit");
            logger.info("Ingreso a metodo edit");
            logger.info("Ingreso a metodo edit");
            logger.info("Ingreso a metodo edit");
        }
        service.edit(beanReq);
        TrainingResponse<?> response = TrainingStatusEnum.OK.createResponse(Object.class);
        return response;
    }

    @DeleteMapping
    public TrainingResponse<?> remove(@RequestBody ClientDelRequest beanReq) {
        if(logger.isWarnEnabled()) {
            logger.warn("Ingreso a metodo remove");
            logger.warn("Ingreso a metodo remove");
            logger.warn("Ingreso a metodo remove");
            logger.warn("Ingreso a metodo remove");
            logger.warn("Ingreso a metodo remove");
        }
        service.remove(beanReq);
        TrainingResponse<?> response = TrainingStatusEnum.OK.createResponse(Object.class);
        return response;
    }

    @GetMapping
    public TrainingResponse<List<Client>> list(){
        TrainingResponse<List<Client>> response = new TrainingResponse<>();
        response.setStatus(TrainingStatusEnum.OK.getStatus());
        response.setData(service.list());
        return response;
    }

}
