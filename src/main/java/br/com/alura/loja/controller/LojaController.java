package br.com.alura.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.loja.dto.CompraDto;
import br.com.alura.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class LojaController {
	
	@Autowired
	private CompraService cs;
	
	@PostMapping
	public void realizarCompra(@RequestBody CompraDto compra) {
		
		cs.efetuarCompra(compra);
	}

}
