package observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void dataChange() {
        this.currentCondition.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dataChange();
    }
}
