package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public Cars(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for(int i=0; i<names.size(); i++){
            cars.add(new Car(names.get(i)));
        }
        this.cars = cars;
    }

    public void play() {
        for(Car car : this.cars){
            car.play();
        }
    }
}
