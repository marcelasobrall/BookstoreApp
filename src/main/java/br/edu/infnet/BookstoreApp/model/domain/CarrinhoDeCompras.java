package br.edu.infnet.BookstoreApp.model.domain;

import java.math.BigDecimal;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemDeCarrinho> itens;
    private BigDecimal total;
    private Usuario cliente;

    private List<Pedido> pedidos;
    
   
    public CarrinhoDeCompras() {
       
    }

    public CarrinhoDeCompras(List<ItemDeCarrinho> itens, BigDecimal total, Usuario cliente) {
        this.itens = itens;
        this.total = total;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("Carrinho de Compras - Total: %.2f", total);
    }

	public List<ItemDeCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItemDeCarrinho> itens) {
		this.itens = itens;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
}