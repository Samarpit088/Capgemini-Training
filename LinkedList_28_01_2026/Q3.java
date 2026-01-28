package LinkedList_28_01_2026;
// Circular Linked List: Task Scheduler
public class Q3 {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addAtEnd(1, "Assignment 1", 1, "2026-02-01");
        ts.addAtEnd(2, "Assignment 2", 2, "2026-02-03");
        ts.addAtBeginning(3, "Assignment 1", 1, "2026-01-30");
        System.out.println("All Tasks:");
        ts.displayAll();
        System.out.println("\nExecuting Tasks:");
        ts.executeNextTask();
        ts.executeNextTask();
        System.out.println("\nSearch by Priority 1:");
        ts.searchByPriority(1);
        ts.removeById(2);
        System.out.println("\nAfter Deletion:");
        ts.displayAll();
    }
}
class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;
    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class TaskScheduler {
    TaskNode head = null;
    TaskNode current = null;
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = current = newNode;
            newNode.next = newNode;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
    void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = current = newNode;
            newNode.next = newNode;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void removeById(int id) {
        if (head == null) return;
        TaskNode curr = head;
        TaskNode prev = null;
        do {
            if (curr.taskId == id) {
                if (curr.next == curr) {
                    head = current = null;
                    return;
                }
                if (curr == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                if (current == curr)
                    current = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
        System.out.println("Task not found");
    }
    void executeNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }
        System.out.println("Executing Task:");
        displayTask(current);
        current = current.next;
    }
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks in scheduler");
            return;
        }
        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }
    void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found)
            System.out.println("No tasks found with this priority");
    }
    void displayTask(TaskNode t) {
        System.out.println("ID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority + ", Due: " + t.dueDate);
    }
}