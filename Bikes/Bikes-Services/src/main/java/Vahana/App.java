package Vahana;

import Vahana.Config.ApplicationConfig;
import Vahana.models.Bike;
import Vahana.models.BikeModels;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context  = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BikeModels bikeModels  = new BikeModels();
        bikeModels.setBikeModelNumber("Gunmetal gray");
        bikeModels.setBikeVersion("ABS");
        Bike bike  = new Bike();
        bike.setBikeName("Royal Enfiled");
        bike.setBikeModels(bikeModels);

        System.out.println( "Hello World!" +bike.toString());
    }
}
