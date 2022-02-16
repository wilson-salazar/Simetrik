package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {

    private ChromeDriver driver = Hooks.getDriver();

    @Given("El usuario se encuentra en la pagina principal del buscador")
    public void el_usuario_se_encuentra_en_la_pagina_principal_del_buscador() {
        String pageTitle = "Google";
        Assert.assertEquals(pageTitle, driver.getTitle());
    }

    @When("Escribe la palabra Simetrick en la barra de busqueda y presiona la tecla enter")
    public void escribe_la_palabra_simetrick_en_la_barra_de_busqueda_y_presiona_la_tecla_enter() {

        WebElement searcherElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        Assert.assertTrue(searcherElement.isDisplayed());
        searcherElement.clear();
        searcherElement.sendKeys("Simetrik" + Keys.ENTER);

    }

    @Then("Debe direccionar a la pantalla de resultados de la busqueda")
    public void debe_direccionar_a_la_pantalla_de_resultados_de_la_busqueda() {

        List<WebElement> itemList = driver.findElements(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div"));
        Assert.assertTrue(itemList.size() > 0);

    }

}
