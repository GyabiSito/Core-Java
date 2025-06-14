package HttpClientAsyncDemoPkg;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientASyncDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
                .POST(BodyPublishers.ofString("{\"name\":\"Fake Activities API\"}")).header("Content-Type", "application/json").build();
        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(httpRequest, BodyHandlers.ofString());

        String body=response.thenApply(HttpResponse::body).get();
        System.out.println(body);


    }
}
