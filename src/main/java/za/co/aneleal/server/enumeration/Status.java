package za.co.aneleal.server.enumeration;
/**
 * @author Anele Aneal Tose
 * @version 1.0
 * @since 15/11/2023
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;

    Status(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}
