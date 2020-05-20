package observer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CurrentCondition {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println(" 气象数据更新 ");
        this.display();
    }

    public void display() {
        System.out.println(" 温度是" + temperature);
        System.out.println(" 气压是" + pressure);
        System.out.println(" 湿度是" + humidity);
    }
}
