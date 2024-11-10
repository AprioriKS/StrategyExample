package service;

import service.impl.BikeRouteService;
import service.impl.CarRouteService;
import service.impl.PublicTransportRouteService;
import service.impl.WalkingRouteService;

public class RouteStrategy {

    public RouteService getRouteService(TransportType transportType) {
        switch (transportType) {
            case BIKE:
                return new BikeRouteService();
            case WALKING:
                return new WalkingRouteService();
            case PUBLIC_TRANSPORT:
                return new PublicTransportRouteService();
            case CAR:
            default:
                return new CarRouteService();
        }
    }
}
