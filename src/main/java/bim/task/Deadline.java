package bim.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a task with a deadline.
 */
public class Deadline extends Task {
    private LocalDate deadline;

    public Deadline(String description, LocalDate deadline) {
        super(description);
        this.deadline = deadline;
    }

    /**
     * Returns the deadline of the task in 'MMM-dd-yyyy' format
     * @return The deadline of the task.
     */
    public String getDeadline() {
        return deadline.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + getDeadline() + ")";
    }
}
