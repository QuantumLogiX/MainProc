package Config;

import java.sql.Time;

/**
 * Created by Genko on 7/5/2015.
 */
public class ServerConstants {
    private static int PORT = 0;
    private static int TIMEOUT = 0;

    public static void setPORT(int port){
        PORT = port;
    }
    public static int getPORT() {
        return PORT;
    }
    public static void setTIMEOUT(int timeout){
        TIMEOUT = timeout;

    }
    public static int getTIMEOUT(){
        return TIMEOUT;
    }
}
