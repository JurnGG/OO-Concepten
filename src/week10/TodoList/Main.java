package week10.TodoList;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodoItem("Pay electricity bill", Priority.HIGH_TO_LOW, "10/12/2024");
        todoList.addTodoItem("Complete project report", Priority.DEADLINE, "09/12/2024");
        todoList.addTodoItem("Book vacation tickets", Priority.LOW_TO_HIGH, "15/01/2025");
        todoList.addTodoItem("Gym subscription renewal", Priority.HIGH_TO_LOW, "01/01/2025");

        todoList.addTodoItem("Finish reading book", Priority.DEADLINE, "01/01/2020");

        try {
            todoList.addTodoItem("Invalid date item", Priority.LOW_TO_HIGH, "invalid-date");
        } catch (IllegalArgumentException e) {
            System.err.println("Caught expected exception: " + e.getMessage());
        }

        todoList.show();
    }
}
