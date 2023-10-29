package pd.example.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection= "Company_Profile")

public class Company  {
    @Id
    private String companyId;
    private String companyName;
    private String address;
    private String street;
    private String city;
    private String state;
    private String country;
    private String defaultCurrency;
    private String phoneNumber;
    private String officeNumber;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fromDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date toDate;
    private int target;

    public Company( String companyName, String address, String street, String city, String state, String country, String phoneNumber, String officeNumber, String email) {

        this.companyName = companyName;
        this.address = address;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.officeNumber = officeNumber;
        this.email = email;
    }

}
