package DAO;

import Models.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tiagu
 */
public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserir(Usuario usuario) throws SQLException{
            String adicionar = "INSERT INTO usuario (nome_usuario, senha_usuario) VALUES ('"+usuario.getNome()+"', '"+usuario.getSenha()+"')";
            Statement stm = connection.createStatement();
            stm.execute(adicionar);
            connection.close();
    }
}
