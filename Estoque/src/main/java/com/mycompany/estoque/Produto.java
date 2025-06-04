/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoque;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Produto {
    
String produto;
int preco;
String nome;
int quantidade;

    public Produto(String produto, int preco) {
        this.nome = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setProduto(String produto) {
        this.nome = produto;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAtual() {
        return quantidade;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidade = quantidadeAtual;
    }

      public void addQuantidadeAtual(int quantidadeAtual) {
        this.quantidade += quantidadeAtual;
    }
   public void removeQuantidadeAtual(int quantidadeAtual) {
        this.quantidade -= quantidadeAtual;
    }
    
    
    
    
    
}
