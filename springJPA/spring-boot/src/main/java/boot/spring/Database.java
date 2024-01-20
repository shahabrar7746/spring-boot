package boot.spring;
import java.sql.*;
import java.util.HashMap;

public class Database {
	private static  String host = "mysql-240f0ee5-com-24local.a.aivencloud.com";
	final static String dbPort = "10102";
	 final static String dbName = "bwpcz0vlb7xoowjt5all";
	final static String dbUser = "uizlnplnxgqkaypn";
	private final static String dbPassword = "AVNS_6OvSkrnvhZDB6mguwKX";
	static String user = "avnadmin";
	final static String dbDriver = "com.mysql.jdbc.Driver";
	private static Connection con = null;
	static Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName(dbDriver);
		if(con == null || con.isClosed()) {
	       con =  DriverManager.getConnection("jdbc:mysql://" + host + ":" + dbPort + "/" + dbName + "?sslmode=require", user, dbPassword);

			return con;
		}
		if (!con.isValid(0)) {
		    // Reconnect to the database.
		    con.close();
		       con =  DriverManager.getConnection("jdbc:mysql://" + host + ":" + dbPort + "/" + dbName + "?sslmode=require", user, dbPassword);

		}
		return con;
	}
	public HashMap<String, Consumers> fetchConsumers() throws SQLException, ClassNotFoundException{
		HashMap<String,Consumers> map = new HashMap();
	    connect();
		PreparedStatement statement = con.prepareStatement("select * from consumerdetails");
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			Consumers consumer = new Consumers();
			consumer.setId(rs.getString("consumerId"));
			consumer.setPassword(rs.getString("password"));
			consumer.setEmail(rs.getString("email"));
			consumer.setLocation(rs.getString("consumerLocation"));
			consumer.setName(rs.getString("name"));
			consumer.setPincode(rs.getString("pincode"));
			map.put(consumer.getId(), consumer);
			consumer = null;
		}
		return map;
		
	}
}
