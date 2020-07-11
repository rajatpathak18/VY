package vy.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfigurer {

  @Bean
  public WebMvcConfigurer corsConfigure(){
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        System.out.println("cors configured ");
        registry.addMapping("/**")
          .allowedOrigins("*")
          //.allowedHeaders("X-Requested-With", "Content-Type", "Authorization",
           // "Origin", "Accept","HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN","Access-Control-Allow-Origin","Referer")
          .allowedHeaders("*")
          .allowedMethods("GET","POST","PUT","OPTIONS");
      }
    };
  }
}
