/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.dao;

import com.mycompany.teste.database.DatabaseConnection;
import com.mycompany.teste.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class UsuarioDAO {
    
    public void criarTabela() throws SQLException {
        
        String sql = " CREATE TABLE IF NOT EXISTS usuarios (id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(100), email VARCHAR(100))";
        try(Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } 
    }
    
    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?,?)";
        String sqlSelect = "SELECT id FROM usuarios WHERE email = ?";
        
        try(Connection conn = DatabaseConnection.getConnection()){
            try(PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, usuario.getNome());
                pstmt.setString(2, usuario.getEmail());
                pstmt.executeUpdate();
            }
            try(PreparedStatement pstmt = conn.prepareStatement(sqlSelect)){
                pstmt.setString(1, usuario.getEmail());
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        usuario.setId(rs.getInt("id"));
                    }
                }
            }
        }
     
    }
    public Usuario buscarPorId(int id) throws SQLException{
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try(Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);
            
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    return new Usuario(rs.getInt("id"), rs.getString("nome"),rs.getString("email"));
                }
            }
        }
        return null;
    }
     public Usuario update(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuarios SET nome = ?, email = ? WHERE id = ?";
        String sqlSelect = "SELECT * FROM usuarios WHERE id = ?";
        
        try(Connection conn = DatabaseConnection.getConnection()){
            try(PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, usuario.getNome());
                pstmt.setString(2, usuario.getEmail());
                pstmt.setInt(3, usuario.getId());
                pstmt.executeUpdate();
            }
            try(PreparedStatement pstmt = conn.prepareStatement(sqlSelect)){
                pstmt.setInt(1, usuario.getId());
                try(ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        Usuario user2 = new Usuario(rs.getString("nome"),rs.getString("email"));
                        usuario.setId(rs.getInt("id"));
                        return user2;
                    }
                }
            }
            
            
        }
     return null;
    }
     public boolean delete(Usuario usuario) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        
        try(Connection conn = DatabaseConnection.getConnection()){
            try(PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, usuario.getId());
                if(pstmt.executeUpdate() > 0){
                    return true;
                }
            }            
            
        }
     return false;
    }
    
    
    
    
}
