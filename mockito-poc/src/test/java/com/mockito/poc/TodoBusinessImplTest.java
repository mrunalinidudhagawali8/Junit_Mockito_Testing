package com.mockito.poc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mockito.poc.service.TodoService;
import com.mockito.poc.service.impl.TodoBusinessImpl;

public class TodoBusinessImplTest {

	@Test
	public void retrieveTodosRelatedToSpringTest() {
		TodoService todoServiceMock = mock(TodoService.class);
		TodoBusinessImpl impl = new TodoBusinessImpl(todoServiceMock);
		List<String> listOfAllTodos = Arrays.asList("learn spring core", "check Spring boot", "what is spring ioc");

		List<String> actualReturnedList = new ArrayList<String>();
		when(impl.retrieveTodosRelatedToSpring("dummy")).thenReturn(listOfAllTodos);
		actualReturnedList = impl.retrieveTodosRelatedToSpring("dummy");

		assertEquals(2, actualReturnedList.size());
	}
}
