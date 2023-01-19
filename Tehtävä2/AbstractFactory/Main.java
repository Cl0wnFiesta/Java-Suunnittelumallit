package AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Class c = null;
        VaateFactory tehdas = null;
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("AbstractFactory/tehdas.properties"));
        } catch (IOException e) {e.printStackTrace();}
        try{
            c = Class.forName(properties.getProperty("tehdas"));
            tehdas = (VaateFactory)c.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

        Jasper jasper = new Jasper();
        jasper.puePäälle(tehdas);
        jasper.luettele();
    }

}
