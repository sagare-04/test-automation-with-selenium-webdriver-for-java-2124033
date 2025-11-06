package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;
import java.util.List;

public class FindingMultipleElements extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");
    List<WebElement> radioButton = driver.findElements(By.cssSelector("input[type='radio']"));
    System.out.println(radioButton.size());

    for (WebElement radio : radioButton) {
      String value = radio.getAttribute("value"); // ✅ must be String
      System.out.println("Radio value: " + value);

    }
    driver.quit();
  }

}
