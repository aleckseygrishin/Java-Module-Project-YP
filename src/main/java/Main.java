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
        String tryAgain = "Попробуйте снова.";

        while (true) {
            System.out.println(String.format("Введите скорость машины №%d: ", numberCar));

            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();

                if (speed > 0 && speed <= 250) {
                    System.out.println("Скорость введена верно.");
                    return speed;
                } else {
                    System.out.println("Скорость не попала в диапазон от 0 до 250.");
                    System.out.println(tryAgain);
                }
            } else {
                System.out.println("Введен некорректный тип данных. (Ожидается целое число)");
                System.out.println(tryAgain);

                scanner.next();
            }
        }
    }
}
