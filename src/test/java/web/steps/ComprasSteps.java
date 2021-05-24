package web.steps;

import org.junit.Assert;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import web.actions.ComprasAction;
import web.core.ThreadDriver;
import web.core.Utils;

public class ComprasSteps {
	
	ComprasAction compras = new ComprasAction(ThreadDriver.getTDriver());
		
	@Dado("^que pesquiso um item no e-commerce amazon$")
	public void que_pesquiso_um_item_no_e_commerce_amazon() throws Throwable {
		compras.pesquisarItem(Utils.obterDadosChave("item"));
	}

	@Quando("^valido a pesquisa$")
	public void valido_a_pesquisa() throws Throwable {
		compras.validarPesquisa(Utils.obterDadosChave("item"));
	}

	@Entao("^adiciono esse item ao carrinho$")
	public void adiciono_esse_item_ao_carrinho() throws Throwable {
		compras.selecionarProduto();
		compras.adicionarCarrinho();
	}

	@E("^valido se o item se encontra no carrinho$")
	public void valido_se_o_item_se_encontra_no_carrinho() throws Throwable {
		Assert.assertTrue(compras.verificarCarrinho());
	}

}