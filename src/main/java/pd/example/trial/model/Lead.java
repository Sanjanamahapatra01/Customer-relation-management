package pd.example.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection= "Lead")
public class Lead {

    private String leadId;
    private String title;
    private String fullName;
    private String lastName;
    private String leadOwner;
    private String designation;
    private String product;
    private String address;
    private String phoneNumber;
    private String email;
    private String company;
    private String industry;
    private String noOfEmployees;
    private String description;
    private String leadSource;
    private String referredBy;

}
