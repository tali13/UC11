
import com.mycompany.calcular.Calcular;
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
public class calcularTest {
    
    private Calcular calc;
    
    @BeforeEach
    void setUp (){
        
        calc = new Calcular();
    }
    
    @Test
    public void somar (){
        
    int resultado  = calc.somar(20,90);    
    
        assertEquals(110,resultado, "resultados" );
    }
    
    
        @Test
    public void dividir (){
        
 
    
        assertEquals(2,calc.dividir(20,10), "resultados" );
    }
    
            @Test
    public void dividirZero (){
       Exception e = assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    
        assertEquals(0,calc.dividirZeros(10,0), "resultados" );
    }
    
    
   
            @Test
    public void multiplicar (){
        

    
        assertEquals(1800,calc.multiplicar(20,90), "resultados" );
    }
    
            @Test
      public void subtrair (){
        

    
        assertEquals(-70,calc.subtrair(20,90), "resultados" );
        
        
    }
       
     
      @Test
      public void potencia (){
          assertEquals(9,calc.potencia(3,2));
          
      }
      
      
     
      
      @Test
      public void raiz (){
          
          
          
          assertEquals(5,calc.raiz(25));
          
      }
      
     @Test
public void raizNegativa() {
  
    Exception e = assertThrows(IllegalArgumentException.class, () -> calc.raiz(-4));
    
    assertEquals("não e possivel calcular a raiz quadrada de numero negativo", e.getMessage());
}

}

