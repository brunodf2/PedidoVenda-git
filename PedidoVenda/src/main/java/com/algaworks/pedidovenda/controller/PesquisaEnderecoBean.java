package com.algaworks.pedidovenda.controller;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaEnderecoBean {

	
	
	
	private List<Integer> enderecoFiltrado;
	
	public PesquisaEnderecoBean() {
		enderecoFiltrado = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			enderecoFiltrado.add(i);
		}
	}

	public List<Integer> getEnderecoFiltrado() {
		return enderecoFiltrado;
	}
	
	
}
