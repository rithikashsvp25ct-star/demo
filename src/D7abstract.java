public class D7abstract {

    static abstract class Employee {
        public String name;
        public String id;
        public int salary;

        Employee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        abstract void solveProblem();
        abstract void work();
    }

    static class BankEmployee extends Employee {

        BankEmployee(String name, String id, int salary) {
            super(name, id, salary);
        }

        @Override
        void solveProblem() {
            System.out.println(name + " is solving banking problems");
        }

        @Override
        void work() {
            System.out.println(name + " is working in the bank");
        }
    }

    static class CheckingEmployee extends Employee {

        CheckingEmployee(String name, String id, int salary) {
            super(name, id, salary);
        }

        @Override
        void solveProblem() {
            System.out.println(name + " is checking customer accounts");
        }

        @Override
        void work() {
            System.out.println(name + " is performing checking operations");
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new BankEmployee("Rithikash", "B101", 50000);
        Employee emp2 = new CheckingEmployee("Reymanth Kumar", "C102", 45000);

        System.out.println("--------------------------------");
        emp1.work();
        System.out.println();
        emp1.solveProblem();

        System.out.println("--------------------------------");
        emp2.work();
        System.out.println();
        emp2.solveProblem();

        System.out.println("--------------------------------");
    }
}