package HTTPeSSL;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class PostRequest {
    public  static final String uri_POST = "https://jsonplaceholder.typicode.com/posts";
    public  static final String file_jhonson = "/home/pedro/Documentos/Engenharia de Software II/Resumos/UNidade 1 Engenharia de Software.odt";
//    public  static final String file_jhonson = "home/jn/IdeaProjects/httpexample/pedido.json";

    public static void main(String[] args) throws FileNotFoundException {

        //cliente http
        HttpClient cliente = HttpClient.newHttpClient();

        //criar requesição
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(String.valueOf(Path.of(file_jhonson))))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(uri_POST))
                .build();
        //Solicitação assincrona:
        cliente.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();


    }
}
