package com.blogapp.service;
import org.springframework.stereotype.Service;
@Service
public class HealthService {
    public String GetHealthStatus(){
        return "blog app is runnning";
    }
}
