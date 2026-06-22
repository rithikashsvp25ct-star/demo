public class Day14 {

    static class Student {
        String name;
        int regno;
        int totalMarks;

        Student(Builder builder) {
            this.name = builder.name;
            this.regno = builder.regno;
            this.totalMarks = builder.totalMarks;
        }

        static class Builder {
            private String name;
            private int regno;
            private int totalMarks;

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Builder regno(int regno) {
                this.regno = regno;
                return this;
            }

            public Builder totalMarks(int totalMarks) {
                this.totalMarks = totalMarks;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("Aravindh")
                .regno(6)
                .totalMarks(499)
                .build();

        System.out.println(student.name);
        System.out.println(student.regno);
        System.out.println(student.totalMarks);
    }
}