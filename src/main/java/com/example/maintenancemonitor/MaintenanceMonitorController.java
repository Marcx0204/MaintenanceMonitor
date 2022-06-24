package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MaintenanceMonitorController {
    MaintenanceMonitor mm = new MaintenanceMonitor();

    @RequestMapping("/setMessage")
    public String setMessage(@RequestParam String m){
        //return mm.setMessage(m);
        return "Your Message is set!";
    }
}
