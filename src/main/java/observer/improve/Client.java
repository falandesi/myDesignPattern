package observer.improve;


public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition();
        BaiduWebsite baiduWebsite = new BaiduWebsite();
        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(baiduWebsite);
        System.out.println(" 通知各个观察者气象数据变更 ");
        weatherData.setData(30F, 120F, 100F);
        System.out.println(" 通知各个观察者气象数据变更 ");
        weatherData.removeObserver(currentCondition);
        weatherData.setData(32F, 110F, 80F);
    }
}
