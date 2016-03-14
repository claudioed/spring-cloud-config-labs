package client.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Claudio E. de Oliveira on 14/03/16.
 */
@RestController
public class GetConfigController {

    @Value("${database.hostname}") String hostname;

    @Value("${database.port}") String port;
    
    @RequestMapping("/database/hostname")
    public String showDatabaseHostname() {
        return "The Database hostname is: " + hostname;
    }

    @RequestMapping("/database/hostname")
    public String showDatabasePort() {
        return "The Database port  is: " + port;
    }
    
    
}
