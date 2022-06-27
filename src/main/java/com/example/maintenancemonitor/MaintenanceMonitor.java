package com.example.maintenancemonitor;

public class MaintenanceMonitor {
    private String message = "";

    public String setMessage(String m){
        this.message = m;
        return this.message;
    }
    public String getMessage(){
        if(this.message.equals("")){
            return "no message set";
        }
        return message;
    }
    public void resetMessage(){
       this.message = "";
    }
}
