package designpatterns.singeltions.eager.exercises.exercise1;

import java.util.HashSet;
import java.util.Set;

public enum Servers {

    INSTANCE;

    private final Set<String> servers = new HashSet<>();

    public boolean addServer(String serverName) {
        if (validateServerName(serverName)) {
            return servers.add(serverName);
        } else {
            return false;
        }
    }

    private boolean validateServerName(String serverName) {
        return serverName.toLowerCase().startsWith("http") || serverName.toLowerCase().startsWith("https");
    }

    public void printServers() {
        for (String server : servers) {
            System.out.println(server);
        }
    }

    public Set<String> getHTTPServers() {
        Set<String> httpServers = new HashSet<>();
        for (String server : servers) {
            if (isHTTPServer(server)) {
                httpServers.add(server);
            }
        }
        return httpServers;
    }

    private boolean isHTTPServer(String server) {
        return server.toLowerCase().startsWith("http") && !server.toLowerCase().startsWith("https");
    }

    private boolean isHTTPSServer(String server) {
        return server.toLowerCase().startsWith("https");
    }

}
