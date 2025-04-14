package lab6.container;

import lab6.task.Task;

public interface Container {
    void push(Task task);
    Task pop();
    boolean isEmpty();
    int size();
}
