
package business;

/**Date: 10/18/18
 **Desc: super class for checking and savings accounts
 * @author jmercer
 */
public class BankAccount {
    //properties
    private String acctNumber;
    private String firstName;
    private String lastName;
    private String owner;
    private double balance;
    //default constructor
    public BankAccount() {
        acctNumber="";
        firstName="";
        lastName="";
        owner="";
        balance=0;
    }
    //custom constructor - 3 params
    public BankAccount(String acctnum,String fname,String lname){
        this.acctNumber=acctnum;
        this.firstName=fname;
        this.lastName=lname;
        this.balance=0;
    }
    /**
     * @return the acctNumber
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * @param acctNumber the acctNumber to set
     */
    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return "Account #: "+this.acctNumber+"-"+this.firstName+" "+this.lastName;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //funtional methods: variations of withdraw
    // withdraw variation 1: withdraw(amount,checkingaccounttype) -- premier vs basic -- returns boolean
    public boolean withdraw(double amount, CheckingAccountType type){
        boolean overdraft=false;
        if (type==CheckingAccountType.Premier && amount>this.balance){
            overdraft=true;
        }
        else 
            if (amount > this.balance) {
                throw new IllegalArgumentException("Insufficient funds. Enter a smaller amount");
            }
            //check for negative withdrawal
            if (amount<0) {
                throw new IllegalArgumentException("The amount must be greater than 0. Try again.");
                
            }
            if (amount>300){
                throw new IllegalArgumentException("You exceeded max withdrawal amount. Try again");
            }           
        
        //update balance
        this.balance-=amount;
        return overdraft;
    }
    
    // withdraw variation 2: 
    public void withdraw(double amount) {

        // not enough funds
        if (amount > this.balance) {
                throw new IllegalArgumentException("Insufficient funds. Enter a smaller amount");
            }
        //check for accidental negative withdrawal request
        else if (amount<0) {
                throw new IllegalArgumentException("The amount must be greater than 0. Try again.");
            }
        // enforce maximum withdrawal allowed -- need to check the specifications to see if this applies
        else if (amount>300){
                throw new IllegalArgumentException("You exceeded max withdrawal amount. Try again");
            }           
                else if (amount < this.balance) {
            //update balance
            this.balance-=amount;
            }
        
    }
    
    
    //functional method: deposit
    public void deposit(double amount) {
        //update balance
        this.balance+=amount;
    }
}
