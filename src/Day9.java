public class Day9 {

    static class College implements AutoCloseable {
        College() {
            System.out.println("VETIAS");
        }

        @Override
        public void close() throws Exception {
            System.out.println("VETIAS Close");
        }
    }

    static class Department extends College {
        Department() {
            System.out.println("CT");
        }

        @Override
        public void close() throws Exception {
            System.out.println("CT Close");
            super.close();
        }
    }

    static class YearOfDepartment extends Department {
        YearOfDepartment() {
            System.out.println("2025 of Department");
        }

        @Override
        public void close() throws Exception {
            System.out.println("2028 is closing year of department");
            super.close();
        }
    }

    public static void main(String[] args) throws Exception {
        try (YearOfDepartment yearOfDepartment = new YearOfDepartment()) {
            System.out.println("Inside try block");
        }
    }
}