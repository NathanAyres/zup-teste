$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("compras.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Adicionar um item ao carrinho",
  "description": "\r\nComo um usuario \r\nGostaria de pesquisar um item\r\nE adicionar esse item ao carrinho",
  "id": "adicionar-um-item-ao-carrinho",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.before({
  "duration": 2503925499,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Pesquisar um item e adicionar ao carrinho",
  "description": "",
  "id": "adicionar-um-item-ao-carrinho;pesquisar-um-item-e-adicionar-ao-carrinho",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 9,
      "name": "@COMPRAS"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que pesquiso um item no e-commerce amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "valido a pesquisa",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "adiciono esse item ao carrinho",
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "valido se o item se encontra no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "ComprasSteps.que_pesquiso_um_item_no_e_commerce_amazon()"
});
formatter.result({
  "duration": 1298152500,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.valido_a_pesquisa()"
});
formatter.result({
  "duration": 18203200,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.adiciono_esse_item_ao_carrinho()"
});
formatter.result({
  "duration": 3890864499,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.valido_se_o_item_se_encontra_no_carrinho()"
});
formatter.result({
  "duration": 4006676000,
  "status": "passed"
});
formatter.after({
  "duration": 654863299,
  "status": "passed"
});
});