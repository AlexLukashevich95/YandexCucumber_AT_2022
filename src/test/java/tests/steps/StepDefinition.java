package tests.steps;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenide.YandexMainPage;
import selenide.YandexShopCategoryPage;
import selenide.YandexShopPage;


public class StepDefinition {
    YandexMainPage yandexMainPage = new YandexMainPage();
    YandexShopPage yandexShopPage = new YandexShopPage();
    YandexShopCategoryPage yandexShopCategoryPage = new YandexShopCategoryPage();

    @When("Переходим по имени ссылки {string}")
    public void goToServicePage(String linkName){
        yandexMainPage.goLinkByName(linkName);
    }

    @Then("Переходим по категории {string} и подкатегории {string}")
    public void goToServicePage(String nameCategory,String nameSubcategory){
        yandexShopPage.goToCategory(nameCategory,nameSubcategory);
    }

    @Then("Фильтруем товары по производителю {string}")
    public void setBrand(String nameBrand){
        yandexShopCategoryPage.chooseBrand(nameBrand);
    }

    @And("Показать {string} продуктов на странице")
    public void setItemsPerPage(String maxItems){
        yandexShopCategoryPage.chooseItemsPerPage(maxItems);
    }

    @Then("Проверка всех продуктов {string} в результате поиска")
    public void checkSearchResults(String nameBrand){
        yandexShopCategoryPage.checkProductsBrand(nameBrand);
    }

}
