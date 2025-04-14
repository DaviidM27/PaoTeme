package lab6.container;

import lab6.task.Task;

public class StackContainer extends AbstractContainer {
    @Override
    public Task pop() {
        if (isEmpty()) return null;
        return tasks[--size];
    }
}
