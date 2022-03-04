package HTTPeSSL;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class getRequest {
    public  static final String uri_GET = "https://jsonplaceholder.typicode.com/posts";
//    public  static final String uri_GET = "https://github.com/cami-la/curso-dio-dominando-ides-java";
//    public  static final String uri_GET = "https://gool.cittati.com.br/goolsystem/repasse/repasse.aspx";
    //github.com/cami-la/curso-dio-dominando-ides-java"
    public static void main(String[] args) throws IOException, InterruptedException {
        //cliente http
        HttpClient cliente = HttpClient.newHttpClient();

        //criar requesição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(uri_GET))
                .build();

        //envio de nova solicitação
        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        //imprimir o conteudo recebido
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }


}
