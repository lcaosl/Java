public class Array {
    public static void main(String[] args) {
        int[] array = new int[900];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 100;
        }
        int[] newArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[j] = array[i];
        }
        for (int i : newArray) {
            System.out.println(i);
        }
    }
}

