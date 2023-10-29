package pd.example.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection= "Contact")
public class Contact {
    private String contactId;
    private String title;
    private String firstName;
    private String lastName;
    private String designation;
    private String department;
    private String account;
    private String address;
    private String phoneNumber;
    private String email;
    private String industry;
    private String note;
    private String leadOwner;
}
