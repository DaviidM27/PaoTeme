package lab6.container;

import lab6.task.Task;

public class QueueContainer extends AbstractContainer {
    private int front = 0;

    @Override
    public Task pop() {
        if (isEmpty()) return null;
        Task task = tasks[front];
        for (int i = 0; i < size - 1; i++) {
            tasks[i] = tasks[i + 1];
        }
        tasks[--size] = null;
        return task;
    }
}
