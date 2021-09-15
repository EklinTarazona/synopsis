package ws.synopsis.trainingdos.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ws.synopsis.trainingdos.enumeration.TrainingStatusEnum;
import ws.synopsis.trainingdos.exception.TrainingException;
import ws.synopsis.trainingdos.response.TrainingResponse;

@ControllerAdvice
public class TrainingAdvice {

    @ExceptionHandler({TrainingException.class})
    public ResponseEntity<TrainingResponse<?>> trainingException(TrainingException e){
        TrainingResponse<?> response = e.getStatus().createResponse(Object.class);
        return ResponseEntity.internalServerError().body(response);
    }

    @ExceptionHandler
    public ResponseEntity<TrainingResponse<?>> generalException(Exception e){
        TrainingResponse<?> response = TrainingStatusEnum.ERROR_GENERIC.createResponse(Object.class);
        return ResponseEntity.internalServerError().body(response);
    }

}
