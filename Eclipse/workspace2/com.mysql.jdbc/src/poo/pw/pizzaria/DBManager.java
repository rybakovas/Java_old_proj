package poo.pw.pizzaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DBManager {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/poo_pw_pizzaria";
	private static DBManager dbManager = null;
	private Connection connection;
	private int lastId;

	/**
	 * Open a connection to the database
	 */
	private void openConnectionToDB() throws PooPWException {
		if(connection == null){
			try {
				connection = DriverManager.getConnection(DB_URL, "root", ""); 
			} catch(SQLException sqlException){
				throw new PooPWException("Erro connectando ao database.", sqlException);
			}
		}
	}
	
	public static DBManager getInstance() throws PooPWException {
		if (dbManager  == null) {
			dbManager = new DBManager();
			dbManager.openConnectionToDB();
		}
		return dbManager;
	}

	public List<Cliente> executaClientQuery(String sqlQuery) throws PooPWException {
		List<Cliente> clList = new ArrayList<>();
		try (
	    	Statement stmt = connection.createStatement();
	    	ResultSet resultSet = stmt.executeQuery(sqlQuery)) {
			while (resultSet.next()) {
				clList.add(new Cliente(resultSet.getInt(1), resultSet.getString(2), 
						resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), 
						resultSet.getString(6),	resultSet.getInt(7), resultSet.getString(8)));
			}
	    } catch (SQLException sqlException) {
	    	throw new PooPWException("Error executando query", sqlException);
	    }
		return clList;
	}

	public boolean executaUpdate(String sqlUpdate) throws PooPWException {
		int rc = 0;
		try (Statement stmt = connection.createStatement()) {
	    	rc = stmt.executeUpdate(sqlUpdate, Statement.RETURN_GENERATED_KEYS);
			// generate keys must be called after execute update
	        ResultSet resultSet = stmt.getGeneratedKeys();
	        if (rc != 0 ) {
	        	if (resultSet.next()) {
	        		// salva o id gerado pelo DB
	        		lastId = resultSet.getInt(1);
	        	}
    		    return true;
    		}
	    } catch (SQLException sqlException) {
	    	throw new PooPWException("Error executando update", sqlException);
	    }
		return false;
	}

	public int getLastID() {
		return lastId;
	}
}
