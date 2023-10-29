package pd.example.trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pd.example.trial.service.UserDetailsServiceImpl;


@Controller
public class HomeController {
    @Autowired
    private final UserDetailsServiceImpl userDetailsService;

    public HomeController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    /**
     * Method will show the homepage.
     * @return
     */
    @GetMapping("/index")
    public String showHomePage () {
        return "index";
    }

    /**
     * This method is used to show the contact page.
     * @return
     */
    @GetMapping("/contact")
    public String showContactPage () {
        return "contact";
    }

    /**
     * Method  show the navigation page.
     * @return
     */
    @GetMapping("/navigation")
    public String showNavigationPage () {
        return "navigation";
    }

    /**
     * Method show the about page.
     * @return
     */
    @GetMapping("/about")
    public String showAboutPage(){return "about";}

    /**
     * Method show the login page.
     * @return
     */
    @GetMapping("/login")
    public String showLoginPage () {
        return "login";
    }


    /**
     * method used to log out from the page after session completion.
     * @param sessionStatus
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/login";
    }
//@GetMapping("/logout")
//public String logout(SessionStatus sessionStatus) {
//    sessionStatus.setComplete();
//    return "redirect:/login";
//}
}
