package pd.example.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.example.trial.model.Account;
import pd.example.trial.model.Contact;
import pd.example.trial.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;


    /**
     * Method is used to get the list of all accounts.
     * @return
     */
    public List<Account> getAccount(){
        return accountRepository.findAll();
    }

    /**
     * Method is used to save the account details.
     * @param account
     * @return
     */
    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }

    /**
     * Method is used to update and save the account details.
     * @param account
     * @return
     */
    public Account updateAccount(Account account){
        return accountRepository.save(account);
    }
}
