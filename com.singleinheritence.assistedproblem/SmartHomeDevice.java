class Device{
    //instance variable
    private String deviceId;
    private boolean status;

    
    //Constructor to initialize Class details 
    Device(String deviceId, boolean status){
        this.deviceId = deviceId;
        this.status = status;
    }

    //Instance metod to display the  details of Device
    public void displayDetails(){
        System.out.println("Display Device Details");
        System.out.println("Device Id : "+ this.deviceId);
        System.out.println("Status : "+ this.status);
    }
}


class Thermostat extends Device{
    //instance variable
    private int temperatureSetting;

    //Constructor to initialize Class details 
    Thermostat(String deviceId, boolean status, int temperatureSetting){
        // Calling the parent class constructor
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Temperature Setting : "+ this.temperatureSetting);
    }
}

public class SmartHomeDevice {
    public static void main(String[] agrs){
        //Creating object of Thermostat class
        Thermostat thermostat = new Thermostat("123FGHH",true,34);
        thermostat.displayDetails();
    }
}
