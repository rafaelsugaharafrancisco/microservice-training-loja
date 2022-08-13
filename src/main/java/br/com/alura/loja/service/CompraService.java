package br.com.alura.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.loja.dto.CompraDto;

@Service
public class CompraService {

	@Autowired
	private RestTemplate client;
	
	public void efetuarCompra(CompraDto compra) {
		
		ResponseEntity<InfoDestinoDto> exchange = client.
				exchange("http://fornecedor/info/" + compra.getLogradouro().getEstado(),
				HttpMethod.GET, null, InfoDestinoDto.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}
}
