package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.SalesTarget;
@Repository
public interface SalesTargetRepository extends MongoRepository<SalesTarget,String> {
}
