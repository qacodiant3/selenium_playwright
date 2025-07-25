package playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class DuckDuckGoSearchTest {
    @Test
    public void testDuckDuckGoSearch() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://duckduckgo.com");
            System.out.println("Title: " + page.title());
            browser.close();
        }
    }
}
