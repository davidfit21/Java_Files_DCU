import java.time.LocalDate;
import java.time.Period;

enum State {
    TODO, BEGN, HALT, WAIT, DONE;
}


class Task {
    final String title;
    String description;
    LocalDate scheduled;
    LocalDate deadline;
    State state;

    public Task(String title, State state) {
        this.title = title;
        this.state = state;
    }

    public Task(String title, State state, String description, LocalDate scheduled, LocalDate deadline) {
        this.title = title;
        this.state = state;
        this.description = description;
        this.scheduled = scheduled;
        this.deadline = deadline;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getScheduled() {
        return this.scheduled;
    }

    public void setScheduled(LocalDate scheduled) {
        this.scheduled = scheduled;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String toString() {
        String message = this.title + " (" + this.state + ")";
        if (scheduled != null) {
            message += " scheduled: " + scheduled;
        }
        if (deadline != null) {
            message += " deadline: " + deadline;
        }
        return message;
    }

    public static void main(String[] args) {
        //////
    }
}

////////////////////////////////////////////////////////

class RepeatedTask extends Task {

    public RepeatedTask(String title, State state) {
        super(title, state);
    }

    // overides setstate() and adds special behaviour when state changes to DONE
    public void setState(State state) {
        if (state == State.DONE) {
            this.state = State.TODO;
        } 
    }
}

///////////////////////////////////////

class Chore extends RepeatedTask {

    LocalDate repeat;

    public Chore(String title, State state, LocalDate scheduled, LocalDate repeat) {
        super(title, state);
        setScheduled(scheduled);
        setRepeat(repeat);
    }

    public LocalDate getRepeat() {
        return this.repeat;
    }

    public void setRepeat(LocalDate repeat) {
        this.repeat = repeat;
    }

    public void setState(State state) {
        super.setState(state);
        if (state == State.DONE) {
            LocalDate repeat_new = repeat.plus(Period.ofDays(7));
            setScheduled(repeat);
            setRepeat(repeat_new);
        }
    }    
}

////////////////////////////////////

class SharedTask extends Task {

    String name;

    public SharedTask(String title, String name) {
        // state always starts with WAIT
        super(title, State.WAIT);
        this.name = name;
    }

    public String toString() {
        return super.toString() + " shared with: " + name;
    }
}

///////////////////////////////


class Dependency extends Task {
    Task task_dependency;

    Dependency(String title, State state, Task task_dependency) {
        super(title, state);
        this.task_dependency = task_dependency;
    }

    public String toString() {
        return super.toString() + " dependent on: " + task_dependency.toString();
    }

    public void setState(State state) {
        if (state == State.DONE && !(task_dependency.state == State.DONE)) {
            return;
        }

        this.state = state;
    }
}