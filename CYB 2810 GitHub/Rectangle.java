public class Rectangle {
    double length;
    double width;

    double area() {
        return length * width;
    }

    double perimeter() {
        return length * 2 + width * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5.0;
        rectangle.width = 3.0;

        System.out.println("The area is " + rectangle.area());
        System.out.println("The perimeter is " + rectangle.perimeter());
    }
}
