package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageObject {
	//Atributos
	//Caixa de Pesquisa
	@FindBy(id = "search")
	private WebElement busca;
	
	
	
	//Construtor
	public Home(WebDriver driver) {
		super(driver);
	}
	
			
	//Metodos e Funcoes a

	public void buscarProdutoComEnter(String produto) {
		busca.clear(); //Limpa a casa de Pesquisa a
		busca.sendKeys(produto + Keys.ENTER);
	}
}
