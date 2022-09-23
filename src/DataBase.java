import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataBase {

    private String splitter;

    public DataBase(String splitter) {
        this.splitter = splitter;
    }

    public DataBase() {
        this(";");
    }

    public void save(TaskList taskList, String pathToFile) throws IOException {
        OutputStream os = new FileOutputStream(pathToFile + "DataBase.csv");
        os.write(239);
        os.write(187);
        os.write(191);
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(os, "UTF-8"))) {

            for (Task task : taskList.getTaskList()) {
                StringBuilder sb = new StringBuilder();

                sb.append(task.getId());
                sb.append(splitter);
                sb.append(task.getAuthorName());
                sb.append(splitter);
                sb.append(task.getName());
                sb.append(splitter);
                sb.append(task.getPriority().getPriorityLevel());
                sb.append(splitter);
                sb.append(task.getDateTimeOfCreation());
                sb.append(splitter);
                sb.append(task.getDeadLine());
                sb.append(splitter);
                sb.append("\n");

                writer.write(sb.toString());
            }
            writer.close();
            System.out.println("Задачи сохранены!");

        }   catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
