package todolist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
	// Define Test Fixtures
	private Task task;
	private ToDoList todolist;

	public ToDoListTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// Initialise Test Fixtures
		task = new Task("First Task");
		todolist = new ToDoList();
	}

	@After
	public void tearDown() throws Exception {
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		// Task task = new Task("First Task");
		// ToDoList todolist = new ToDoList();
		todolist.addTask(task);
		assertTrue(todolist.getAllTasks().contains(task));
	}
	
	@Test
	public void testIsEmpty() {
		//Task task = new Task("First Task");
		//ToDoList todolist = new ToDoList();
		todolist.addTask(task);
		todolist.removeTask(task.getDescription());
		assertTrue(todolist.getAllTasks().isEmpty());
	}
	
	@Test
	public void testRemoveTask() {
		Task task = new Task("First Task");
		Task task2 = new Task("Second Task");
		ToDoList todolist = new ToDoList();
		todolist.addTask(task);
		todolist.addTask(task2);
		todolist.removeTask(task.getDescription());
		assertFalse(todolist.getAllTasks().contains(task));
	}

	@Test
	public void testGetStatus() {
		fail("Not implemented yet");
	}
//	}

	@Test
	public void testCompleteTask() {
		Task task = new Task("First Task");
		ToDoList todolist = new ToDoList();
		todolist.addTask(task);
		todolist.completeTask("First Task");
		assertEquals(todolist.getStatus("First Task"), "Done");
	}

	@Test
	public void testGetCompletedTasks() {
		fail("Not implemented yet");
	}
}
