/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estoque;

import java.util.ArrayList;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> estoque = new ArrayList<>();

    public void adicionarItem(String nome, int preco, int quantidadeAdicionar) {
        if (preco <= 0 || quantidadeAdicionar <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo e quantidade maior que zero.");
        }

        for (Produto prod : estoque) {
            if (prod.getNome().equalsIgnoreCase(nome)) {
                if (prod.getPreco() != preco) {
                    System.out.println("Aviso: Preço diferente para produto já existente. Usando preço antigo: " + prod.getPreco());
                }
                prod.addQuantidadeAtual(quantidadeAdicionar);
                return;
            }
        }

        Produto novoProduto = new Produto(nome, preco);
        novoProduto.addQuantidadeAtual(quantidadeAdicionar);
        estoque.add(novoProduto);
    }

    public int getQuantidade(String nomeProduto) {
        for (Produto prod : estoque) {
            if (prod.getNome().equalsIgnoreCase(nomeProduto)) {
                return prod.getQuantidadeAtual();
            }
        }
        return -1;
    }

    public String produtoMaisEstocados() {
        if (estoque.isEmpty()) {
            return null;
        }

        Produto maisEstocado = estoque.get(0);
        for (Produto prod : estoque) {
            if (prod.getQuantidadeAtual() > maisEstocado.getQuantidadeAtual()) {
                maisEstocado = prod;
            }
        }
        return maisEstocado.getNome();
    }

    public void limparEstoque() {
        estoque.clear();
    }

    public void removerItem(String nomeProduto, int quantidadeRemover) {
        for (Produto prod : estoque) {
            if (prod.getNome().equalsIgnoreCase(nomeProduto)) {
                if (quantidadeRemover > prod.getQuantidadeAtual()) {
                    throw new IllegalArgumentException("Quantidade insuficiente no estoque.");
                }
                prod.removeQuantidadeAtual(quantidadeRemover);
                if (prod.getQuantidadeAtual() == 0) {
                    estoque.remove(prod);
                }
                return;
            }
        }
        throw new IllegalArgumentException("Produto não encontrado: " + nomeProduto);
    }

 
    public void listarEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto prod : estoque) {
                System.out.println(prod);
            }
        }
    }
}

    

