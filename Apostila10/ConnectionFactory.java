import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "1234";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoas";

    public Connection obtemConexao(){
        try{
            Connection c = DriverManager.getConnection(
                "jdbe:mysql://" + host + ":" + porta + "/" + bd, 
                usuario, 
                senha
            );
            return c;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
