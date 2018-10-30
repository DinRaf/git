import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Detail {
    private String material;
    private String purpose;
    private Integer weight;
    private Integer price;
}
