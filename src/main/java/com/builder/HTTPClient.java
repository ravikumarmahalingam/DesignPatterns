package com.builder;

public class HTTPClient {
    private String method;
    private String url;
    private String userName;
    private String password;
    private String headers;
    private String body;


    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HTTPClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public HTTPClient(HTTPClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.userName = httpClientBuilder.userName;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }

    public static class HTTPClientBuilder{
        private String method;
        private String url;
        private String userName;
        private String password;
        private String headers;
        private String body;

        public HTTPClientBuilder method(String method){
            this.method = method;
            return this;
        }

        public HTTPClientBuilder url(String url){
            this.url = url;
            return this;
        }

        public HTTPClientBuilder secure(String userName, String password){
            this.userName = userName;
            this.password = password;
            return this;
        }

        public HTTPClientBuilder headers(String headers){
            this.headers = headers;
            return this;
        }

        public HTTPClientBuilder body(String body){
            this.body = body;
            return this;
        }

        public HTTPClient build(){
            return new HTTPClient(this);
        }
    }
}
