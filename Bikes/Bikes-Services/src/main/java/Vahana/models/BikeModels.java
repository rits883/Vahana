package Vahana.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/***
 Vahana
 @Author REETESH KUMAR CHOUBEY
 @Date 03-01-2019
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BikeModels {
    private String bikeModelNumber;
    private String bikeVersion;
}
