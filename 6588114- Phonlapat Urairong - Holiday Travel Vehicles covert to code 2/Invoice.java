public class Invoice {  
    private Customer customer;  
    private NewVehicle newVehicle;  
    private TradeInVehicle tradeInVehicle;  
    private Salesperson salesperson;  
    private LocalDateTime dateTime;  
    private String invoiceNumber;  
    private String customerSignature;  
    private ArrayList<Options> optionsList;  

    public Invoice(Customer customer, NewVehicle newVehicle, TradeInVehicle tradeInVehicle, Salesperson salesperson, LocalDateTime dateTime, String invoiceNumber, String customerSignature, ArrayList<Options> optionsList) {  
        this.customer = customer;  
        this.newVehicle = newVehicle;  
        this.tradeInVehicle = tradeInVehicle;  
        this.salesperson = salesperson;  
        this.dateTime = dateTime;  
        this.invoiceNumber = invoiceNumber;  
        this.customerSignature = customerSignature;  
        this.optionsList = optionsList;  
    }  
}