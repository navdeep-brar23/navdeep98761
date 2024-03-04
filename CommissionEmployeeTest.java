

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(
                "nav", "brar", "212-00-3622", 80000, .06);
        CommissionEmployee employee2 = new CommissionEmployee(
                "baba", "sandhu", "212-00-3622", 60000, 0.9);
        CommissionEmployee employee3 = new CommissionEmployee(
                "arsh", "gill", "212-00-3622", 40000, 0.9);
        CommissionEmployee employee4 = new CommissionEmployee(
                "kuwar", "kon", "212-00-0222", 70000, 0.9);
        CommissionEmployee employee5 = new CommissionEmployee(
                "mor", "raja", "212-00-3622", 20000, 0.9);
        CommissionEmployee[] emp = {employee, employee2, employee3, employee4, employee5};
        // get commission employee data
        for (int i = 0; i <= emp.length - 1; i++) {
            System.out.println("Employee information obtained by get methods:");
            System.out.printf("%n%s %s%n", "First name is",
                    emp[i].getFirstName());
            System.out.printf("%s %s%n", "Last name is",
                    emp[i].getLastName());
            System.out.printf("%s %s%n", "Social security number is",
                    emp[i].getSocialSecurityNumber());
            System.out.printf("%s %.2f%n", "Gross sales is",
                    emp[i].getGrossSales());
            System.out.printf("%s %.2f%n", "Commission rate is",
                    emp[i].getCommissionRate());

            emp[i].setGrossSales(5000);
            emp[i].setCommissionRate(.1);

            System.out.printf("%n%s:%n%n%s%n",
                    "Updated employee information obtained by toString", emp[i]);
        }
    }
}