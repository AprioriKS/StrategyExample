package service.impl;

import service.RouteService;

public class WalkingRouteService implements RouteService {

    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 10;
    }
}
