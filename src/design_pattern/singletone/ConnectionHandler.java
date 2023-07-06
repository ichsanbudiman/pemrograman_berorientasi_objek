package design_pattern.singletone;

public class ConnectionHandler {
    private static Connection conn;

    public static Connection getConnection(){
        if(conn==null){
            conn = new Connection("localhost", "toko", "root", "root");
        }
        return conn;
    }
}
