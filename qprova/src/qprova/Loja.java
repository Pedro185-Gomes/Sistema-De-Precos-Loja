package qprova;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> produtos;
   
    public Loja(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto produtoMaisCaro() {
        if (produtos.isEmpty()) return null;

        Produto maisCaro = produtos.get(0);
        for (Produto p : produtos) {
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }
        return maisCaro;
    }

    public Produto produtoMaisBarato() {
        if (produtos.isEmpty()) return null;

        Produto maisBarato = produtos.get(0);
        for (Produto p : produtos) {
            if (p.getPreco() < maisBarato.getPreco()) {
                maisBarato = p;
            }
        }
        return maisBarato;
    }

    public double precoMedio() {
        if (produtos.isEmpty()) return 0;
        double soma = 0;
        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        return soma / produtos.size();
    }
}

