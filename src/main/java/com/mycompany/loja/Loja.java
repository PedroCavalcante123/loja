package com.mycompany.loja;

import java.util.Scanner;

public class Loja {  
    
    private static Scanner scanner;
    private static Cliente[] clientes;
    private static Produto[] produtos;
    private static Fatura[] faturas;       
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        produtos = new Produto[10];
        clientes = new Cliente[10];
        faturas = new Fatura[10];
        menu();
    }  
    
    private static void cadastrarProduto(){
        
        int proxInd = -1;
        
        for(int i = 0; i < 10; i++){
            if(produtos[i]== null){
                proxInd = i;
                break;
            }
        }
        if(proxInd == -1){
            System.out.println("a lista esta cheia");
            return;
        }
         
        System.out.println("titulo");
        String titulo = scanner.next();
        System.out.println("preço");
        float preco = scanner.nextFloat();
        System.out.println("estoque");
        int estoque = scanner.nextInt();
        
        Produto p1 = new Produto(12,titulo,preco,estoque);
        produtos[proxInd] = p1;
    }
    private static void cadastrarCliente(){
        int proxInd = -1;
        
        for(int  i  = 0; i < 10; i++){
            if(clientes[i]== null){
                proxInd = i;
                break;
            }
        }
        if(proxInd == -1){
            System.out.println("a lista esta  cheia");
            return;
        }
        System.out.println("nome");
        String nome = scanner.next();
        System.out.println("email");
        String email = scanner.next();
        
        Cliente c1 = new Cliente(10,nome,email);
        clientes[proxInd] = c1;
    }
    
    private static void menu(){
        System.out.println("menu");
        System.out.println("1. cadastrar produto");
        System.out.println("2. cadastrar cliente");
        System.out.println("3. comprar produto");
        System.out.println("4. imprimir faturas");
        System.out.println("5. sair");
        int escolha = scanner.nextInt();
        
        switch(escolha){
            case 1: 
                cadastrarProduto();
                break;
            case 2:
                cadastrarCliente();
                break;
            case 3:
                comprarProduto();
                break;
            case 4:
                imprimirFaturas();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
              
               
        }
        menu();
    }
  private static void imprimirProdutos (){
      
      for(int i = 0;i < produtos.length; i++){
          if(produtos[i]== null){
              break;
          }
          System.out.println(i + " - "+ produtos[i].getTitulo()); 
          
      }
  } 
  private static void comprarProduto(){
      System.out.println("id do cliente");
      int id = scanner.nextInt();
      if(clientes[id] == null){
          return;
      }
      imprimirProdutos();
      int idProduto = scanner.nextInt();
      if(produtos[idProduto] == null){
          return;
          
      }
      Fatura fatura = new Fatura(0,id ,clientes[id].getEmail(),idProduto,produtos[idProduto].getPreco());
      for(int i = 0;i < faturas.length; i++){
          if(faturas[i]== null){
              faturas[i]= fatura; 
              break;
          }
      }
  }  
  private static void imprimirFaturas(){
      for(int i = 0;i < faturas.length; i++){
          if(faturas[i] == null){
              break;
          }
          System.out.println(faturas[i].toString());
      }
  }
}
