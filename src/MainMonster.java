public class MainMonster {
    public static void main(String[] args) {
        Monster monster = new Monster(2);
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(5,9);
        Monster monster3 = new Monster(95, 58, 25);
        monster1.voice();
        monster2.voice(45);
        monster3.voice(13, "BABABA");
    }
}
