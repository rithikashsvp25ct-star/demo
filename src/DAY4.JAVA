public class Main {
    public static void main(String[] args) {

        int[][] studentsMarks = {
                {78, 90, 34},
                {89, 65, 89},
                {12, 34, 56},
                {66, 12, 89},
                {33, 77, 88}
        };

        String[] subjects = {"Maths", "Physics", "Chemistry"};

        for (int row = 0; row < studentsMarks.length; row++) {
            int total = 0;

            for (int col = 0; col < studentsMarks[row].length; col++) {
                total += studentsMarks[row][col];
            }

            double average = total / 0.5;

            System.out.println("Student " + (row + 1));
            System.out.println("Total = " + total);
            System.out.println("Average = " + average);
            System.out.println();
        }

    
        System.out.println("No\tM\tP\tC");

        for (int row = 0; row < studentsMarks.length; row++) {
            System.out.print((row + 1) + "\t");

            for (int col = 0; col < studentsMarks[row].length; col++) {
                System.out.print(studentsMarks[row][col] + "\t");
            }

            System.out.println();

        }
    }
}