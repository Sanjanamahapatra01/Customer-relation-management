package pd.example.trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pd.example.trial.model.Contact;
import pd.example.trial.model.Lead;
import pd.example.trial.service.ContactService;

import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    /**
     * Method is used to create contact.
     * @return
     */
    @GetMapping("/create")
    public String createContact(){
        return "contact_create";
    }

    /**
     * Method is used to save the contact details.
     * @param contacts
     * @return
     */
    @PostMapping("/create")
    public String contactCreate(@ModelAttribute Contact contacts){
        contactService.saveContact(contacts);
        return "redirect:/crm/home";
    }

    /**
     * Method is used to view the contact details.
     * @param model
     * @return
     */
    @GetMapping("/view-contacts")
    public String viewContact(Model model){
        List<Contact> contact = contactService.getContact();
        model.addAttribute("listAll",contact);
        return "view_contact";

    }
}
