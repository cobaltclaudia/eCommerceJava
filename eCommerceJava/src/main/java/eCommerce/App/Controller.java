package eCommerce.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Welcome to the E-commerce Application!";
    }

    // Add more endpoints as needed
}
