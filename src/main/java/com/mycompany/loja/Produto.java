/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author ppedr
 */
public class Produto {
    private int id;
    private String titulo;
    private float preco;
    private int estoque;

    public Produto(int id, String titulo, float preco, int estoque) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void reduzirEstoque() {
        if (estoque > 0) {
            estoque--;
        }
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Preço: " + preco + ", Estoque: " + estoque;
    }
}

