package modelsjson.responsejson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JsonResponseModelPOST {
    String status;
    String title;
    String body;
    int id;
    String message;
}
