public class Main3 {
    double length;
    double width;

    double area() {
        return length * width;
    }

    double perimeter() {
        return length * 2 + width * 2;
    }

    public static void main(String[] args) {
        Main3 rectangle = new Main3();
        rectangle.width = 4;
        rectangle.length = 3;

        System.out.println("The area is " + rectangle.area());
        System.out.println("The perimeter is " + rectangle.perimeter());
    }
}
