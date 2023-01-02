public class WorkerMain {
    public static void main(String[] args) {
        Worker worker = new Worker("Иван Пупкин", "программист", 50000);
        System.out.println(worker.info(12));
    }
}
