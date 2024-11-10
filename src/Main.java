import service.RouteService;
import service.RouteStrategyJava14;
import service.TransportType;

public class Main {

    public static void main(String[] args) {
        //for old version java (before 14) use RouteStrategy
        RouteStrategyJava14 strategy = new RouteStrategyJava14();
        RouteService bikeRouteService = strategy.getRouteService(TransportType.BIKE);
        double time = bikeRouteService.calculateRouteTime(0, 100);
        System.out.println(time);
    }
}