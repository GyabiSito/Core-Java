package HttpClientDemoPkg;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
                .POST(BodyPublishers.ofString("{\"name\":\"Fake Activities API\"}")).header("Content-Type", "application/json").build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());
        System.out.println("STATUS =======> " + httpResponse.statusCode());
        System.out.println("STATUS =======> " + httpResponse.body());

        HttpHeaders headers = httpResponse.headers();
        System.out.println(headers.map());
    }
}
