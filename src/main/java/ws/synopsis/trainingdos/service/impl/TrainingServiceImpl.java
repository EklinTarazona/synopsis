package ws.synopsis.trainingdos.service.impl;

import org.springframework.stereotype.Service;
import ws.synopsis.trainingdos.response.IndexResponse;
import ws.synopsis.trainingdos.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {
    @Override
    public IndexResponse index() {
        System.out.println("Invocando a index.");
        StringBuilder str = new StringBuilder().append("Invocando").append(" a ").append("index.");
        return IndexResponse
                .builder()
                .message(str.toString())
                .build();
    }
}
