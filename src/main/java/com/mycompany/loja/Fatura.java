/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author ppedr
 */
public class Fatura {
    int id;
    int id_cliente;
    String email_cliente;
    int id_produto;
    float valor;

    public Fatura(int id, int id_cliente, String email_cliente, int id_produto, float valor) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.email_cliente = email_cliente;
        this.id_produto = id_produto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Fatura ID: " + id + ", Cliente ID: " + id_cliente + ", Email Cliente: " + email_cliente + 
               ", Produto ID: " + id_produto + ", Valor: R$" + valor;
    }
}
