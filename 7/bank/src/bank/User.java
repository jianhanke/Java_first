package bank;

public class User {
	private String cardId;
	private String cardPwd;
	private String userName;
	private int  account;
	private String call;
	//银行卡号
	public void setcardId(String cardId) {
		this.cardId=cardId;
	}
	public String getcardId() {
		return cardId;
	}
	//银行密码
	public void setcardPwd(String cardPwd) {
		this.cardPwd=cardPwd;
	}
	public String getcardPwd() {
		return cardPwd;
	}
	//用户名
	public void setuserName(String userName) {
		this.userName=userName;
	}
	public String getuserName() {
		return userName;
	}
	//账户余额
	public void setaccount(int account) {
		this.account=account;
	}
	public int getaccount() {
		return account;
	}
	//电话号码
	public void  setcall(String call) {
		this.call=call;
	}
	public String  getcall() {
		return call;
	}
	public boolean containsKey(String cardId2) {
		// TODO Auto-generated method stub
		return false;
	}

}
