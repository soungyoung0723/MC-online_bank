
package business;

/**
 *
 * @author twalters25
 */
public class SavingsAccount extends BankAccount{
    // Attributes
    private String owner;
    private double interestRate;
    
    // Default Constructor
    public SavingsAccount() {
        this.interestRate = 0.02;
    }
    
    // Custom Constructor (3 parameters)
    public SavingsAccount(String acctNo, String fname, String lname) {
        super(acctNo, fname, lname); // call super class constructor
    }
    
    
    
    // functional methods: calculate interest earned (1) and add interest to balance (2)
    // method CalculateInterest()
    public double CalculateInterest() {
        double interestEarned = 0.0;
        if (super.getBalance() > 100)
            interestEarned = super.getBalance() * this.getInterestRate();
        return interestEarned;        
    }
    
    // method InterestAddedToBalance() 
    public double InterestAddedToBalance() {
        double updatedBalance = 0.0;
        if (super.getBalance() > 100) {
            updatedBalance = super.getBalance() + this.CalculateInterest();
        }
        return updatedBalance;
    }
    
    // functional method override: override super's withdraw method to make it specific to savings acct
    // (if needed)

    /**
     * @return the owner
     */
    @Override
    public String getOwner() {
        return "Savings-"+super.getOwner();
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        interestRate = 0.02;
        return interestRate;
    }
    
    
}
