public class Day8record{
    record CourseRecord(String Dept,String Coursename){

    }
    static void main() {
        CourseRecord courseRecord=new CourseRecord("Computer technology","B.sc CT");
        System.out.println("---------------------------");
        System.out.println("Dept :"+courseRecord.Dept());
        System.out.println("Course Name :"+courseRecord.Coursename());
        System.out.println("---------------------------");
    }
}