import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList = new ArrayList<>();


    public List<Task> getTaskList() {
        return taskList;
    }

    public boolean isEmpty() {
        return taskList.isEmpty();
    }

    public void add(Task task) {
        if (!taskList.contains(task)) {
            taskList.add(task);
        }
    }

    public boolean remove(Task task) {
        boolean isRemoved = false;
        if (taskList.contains(task)) {
            taskList.remove(task);
            isRemoved = true;
        }
        return isRemoved;
    }

    public Task getTask(int index) {
        if (index >= taskList.size() || index < 0) {
            return null;
        }
        return taskList.get(index);
    }
}
