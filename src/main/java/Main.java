import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        String carName;
        int carSpeed;

        //Цикл для заполнения машин, которые участвуют в гонке
        for (int i = 1; i <= 3; i++) {
            System.out.println(String.format("Введите название машины №%d: ", i));
            carName = scanner.next();
            carSpeed = checkCorrectSpeed(i);
            cars.add(new Car(carName, carSpeed));
        }

        race.getCarWithMaxDistance(cars);
    }

    //Метод для запроса у пользователя корректной скорости
    static int checkCorrectSpeed (int numberCar) {
        Scanner scanner = new Scanner(System.in);
        int speed;

        while (true) {
            System.out.println(String.format("Введите скорость машины №%d: ", numberCar));
            speed = scanner.nextInt();

            if (speed > 0 && speed <= 250) {
                System.out.println("Скорость введена верно.");
                return speed;
            } else {
                System.out.println("Не верное значение скорости.");
                System.out.println("Попробуйте снова.");
            }
        }
    }
}
