package com.example.maintenancemonitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaintenanceMonitorTest {
    MaintenanceMonitor mm = new MaintenanceMonitor();
    @Test
    void setMessageTest(){
        String expected = "success";
        String result = mm.setMessage("success");
        Assertions.assertEquals(expected,result);
    }
    @Test
    void getMessageTest(){
        String expected = "success1";
        mm.setMessage("success1");
        String result = mm.getMessage();
        Assertions.assertEquals(expected,result);
    }
}
