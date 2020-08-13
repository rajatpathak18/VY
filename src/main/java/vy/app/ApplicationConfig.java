package vy.app;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import vy.app.validation.MemberValidation;
import vy.app.validation.UserValidation;

import javax.sql.DataSource;

@Configuration
@PropertySource("Application.properties")
public class ApplicationConfig {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;

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

    @Bean
    public DataSource getDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(this.url);
        dataSourceBuilder.username(this.username);
        dataSourceBuilder.password(this.password);
        return dataSourceBuilder.build();
    }
}
