#language: pt
@funcionais
Funcionalidade: Adicionar um item ao carrinho
  
  Como um usuario 
  Gostaria de pesquisar um item
  E adicionar esse item ao carrinho

  @COMPRAS
  Cenario: Pesquisar um item e adicionar ao carrinho
    Dado que pesquiso um item no e-commerce amazon
 		Quando valido a pesquisa
    Entao adiciono esse item ao carrinho 
    E valido se o item se encontra no carrinho 