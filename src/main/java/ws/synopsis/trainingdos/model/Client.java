package ws.synopsis.trainingdos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private Long clientId;
    private String name;
    private String typeDoc;
    private String numDoc;
    private String role;
}
