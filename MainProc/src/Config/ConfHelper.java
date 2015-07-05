package Config;

import java.io.*;
import java.util.Properties;

/**
 * Created by Genko on 7/5/2015.
 */
public class ConfHelper {

    Properties props;
    InputStream input;
    OutputStream output;
    public ConfHelper(){
        props = new Properties();
    }

    public void loadServerConf(File file){
        try{
            input = new FileInputStream(file);
            props.load(input);
            ServerConstants.setPORT(Integer.parseInt(props.getProperty("PORT")));
            ServerConstants.setTIMEOUT(Integer.parseInt(props.getProperty("TIMEOUT")));


        }catch(IOException e){e.printStackTrace();}

    }

    /**
    public void loadClientConf(File file){
        try{
            input = new FileInputStream(file);
            props.load(input);
            ServerConstants.setPORT(Integer.parseInt(props.getProperty("PORT")));
            ServerConstants.setTIMEOUT(Integer.parseInt(props.getProperty("IP")));


        }catch(IOException e){e.printStackTrace();}
    }
     */


}
