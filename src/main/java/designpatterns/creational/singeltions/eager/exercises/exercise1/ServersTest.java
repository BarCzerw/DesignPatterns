package designpatterns.creational.singeltions.eager.exercises.exercise1;

public class ServersTest {

    public static void main(String[] args) {
        Servers servers = Servers.INSTANCE;

        System.out.println(servers.addServer("http://"));
        System.out.println(servers.addServer("http://"));
        System.out.println(servers.addServer("https://"));
        System.out.println(servers.addServer("http:/"));
        System.out.println(servers.addServer("http:"));
        System.out.println(servers.addServer("htp:"));

        servers.printServers();

        System.out.println(servers.getHTTPServers());

    }
}
