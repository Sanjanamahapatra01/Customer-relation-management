package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String > {
}
