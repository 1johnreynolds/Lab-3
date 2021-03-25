package utils;


import com.fasterxml.jackson.databind.JsonNode;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class HttpUtil {

    private static final String BASE_URL = "http://localhost:9000";

    public static HttpResponse makeRequest (
            String partialUrl, String httpMethod, JsonNode parameters) {
        URL url;
        HttpURLConnection conn;
        HttpResponse response = new HttpResponse();

        try {
            url = new URL(BASE_URL + partialUrl);

            conn = (HttpsURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json");
            DataOutputStream dos;
            conn.setRequestMethod(httpMethod);

            if (Arrays.asList("POST", "PUT").contains(httpMethod)) {
                String params = parameters.toString();
                conn.setDoOutput(true);
                dos = new DataOutputStream(conn.getOutputStream());
                dos.writeBytes(params);
                dos.flush();
                dos.close();
            }

            int respCode = conn.getResponseCode();
            response.setStatusCode(respCode);

            if (respCode == 200 || respCode == 201) {
                response.setResponse(inputStreamToString(conn.getInputStream()));
            }
        } catch (IOException e) {
            System.err.println("Http request failed: " + e);
        }

        return response;
    }

    private static String inputStreamToString(InputStream is)
            throws IOException {
        BufferedReader br;
        StringBuilder sb = new StringBuilder();

        String line;
        br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

}

