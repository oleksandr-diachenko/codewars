package oleksandrdiachenko.kyu8.Cockroach;

/**
 * @author Alexander Diachenko
 */
public class Cockroach {
    public int cockroachSpeed(double x) {
        double cmPerHour = x * 1000 * 100;
        int secInHour = 60 * 60;
        return (int) (cmPerHour / secInHour);
    }
}