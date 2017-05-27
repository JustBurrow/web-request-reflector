package kr.lul.web.request.reflector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author justburrow
 * @since 2017. 5. 28.
 */
@SpringBootApplication
@EnableWebMvc
public class Runner {
  public static void main(String[] args) {
    SpringApplication.run(Runner.class, args);
  }
}
