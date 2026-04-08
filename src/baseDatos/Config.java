
package baseDatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author dam
 */
public class Config {
  
    private Properties props;

    public Config() {
        props= new Properties();
        try{
            FileInputStream fis=new FileInputStream("config.properties");
            props.load(fis);
        }catch(IOException ex){
            
        }
    }

    public String getProps(String clave) {
        return props.getProperty(clave);
    }
    
    
}
