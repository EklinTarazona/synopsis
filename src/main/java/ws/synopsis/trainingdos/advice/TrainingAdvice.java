package ws.synopsis.trainingdos.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ws.synopsis.trainingdos.exception.ClientExistException;
import ws.synopsis.trainingdos.exception.ClientNotExistException;
import ws.synopsis.trainingdos.response.TrainingResponse;
import ws.synopsis.trainingdos.response.TrainingStatus;

@ControllerAdvice
public class TrainingAdvice {

    @ExceptionHandler({ClientNotExistException.class})
    public ResponseEntity<TrainingResponse<?>> clientNotExistException(ClientNotExistException e){
        TrainingResponse<?> response = new TrainingResponse<>();
        response.setStatus(new TrainingStatus("9001", "El cliente no existe."));
        return ResponseEntity.internalServerError().body(response);
    }

    @ExceptionHandler
    public ResponseEntity<TrainingResponse<?>> clientExistException(Exception e){
        TrainingResponse<?> response = new TrainingResponse<>();
        response.setStatus(new TrainingStatus("9000", "Error generico."));
        return ResponseEntity.internalServerError().body(response);
    }

}
