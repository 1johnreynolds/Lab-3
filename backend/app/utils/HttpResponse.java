package utils;

public class HttpResponse {
    private int statusCode;
    private String response;

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponse() {
        return response;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
