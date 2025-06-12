/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import com.mycompany.snake.SnakeGame.Tile;
import java.awt.event.KeyEvent;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */

public class MovementAndCollision {

    private SnakeGame snakeGame;

    MovementAndCollision(SnakeGame snakeGame) {
        this.snakeGame = snakeGame;
    }

    public void move() {
      
        if (snakeGame.collision(snakeGame.snakeHead, snakeGame.food)) {
            snakeGame.snakeBody.add(snakeGame.new Tile(snakeGame.food.x, snakeGame.food.y));
            snakeGame.placeFood();
            
             
        }

     
        for (int i = snakeGame.snakeBody.size() - 1; i >= 0; i--) {
            Tile current = snakeGame.snakeBody.get(i);
            if (i == 0) {
                current.x = snakeGame.snakeHead.x;
                current.y = snakeGame.snakeHead.y;
            } else {
                Tile prev = snakeGame.snakeBody.get(i - 1);
                current.x = prev.x;
                current.y = prev.y;
            }
        }

       
        snakeGame.snakeHead.x += snakeGame.velocityX;
        snakeGame.snakeHead.y += snakeGame.velocityY;

        
        for (Tile part : snakeGame.snakeBody) {
            if (snakeGame.collision(snakeGame.snakeHead, part)) {
                snakeGame.gameOver = true;
            }
        }

       
        if (snakeGame.snakeHead.x < 0 || snakeGame.snakeHead.x >= snakeGame.boardWidth / snakeGame.tileSize ||
            snakeGame.snakeHead.y < 0 || snakeGame.snakeHead.y >= snakeGame.boardHeight / snakeGame.tileSize) {
            snakeGame.gameOver = true;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (snakeGame.velocityY != 1) {
                    snakeGame.velocityX = 0;
                    snakeGame.velocityY = -1;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (snakeGame.velocityY != -1) {
                    snakeGame.velocityX = 0;
                    snakeGame.velocityY = 1;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (snakeGame.velocityX != 1) {
                    snakeGame.velocityX = -1;
                    snakeGame.velocityY = 0;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (snakeGame.velocityX != -1) {
                    snakeGame.velocityX = 1;
                    snakeGame.velocityY = 0;
                }
                break;
        }
    }
}
