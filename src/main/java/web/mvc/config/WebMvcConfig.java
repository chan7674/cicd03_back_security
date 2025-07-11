package web.mvc.config;
import org.springframework.context.annotation.Configuration;
import 
org.springframework.web.servlet.config.annotation.CorsRegistry;
import 
org.springframework.web.servlet.config.annotation.EnableWebMvc;
import 
org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* WebMvcConfigurer 를 이용해서 @CrossOrigin 글로벌 설정
* */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
     registry.addMapping("/**")
    // .allowedOrigins("http://localhost:5173","http://localhost:4173")
     //.allowedOrigins("http://43.200.184.113:5173", "http://43.200.184.113:4173")
      .allowedOrigins("http://54.180.29.143", "http://54.180.29.143:80")
      .allowedOrigins("http://k-chan.kro.kr\n", "https://k-chan.kro.kr")
     .allowedMethods("OPTIONS","GET","POST","PUT","DELETE");
  }
}