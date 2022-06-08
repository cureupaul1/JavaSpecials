package ro.java.ctrln;

import java.util.Random;

public interface Starship {
    public void warp();

    public void  setStarshipDestination(String destination);

    public double computeWarpSpeed(int warpFactor, int lightYeadToDestination);

    default Double productionId(){
        Random r =new Random();
        return 1 + (2-r.nextDouble());
    }
}
