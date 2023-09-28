public class Car
{
    private String make;
    private String model;
    int speed;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate() {
        speed++;
    }

    public void decelerate() {
        speed--;
    }

    public void accelerate(int increase) {
        speed += increase;
    }

    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Corolla");
        System.out.println("The car make is " + car1.getMake());
        System.out.println("The car model is " + car1.getModel());
        for(int i=0; i<10; i++)
            car1.accelerate();
        System.out.println("The car speed is " + car1.getSpeed());
        car1.decelerate();
        car1.decelerate();
        System.out.println("The car speed is " + car1.getSpeed());
        car1.accelerate(20);
        System.out.println("The car speed is " + car1.getSpeed());
    }
}
