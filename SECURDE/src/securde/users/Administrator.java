package securde.users;

public class Administrator extends User {


	public Administrator(int id, String userName, String password) {
		super(id, userName, password);
	}

	public void banAccount(User user, String remarks) {
		//Database logic where user is banned, idk how we'll implement the banning
		//but yeah remarks is why user is banned.
	}

}