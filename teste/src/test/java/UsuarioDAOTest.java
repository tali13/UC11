
import com.mycompany.teste.dao.UsuarioDAO;
import com.mycompany.teste.model.Usuario;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class UsuarioDAOTest {
    static UsuarioDAO dao;
    
    @BeforeAll
    static void setup() throws SQLException{
        dao = new UsuarioDAO();
        dao.criarTabela();
    }
    
    @Test
    void deveInserirUsuarioNoBanco() throws SQLException{
        Usuario usuario = new Usuario("Ana Silva","ana@mail");
        dao.inserir(usuario);
        assertTrue(usuario.getId() > 0, "ID deve ser gerado");
    }
    
    @Test
    void deveBuscarUsuarioPorId() throws SQLException{
        Usuario usuario = new Usuario("Roberto Carlos","Robertinho@gmail");
        dao.inserir(usuario);
        
        Usuario encontrado = dao.buscarPorId(usuario.getId());
        
        assertNotNull(encontrado);
        assertEquals(usuario.getNome(), encontrado.getNome());
        assertEquals(usuario.getEmail(), encontrado.getEmail());
    }
    
    @Test
    void deveAtualizarNome() throws SQLException{
        Usuario usuario = new Usuario("Roberto Carlos","Robertinho@gmail");
        dao.inserir(usuario);
        
        
        usuario.setNome("Roberto Carloss");
        usuario.setEmail("Robertinho2@gmail");
        
        Usuario usuario2 = dao.update(usuario);
        
        assertNotNull(usuario2);
        assertEquals("Roberto Carloss", usuario2.getNome());
        assertEquals("Robertinho2@gmail", usuario2.getEmail());  
    }
    
    @Test
    void deveDeletarUsuario() throws SQLException{
        Usuario usuario = new Usuario("Roberto Carlos","Robertinho@gmail");
        dao.inserir(usuario);
        
        assertTrue(dao.delete(usuario));
    }
    
    
    
}
