package utils;

import org.openqa.selenium.Cookie;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Cookies {

    public static void setRodoCookieWebsite1() {
        setCookie("gdprc", "1", ".website1.pl","/");

    }

    public static void setCookie(String versionName, String versionValue, String domain, String path) {
        Cookie cookie = new Cookie.Builder(versionName, versionValue)
                .domain(domain)
                .isHttpOnly(false)
                .isSecure(false)
                .path(path)
                .build();
        getDriver().manage().addCookie(cookie);
        getDriver().navigate().refresh();
    }
}
