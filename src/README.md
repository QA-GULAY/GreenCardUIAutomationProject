# GreenKart UI Automation Test Project

Bu proje, GreenKart alışveriş sitesinin işlevselliğini test etmek için UI otomasyonunu kullanır. Java dilinde Selenium WebDriver ve Cucumber kullanılarak geliştirilmiştir.

## Gereksinimler

- Java JDK 8 veya üstü
- IntelliJ IDEA veya tercih ettiğiniz bir IDE
- WebDriver'e uygun tarayıcı sürücüsü (örneğin, ChromeDriver)
- Maven 

## Kurulum

1. Proje dosyalarını bilgisayarınıza klonlayın veya ZIP olarak indirin.
2. IntelliJ IDEA'da proje klasörünü açın.
3. Projeyi Maven ile import edin.
4. Tarayıcı sürücüsünü WebDriver'a uygun şekilde yapılandırın ve yolunu belirtin.

## Kullanım

1. `src/test/java` altındaki `com.example.tests` paketinde bulunan test senaryolarını inceleyin.
2. Test senaryolarını çalıştırmak için ilgili test dosyasını seçin, sağ tıklayın ve "Run" seçeneğini belirleyin.
3. Testlerin çalıştırılmasıyla ilgili raporlar ve sonuçlar IntelliJ IDEA'da görüntülenecektir.

## Test Senaryoları

Sitede ürün arama, sepete ürün ekleme, ödeme işlemi gibi çeşitli senaryolar bulunmaktadır. Her test senaryosu ayrı test dosyasında bulunmaktadır.

## Kullanım Örnekleri

Projenin temel kullanımını ve özelliklerini açıklayan Cucumber senaryoları örnekleri aşağıda verilmiştir. Proje Cucumber framework ile tasarlanmış olup, step definitions Gerkin Language kullanılmıştır.

## Ürün Arama Senaryosu

## Cucumber Senaryo Dosyası (searchingResult.feature): 

```gherkin
Feature: Testing results of searching ###
  @SearchBox
  Scenario: verification of searching results in GreenKart website
    Given User goes to "Greenkart_Url" website
    When  User searches a "Product_Name" from search box
    Then  User can see the results of relevant products


## Cucumber senaryo adımları (SearchStepDefinitions.java):###
public class ReasultsOfSearchingProducts {

    @Given("User goes to {string} website")
    public void user_goes_to_website(String Greenkart_Url) {
        Driver.getDriver().get(ConfigReader.getProperties(Greenkart_Url));
    }
     @When("User searches a {string} from search box")
    public void user_searches_a_from_search_box(String Product_Name) {
      mainPage.searchBox.sendKeys(ConfigReader.getProperties("Product_Name"));
      mainPage.searchButton.click();
    }
    @Then("^sonuçlar görüntülenir$")
    public void viewResults() {
        // Sonuçları görüntüleme işlemi
    }
    @Then("User can see the results of relevant products")
    public void user_can_see_the_results_of_relevant_products() {
        String actualProduct = mainPage.ResultOfProduct.getText();
        String expectedProduct = "Product_Name";
        Assert.assertEquals("Product which is searched and result is not same",expectedProduct,actualProduct);
    }
}
```
## Raporlar: 

Testlerin başarılı/başarısız durumları ve ayrıntılı sonuçlar raporlar şeklinde görüntülenebilir. Raporlar proje klasöründe reports altında yer almaktadır.

## Önemli Notlar:

Test senaryolarını çalıştırmadan önce, tarayıcı sürücüsünün doğru yolu belirtildiğinden ve projenin doğru bir şekilde yapılandırıldığından emin olun.
Testlerin başarılı bir şekilde çalışabilmesi için internet bağlantısına ihtiyaç duyulabilir.

## Katkı:

Bu proje üzerinde herhangi bir katkıda bulunmak isterseniz, lütfen forklayın ve pull request gönderin. Her türlü katkıya açığız!

## Lisans:

Bu proje MIT Lisansı altında lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasını inceleyebilirsiniz.

_**Bu README dosyası, projenin temel bilgilerini, gereksinimleri, kurulum adımlarını, kullanım yönergelerini ve diğer önemli noktaları içeriyor. Gerçek proje detaylarına ve gereksinimlerine göre özelleştirilebilir.**_








#   G r e e n C a r d U I A u t o m a t i o n P r o j e c t  
 #   G r e e n C a r d U I A u t o m a t i o n P r o j e c t  
 