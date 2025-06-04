
import com.mycompany.calculadora.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class calculadoraTest {
    private calculadora calc;
    
    
    @BeforeEach
    void setUp(){
        calc = new calculadora();
    }
    
    
    
    
    
    
  
    @Test
    public void testSomar() {
       
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 + 3 deve ser 5");//Compara dois valores e verifica se são iguais.
    }
    
      @Disabled
    @Test
    public void testDivisao() {
        
       
        assertEquals(1,calc.divisao(10, 10), "A soma de 10 + 10 ");
    }
    
    
    
    
    
}
