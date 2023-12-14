package br.edu.infnet.BookstoreApp.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	private static int proximoId = 1;

    private int id;
    private LocalDateTime dataPedido;
    private StatusPedido status;
    private Usuario cliente;
    private List<ItemDeCarrinho> itensCarrinho;
    
    private CarrinhoDeCompras carrinho;

    public Pedido() {
        this.id = proximoId++;
    }

    public Pedido(LocalDateTime dataPedido, StatusPedido status, Usuario cliente, List<ItemDeCarrinho> itensCarrinho) {
        this();
        this.dataPedido = dataPedido;
        this.status = status;
        this.cliente = cliente;
        this.itensCarrinho = itensCarrinho;
    }

    @Override
    public String toString() {
        return String.format("Pedido - Data: %s, Status: %s", dataPedido, status);
    }

    public int getId() {
        return id;
    }
    
    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public List<ItemDeCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    public void setItensCarrinho(List<ItemDeCarrinho> itensCarrinho) {
        this.itensCarrinho = itensCarrinho;
    }
}