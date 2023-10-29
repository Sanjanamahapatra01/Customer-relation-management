package pd.example.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.example.trial.model.Contact;
import pd.example.trial.model.Lead;
import pd.example.trial.repository.ContactRepository;
import pd.example.trial.repository.LeadRepository;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    /**
     * Method will show the list of contacts.
     * @return
     */
    public List<Contact> getContact(){
        return contactRepository.findAll();
    }

    /**
     * Method will save the contact details.
     * @param contact
     * @return
     */
    public Contact saveContact(Contact contact){
        return contactRepository.save(contact);
    }

    /**
     * Method is used to update the contact details.
     * @param contact
     * @return
     */
    public Contact updateContact(Contact contact){
        return contactRepository.save(contact);
    }
}
