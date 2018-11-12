package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ViewScoped
public class ClienteBean implements Serializable {


	private static final long serialVersionUID = 1L;

	private List<Cliente> clientes;
	private Cliente cliente;
	private Cliente clienteSelecionado;
	
	@PostConstruct
	public void init() {
		cliente = new Cliente();
		clientes = new ArrayList<>();
			
	}
	
	public void novoCliente() {
		clientes.add(cliente);
		cliente = new Cliente();
		
		System.out.println("Metodo incluir confirmado");
	}
	
	public void excluiCliente() {
		clientes.remove(clienteSelecionado);
		cliente = new Cliente();
		clienteSelecionado = null;
		
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "cliente excluido com sucesso!", "cliente excluido com sucesso!" );
		context.addMessage("avisoExclusao", msg);
		
		System.out.println("Metodo excuir confirmado!");
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}
	
}
