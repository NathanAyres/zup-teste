#language: pt
@funcionais
Funcionalidade: Adicionar um item ao carrinho
  
  Como um usuario 
  Gostaria de pesquisar um iten
  E adicionar esse item ao carrinho

  @COMPRAS
  Cenario: Pesquisar um item e adicionar ao carrinho
    Dado que pesquiso um iten no e-comerce amazon
 		Quando valido a pesquisa
    Entao adiciono esse item ao carrinho 
    E valido se o iten se encontra no carrinho 