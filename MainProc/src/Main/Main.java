package Main;

import Config.ConfHelper;
import Config.ServerConstants;


import java.io.File;

/**
 * Created by Genko on 7/5/2015.
 */
public class Main {
    public static void main(String[] args) {
        ConfHelper l = new ConfHelper();
        File file  = new File("src/config.properties");
        System.out.println(ServerConstants.getPORT());
        l.loadServerConf(file);
        System.out.println(ServerConstants.getPORT());

    }
}
