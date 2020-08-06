package poo.pw.pizzaria;

import java.util.List;

import com.mysql.fabric.xmlrpc.Client;

public class Cliente {

	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private String endereco;
	private String celular;
	private int acessoID;
	private String senha;

	/**
	 * Registra cliente
	 * @param n
	 * @param s
	 * @param e
	 * @param end
	 * @param cel
	 * @param aID
	 * @param pwd
	 * @throws PooPWException
	 */
	public Cliente(String n, String s, String e, String end, String cel, int aID, String pwd) throws PooPWException {
		nome = n;
		sobrenome = s;
		email = e;
		endereco = end;
		celular = cel;
		acessoID = aID;
		senha = pwd;

		// verifica se o client ja existe
		if (clienteExiste()) {
			throw new PooPWException("Client com email " + email + " ja existe");
		} else {
			// adiciona o cliente no DB
			adicionaCliente();
		}
	}

	/**
	 * Usado internamente para carregar os clientes do database
	 * @param i
	 * @param n
	 * @param s
	 * @param e
	 * @param end
	 * @param cel
	 * @param aID
	 * @param pwd
	 */
	public Cliente(int i, String n, String s, String e, String end, String cel,	int aID, String pwd) {
		id = i;
		nome = n;
		sobrenome = s;
		email = e;
		endereco = end;
		celular = cel;
		acessoID = aID;
		senha = pwd;
	}

	/**
	 * Dado email e pwd verifica se usuario esta no db e retorna se estiver
	 * @param e
	 * @param pwd
	 * @return
	 * @throws PooPWException
	 */
	public static Cliente login(String clEmail, String pwd) throws PooPWException {
		// load the client record & verifica por email e pwd
		String whereClause = "EMAIL_CLI = '" + clEmail + "' and SENHA_CLI = '" + pwd	+ "'";
		List<Cliente> cl = loadClientes(whereClause);
		if (cl.size() == 1) {
			return cl.get(0);
		}
		return null;
	}

	/**
	 * Dado email e pwd verifica se usuario esta no db e retorna se estiver
	 * @param e
	 * @param pwd
	 * @return
	 * @throws PooPWException
	 */
	public static boolean removeClient(String clEmail, String pwd) throws PooPWException {
		// load the client record & verifica por email e pwd
		String whereClause = "EMAIL_CLI = '" + clEmail + "' and SENHA_CLI = '" + pwd	+ "'";
		String update = "DELETE from CLIENTE where " + whereClause + ";";
		try {
			DBManager db = DBManager.getInstance();
			return db.executaUpdate(update);
		} catch (PooPWException e) {
			throw new PooPWException("Error acessando a tabela CLIENTE of the DB", e);
		}
	}
	
	/**
	 * Load os clientes do database usando a where clause passada por parametro
	 * 
	 * @return
	 * @throws PooPWException
	 */
	private static List<Cliente> loadClientes(String whereClause)
			throws PooPWException {
		try {
			DBManager db = DBManager.getInstance();
			String query = "SELECT * from CLIENTE where " + whereClause + ";";
			return db.executaClientQuery(query);
		} catch (PooPWException e) {
			throw new PooPWException("Error acessando a tabela CLIENTE of the DB", e);
		}
	}

	/**
	 * Verifica se o cliente ja consta no database
	 * 
	 * @return
	 * @throws PooPWException
	 */
	private boolean clienteExiste() throws PooPWException {
		// verifica por email
		String whereClause = "EMAIL_CLI = '" + email + "'";
		List<Cliente> cl = loadClientes(whereClause);
		return ((cl.size() > 0) && cl.get(0).getEmail().equals(email));
	}

	/**
	 * Verifica se o client ja consta no database
	 * 
	 * @return
	 * @throws PooPWException
	 */
	private void adicionaCliente() throws PooPWException {
		try {
			DBManager db = DBManager.getInstance();
			// verifica por email
			String update = "INSERT INTO CLIENTE ("
					+ "Nome_Cli,Sobrenome_Cli,Email_Cli,End_Cli,Celular_Cli,Acesso_idAcesso,Senha_Cli)"
					+ " VALUES (" + "'" + nome + "'," + "'" + sobrenome + "',"
					+ "'" + email + "'," + "'" + endereco + "'," + "'"
					+ celular + "'," + acessoID + "," + "'" + senha + "'"
					+ ");";
			if (db.executaUpdate(update)) {
				id = db.getLastID();
			}
		} catch (PooPWException e) {
			throw new PooPWException("Error adicionando client a tabela CLIENTE of the DB", e);
		}
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCelular() {
		return celular;
	}

	public int getAcessoID() {
		return acessoID;
	}

	public String getSenha() {
		return senha;
	}

	public String toString() {
		return "Cliente: " + nome + " " + sobrenome + " - " + email + " - "
				+ endereco + " - " + celular;
	}

	public static void main(String[] args) {
		try {
			Cliente andrea = new Cliente("andrea", "chiavegatto",
					"aa@hotmail.com", "rua l", "9999-9999", 1, "!@##$");
			System.out.println("Adding " + andrea);
		} catch (PooPWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Cliente x = Cliente.login("aa@hotmail.com", "!@##$");
			System.out.println(x);

			x = Cliente.login("rybakovas@gmail.com", "123");
			System.out.println(x);

			x = Cliente.login("rybakovas@gmail.com", "sadasd");
			System.out.println(x);

			System.out.println(Cliente.removeClient("aa@hotmail.com", "12"));
			System.out.println(Cliente.removeClient("aa@hotmail.com", "!@##$"));
			System.out.println(Cliente.removeClient("aa@hotmail.com", "!@##$"));
		} catch (PooPWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
