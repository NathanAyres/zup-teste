package web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComprasAction extends BaseActions {

	public ComprasAction(WebDriver driver) {
		super(driver);
	}

	public void pesquisarIten(String item) {
		WebElement campoPesquisa = driver.findElement(By.id("twotabsearchtextbox"));
		campoPesquisa.click();
		campoPesquisa.sendKeys(item);
		campoPesquisa.submit();
	}

	public void validarPesquisa(String iten) throws Exception {
		String pesquisa = driver.findElement(By.xpath(
				"//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[@class=\"a-color-state a-text-bold\"]"))
				.getText();
		boolean compara = pesquisa.contains(iten);
		if (compara == false) {
			throw new Exception("Retorno de Pesquisa incorreto");
		}
	}

	public void selecionarProduto() throws Exception {
		driver.findElement(By.xpath(
				"//div[@class='a-section aok-relative s-image-fixed-height']/img[@src='https://m.media-amazon.com/images/I/61Rr8uxmREL._AC_UY218_ML3_.jpg']")).click();
	}

	public void adicionarCarrinho() {
		WebElement addCarrinho = driver.findElement(By.id("add-to-cart-button"));
		addCarrinho.click();
	}
	
	public boolean verificarCarrinho() {
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2']")).click();
		WebElement btnFecharPedido = driver.findElement(By.xpath("//div[@class='a-box a-color-alternate-background sc-buy-box-inner-box']"));
		boolean validaCarrinho = btnFecharPedido.isDisplayed();
		return validaCarrinho;
	}
}
