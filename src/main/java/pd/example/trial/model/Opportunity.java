package pd.example.trial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection= "Opportunity")
public class Opportunity {

    private String opportunityId;
    private String opportunityName;
    private String accountType;
    private String type;
    private String opportunitySource;
    private String status;
    private String progress;
    private String opportunities;
    private String assumptionClosedDate;
    private String owner;
}
