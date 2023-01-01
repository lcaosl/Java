public class Rect {
    double width;
    double length;

    void sidesOfTheRectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    String rectanglePerimeter(){
        return 2 * (width + length) + " см";
    }

    double rectangleArea(){
        return width * length;
    }
}
