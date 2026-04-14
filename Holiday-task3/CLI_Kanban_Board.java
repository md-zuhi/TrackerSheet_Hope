import java.util.*;
class Task {
    private int id;
    private String title;
    private String status;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = "ToDo";
    }

    public int getId() { return id; }
    public String getStatus() { return status; }

    public void move() {
        if (status.equals("ToDo")) status = "InProgress";
        else if (status.equals("InProgress")) status = "Done";
        else System.out.println("Task already completed.");
    }

    public void display() {
        System.out.println(id + ". " + title + " [" + status + "]");
    }
}

class KanbanBoard {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(tasks.size() + 1, title));
        System.out.println("Task added!");
    }

    public void moveTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.move();
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task t : tasks) {
            t.display();
        }
    }
}

public class CLI_Kanban_Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KanbanBoard board = new KanbanBoard();

        while (true) {
            System.out.println("\n1. Add Task\n2. Move Task\n3. View Tasks\n4. Exit");
            System.out.print("Choose: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine(); 

                if (choice == 1) {
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    board.addTask(title);
                } 
                else if (choice == 2) {
                    System.out.print("Enter task ID: ");
                    int id = sc.nextInt();
                    board.moveTask(id);
                } 
                else if (choice == 3) {
                    board.showTasks();
                } 
                else if (choice == 4) {
                    System.out.println("Exiting...");
                    break;
                } 
                else {
                    System.out.println("Invalid choice!");
                }
            } catch (Exception e) {  
                System.out.println("Invalid input! Try again.");
                sc.nextLine(); 
            }
        }
        sc.close();
    }
}