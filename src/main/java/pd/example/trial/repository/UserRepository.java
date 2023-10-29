package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pd.example.trial.model.User;

public interface UserRepository extends MongoRepository<User,String>
{
    User findByUsername(String username);
}
