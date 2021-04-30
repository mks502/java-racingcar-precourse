package racingcar;

public class Car {
    private CarName name;
    private int position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public void moveFoward() {
        ++this.position;
    }

    public void moveStop() {
    }
}
