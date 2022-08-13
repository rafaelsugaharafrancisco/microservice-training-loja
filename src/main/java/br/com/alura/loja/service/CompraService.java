package br.com.alura.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.loja.dto.CompraDto;

@Service
public class CompraService {

	public void efetuarCompra(CompraDto compra) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoDestinoDto> exchange = client.
				exchange("http://localhost:8081/info/" + compra.getLogradouro().getEstado(),
				HttpMethod.GET, null, InfoDestinoDto.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}
}
