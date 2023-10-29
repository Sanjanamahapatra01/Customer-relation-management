package pd.example.trial.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String originalPassword="sanj273";
        String encodedPassword= encoder.encode(originalPassword);
        System.out.println(encodedPassword);
    }
}
