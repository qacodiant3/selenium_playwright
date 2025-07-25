package playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class BingSearchTest {
    @Test(priority = 2)
    public void testBingSearch() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://www.bing.com");
            System.out.println("Title: " + page.title());
            browser.close();
        }
        
        
    }
    
    @Test(priority = 1)
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
