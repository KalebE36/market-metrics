package com.kalebe36.market_metrics.titan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    @GetMapping
        public Map<String, String> getHealth() {
            return Map.of(
                    "status", "up",
                    "service", "Spring Boot Backend"
            );
        }
}
