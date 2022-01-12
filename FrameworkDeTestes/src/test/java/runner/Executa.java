package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import conexoes.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features",
		glue = "Steps",
		tags = "@cadastro or @login", 
		dryRun = true,
		plugin = {"pretty","html:target/report.html"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa extends Drivers {

	@BeforeClass
	public static void abrirNavegador() {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://automationpractice.com/index.php");
				System.out.println("--------------- TESTE INICIADO ---------------");
		}
		
	@AfterClass
	public static void fecharNavegador() {
		
		driver.quit();
		System.out.println("---------------- TESTE FINALIZADO ------------------");
		
	}

}
