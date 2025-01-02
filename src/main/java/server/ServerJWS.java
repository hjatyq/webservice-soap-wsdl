package server;

import jakarta.xml.ws.Endpoint;
import org.eclipse.persistence.sessions.server.Server;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8189/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Server started on " + url);


    }
}
