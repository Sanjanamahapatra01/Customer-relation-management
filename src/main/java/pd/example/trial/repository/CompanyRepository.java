package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.Company;

@Repository
public interface CompanyRepository extends MongoRepository<Company,String> {
    Company findByCompanyId(String companyId);
}
