abstract class Ticket {
    private int id;
    private String issue;
    private String status;

    Ticket(int id, String issue) {
        if (issue == null || issue.isEmpty())
            throw new IllegalArgumentException("Issue cannot be empty");
        this.id = id;
        this.issue = issue;
        this.status = "Open";
    }

    public int getId() { return id; }
    public String getIssue() { return issue; }
    public String getStatus() { return status; }

    public void closeTicket() { status = "Closed"; }

    abstract void showDetails();
}

class TechnicalTicket extends Ticket {
    private String device;

    TechnicalTicket(int id, String issue, String device) {
        super(id, issue);
        this.device = device;
    }

    void showDetails() {
        System.out.println("Tech Ticket ID: " + getId());
        System.out.println("Issue: " + getIssue());
        System.out.println("Device: " + device);
        System.out.println("Status: " + getStatus());
    }
}

class Customer {
    private String name;

    Customer(String name) { this.name = name; }

    public void createTicket(Ticket t) {
        System.out.println(name + " created Ticket " + t.getId());
    }
}

class SupportAgent {
    private String name;

    SupportAgent(String name) { this.name = name; }

    public void resolveTicket(Ticket t) {
        t.closeTicket();
        System.out.println(name + " resolved Ticket " + t.getId());
    }
}

public class laptop {
    public static void main(String[] args) {
        try {
            Customer c1 = new Customer("Aman");
            Ticket t1 = new TechnicalTicket(101, "Laptop not working", "Laptop");
            SupportAgent a1 = new SupportAgent("Rahul");

            c1.createTicket(t1);
            t1.showDetails();
            a1.resolveTicket(t1);
            System.out.println();
            t1.showDetails();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}