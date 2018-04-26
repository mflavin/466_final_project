package Model;

public class AdminAccount {
	
	private String accountid;
	private String userid;
	private int setCarPrice;
	private int setPartPrice;
	private double balance;
   
	public AdminAccount() {

	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getSetCarPrice() {
		return setCarPrice;
	}
	public void setSetCarPrice(int setCarPrice) {
		this.setCarPrice = setCarPrice;
	}
	public int getSetPartPrice() {
		return setPartPrice;
	}
	public void setSetPartPrice(int setPartPrice) {
		this.setPartPrice = setPartPrice;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
