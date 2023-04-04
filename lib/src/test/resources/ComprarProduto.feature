#language: pt
Funcionalidade: Comprar Produto
	# Fluxo de compras no site Petz
	# Envolve as P�ginas Home, Resultado da consulta e Detalhes P�ginas
	
	Cenario: Compra a partir de uma busca
	Dado que acesso o site Petz
	Quando busco por "coleira" e pressiono Enter
	Entao exibe uma lista de produtos relacionados com "coleira"
	Quando escolho "Coleira Petz Planetário para Cães"
	Entao exibe para o "Tamanho G" o preco de "R$ 49.99"