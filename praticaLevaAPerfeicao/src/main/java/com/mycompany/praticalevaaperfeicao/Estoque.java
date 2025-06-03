/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praticalevaaperfeicao;

import java.util.ArrayList;

/**
 *
 * @author JOAOPEDROBACKXAVIER
 */
public class Estoque {
    
    public Produto buscarProduto(ArrayList<Produto> estoque, String nomeBuscado) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }
    
    public void adicionarProduto(ArrayList<Produto> estoque, String nome, int quantidade){
        Produto produto = buscarProduto(estoque, nome);
        if(produto == null){
            Produto novoProduto = new Produto(nome, quantidade);
            estoque.add(novoProduto);        
        }else{
            produto.setQuantidade(produto.getQuantidade() + quantidade);
        }
    }
    
    public void removerProduto(ArrayList<Produto> estoque, String nome, int quantidade){
        Produto produto = buscarProduto(estoque,nome);
        if(produto.getQuantidade() >= quantidade){
            produto.setQuantidade(produto.getQuantidade() - quantidade);
        }else{
            throw new IllegalArgumentException("Produto '" + nome + "' tem menos de " + quantidade);
        }
    }
    
    public int consultarQuantidade(ArrayList<Produto> estoque, String nome){
        Produto produto = buscarProduto(estoque,nome);   
        if(produto == null){
            throw new IllegalArgumentException("Produto '" + nome + "' nao existe");            
        }
        return produto.getQuantidade();
    }
    
    public String produtoMaisEstocado(ArrayList<Produto> estoque){
        Produto produtoMaisEstocado = new Produto("",0);
        if(estoque.isEmpty()){
            throw new IllegalArgumentException("Estoque vazio");
        }else{
            for (Produto produto: estoque){
                if (produto.getQuantidade() > produtoMaisEstocado.getQuantidade()){
                    produtoMaisEstocado = new Produto(produto.getNome(), produto.getQuantidade());
                }
            }            
        }
        return produtoMaisEstocado.getNome();
    }
    
    public ArrayList<Produto> limparEstoque(ArrayList<Produto> estoque){
        estoque.clear();
        return estoque;
    }
    
}
