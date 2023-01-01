public class Rect {
    double width;
    double length;

    void sidesOfTheRectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    String rectanglePerimeter(){
        return "Периметр прямоуголька: " + 2 * (width + length) + " см";
    }

    String rectangleArea(){
        return "Площадь прямоуголька: " + width * length + " см в квадрате";
    }
}
