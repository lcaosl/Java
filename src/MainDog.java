public class MainDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speed = 21;
        dog1.name = "Baboon";
        dog1.race = "Fox";
        dog1.run();
        System.out.println(dog1.info());
    }
}
