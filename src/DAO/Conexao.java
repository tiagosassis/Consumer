package DAO;

/**
 *
 * @author lilianevale
 * #RoubeiOCódigoMesmo!
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe utilizada para conectar e desconectar do banco de dados.
 */

public class Conexao {
    public static Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/consumer", "root", "");     
        } catch (SQLException ex) {
            System.out.println("Erro: Não conseguiu conectar no BD." + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: Não encontrou o driver do BD.");
        }
        return conn;
    }

    public static void desconectar(Connection conn) {
        try {
            if(conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Não conseguiu desconectar do BD.");
        }
    }
  
    public static String consulta() {
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
        String stringResultado = "";
        try {
            String consulta = "SELECT * FROM usuario";
            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while(resultado.next()) {
                stringResultado += resultado.getString("nome_usuario");
                stringResultado += "-";
                stringResultado += resultado.getString("senha_usuario");
                stringResultado += "-";
            }
        } catch (SQLException ex) {
            System.out.println("Não conseguiu consultar os dados de usuario.");
        }
        finally {
            conexao.desconectar(conn);
        }
        return stringResultado;
    }
    
    public static void inserirUsuario() {
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
        try {
            String adicionar = "INSERT INTO usuario (nome_usuario, senha_usuario) VALUES ('root', 'admin')";
        
            Statement stm = conn.createStatement();
            stm.execute(adicionar);
            System.out.println("Adicionou a pessoa carro no BD.");
        } catch (SQLException ex) {
            System.out.println("Não conseguiu adicionar uma pessoa no BD.");
        } finally {
            conexao.desconectar(conn);
        }
    }
    
    public static void inserirProduto() {
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
        try {
            String adicionar = "INSERT INTO usuario (nome_usuario, senha_usuario) VALUES ('root', 'admin')";
        
            Statement stm = conn.createStatement();
            stm.execute(adicionar);
            System.out.println("Adicionou a pessoa carro no BD.");
        } catch (SQLException ex) {
            System.out.println("Não conseguiu adicionar uma pessoa no BD.");
        } finally {
            conexao.desconectar(conn);
        }
    }
  
    public static void excluir() throws Exception{
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
	Statement stmt= null;
	stmt = conn.createStatement();   
	String excluir = "DELETE FROM employees WHERE employeeNumber=1.504";		
	stmt.executeUpdate(excluir);
	conn.close();
	stmt.close();
    }
    
    public static void consultarPorNome(String nome) {
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();   // Carro carro = null;
        try {
            String consulta = "SELECT * FROM employees WHERE firstName = '" + nome + "'";
            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery(consulta);
            while(resultado.next()) {
                System.out.print(resultado.getString("firstName"));
                System.out.print(" - " + resultado.getString("lastName"));
                System.out.print(" - " + resultado.getInt("employeeNumber") + "\n");
            }
        } catch (SQLException ex) {
            System.out.println("Nao conseguiu consultar os dados.");
        }

    }
    
    public static void atualizar() {
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
        try {
            String atualizar = "UPDATE employees SET firstName = 'Rafael' WHERE firstName = 'Liliane'";

            Statement stm = conn.createStatement();
            stm.executeUpdate(atualizar);
            System.out.println("Atualizou o nome de liliane para rafael.");
        } catch (SQLException ex) {
            System.out.println("Não conseguiu atualizar uma pessoa no BD.");
        } finally {
            conexao.desconectar(conn);
        }
    }
}


