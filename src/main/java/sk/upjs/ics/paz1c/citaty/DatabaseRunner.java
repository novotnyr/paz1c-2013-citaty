package sk.upjs.ics.paz1c.citaty;

import org.hsqldb.Server;

public class DatabaseRunner {
    public static void main(String[] args) {
        Server server = new Server();
        server.setDatabaseName(0, "citaty");
        server.setDatabasePath(0, "db/citaty");
        server.start();
    }
}
