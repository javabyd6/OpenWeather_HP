package pl.sda.openWeather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author perczynski
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private String name;
    private String region;
    private String country;
    private Integer lat;
    private Integer lon;
    private String tz_id;
    private Integer localtime_epoch;
    private String localtime;


}
