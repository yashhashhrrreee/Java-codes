
public class Default_Parametrised_Constructur {
    private String make;
    private String model;
    private int year;
    
    // Default constructor
    public Default_Parametrised_Constructur() {
       this.make = "Unknown";
       this.model = "Unknown";
       this.year = 0;
    }
    
    // Parameterized constructor
    public Default_Parametrised_Constructur(String make, String model, int year) {
       this.make = make;
       this.model = model;
       this.year = year;
    }
    
    // Getters and Setters
    public String getMake() {
       return make;
    }
 
    public void setMake(String make) {
       this.make = make;
    }
 
    public String getModel() {
       return model;
    }
 
    public void setModel(String model) {
       this.model = model;
    }
 
    public int getYear() {
       return year;
    }
 
    public void setYear(int year) {
       this.year = year;
    }
    
    // Main method to test the class
    public static void main(String[] args) {
       // Creating an object of Car using default constructor
       Default_Parametrised_Constructur car1 = new Default_Parametrised_Constructur();
       System.out.println("Car 1 Details: " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
       
       // Creating an object of Car using parameterized constructor
       Default_Parametrised_Constructur car2 = new Default_Parametrised_Constructur("Honda", "City", 2022);
       System.out.println("Car 2 Details: " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
    }
 }
 