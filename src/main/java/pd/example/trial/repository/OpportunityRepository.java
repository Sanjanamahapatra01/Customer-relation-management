package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.Opportunity;

@Repository
public interface OpportunityRepository extends MongoRepository<Opportunity,String> {
}