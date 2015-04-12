package su.dalv.itis.java.spring.task24.controller;

import junit.framework.TestCase;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;

import java.io.IOException;


public class HelloControllerTest extends TestCase {

    private static String url = "http://localhost:8080";

    @Test
    public void testPlainText() throws IOException {
        HttpClient httpClient = new HttpClient();
        PostMethod method = new PostMethod(url + "/string-to-string");
        method.setRequestHeader("Content-Type", "text/plain");
        method.setRequestHeader("Accept", "text/plain");
        String text = "text";
        method.setRequestBody(text);
        httpClient.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        String s = new String(responseBody);
        assertEquals(text,s);
    }


    @Test
    public void testXml() throws IOException {
        HttpClient httpClient = new HttpClient();
        PostMethod method = new PostMethod(url + "/xmjs-to-xmjs");
        method.setRequestHeader("Content-Type", "application/xml");
        method.setRequestHeader("Accept", "application/xml");
        String text = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Person><id>5</id><name>Spencer</name><isAdmin>true</isAdmin></Person>";
        method.setRequestBody(text);
        httpClient.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        String s = new String(responseBody);
        assertEquals(text,s);
    }

    @Test
    public void testJson() throws IOException {
        HttpClient httpClient = new HttpClient();
        PostMethod method = new PostMethod(url + "/xmjs-to-xmjs");
        method.setRequestHeader("Content-Type", "application/json");
        method.setRequestHeader("Accept", "application/json");
        String text ="{\"id\":5,\"name\":\"Spencer\",\"isAdmin\":true}";
        method.setRequestBody(text);
        httpClient.executeMethod(method);

        byte[] responseBody = method.getResponseBody();
        String s = new String(responseBody);
        assertEquals(text,s);
    }

    @Test
    public void testJsonToXml() throws IOException {
        HttpClient httpClient = new HttpClient();
        PostMethod method = new PostMethod(url + "/xmjs-to-xmjs");
        method.setRequestHeader("Content-Type", "application/json");
        method.setRequestHeader("Accept", "application/xml");
        String text = "{\"name\": \"Spencer\",\"id\": \"5\",\"isAdmin\": \"true\"}";
        method.setRequestBody(text);
        httpClient.executeMethod(method);
        String response = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Person><id>5</id><name>Spencer</name><isAdmin>true</isAdmin></Person>";
        byte[] responseBody = method.getResponseBody();
        String s = new String(responseBody);
        assertEquals(response,s);
    }
}