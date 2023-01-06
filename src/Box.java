public class Box {
    double a;
    double b;
    double c;

    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double square() {
        return a * b * c;
    }

    void compare(Box box) {
        double thisSquare = square();
        double boxSquare = box.square();
        if (thisSquare > boxSquare) {
            System.out.println("Больше эта, чем - та!");
        } else if (thisSquare < boxSquare) {
            System.out.println("Меньше эта, чем - та!");
        } else {
            System.out.println("Они равны!");
        }

    }
}
