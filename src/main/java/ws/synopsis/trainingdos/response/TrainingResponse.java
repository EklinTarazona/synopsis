package ws.synopsis.trainingdos.response;

import lombok.Data;

@Data
public class TrainingResponse <T> {
    TrainingStatus status;
    private T data;
}
