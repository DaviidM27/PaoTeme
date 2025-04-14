package lab6;

import lab6.container.Container;
import lab6.container.QueueContainer;
import lab6.container.StackContainer;
import lab6.task.CounterOutTask;
import lab6.task.OutTask;
import lab6.task.RandomOutTask;
import lab6.task.Task;

public class main {
    public static void Main(String[] args) {
        Container stack = new StackContainer();
        Container queue = new QueueContainer();

        // Adăugare în Stack (LIFO)
        stack.push(new OutTask("Hello from Stack!"));
        stack.push(new RandomOutTask());
        stack.push(new CounterOutTask());

        System.out.println("Executing tasks from Stack:");
        while (!stack.isEmpty()) {
            Task task = stack.pop();
            task.execute();
        }

        // Adăugare în Queue (FIFO)
        queue.push(new OutTask("Hello from Queue!"));
        queue.push(new RandomOutTask());
        queue.push(new CounterOutTask());

        System.out.println("\nExecuting tasks from Queue:");
        while (!queue.isEmpty()) {
            Task task = queue.pop();
            task.execute();
        }
    }
}
