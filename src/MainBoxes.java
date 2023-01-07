public class MainBoxes {
    public static void main(String[] args) {
        Boxes boxes1 = new Boxes(10);
        Boxes boxes2 = new Boxes(20,20,10);
        Boxes boxes3 = boxes1.sumBox(boxes2);
        Boxes boxes4 = new Boxes(boxes1, boxes3);
        boxes1.showVolume();
        boxes2.showVolume();
        boxes3.showVolume();
        double volumeSum = boxes1.volume() + boxes3.volume();
        System.out.println("boxes1 + boxes3 = " + volumeSum);
        boxes4.showVolume();
    }
}
