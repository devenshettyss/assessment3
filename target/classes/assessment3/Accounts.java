package assessment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Accounts {
	private static Logger logger = LoggerFactory.getLogger(Accounts.class);
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost/assessment3";
		String DB_USER  = "root";
		String DB_PASSWORD = "Nuvelabs123$";

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {
			create(statement); //create
//			retrieve(statement);
//			update(statement);
//			delete(statement);
//			List<String> regions = retrieveWithCondition(statement, "A");
//			logger.debug(regions.toString());
//			sort(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void create(Statement statement) throws SQLException {
		statement.execute("INSERT INTO ACCOUNTS VALUES(1,'ABC',10000,'17-08-2021','ACTIVE','SAVINGS',1);");
		statement.execute("INSERT INTO ADDRESS VALUES(1,'MUMBAI','MAHARASHTRA',400067,1234567890,221,'BAKER STREET',1);");
		logger.debug("USER CREATED");
	}

	}