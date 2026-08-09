package com.ggiou.cicdlab.health;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String check(){
        return "UP";
    }
}
