package net.engineeringdigest.journalApp.controller.oldControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String HealthCheck() {
        return "OK";
    }
}
