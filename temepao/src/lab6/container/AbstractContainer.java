package lab6.container;

import lab6.task.Task;

public abstract class AbstractContainer implements Container {
    protected Task[] tasks;
    protected int size;

    public AbstractContainer() {
        tasks = new Task[50];
        size = 0;
    }

    @Override
    public void push(Task task) {
        if (size < 50) {
            tasks[size++] = task;
        } else {
            System.out.println("Container is full. Cannot add more tasks.");
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public abstract Task pop();
}
