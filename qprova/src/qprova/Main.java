package qprova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da loja: ");
        String nomeLoja = scanner.nextLine();

        Loja loja = new Loja(nomeLoja);

        System.out.print("Digite a quantidade de produtos: ");
        int numeroQtdProdutos = scanner.nextInt();
       
        for (int i = 1; i <= numeroQtdProdutos; i++) {
            System.out.println("Informe os Dados do " + i + "º produto:");
            System.out.print("Nome do produto: ");
            scanner.nextLine(); 
            String nomeProduto = scanner.nextLine();

            System.out.print("Preço do produto: ");
            double preco = scanner.nextDouble();

            Produto produto = new Produto(nomeProduto, preco);
            loja.adicionarProduto(produto);
        }

        Produto maisCaro = loja.produtoMaisCaro();
        Produto maisBarato = loja.produtoMaisBarato();
        double precoMedio = loja.precoMedio();
      
        System.out.println("\nProduto Mais Caro: " + (maisCaro));
        System.out.println("Produto Mais Barato: " + (maisBarato));
        System.out.printf("Média de preços: " + precoMedio);  
    }
}
