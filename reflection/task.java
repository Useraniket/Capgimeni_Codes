package reflection;

public class task {

    @Role("admin")
    public void performAdminTask() {
        System.out.println("Admin task performed.");
    }

    @Role("user")
    public void performUserTask() {
        System.out.println("User task performed.");
    }

    @Role("guest")
    public void performGuestTask() {
        System.out.println("Guest task performed.");
    }
}
