package devsUserDBMysq.com.devs.user.db.mysql;

import java.util.HashMap;
import java.util.Map;

import com.devsUsersDB.user.auth.UserDatabaseAuthentication;

public class MySqlAuthenticator implements UserDatabaseAuthentication {
	
	
	private Map<String,String> users = new HashMap<>();


	public MySqlAuthenticator() 
	{
		users.put("Raiden", "Java");
		users.put("devs", "password");
	}
	
	@Override
	public boolean authenticate(String username, String Password) 
	{
		System.out.println("Autenticacion con MySQl");
		String pass = users.get(username);
		// ? true <- es verdadero devuelvo true si no false
		return (pass!=null && pass.equals(Password)) ? true:false;
	}

}
