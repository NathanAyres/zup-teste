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
  "description": "\nComo um usuario \nGostaria de pesquisar um iten\nE adicionar esse item ao carrinho",
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
  "duration": 4470867400,
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
  "name": "que pesquiso um iten no e-comerce amazon",
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
  "name": "valido se o iten se encontra no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "ComprasSteps.que_pesquiso_um_iten_no_e_comerce_amazon()"
});
formatter.result({
  "duration": 1262810100,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.valido_a_pesquisa()"
});
formatter.result({
  "duration": 27409100,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.adiciono_esse_item_ao_carrinho()"
});
formatter.result({
  "duration": 5079423000,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.valido_se_o_iten_se_encontra_no_carrinho()"
});
formatter.result({
  "duration": 1210198000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat web.steps.ComprasSteps.valido_se_o_iten_se_encontra_no_carrinho(ComprasSteps.java:34)\r\n\tat ✽.E valido se o iten se encontra no carrinho(compras.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 811951000,
  "status": "passed"
});
});