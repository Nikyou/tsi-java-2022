package Exercise1;

public class GravityCalculator {
    static final double GRAVITY = -9.81; // Earth's gravity in m / s ^ 2

    public static void main(int fallingTime, double initialPosition, double initialVelocity) {
        NextPosition(fallingTime, initialPosition, initialVelocity);
    }

    private static void NextPosition(int fallingTime, double initialPosition, double initialVelocity){
         double finalPosition = (fallingTime ^ 2) * GRAVITY * 0.5 + initialVelocity + initialPosition;
        System.out.println ("Position in" + fallingTime + "seconds:" + finalPosition);
    }
}
