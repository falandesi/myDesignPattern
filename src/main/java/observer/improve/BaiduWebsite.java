package observer.improve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BaiduWebsite implements Observe {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    public void display() {
        System.out.println(" 百度网页温度是" + temperature);
        System.out.println(" 百度网页气压是" + pressure);
        System.out.println(" 百度网页湿度是" + humidity);
    }
}
