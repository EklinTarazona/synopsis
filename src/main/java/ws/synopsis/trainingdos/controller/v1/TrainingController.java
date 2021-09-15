package ws.synopsis.trainingdos.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ws.synopsis.trainingdos.enumeration.TrainingStatusEnum;
import ws.synopsis.trainingdos.response.IndexResponse;
import ws.synopsis.trainingdos.response.TrainingResponse;
import ws.synopsis.trainingdos.response.TrainingStatus;
import ws.synopsis.trainingdos.service.TrainingService;

@RestController
@RequestMapping("/training/v1")
public class TrainingController {

    @Autowired
    private TrainingService service;

    @GetMapping({"/", ""})
    public TrainingResponse<IndexResponse> index(){
        TrainingResponse<IndexResponse> response = TrainingStatusEnum.OK.createResponse(IndexResponse.class);
        response.setData(service.index());
        return response;
    }

}
