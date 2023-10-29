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
@Document(collection= "Employee_Profile")
public class Employee {
    @Id
    private String employeeId;
    private String name;
    private String designation;
    private String jobArea;
    private String reportTo;
    private String email;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date targetDate;
    private int targetValue;

}
