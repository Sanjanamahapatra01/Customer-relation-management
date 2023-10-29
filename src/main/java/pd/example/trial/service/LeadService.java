package pd.example.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.example.trial.model.Company;
import pd.example.trial.model.Lead;
import pd.example.trial.repository.LeadRepository;

import java.util.List;

@Service
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    /**
     * Method is used to get lead.
     * @return
     */
    public List<Lead> getLead(){
        return leadRepository.findAll();
    }

    /**
     * Method is used to save the lead details.
     * @param lead
     * @return
     */
    public Lead saveLead(Lead lead){
        return leadRepository.save(lead);
    }

    /**
     * Method is used to upadte the lead details.
     * @param lead
     * @return
     */
    public Lead updateLead(Lead lead){
        return leadRepository.save(lead);
    }
}
