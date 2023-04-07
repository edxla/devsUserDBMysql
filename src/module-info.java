import com.devsUsersDB.user.auth.UserDatabaseAuthentication;

import devsUserDBMysq.com.devs.user.db.mysql.MySqlAuthenticator;

module com.devs.user.db.mysql {
	requires com.amazarashi.devsUsersDB;
	//Interfacon con interfaz
	provides UserDatabaseAuthentication with MySqlAuthenticator;
}