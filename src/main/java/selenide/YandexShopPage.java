package selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class YandexShopPage {

    public void goToCategory(String nameCategory,String nameSubcategory){
        $x("//button[@id='catalogPopupButton']").click();
        ElementsCollection categories = $$x("//li[@data-zone-name='category-link']");
        categories.find(text(nameCategory)).hover();
        ElementsCollection subcategories = $$x("//ul[@data-autotest-id='subItems']/li");
        subcategories.find(text(nameSubcategory)).click();
    }
}
