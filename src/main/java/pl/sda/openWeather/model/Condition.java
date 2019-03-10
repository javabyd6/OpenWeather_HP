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
public class Condition {

    private String text;
    private String icon;
    private Integer code;


}
