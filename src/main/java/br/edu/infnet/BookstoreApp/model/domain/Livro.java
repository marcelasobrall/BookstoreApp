package br.edu.infnet.BookstoreApp.model.domain;

import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private double preco;
    private List<Avaliacao> avaliacoes;
    private List<String> autores;
    private List<String> generos;

    private List<ItemDeCarrinho> itensCarrinho;
    
 
    public Livro() {
        
    }

    public Livro(String titulo, String autor, String genero, String sinopse, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return String.format("Livro: %s, Autor: %s, Gênero: %s, Preço: %.2f", titulo, autor, genero, preco);
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	 public void setItensCarrinho(List<ItemDeCarrinho> itensCarrinho) {
	        this.itensCarrinho = itensCarrinho;
	    }
}