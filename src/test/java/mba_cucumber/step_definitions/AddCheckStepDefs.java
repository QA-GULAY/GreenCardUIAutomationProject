package mba_cucumber.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mba_cucumber.pages.PageAdd;
import org.junit.Assert;

public class AddCheckStepDefs {
    PageAdd pageAdd = new PageAdd();

    @Given("User increases beetroot product")
    public void kullanici_beetroot_urununu_artirir() throws InterruptedException {
        pageAdd.BeetrootIncrement();
        pageAdd.BeetrootIncrement();
        Thread.sleep(1000);
    }

    @When("The user clicks beetroot")
    public void kullanici_beetroot_urununu_sepete_ekler() throws InterruptedException {
        pageAdd.beetrootclick();
        Thread.sleep(1000);
    }

    @When("The user clicks pumpkin")
    public void kullanici_urununu_sepete_ekler() throws InterruptedException {
        pageAdd.PumpkinClick();
        Thread.sleep(1000);
    }

    @When("The user clicks pomegranate")
    public void kullanici_pomegranate_urununu_sepete_ekler() throws InterruptedException {
        pageAdd.PomegranateClick();
        Thread.sleep(1000);
    }


    @When("The user clicks add to cart")
    public void kullanici_sepete_gider() throws InterruptedException {
        pageAdd.sepeteGitClick();
        Thread.sleep(1000);

    }

    @Then("User verifies that the items have been added to the cart correctly")
    public void kullanici_urunlerin_dogru_bir_sekilde_sepete_eklendigini_dogrular() throws InterruptedException {
        String expectedMessagePupkin = "1 No.";
        String expectedMessagePomegranate = "1 No.";
        String expectedMessageBeetRoot = "3 Nos.";

        Assert.assertEquals("Sepete 1 kilo kabak eklenmedi", pageAdd.pupkinuantity1(), expectedMessagePupkin);
        Assert.assertEquals("Sepete 1 kilo nar eklenmedi", expectedMessagePomegranate, pageAdd.PomegranateQaquantity1());
        Assert.assertEquals("Sepete 3 kilo kirmizi pancar eklenmedi", expectedMessageBeetRoot, pageAdd.beetrootQuantity3());

        Thread.sleep(1000);
    }

}
