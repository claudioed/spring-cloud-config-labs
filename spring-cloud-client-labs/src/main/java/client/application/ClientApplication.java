package client.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Claudio E. de Oliveira on 14/03/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"client"})
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
    
}
