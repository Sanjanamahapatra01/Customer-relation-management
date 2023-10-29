package pd.example.trial.service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pd.example.trial.model.User;
import pd.example.trial.repository.UserRepository;

import java.util.Collections;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;


    public UserDetailsServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    /**
     * Method is used to load the user by username.
     * @param username
     * @return
     */
    @Override
    public UserDetails loadUserByUsername(String username)  {
        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UserNotFound(
//                    "User is invalid or not exist"
//            );
//        }
        return new org.springframework.security.core.userdetails.User(((User) user).getUsername(), user.getPassword(), Collections.emptyList());
    }
}