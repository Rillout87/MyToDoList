import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        Task myTask1 = new Task("Сделать кофе", LocalDate.of(2022, 9, 23),
                "Кирилл", new HighPriority());
        Task myTask2 = new Task("Помыть кружку", LocalDate.of(2022, 9, 24),
                "Кирилл", new LowPriority());

        myTask1.getTaskData();
        myTask2.getTaskData();

        TaskList taskList = new TaskList();
        taskList.add(myTask1);
        taskList.add(myTask2);

        DataBase db = new DataBase();
        db.save(taskList, "");
    }
}