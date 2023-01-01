public class Dog {
    String name = "";
    String race = "";
    int speed;

    void run() {
        String running = "";
        for (int i = 0; i < speed; i++) {
            running += "бегу";


            if (i == speed - 1) {
                running += ".";
            } else {
                running += ", ";
            }
        }
        System.out.println(running);
    }
    String info() {
        return "Кличка: " + name + "\nПорода: " + race + "\nСкорость " + speed;
    }

}

