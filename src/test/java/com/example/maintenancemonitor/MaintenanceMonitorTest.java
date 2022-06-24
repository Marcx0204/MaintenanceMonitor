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
}
