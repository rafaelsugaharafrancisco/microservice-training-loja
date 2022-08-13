package br.com.alura.loja.dto;

import java.util.List;

public class CompraDto {

	private List<ItemDto> itens;
	
	private LogradouroDto logradouro;

	public List<ItemDto> getItens() {
		return itens;
	}

	public void setItens(List<ItemDto> itens) {
		this.itens = itens;
	}

	public LogradouroDto getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroDto logradouro) {
		this.logradouro = logradouro;
	}
}
