/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */


public class SnakeGame extends JPanel implements ActionListener, KeyListener {

    public class Tile {
        public int x, y;

        public  Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
        
    }

    public int boardWidth, boardHeight;
    public int tileSize = 30;
    public Tile snakeHead;
   public  ArrayList<Tile> snakeBody;
   public  Tile food;
    public Random random;
   public  int velocityX, velocityY;
    public Timer gameLoop;
   public  boolean gameOver = false;

    public MovementAndCollision movementAndCollision;
  public   SnakeDraw snakeDraw;

    
       public SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);

        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<>();
        food = new Tile(10,10);
        random = new Random();

        velocityX = 1;
        velocityY = 0;

        movementAndCollision = new MovementAndCollision(this);
        snakeDraw = new SnakeDraw(this);

        gameLoop = new Timer(100, this);
        gameLoop.start();
        
    }
       
       public void restart(){
           snakeHead.x = 5;
           snakeHead.y = 5;
           food.x = 10;
           food.y = 10;
           snakeBody.clear();
           velocityX = 1;
           velocityY = 0;
           gameOver = false;
           gameLoop.start();
       }

    public void placeFood() {
    boolean valid = false;
    while (!valid) {
        int posX = random.nextInt(boardWidth / tileSize);
        int posY = random.nextInt(boardHeight / tileSize); 

        boolean onSnake = (snakeHead.x == posX && snakeHead.y == posY);
        for (Tile part : snakeBody) {
            if (part.x == posX && part.y == posY) {
                onSnake = true;
                break;
            }
        }

        if (!onSnake) {
            food = new Tile(posX, posY);
            valid = true;
        }
    }
    
}


    public void move() {
        movementAndCollision.move();
    }

    public boolean collision(Tile tile1, Tile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameOver) {
            gameLoop.stop();
            restart();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        movementAndCollision.keyPressed(e);
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        snakeDraw.paintComponent(g);
    }
    
}
