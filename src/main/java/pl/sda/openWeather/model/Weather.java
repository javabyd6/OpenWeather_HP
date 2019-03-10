package pl.sda.openWeather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.openWeather.model.Current;
import pl.sda.openWeather.model.Location;

/**
 * @author perczynski
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {


    private Location location;
    private Current current;
    public int getTemp()
    {
        return current.getTemp_c();
    }
}
