
package business;

/**Author: June Mercer
 **Date: 10/25/18
 * @author jmercer
 */
public class CheckingAccount extends BankAccount{
    private final double feePerOverdraft=10.0;
    //attributes
    private String owner;
    private CheckingAccountType checkingAcctType;
    private double overdraftFee;
    private int numOfOverdrafts;
    
    //default constructor
    public CheckingAccount(){
        this.overdraftFee=0.0;
        this.numOfOverdrafts=0;
    }
    
    //custom constructor - 3 params
    public CheckingAccount(String acctNo,String fname,String lname){
        super(acctNo,fname,lname);//call super class constructor
    }

    /**
     * @return the feePerOverdraft
     */
    public double getFeePerOverdraft() {
        return feePerOverdraft;
    }

    /**
     * @return the owner
     */
    @Override
    public String getOwner() {
        return "Checking-"+super.getOwner();
    }

    /**
     * @return the checkingAcctType
     */
    public CheckingAccountType getCheckingAcctType() {
        return checkingAcctType;
    }

    /**
     * @param checkingAcctType the checkingAcctType to set
     */
    public void setCheckingAcctType(CheckingAccountType checkingAcctType) {
        this.checkingAcctType = checkingAcctType;
    }

    /**
     * @return the overdraftFee
     */
    public double getOverdraftFee() {
        return overdraftFee;
    }

    /**
     * @return the numOfOverdrafts
     */
    public int getNumOfOverdrafts() {
        return numOfOverdrafts;
    }
    //functional method: 
    //return boolean withdraw(double amount,type)
    @Override
    public boolean withdraw(double amount,CheckingAccountType type){
        boolean b=false;
        boolean overdraft=super.withdraw(amount, type);
        if (overdraft){
            //charge fee
            this.overdraftFee+=this.feePerOverdraft;
            //increment overdraft count
            this.numOfOverdrafts++;
            b=true;
        }
        return b;
    }
}
