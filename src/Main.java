import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollManager manager = new PayrollManager();

        int choice;

        do {
            System.out.println("\n===== PAYROLL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Calculate Total Payroll");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id1 = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name1 = sc.nextLine();

                        System.out.print("Enter Base Salary: ");
                        double baseSalary = sc.nextDouble();

                        System.out.print("Enter Bonus: ");
                        double bonus = sc.nextDouble();

                        System.out.print("Enter Tax Rate (%): ");
                        double tax = sc.nextDouble();

                        manager.addEmployee(new FullTimeEmployee(id1, name1, baseSalary, bonus, tax));
                        break;

                    case 2:
                        System.out.print("Enter ID: ");
                        int id2 = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name2 = sc.nextLine();

                        System.out.print("Enter Hourly Rate: ");
                        double rate = sc.nextDouble();

                        System.out.print("Enter Hours Worked: ");
                        int hours = sc.nextInt();

                        manager.addEmployee(new PartTimeEmployee(id2, name2, rate, hours));
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to remove: ");
                        int removeId = sc.nextInt();
                        manager.removeEmployee(removeId);
                        break;

                    case 4:
                        manager.displayAllEmployees();
                        break;

                    case 5:
                        double total = manager.calculateTotalPayroll();
                        System.out.println("Total Payroll: " + total);
                        break;

                    case 6:
                        System.out.println("Exiting system...");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear buffer
            }

        } while (choice != 6);

        sc.close();
    }
}
