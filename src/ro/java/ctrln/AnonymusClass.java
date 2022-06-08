package ro.java.ctrln;

public class AnonymusClass {

    public static void main(String[] args) {
        Starship starship = new Starship() {
            @Override
            public void warp() {
                System.out.println("Anonymous class warp!");
            }

            @Override
            public void setStarshipDestination(String destination) {
                System.out.println("Flying to " + destination);

            }

            @Override
            public double computeWarpSpeed(int warpFactor, int lightYeadToDestination) {
                return warpFactor*lightYeadToDestination;
            }
        };
        starship.warp();
        starship.setStarshipDestination("Mars");
        System.out.println("Warp speed is: " +starship.computeWarpSpeed(3,1000));

        System.out.println("starship instanceof Object: " + (starship instanceof Object));
    }

}
