package pl.sda.openWeather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.openWeather.model.Condition;

/**
 * @author perczynski
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {
    private Integer last_updated_epoch;
    private String last_updated;
    private Integer temp_c;
    private Integer temp_f;
    private Integer is_day;
    private Condition condition;
    private Integer wind_mph;
    private Integer wind_kph;
    private Integer wind_degree;
    private String wind_dir;
    private Integer pressure_mb;
    private Integer pressure_in;
    private Integer precip_mm;
    private Integer precip_in;
    private Integer humidity;
    private Integer cloud;
    private Integer  feelslike_c;
    private Integer feelslike_f;
    private Integer vis_km;
    private Integer vis_miles;
    private Integer uv;





}
