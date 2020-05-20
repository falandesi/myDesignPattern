package observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentCondition());
        weatherData.setData(22F, 150F, 40F);
        System.out.println("===============气象数据更新==================");
        weatherData.setData(26F, 140F, 30F);

    }
}
