package br.edu.infnet.BookstoreApp.model.domain;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private TipoUsuario tipo;
    private CarrinhoDeCompras carrinho;
    private List<Pedido> pedidos;
    

    private List<Avaliacao> avaliacoes;


    public Usuario() {
        
    }

    public Usuario(String nome, String email, String senha, TipoUsuario tipo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return String.format("Usuário: Email=%s, Nome=%s, Tipo=%s", email, nome, tipo);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public CarrinhoDeCompras getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoDeCompras carrinho) {
		this.carrinho = carrinho;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}