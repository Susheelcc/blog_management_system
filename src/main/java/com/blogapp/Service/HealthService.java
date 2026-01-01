package com.blogapp.Service;
import org.springframework.stereotype.Service;
@Service
public class HealthService {
    public String GetHealthStatus(){
        return "blog app is runnning";
    }
}
