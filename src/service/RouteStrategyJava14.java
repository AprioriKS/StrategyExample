package service;

import service.impl.BikeRouteService;
import service.impl.CarRouteService;
import service.impl.PublicTransportRouteService;
import service.impl.WalkingRouteService;

public class RouteStrategyJava14 {

    public RouteService getRouteService(TransportType transportType) {
        return switch (transportType) {
            case BIKE -> new BikeRouteService();
            case WALKING -> new WalkingRouteService();
            case PUBLIC_TRANSPORT -> new PublicTransportRouteService();
            default -> new CarRouteService();
        };
    }
}
