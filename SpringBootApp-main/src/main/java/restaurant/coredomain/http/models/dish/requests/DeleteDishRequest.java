package restaurant.coredomain.http.models.dish.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteDishRequest {
    private String title;
    private String email;
    private String password;
}
