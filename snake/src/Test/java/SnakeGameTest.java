

import com.mycompany.snake.Snake;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import com.mycompany.snake.SnakeGame;
import com.mycompany.snake.SnakeGame.Tile;
import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TALITANAIBERTDACOSTA
 */


public class SnakeGameTest {

    private SnakeGame sn;

    @BeforeEach
    void setup() {
        sn = new SnakeGame(900, 900);
    }

    @Test
    public void testBoardSize() {
        assertEquals(900, sn.boardWidth);
        assertEquals(900, sn.boardHeight);
    }

    @Test
    public void testSnakeHeadPosition() {
  SnakeGame gameSnake = new SnakeGame(900, 900);
  
  int x = gameSnake.snakeHead.x;
   int y = gameSnake.snakeHead.y; 
   
   assertEquals(5, x);
        assertEquals(5, y);
    }

    @Test
    public void testFoodPosition() {
         SnakeGame gameSnake = new SnakeGame(900, 900);
  
  int foodx = gameSnake.food.x;
   int foody = gameSnake.food.y; 
   
   assertNotEquals(10, foodx);
   
        assertNotEquals(10, foody);
    }

    @Test
    public void testInitialGameOverState() {
        assertFalse(sn.gameOver);
    }

    @Test
    public void testPlaceFoodChangesPosition() {
  
              SnakeGame gameSnake = new SnakeGame(900, 900);
  

  
   
 
   
SnakeGame.Tile origin = gameSnake.new Tile(gameSnake.food.x, gameSnake.food.y);

    gameSnake.placeFood();
    
    Tile changed = gameSnake.food;
    
    
       assertFalse(gameSnake.collision(changed, origin));
       
   //assertTrue(gameSnake.collision(changed, origin));
       
   
   
    }


    @Test
    public void testMoveChangesHeadPosition() {
   
                  SnakeGame gameSnake = new SnakeGame(900, 900);
  
  int movex = gameSnake.snakeHead.x;
   int movey = gameSnake.snakeHead.y; 
   
   
   gameSnake.move();
   
       
   
  int NewMove = gameSnake.snakeHead.getX();
  int Newmove = gameSnake.snakeHead.getY(); 

   
   assertEquals(6, NewMove);
        assertEquals(5, Newmove);
        
    }

    @Test
    public void testKeyPressedUp() {
        KeyEvent upEvent = new KeyEvent(sn, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'W');
        sn.keyPressed(upEvent);
        assertEquals(0, sn.velocityX);
        assertEquals(-1, sn.velocityY);
    }

    @Test
    public void testKeyPressedDownWhenMovingUp() {
        sn.velocityY = -1;
        KeyEvent downEvent = new KeyEvent(sn, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'S');
        sn.keyPressed(downEvent);
        assertEquals(1, sn.velocityX);
        assertEquals(-1, sn.velocityY);
    }

    @Test
    public void testKeyPressedLeft() {
        KeyEvent leftEvent = new KeyEvent(sn, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'A');
        sn.keyPressed(leftEvent);
        assertEquals(1, sn.velocityX);
        assertEquals(0, sn.velocityY);
    }

    @Test
    public void testKeyPressedRightWhenMovingLeft() {
        sn.velocityX = -1;
        KeyEvent rightEvent = new KeyEvent(sn, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'D');
        sn.keyPressed(rightEvent);
        assertEquals(-1, sn.velocityX);
        assertEquals(0, sn.velocityY);
    }

  @Test
public void testCollisionWithBoardEdgeEndsGame() {
    SnakeGame gameSnake = new SnakeGame(10, 10); 
    
   gameSnake.snakeHead = gameSnake.new Tile(129,0);
    
    gameSnake.velocityX = 0;
    
    gameSnake.velocityY = -1;
    
    gameSnake.move();
    
    assertTrue(gameSnake.gameOver);
    
  }

}
