import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private static Integer idCounter;
    private Integer id;
    private String name;
    private LocalDateTime dateTimeOfCreation;
    private LocalDate deadLine;
    private String authorName;
    private Priority priority;

    static {
        idCounter = 0;
    }

    public Task(String name, LocalDate deadLine, String authorName, Priority priority) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
        this.dateTimeOfCreation = LocalDateTime.now();
        this.deadLine = deadLine;
        this.authorName = authorName;
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateTimeOfCreation() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dateTimeOfCreation.format(formatter);
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Priority getPriority() {
        return priority;
    }

    public void getTaskData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(id + " " + name + " " + dateTimeOfCreation.format(formatter) + " " + deadLine + " "
                + authorName + " " + priority.getPriorityLevel());
    }


}
