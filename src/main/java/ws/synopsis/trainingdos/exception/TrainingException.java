package ws.synopsis.trainingdos.exception;

import lombok.Getter;
import ws.synopsis.trainingdos.enumeration.TrainingStatusEnum;
import ws.synopsis.trainingdos.response.TrainingStatus;

@Getter
public class TrainingException extends Exception {

    private final TrainingStatusEnum status;

    public TrainingException(TrainingStatusEnum status) {
        super(status.getStatus().getMessage());
        this.status = status;
    }

    public TrainingException(TrainingStatusEnum status, Throwable cause) {
        super(status.getStatus().getMessage(), cause);
        this.status = status;
    }

}
