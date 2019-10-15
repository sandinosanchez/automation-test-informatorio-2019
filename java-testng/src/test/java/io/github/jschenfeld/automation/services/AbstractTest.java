package io.github.jschenfeld.automation.services;

public class AbstractTest {

    private String url;

    public AbstractTest() {
        this.url = "http://swapi.co/api/{resource}/{id}/";
    }

    public String getUrl() {
        return url;
    }
}
