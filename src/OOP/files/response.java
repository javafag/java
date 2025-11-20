package OOP.files;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class response {
    public static void main(String[] args) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://github.com/javafag/java"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Path path = Path.of("response.json");
        Files.writeString(path, response.body());

        System.out.println("Response saved to response.json");
        String content = Files.readString(path);
        System.out.println("Preview:\n" + content.substring(0, Math.min(200, content.length())));
    }
}
