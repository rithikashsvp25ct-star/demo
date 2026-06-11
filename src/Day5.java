public class Day5 {

/*static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        Car(String brand, String color, int fuel) {
            this.brand = brand;
            this.color = color;
            this.fuel = fuel;
            this.speed = 0;
        }

        public void accelerate() {
            System.out.println("Brand :"+brand);
            System.out.println("Colour :"+color);
            if (fuel > 0) {
                speed += 10;
                fuel -= 5;
                System.out.println("accelerated. Speed: " + speed +" km/h | Fuel: " + fuel + "%");
            } 
        }

        public void decelerate() {
            if (speed > 0) {
                speed -= 10;
                System.out.println("slowed down. Speed: " + speed + " km/h");
            } 
        }

        public void refill() {
            fuel += 20;
            if (fuel > 100) {
                fuel = 100;
            }
            System.out.println("refueled. Current Fuel: " + fuel + "%");
        }

        public void showFuel() {
            System.out.println("Fuel Status of " + fuel + "%");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tata", "Red", 30);

        myCar.showFuel();
        myCar.accelerate();
        myCar.decelerate();
        myCar.refill();
        myCar.showFuel();
    }*/
 static   class Student {
    String name, dept;
    int regNo;
    int maths, physics, chemistry;
    Student(String n, int r, String d) {
        name = n;
        regNo = r;
        dept = d;
    }
    void setMaths(int m) { 
        maths = m; 
        }
    void setPhysics(int p) { 
        physics = p; 
        }
    void setChemistry(int c) { 
        chemistry = c;
        }


    void updateMarks(int m) {
        maths = m;
    }

    void updateMarks(int m, int p) {
        maths = m;
        physics = p;
    }

    void updateMarks(int m, int p, int c) {
        maths = m;
        physics = p;
        chemistry = c;
    }

    void show() {
        System.out.println(name + " " + regNo + " " + dept);
        System.out.println(maths + " " + physics + " " + chemistry);
        System.out.println("------------");
    }
}
    public static void main(String[] args) {

        Student s1 = new Student("Arun", 101, "CSE");
        Student s2 = new Student("Bala", 102, "ECE");
        Student s3 = new Student("Charan", 103, "MECH");

        s1.updateMarks(80, 85, 90);
        s2.setMaths(70);
        s2.setPhysics(75);
        s2.setChemistry(65);
        s3.updateMarks(88);

        s1.show();
        s2.show();
        s3.show();
    }
}
