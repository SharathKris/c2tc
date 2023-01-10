package tns.day15.database;

public class StatementInterface {

	static Connection cn;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch
	}
}
