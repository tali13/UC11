
import com.mycompany.estoque.Estoque;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class EstoqueTest {
    private Estoque estoque ; 
    
    
    
     @BeforeEach
    void setUp() {
        estoque = new Estoque();
    }

    @Test
    void testAdicionarItemNovo() {
        estoque.adicionarItem("Arroz", 500, 10);
        assertEquals(10, estoque.getQuantidade("Arroz"));
    }

    @Test
    void testAdicionarItem() {
        estoque.adicionarItem("Feijão", 700, 5);
        estoque.adicionarItem("Feijão", 700, 3);
        assertEquals(8, estoque.getQuantidade("Feijão"));
    }

    @Test
    void testAdicionarItem7() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estoque.adicionarItem("Macarrão", -100, 2);
        });
        assertEquals("Preço deve ser positivo e quantidade maior que zero.", exception.getMessage());
    }

    @Test
    void testConsultarQuantidade() {
        assertEquals(-1, estoque.getQuantidade("ProdutoInexistente"));
    }

    @Test
    void testRemoverItemC() {
        estoque.adicionarItem("Açúcar", 400, 6);
        estoque.removerItem("Açúcar", 4);
        assertEquals(2, estoque.getQuantidade("Açúcar"));
    }

    @Test
    void testRemoverItemCi() {
        estoque.adicionarItem("Sal", 200, 1);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estoque.removerItem("Sal", 2);
        });
        assertEquals("Quantidade insuficiente no estoque.", exception.getMessage());
    }

    @Test
    void testProdutoM() {
        estoque.adicionarItem("Leite", 300, 5);
        estoque.adicionarItem("Café", 500, 10);
        // Apenas testa se método roda sem erro
        assertDoesNotThrow(() -> estoque.produtoMaisEstocados());
    }

    @Test
    void testLimparE() {
        estoque.adicionarItem("Biscoito", 250, 4);
        estoque.limparEstoque();
        assertEquals(-1, estoque.getQuantidade("Biscoito"));
    }
}

