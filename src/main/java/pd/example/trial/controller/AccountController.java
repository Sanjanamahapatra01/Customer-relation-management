package pd.example.trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pd.example.trial.model.Account;
import pd.example.trial.model.Contact;
import pd.example.trial.service.AccountService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * This method is used to create the accounts.
     * @return
     */
    @GetMapping("/create")
    public String createAccount(){
        return "create_Account";
    }

    /**
     * This method is used to save the accoount details.
     * @param accounts
     * @return
     */
    @PostMapping("/create")
    public String accountCreate(@ModelAttribute Account accounts){
        accountService.saveAccount(accounts);
        return "redirect:/crm/home";
    }

    /**
     *This method is used to show the list of all accounts .
     * @param model
     * @return
     */
    @GetMapping("/view-accounts")
    public String viewAccounts(Model model){
        List<Account> account = accountService.getAccount();
        model.addAttribute("listAll",account);
        return "view_account";

    }
}
