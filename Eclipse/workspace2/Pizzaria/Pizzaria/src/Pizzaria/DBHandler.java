package Pizzaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.websocket.Session;

import org.apache.coyote.Request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DBHandler {

	private Connection connection;
	private	String database = "poo_pw_pizzaria";
	private	String username = "root";
	private String senha = "";// "adm01BKP";

	private String user;
	private String id;
	private String password;
	public Statement sst;
	private String nomeCli;
	public String connStr = "jdbc:mysql://localhost:3306/" + database
			+ "?autoReconnect=true";

	public synchronized Connection pegaConexao() {
		if (connection == null) {
			connection = createConnection();
			try {
				connection.setAutoCommit(false);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		return connection;
	}

	public Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connStr, username, senha);
			try {
				connection.setAutoCommit(false);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return connection;
	}

	public DBHandler() {
		createConnection();

	}

	public String getCliname(){
		
		System.out.println("getCliname");
		System.out.println("user: " + this.user);
		System.out.println("password: " + this.password);
		String nome = "";
	//	String id = "";
			
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.cliente where Email_Cli='"
							+ this.user + "' and Senha_Cli='" + this.password + "' ;");
			
			rs.next();
			nome = rs.getString("Nome_Cli");
			//id = rs.getString("IdCliente");
			System.out.println("Nome Cliname: " + nome);
			//System.out.println("Nome id: " + id);
			connection.commit();
			
	
						
		} catch (Exception ex) {

		}
		
		return nome;
		
	}
	
	public String getProduto(String id){
		
		String prod = "";
	//	String id = "";
			
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.produto where idProduto=" + id + ";");
			
			rs.next();
			prod = rs.getString("Descr_Prod");
			connection.commit();
				
		} catch (Exception ex) {

		}
		
		return prod;
		
	}

     public String getCliente(String id){
		
		String nome = "";
	//	String id = "";
			
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.cliente where idCliente=" + id + ";");
			
			rs.next();
			nome = rs.getString("Nome_Cli");
			nome += rs.getString("Sobrenome_Cli");
			connection.commit();
				
		} catch (Exception ex) {

		}
		
		return nome;
		
	}
     
     public String getFuncname(){
		
		String nome = "";
			
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.funcionario where User_Func='"
							+ this.user + "' and Senha_Func='" + this.password + "' ;");
			
			rs.next();
			nome = rs.getString("Nome_Func");
			connection.commit();
			
	
						
		} catch (Exception ex) {

		}
		
		return nome;
		
	}
	
	public String getCliId(){
		
	
		String id = "";
	//	String id = "";
			
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.cliente where Email_Cli='"
							+ this.user + "' and Senha_Cli='" + this.password + "' ;");
			
			rs.next();
			id = rs.getString("IdCliente");
			//id = rs.getString("IdCliente");
			System.out.println("Nome Cliname: " + id);
			//System.out.println("Nome id: " + id);
			connection.commit();
			
	
						
		} catch (Exception ex) {

		}
		
		
		return id;
		
		
	}
   
     
	public String getFuncId(){
		
		
		String id = "";
			
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.funcionario where User_Func='"
							+ this.user + "' and Senha_Func='" + this.password + "' ;");
			
			rs.next();
			id = rs.getString("IdFuncionario");
			connection.commit();
			
	
						
		} catch (Exception ex) {
ex.printStackTrace();
		}
		
		
		return id;
		
		
	}
	
	public String nomeCliente(String email, String senha) {
		this.user = email;
		this.password = senha;	
		
		return getCliname();
	}
	
	public String IdCliente(String email, String senha) {
		this.user = email;
		this.password = senha;	
		
		return getCliId();
	}

	public String nomeFunc(String usuario, String senha) {
		this.user = usuario;
		this.password = senha;	
		
		return getFuncname();
	}
	
	public String IdFunc(String usuario, String senha) {
		this.user = usuario;
		this.password = senha;	
		
		return getFuncId();
	}
	
	public void Cadastrar(String name, String email, String endereco,
			String sobrenome, String cel, String senha) {
		try {
			sst = pegaConexao().createStatement();

			sst.executeUpdate("INSERT INTO cliente (Nome_Cli,Sobrenome_Cli,Email_Cli,End_Cli,Celular_Cli,Acesso_idAcesso,Senha_Cli) VALUES ('"
					+ name
					+ "','"
					+ sobrenome
					+ "','"
					+ email
					+ "','"
					+ endereco + "','" + cel + "',1,'" + senha + "' );");

			connection.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void Deletar(String idClient) {
		try {
			sst = pegaConexao().createStatement();

			sst.executeUpdate("DELETE from cliente where IdCliente=" + idClient + ";");

			connection.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void FCadastrar(String name, String usuario, String sobrenome, String senha) {
		try {
			sst = pegaConexao().createStatement();

			sst.executeUpdate("INSERT INTO funcionario (Nome_Func,Sobrenome_Func,User_Func,Acesso_idAcesso,Pass_Func,Senha_Func) VALUES ('"
					+ name
					+ "','"
					+ sobrenome
					+ "','"
					+ usuario
					+ "',2,'" + senha + "','" 
					+ senha + "');");

			connection.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void FDeletar(String idFunc) {
		try {
			sst = pegaConexao().createStatement();

			sst.executeUpdate("DELETE from funcionario where IdFuncionario=" + idFunc + ";");

			connection.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public boolean Logar(String email, String senha) {
		try {
			sst = pegaConexao().createStatement();

			ResultSet rs = sst
					.executeQuery("Select IdCliente From cliente where Email_Cli='"
							+ email + "' and Senha_Cli='" + senha + "' ;");

			if (rs.next())
				return true;
			else
				return false;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public boolean FLogar(String usuario, String senha) {
		try {
			sst = pegaConexao().createStatement();

			ResultSet rs = sst
					.executeQuery("Select IdFuncionario From funcionario where User_Func='"
							+ usuario + "' and Senha_Func='" + senha + "' ;");

			if (rs.next())
				return true;
			else
				return false;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public ArrayList<String> Cardapio() {
		ArrayList<String> tests = new ArrayList<String>();
		try {
			sst = pegaConexao().createStatement();

			ResultSet rs = sst.executeQuery("Select * From ingrediente;");
			
		
			while (rs.next()) {
				String test =rs.getString("Descr_Ingr");
				tests.add(test);
			
				
			}
			connection.commit();
			
		} catch (Exception ex) {

		}
		return tests;
	}
	
	public ArrayList<String[]> Pedidos() {
		System.out.println("Pedidos");
		ArrayList<String[]> tests = new ArrayList<String[]>();
		
		try {
			sst = pegaConexao().createStatement();

			ResultSet rs = sst.executeQuery("Select * From pedido;");
			
		
			while (rs.next()) {
				tests.add(new String[] { getCliente(rs.getString("Cliente_IdCliente")), 
						getProduto(rs.getString("Produto_IdProduto")),
						rs.getString("Status_Ped")});
			
				
			}
			connection.commit();
			
		} catch (Exception ex) {

		}
		return tests;
	}
	
	public void PDeletar(String[] prodList) {
		if (prodList != null) {
			try {
				sst = pegaConexao().createStatement();
	
				for (String prod: prodList) {
					String pId = IdProduto(prod);
					sst.executeUpdate("DELETE from produto_has_ingrediente where produto_idProduto=" + pId + ";");
					sst.executeUpdate("DELETE from produto where idProduto=" + pId + ";");
				}
	
				connection.commit();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public ArrayList<String> Menu() {
		ArrayList<String> menu = new ArrayList<String>();

		try {
			sst = pegaConexao().createStatement();

			ResultSet rs = sst.executeQuery("Select * From produto;");
			
		
			while (rs.next()) {
				String prod =rs.getString("Descr_Prod");
				menu.add(prod);
			//String prod =rs.getString("Valor_Prod");
				//menu.add(prod);
				
			}
			connection.commit();
			
		} catch (Exception ex) {

		}
		return menu ;
		}
	
	public ArrayList<String> ValorMenu() {
		ArrayList<String> valormenu = new ArrayList<String>();

		try {
			sst = pegaConexao().createStatement();

			ResultSet rs = sst.executeQuery("Select * From produto;");
			
		
			while (rs.next()) {
				String money =rs.getString("Valor_Prod");
				
				valormenu.add(money);
			
				
			}
			connection.commit();
			
		} catch (Exception ex) {

		}
		return valormenu ;
		}
	
	public void Montar(String nomepizza,String[] checkMonte) {
		
		
	
		try {
			
			float SomaValor=0;
			sst = pegaConexao().createStatement();


		
	

			
			for (String s : checkMonte)
			{
				ResultSet rs = sst.executeQuery("Select Valor_Ingr From ingrediente where Descr_Ingr='"+s+"';");
				
				
				while (rs.next()) {
					String  somaValorIngre =rs.getString("Valor_Ingr");
					float SomaValor2=Float.parseFloat(somaValorIngre);
					SomaValor=SomaValor2+SomaValor;


			}

			}
		
			sst.executeUpdate("INSERT INTO produto (Descr_Prod,Valor_Prod) VALUES ('"
					+ nomepizza
					+ "','"
					+ SomaValor + "' );");
			

		
			ResultSet rs = sst.executeQuery("Select idProduto From poo_pw_pizzaria.produto where Descr_Prod='"+nomepizza+"';");
			rs.next();
			String  Id_Prod =rs.getString("idProduto");
			
			
			for (String s : checkMonte)
			{
				ResultSet rs2 = sst.executeQuery("Select idIngrediente From ingrediente where Descr_Ingr='"+s+"';");
			 rs2.next();
				
				String  Id_Ingre =rs2.getString("idIngrediente");
				sst.executeUpdate("INSERT INTO produto_has_ingrediente (Produto_idProduto,Ingrediente_idIngrediente) VALUES ('"
						+ Id_Prod
						+ "','"
						+ Id_Ingre + "' );");


		
			}
			connection.commit();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public float Escolher(String[] escolhecardapio,String idCli) {
		float SomaValor=0;
try {
			
			
			sst = pegaConexao().createStatement();


		
			for (String s : escolhecardapio)
			{
				ResultSet rs = sst.executeQuery("Select Valor_Prod From poo_pw_pizzaria.produto where Descr_Prod='"+ s +"';");
				
				
				while (rs.next()) {
					String  somaValorProd =rs.getString("Valor_Prod");
					float SomaValor2=Float.parseFloat(somaValorProd);
					SomaValor=SomaValor2+SomaValor;


			}

			}
		

		
			
			for (String s : escolhecardapio)
			{
	
				String  Id_Prod = IdProduto(s);
				
				System.out.println("produto " + s + " " + Id_Prod);
				
				sst.executeUpdate("INSERT INTO poo_pw_pizzaria.pedido (Produto_idProduto,Cliente_idCliente,Status_Ped) VALUES ('"
						+ Id_Prod
						+ "','"
						+ idCli+ "','wait');");
		
			}
			
			
			connection.commit();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	return SomaValor;
	
	}
	
	public ArrayList<String> getPedido() {
		ArrayList<String> pedido = new ArrayList<String>();
		ArrayList<String> descr_pedido = new ArrayList<String>();
		try {
			sst = pegaConexao().createStatement();

			String query = "Select poo_pw_pizzaria.produto.Descr_Prod from  "
					+ "poo_pw_pizzaria.produto inner join  poo_pw_pizzaria.pedido on "
					+ "poo_pw_pizzaria.produto.idProduto=poo_pw_pizzaria.pedido.Produto_idProduto "
					+ "where poo_pw_pizzaria.pedido.Status_Ped='wait'";
			if (this.id != null) {
					query += "AND poo_pw_pizzaria.pedido.Cliente_idCliente='"+ this.id +"' ";
			}
			query += ";";
					
			ResultSet rs = sst.executeQuery(query);
			
		
			while (rs.next()) {
				String idprod =rs.getString("Descr_Prod");
				pedido.add(idprod);
		
				
			}
			

			connection.commit();
			
		} catch (Exception ex) {

		}
		return pedido ;
		}
	
	public String IdProduto(String prod) {
			
		String id = null;
		try {
			sst = pegaConexao().createStatement();
			ResultSet rs = sst
					.executeQuery("SELECT * FROM poo_pw_pizzaria.produto where descr_prod='"
							+ prod + "' ;");
			
			rs.next();
			id = rs.getString("IdProduto");
			connection.commit();
			
	
						
		} catch (Exception ex) {
		}
		
		
		return id;
		
		
	}

	
	public ArrayList<String> IdPedido(String idCli) {
		
		this.id = idCli;
		
		
		return getPedido();
	}
	
	public ArrayList<String> TodosPedidos() {
		
		this.id = null;		
		
		return getPedido();
	}

	public void Comprar(String idCli) {
		
		System.out.println("entrou comprar");
		try {
		sst = pegaConexao().createStatement();

		sst.executeUpdate("UPDATE poo_pw_pizzaria.pedido SET "
				+ "poo_pw_pizzaria.pedido.Status_Ped ='Efetuada' "
				+ "where poo_pw_pizzaria.pedido.Cliente_idCliente='"+idCli+"' and poo_pw_pizzaria.pedido.Status_Ped='wait';");

			connection.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		new DBHandler().Estoque(idCli);
	}
	
	public void Cancelar(String idCli) {
		System.out.println("entrou cancelar");
		try {
			sst = pegaConexao().createStatement();

			sst.executeUpdate("UPDATE poo_pw_pizzaria.pedido SET "
					+ "poo_pw_pizzaria.pedido.Status_Ped ='Cancelado' "
					+ "where poo_pw_pizzaria.pedido.Cliente_idCliente='"+idCli+"' and poo_pw_pizzaria.pedido.Status_Ped='wait';");

			connection.commit();
		} catch (Exception ex) {
		ex.printStackTrace();
		}
	}
	
	public void Estoque(String idCli) {
		System.out.println("entrou estoque");
		ArrayList<String> ListProd = new ArrayList<String>();
		
		
		ArrayList<String> ListIngr = new ArrayList<String>();
		
		
		
		int i =0;
		int j =0;
		
		
		try {
			sst = pegaConexao().createStatement();

			
			ResultSet rs2 = sst.executeQuery("Select poo_pw_pizzaria.produto.idProduto from  "
					+ "poo_pw_pizzaria.produto inner join  poo_pw_pizzaria.pedido on "
					+ "poo_pw_pizzaria.produto.idProduto=poo_pw_pizzaria.pedido.Produto_idProduto "
					+ "where poo_pw_pizzaria.pedido.Cliente_idCliente='"+ idCli +"' "
					+ "and poo_pw_pizzaria.pedido.Status_Ped='Efetuada';");
			while (rs2.next()) {
				String Prod =rs2.getString("idProduto");
				
				ListProd.add(Prod);
			
			}
			for(String p : ListProd) {
				String [] ElementProd = ListProd.toArray(new String[ListProd.size()]);
				
			ResultSet rs =sst.executeQuery("select poo_pw_pizzaria.ingrediente.idIngrediente"
					+ " from poo_pw_pizzaria.ingrediente"
					+ " inner join poo_pw_pizzaria.produto_has_ingrediente"
					+ " on poo_pw_pizzaria.ingrediente.idIngrediente=poo_pw_pizzaria.produto_has_ingrediente.Ingrediente_idIngrediente"
					+ " inner join poo_pw_pizzaria.produto"
					+ " on poo_pw_pizzaria.produto_has_ingrediente.Produto_idProduto=poo_pw_pizzaria.produto.idProduto"
					+ " where poo_pw_pizzaria.produto.idProduto='"+ElementProd[i]+"';");
			
			i++;
			
			while (rs.next()) {
				String idingre =rs.getString("idIngrediente");
				ListIngr.add(idingre);
				
				
			}
			}
			
			for(String c : ListIngr) {
				String [] ElementIngr = ListIngr.toArray(new String[ListIngr.size()]);
			sst.executeUpdate("update poo_pw_pizzaria.ingrediente"
					+ " set poo_pw_pizzaria.ingrediente.Qtd_Ingr=(poo_pw_pizzaria.ingrediente.Qtd_Ingr - 1)"
					+ " where poo_pw_pizzaria.ingrediente.idIngrediente='"+ElementIngr[j]+"';");
			
			j++;
			}
			connection.commit();
		} catch (Exception ex) {
		ex.printStackTrace();
		}
		new DBHandler().Computado(idCli);
	}
	
	public void Computado(String idCli) {
		System.out.println("entrou computado");
		try {
			sst = pegaConexao().createStatement();

			sst.executeUpdate("UPDATE poo_pw_pizzaria.pedido SET "
					+ "poo_pw_pizzaria.pedido.Status_Ped ='Computado' "
					+ "where poo_pw_pizzaria.pedido.Cliente_idCliente='"+idCli+"' and poo_pw_pizzaria.pedido.Status_Ped='Efetuada';");

			connection.commit();
		} catch (Exception ex) {
		ex.printStackTrace();
		}
	}
	
}
