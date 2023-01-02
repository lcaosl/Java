public class Worker {
    String name = "";
    String position = "";
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int value) {
            return "Сотрудник " + name + ", должность " + position + ", за последние " + value + " месяцев получил " + salary * value + " рублей.";
        }

}
