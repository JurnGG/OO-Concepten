package week10.TodoList;

import java.time.LocalDate;

public class TodoItem {
    private String description;
    private Priority priority;
    private LocalDate deadline;

    public TodoItem(String description, Priority priority, String deadline) {
        this.description = description;
        this.priority = priority;
        try {
            String[] dateParts = deadline.split("/");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);
            this.deadline = LocalDate.of(year, month, day);
            if (this.deadline.isBefore(LocalDate.now())) {
                System.err.println("Deadline cannot be in the past");
                this.deadline = LocalDate.now();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid deadline format");
        }
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-40s %s", priority, description, deadline);
    }
}
