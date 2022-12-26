public class Loop {
    public static void main(String[] args) {
        for (int i = 1000; i > 0; i--) {
            if(i % 2 != 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
