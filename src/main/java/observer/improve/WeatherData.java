package observer.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observe> observeList = new ArrayList<>();

    public void dataChange() {this.notifyObservers();}

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dataChange();
    }

    @Override
    public void registerObserver(Observe observe) {
        this.observeList.add(observe);
    }

    @Override
    public void removeObserver(Observe observe) {
        if(this.observeList.contains(observe)) {
            this.observeList.remove(observe);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observeList.size(); i++) {
            this.observeList.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
