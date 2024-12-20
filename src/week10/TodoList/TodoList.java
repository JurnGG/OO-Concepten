package week10.TodoList;

import java.util.LinkedList;
import java.util.List;

public class TodoList {
    private List<TodoItem> items;

    public TodoList() {
        items = new LinkedList<>();
    }

    public void addTodoItem(String description, Priority priority, String deadline) {
        TodoItem newItem = new TodoItem(description, priority, deadline);
        int index = 0;
        for (TodoItem item : items) {
            if (item.getPriority().ordinal() < newItem.getPriority().ordinal()) {
                break;
            }
            index++;
        }
        items.add(index, newItem);
    }

    public void show(){
        for(TodoItem item : items){
            System.out.println(item+"\n");
        }
    }


}
