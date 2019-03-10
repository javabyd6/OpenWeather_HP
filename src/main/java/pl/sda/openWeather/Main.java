package pl.sda.openWeather;
import pl.sda.openWeather.model.Weather;
import pl.sda.openWeather.service.WeatherService;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * @author perczynski
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException {

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwe miasta którego chcesz sprawdzić pogode");
            String city = scanner.nextLine();
            Weather pogoda = WeatherService.getCityWeather(city);
            double temp = pogoda.getTemp();

            System.out.println("Pogoda dla " + city + " tutaj " + temp + " stopni celsjusza");

        }
    }


}
