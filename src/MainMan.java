public class MainMan {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.age = 46;
        man1.name = "Slava";
        man1.weight = 95;
        Man man2 = new Man();
        man2.age = 46;
        man2.name = "Vica";
        man2.weight = 95;
        Man man3 = new Man();
        man3.age = 46;
        man3.name = "Odin";
        man3.weight = 95;
        Man man4 = new Man();
        man4.age = 48;
        man4.name = "Claudia";
        man4.weight = 95;
        Man man5 = new Man();
        man5.age = 46;
        man5.name = "Dan";
        man5.weight = 120;
        double allWeight = man1.weight + man2.weight + man3.weight + man4.weight + man5.weight;
        double arithmeticMean = allWeight / 5;
        System.out.println(arithmeticMean);

        //---------------------------------------------------------------------------------------

        Man[] men = new Man[5];
        men[0] = man1;
        men[1] = man2;
        men[2] = man3;
        men[3] = man4;
        men[4] = man5;

        int sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].age;
        }
        System.out.println(sum/(double)men.length);
    }
}
