import java.util.Scanner;

class Menu {

    public static void main(String[] args) {
        taskCompass tc = new taskCompass();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            if (!tc.getLoggedIn()) {
                System.out.println("Main Menu:");
                System.out.println("1. Login");
                System.out.println("2. Sign Up");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        if(tc.getUsers().isEmpty()) {
                            System.out.println("No user accounts, please create an account first.\n");
                            break;
                        }
                        tc.login(scanner);
                        break;
                    case 2:
                        tc.signUp(scanner);
                        break;
                    case 3:
                        isRunning = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("\nLogged In Menu:");
                System.out.println("1. View Tasks");
                System.out.println("2. Create Task");
                System.out.println("3. Edit Task");
                System.out.println("4. View Notifications");
                System.out.println("5. Change User");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        tc.viewTasks();
                        break;
                    case 2:
                        tc.createTask(scanner);
                        break;
                    case 3:
                        // tc.editTask(scanner);
                        break;
                    case 4:
                        viewNotifications();
                        break;
                    case 5:
                        tc.setLoggedIn(false);
                        tc.setCurrentUser(null);
                        System.out.println("Logged out. Returning to Main Menu...");
                        break;
                    case 6:
                        isRunning = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }                
            }
        }
        scanner.close();
    }

    private static void viewNotifications() {
        System.out.println("You have no new notifications.");
    }
}
