package pd.example.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.example.trial.model.Opportunity;
import pd.example.trial.repository.OpportunityRepository;

import java.util.List;
@Service
public class OpportunityService {
    @Autowired
    private OpportunityRepository opportunityRepository;

    /**
     * Method is used to get the opportunities.
     * @return
     */
    public List<Opportunity> getOpportunity(){
        return opportunityRepository.findAll();
    }

    /**
     * Method is used to save the opportunity .
     * @param opportunity
     * @return
     */
    public Opportunity saveOpportunity(Opportunity opportunity){
        return opportunityRepository.save(opportunity);
    }

    /**
     *  Method is used to update the opportunity details.
     *  @param opportunity
     * @return
     */
    public Opportunity updateOpportunity(Opportunity opportunity){
        return opportunityRepository.save(opportunity);
    }
}
