package br.edu.infnet.BookstoreApp.model.domain;

public class ItemDeCarrinho {
    private static int proximoId = 1;
    private int id;
    private Livro livro;
    private int quantidade;
    
    private CarrinhoDeCompras carrinho;
  
    public ItemDeCarrinho() {
        this.id = proximoId++;
      
    }
    public ItemDeCarrinho(Livro livro, int quantidade) {
        this();
        this.livro = livro;
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return String.format("Item - Livro: %s, Quantidade: %d", livro.getTitulo(), quantidade);
    }
    public int getId() {
        return id;
    }


	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}