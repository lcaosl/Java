public class Boxes {

    double width;
    double height;
    double length;

    Boxes(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Boxes(double size) {
        this.width = size;
        this.height = size;
        this.length = size;
    }

    Boxes() {
        width = 0;
        height = 0;
        length = 0;
    }

    Boxes(Boxes boxes) {
        this.width = boxes.width;
        this.height = boxes.height;
        this.length = boxes.length;
    }
    //Ваше решение может отличаться, я сделал так: если мы просто у новой коробки укажем длину и ширину и высоту равную сумме двух коробок,
    //то получившаяся коробка по объему однозначно получится больше суммы тех двух коробок.
    Boxes(Boxes boxes1, Boxes boxes2) {
        this.width = boxes1.width + boxes2.width;
        this.length = boxes1.length + boxes2.length;
        this.height = boxes1.height + boxes2.height;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Boxes increase(int i) {
        return new Boxes(width *i, height * i, length * i);
    }

    Boxes sumBox(Boxes boxes) {
        return new Boxes(this.width + boxes.width, this.height + boxes.height, this.length + boxes.length);
    }

    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }

    int compare(Boxes boxes) {
        double thisVolume = volume();
        double boxVolume = boxes.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

}
