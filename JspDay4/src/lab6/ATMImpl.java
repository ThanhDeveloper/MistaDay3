package lab6;

public class ATMImpl implements ATM1,ATM2 {
	public int idATM;
	public int accountId;


	@Override
	public boolean withdraw(int accNo, double money) {
		
		return false;
	}

	@Override
	public boolean deposit(int accNo, double money) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override                                                                                                                                         
	public double queryBalance(int accNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
