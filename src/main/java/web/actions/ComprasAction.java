package web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComprasAction extends BaseActions {

	public ComprasAction(WebDriver driver) {
		super(driver);
	}

	public void pesquisarItem(String item) {
		WebElement campoPesquisa = driver.findElement(By.id("twotabsearchtextbox"));
		campoPesquisa.click();
		campoPesquisa.sendKeys(item);
		campoPesquisa.submit();
	}

	public void validarPesquisa(String item) throws Exception {
		String pesquisa = driver.findElement(By.xpath(
				"//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[@class=\"a-color-state a-text-bold\"]"))
				.getText();
		boolean compara = pesquisa.contains(item);
		if (compara == false) {
			throw new Exception("Retorno de Pesquisa incorreto");
		}
	}

	public void selecionarProduto() throws Exception {
		driver.findElement(By.xpath(
				"//div[@class='a-section aok-relative s-image-square-aspect']/img[@src='https://m.media-amazon.com/images/I/41GZCWFJB1L._AC_UL320_.jpg']")).click();
	}

	public void adicionarCarrinho() {
		WebElement addCarrinho = driver.findElement(By.id("add-to-cart-button"));
		addCarrinho.click();
	}
	
	public boolean verificarCarrinho() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("nav-cart-count-container")).click(); 
		WebElement btnFecharPedido = driver.findElement(By.xpath("//span[@class='a-button a-button-normal a-button-span12 a-button-primary']"));
		boolean validaCarrinho = btnFecharPedido.isDisplayed();
		return validaCarrinho;
	}
}
