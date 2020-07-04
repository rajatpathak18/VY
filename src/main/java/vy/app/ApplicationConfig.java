package vy.app;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vy.app.validation.MemberValidation;
import vy.app.validation.UserValidation;

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public MemberValidation memberValidation() {
        return new MemberValidation();
    }

    @Bean
    public UserValidation userValidation() {
        return new UserValidation();
    }
}
