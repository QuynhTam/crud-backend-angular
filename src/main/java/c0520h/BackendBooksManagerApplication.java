package c0520h;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@AutoConfigurationPackage
@ConfigurationPropertiesScan
public class BackendBooksManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendBooksManagerApplication.class, args);
    }

}
