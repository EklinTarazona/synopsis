package ws.synopsis.trainingdos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class TrainingResponse <T> {
    TrainingStatus status;
    private T data;
}
