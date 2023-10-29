package pd.example.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection= "Account")
public class Account {
    private String accountId;
    private String accountName;
    private String accountType;
    private String description;
    private String billingAddress;
    private String owner;
    private String phoneNumber;
    private String shippingAddress;

}
