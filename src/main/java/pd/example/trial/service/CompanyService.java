package pd.example.trial.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.example.trial.model.Company;
import pd.example.trial.repository.CompanyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {
    @Autowired
    private  CompanyRepository companyRepository;


    /**
     * Method will return the list of company.
     * @return
     */
    public List<Company> getCompany(){
        return companyRepository.findAll();
    }

    /**
     * Methos saves the company details.
     * @param company
     * @return
     */
    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    /**
     * method updates the company details.
     * @param company
     * @return
     */
    public Company upadteCompany(Company company){
        return companyRepository.save(company);
    }

    /**
     * method is used to find the company by its id.
     * @param companyId
     * @return
     */
    public Company findByCompanyId(String companyId) {
        return companyRepository.findByCompanyId(companyId);
    }
}
