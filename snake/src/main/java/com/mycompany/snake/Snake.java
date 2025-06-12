/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.snake;

import javax.swing.JFrame;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Snake {

    public static void main(String[] args) {
     int  boardWidth =900; // controla a largura da tela
     int boardHeight = boardWidth;// controla a altura de tela
     
     
     JFrame frame = new JFrame ("snake");// cria um JFrame novo
        
     frame.setVisible(true);
     frame.setSize(boardWidth + 16, boardHeight + 45);// define o tamanho dele
     frame.setLocationRelativeTo(null); //faz com que a tela no meio
     frame.setResizable(false);// não deixa aumentar a tela/diminuir
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        
        
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
       

        
        snakeGame.requestFocus();

        
        
    }   
}
