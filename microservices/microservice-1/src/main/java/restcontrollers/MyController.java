package restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/data")
    public String getData() {
        return "Data from Microservice 1";
    }
}
