// 1 - Nome do pacote
package petz;

//2- Bibliotecas importadas
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//3- Classe
public class Simples {
	//3.1 - Atributos
	String url; 	  //Endereço do site alvo
	WebDriver driver; //Objeto do Selenium WebDriver
	
	//3.2 - Metodos ou Funçoes
	@BeforeEach
	public void iniciar() {
		url = "https://www.petz.com.br/"; //Endereço da Petz
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximizar a janela do Browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //Espera Implicita de 30 segundos
	}
	
	@AfterEach
	public void Finalizar() {
		driver.quit();
	}
	
	@Test //O Teste
	public void abrirPagina() {
		driver.get(url); //Abrir a pagina inicial do site Petz
		assertEquals("Pet Shop: Petz o maior pet shop do Brasil.", driver.getTitle()); //Validou o texto guia da pagina
	}
}
