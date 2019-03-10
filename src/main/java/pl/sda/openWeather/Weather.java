package pl.sda.openWeather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author perczynski
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    private Location location;
    private Current current;
}
