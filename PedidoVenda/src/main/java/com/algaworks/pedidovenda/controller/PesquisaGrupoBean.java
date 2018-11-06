package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaGrupoBean {

	private List<Integer> grupoFiltrado;
	
	public PesquisaGrupoBean() {
		grupoFiltrado = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			grupoFiltrado.add(i);
		}
	}

	public List<Integer> getGrupoFiltrado() {
		return grupoFiltrado;
	}
	
}
