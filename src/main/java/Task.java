public class Task {
    private String description;
    private boolean isDone;

    public Task() {
        this("");
    }
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }
    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }
    public void setDone() {
        this.isDone = true;
    }
}
