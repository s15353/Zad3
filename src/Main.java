public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(7);

        myCar.start();
        myCar.stop();

        System.out.println("Liczba miejsc w samochodzie: " + myCar.getNumberOfSeats());
    }
}