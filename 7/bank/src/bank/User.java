package bank;

public class User {
	private String cardId;
	private String cardPwd;
	private String userName;
	private int  account;
	private String call;
	//���п���
	public void setcardId(String cardId) {
		this.cardId=cardId;
	}
	public String getcardId() {
		return cardId;
	}
	//��������
	public void setcardPwd(String cardPwd) {
		this.cardPwd=cardPwd;
	}
	public String getcardPwd() {
		return cardPwd;
	}
	//�û���
	public void setuserName(String userName) {
		this.userName=userName;
	}
	public String getuserName() {
		return userName;
	}
	//�˻����
	public void setaccount(int account) {
		this.account=account;
	}
	public int getaccount() {
		return account;
	}
	//�绰����
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
