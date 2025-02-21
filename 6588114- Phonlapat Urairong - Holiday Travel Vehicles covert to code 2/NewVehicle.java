public class NewVehicle {  
    private String vehicleSerialNumber;  
    private String name;  
    private String model;  
    private int year;  
    private String manufacturer;  
    private double baseCost;  
    
    public NewVehicle(String vehicleSerialNumber, String name, String model, int year, String manufacturer, double baseCost) {  
        this.vehicleSerialNumber = vehicleSerialNumber;  
        this.name = name;  
        this.model = model;  
        this.year = year;  
        this.manufacturer = manufacturer;  
        this.baseCost = baseCost;  
    }  
}