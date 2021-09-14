package ws.synopsis.trainingdos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
    private Long clientId;
    private String name;
    private String typeDoc;
    private String numDoc;
}
