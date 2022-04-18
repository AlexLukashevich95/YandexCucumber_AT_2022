package selenide;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class YandexMainPage{

    public void goLinkByName(String linkName){
        ElementsCollection elem = $$x("//li[contains(@class,'services-new__list-item')]/a");
        elem.find(text(linkName)).click();
        switchTo().window(1);
    }
}
