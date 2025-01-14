import java.util.ArrayList;

public class Race {

    //Метод для расчета преодоленного растояни машиной
    public int calculateDistance(int speed) {
        return speed * 24;
    }

    //Метод для определения самого быстрого авто и его вывода
    public void getCarWithMaxDistance(ArrayList<Car> cars) {
        int resultCarDistance = calculateDistance(cars.get(0).speed);
        String resultCarName = cars.get(0).name;
        String patternOutput = "Самая быстрая машина: %s";
        int nowCarDistance;

        for (Car car : cars) {
            nowCarDistance = calculateDistance(car.speed);
            if (nowCarDistance > resultCarDistance) {
                resultCarDistance = nowCarDistance;
                resultCarName = car.name;
            }
        }

        System.out.println(String.format(patternOutput, resultCarName));
    }
}
