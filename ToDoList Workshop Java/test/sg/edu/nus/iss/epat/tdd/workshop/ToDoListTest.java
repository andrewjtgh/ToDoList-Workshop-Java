package sg.edu.nus.iss.epat.tdd.workshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
	// Define Test Fixtures
	private ToDoList todolist;
	private Task task;
	private Task task2;
	private Task task3;

	public ToDoListTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// Initialise Test Fixtures
		todolist = new ToDoList();
		task = new Task("Desc 1");
		task2 = new Task("Desc 2");
		task3 = new Task("Desc 3");
	}

	@After
	public void tearDown() throws Exception {
		// Uninitialised test Fixtures
	}

	@Test
	public void testAddTask() {
		todolist.addTask(task);
		assertTrue(todolist.getAllTasks().contains(task));
	}

	@Test
	public void testIsEmpty() {
		todolist.addTask(task);
		todolist.removeTask(task.getDescription());
		assertTrue(todolist.getAllTasks().isEmpty());
	}

	@Test
	public void testGetStatus() {
		// fail("Not implemented yet");
		todolist.addTask(task);
		assertEquals(false, todolist.getStatus("Desc 1"));
		todolist.completeTask("Desc 1");
		assertEquals(true, todolist.getStatus("Desc 1"));
	}

	@Test
	public void testRemoveTask() {
		// fail("Not implemented yet");
		todolist.addTask(task);
		todolist.addTask(task2);
		todolist.removeTask(task.getDescription());
		assertFalse(todolist.getAllTasks().contains(task));

	}

	@Test
	public void testGetCompletedTasks() {
		// fail("Not implemented yet");
		todolist.addTask(task);
		todolist.addTask(task2);
		todolist.addTask(task3);

		todolist.completeTask("Desc 1");
		todolist.completeTask("Desc 3");

		Collection<Task> tasks = todolist.getCompletedTasks();
		assertEquals(tasks.size(), 2);
		assertTrue(tasks.contains(task));
		assertFalse(tasks.contains(task2));
		assertTrue(tasks.contains(task3));

	}
}
