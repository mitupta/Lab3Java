public class MarsRobot {
    public String status;
    public int speed;
    public float temperature;

MarsRobot( double temperature) {
    if (temperature < -80.0) {
        status = "powrót do domu";
        speed = 5;
    }

        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }


public static void main(String[] args) {
    MarsRobot marsRobot = new MarsRobot(-100.0);
    //MarsRobot marsRobot1 = new MarsRobot();

    }





}
