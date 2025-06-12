/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import com.mycompany.snake.SnakeGame.Tile;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */


public class SnakeDraw extends JPanel {

    private SnakeGame snakeGame;

    SnakeDraw(SnakeGame snakeGame) {
        this.snakeGame = snakeGame;
        
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < snakeGame.boardWidth / snakeGame.tileSize; i++) {
            g.setColor(Color.DARK_GRAY);
            g.drawLine(i * snakeGame.tileSize, 0, i * snakeGame.tileSize, snakeGame.boardHeight);
            g.drawLine(0, i * snakeGame.tileSize, snakeGame.boardWidth, i * snakeGame.tileSize);
        }

        
        g.setColor(Color.RED);
        g.fillRect(
            snakeGame.food.x * snakeGame.tileSize,
            snakeGame.food.y * snakeGame.tileSize,
            snakeGame.tileSize,
            snakeGame.tileSize
        );

        
        g.setColor(Color.CYAN);
        for (Tile part : snakeGame.snakeBody) {
            g.fillRect(
                part.x * snakeGame.tileSize,
                part.y * snakeGame.tileSize,
                snakeGame.tileSize,
                snakeGame.tileSize
            );
        }

       
        g.setColor(Color.BLUE);
        g.fillRect(
            snakeGame.snakeHead.x * snakeGame.tileSize,
            snakeGame.snakeHead.y * snakeGame.tileSize,
            snakeGame.tileSize,
            snakeGame.tileSize
        );

       
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        if (snakeGame.gameOver) {
            g.setColor(Color.RED);
            g.drawString("Game Over! Score: " + snakeGame.snakeBody.size(),
                         10, 20);
        } else {
            g.drawString("Score: " + snakeGame.snakeBody.size(), 10, 20);
        }
    }
}
