package pd.example.trial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.example.trial.model.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
}
