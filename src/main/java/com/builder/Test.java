package com.builder;

import com.builder.HTTPClient.HTTPClientBuilder;

public class Test {

    public static void main(String[] args) {
        HTTPClientBuilder httpClientBuilder = new HTTPClientBuilder();
        HTTPClient httpClient = httpClientBuilder.method("post").
                body("body").secure("user", "pass").url("url").headers("headers").build();
        System.out.println("Value of the httpclient:::" + httpClient);
    }
}
