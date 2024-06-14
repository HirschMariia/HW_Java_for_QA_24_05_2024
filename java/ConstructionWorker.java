import java.util.ArrayList;
import java.util.List;

public class ConstructionWorker {
    private final List<Runnable> tasks = new ArrayList<>();

    public void addTask(Runnable task) {
        tasks.add(task);
    }

    public void doTasks() {
        for (Runnable task : tasks) {
            task.run();
        }
    }

    public static void main(String[] args) {
        ConstructionWorker worker = new ConstructionWorker();

        worker.addTask(() -> System.out.println("Digging a hole"));
        worker.addTask(() -> System.out.println("Mixing concrete"));
        worker.addTask(() -> System.out.println("Building a wall"));

        worker.doTasks();
    }
}
