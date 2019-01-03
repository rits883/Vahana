package Vahana.models;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 Vahana
 @Author REETESH KUMAR CHOUBEY
 @Date 03-01-2019
 */

@Component
@Data
@ToString
public class Bike {
    private  String bikeName;

    @Autowired
    private  BikeModels bikeModels;

}
