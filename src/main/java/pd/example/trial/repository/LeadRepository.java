package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.Lead;
@Repository
public interface LeadRepository extends MongoRepository<Lead,String> {
}
