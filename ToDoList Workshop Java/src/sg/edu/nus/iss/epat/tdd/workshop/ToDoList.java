package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
	private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask(Task task) {
		// Add code here
		tasks.put(task.getDescription(), task);
	}

	public void completeTask(String description) {
		// Add code here
		Task task = null;
		if ((task = tasks.get(description)) != null)
			;
		task.setComplete(true);
	}

	public boolean getStatus(String description) {
		// Add code here
		Task task = null;
		if ((task = tasks.get(description)) != null)
			;
		return task.isComplete();
	}

	public Task getTask(String description) {
		// Add code here
		return null;
	}

	public Task removeTask(String description) {
		// Add code here
		return tasks.remove(description);
	}

	public Collection<Task> getAllTasks() {
		return tasks.values();
	}

	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTasks = new ArrayList<Task>();

		for (Task task : getAllTasks()) {
			if (task.isComplete())
				completedTasks.add(task);
		}

		return completedTasks;
	}
}
