package todolist;

import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      // Add code here
   }

   public boolean getStatus(String description) {
      // Add code here
      return false;
   }

   public Task getTask(String description) {
      // Add code here
      return null;
   }

   public Task removeTask(String description) {
      return tasks.remove(description);
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      return null;
   }
}
