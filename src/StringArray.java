public class StringArray {
    public static void main(String[] args) {
        String[] MouthOfYear = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String result = "";
        for (int i = 0; i < MouthOfYear.length; i++) {
            result += MouthOfYear[i];
            if (i == MouthOfYear.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
