package DAO;

import Models.Cliente;
import Models.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tiagu
 */
public class ClienteDAO {
    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserir(Cliente cliente) throws SQLException{
            String adicionar = "INSERT INTO clientes (nome, telefone, cep, rua, bairro, complemento, numero) VALUES (' " + cliente.getNome() + " ',' " + cliente.getTelefone() + " ',' " + cliente.getCep() + " ',' " + cliente.getRua() + " ',' " + cliente.getBairro() + " ',' " + cliente.getComplemento() + " ',' " + cliente.getNumero() + " ')";
            Statement stm = connection.createStatement();
            stm.execute(adicionar);
            connection.close();
    }
    
}
