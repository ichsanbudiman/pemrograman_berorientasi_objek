package design_pattern.singletone;

public class Connection {
    private String host;
    private String database;
    private String username;
    private String password;

    public Connection(String host,String database, String username, String password){
        this.host = host;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    public void sql(String sql){
        
    }
}
