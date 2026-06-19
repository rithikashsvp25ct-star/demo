public class Day6marks {

    static class Student {
        String name, dept;
        int regNo;
        int maths, physics, chemistry;

        Student(String n, int r, String d) {
            name = n;
            regNo = r;
            dept = d;
        }
        int getMaths() {
            return this.maths ;
        }
        int getPhysics() {
           return this.physics;
        }

        int getChemistry() {
            return this.chemistry;
        }

        void setMaths(int m) {
            this .maths=m;
        }

        void setPhysics(int p) {
          this.physics = p;
        }

        void setChemistry(int c) {
            this.chemistry = c;
        }
        void updateMarks(int m) {
            maths = m;
        }

        void updateMarks(int p, int c) {
            physics = p;
            chemistry=c;
        }
        void updateMarks(int m, int p, int c) {
            maths = m;
            physics = p;
            chemistry = c;
        }

        void show() {
            System.out.println(name + " " + regNo + " " + dept);
            System.out.println("Maths     : " + getMaths());
            System.out.println("Physics   : " + getPhysics());
            System.out.println("Chemistry : " + getChemistry());
            System.out.println("------------");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 101, "CSE");
        Student s2 = new Student("Bala", 102, "ECE");
        Student s3 = new Student("Charan", 103, "MECH");
        s1.updateMarks(80,89, 90);
        s2.setMaths(70);
        s2.setPhysics(75);
        s2.setChemistry(65);
        s3.updateMarks(88);
        s3.updateMarks(90, 89);
        s1.show();
        s2.show();
        s3.show();
    System.out.println("Arun Maths Mark: " + s1.getMaths());
    System.out.println("Bala Physics Mark: " + s2.getPhysics());
    System.out.println("Charan Chemistry Mark: " + s3.getChemistry());
    }
}