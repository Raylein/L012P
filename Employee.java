public class Employee {
    private String name;
    private double salary;
    
    // Responsibility 1: Employee data management
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Responsibility 2: Payroll calculation
    public double calculatePay() {
        // imagine complex payroll logic based on 
    	// bonus of the year
        return salary * 1.1; // with bonus
    }
    
    // Responsibility 3: Tax calculation
    public double calculateTax() {
    	// imagine complex calculation based on 
    	// current interest and tax rates
        return salary * 0.25;
    }
    
    // Responsibility 4: Database operations
    public void saveToDatabase() {
        // imagine actual database operations
        System.out.println("Saving to database...");
    }
    
    // Responsibility 5: Report generation
    public void generatePayStub() {
        System.out.println("=== PAY STUB ===");
        System.out.println("Name: " + name);
        System.out.println("Pay: " + calculatePay());
        System.out.println("Tax: " + calculateTax());
    }
    
    // Responsibility 6: Email notifications
    public void emailPayStub() {
    	// imagine actual code that sends an email
        System.out.println("Emailing pay stub to " + name);
    }
}