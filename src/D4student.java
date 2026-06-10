void main(){
    int[][] studentAttendance= new int[][]{
            {0, 1, 0},
            {1, 0, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0},
    };
    for (int row = 0; row < studentAttendance.length; row++)
    {
        System.out.println("Student " + (row+1)+":");

        for (int column = 0; column < studentAttendance[row].length; column++) {
            if (studentAttendance[row][column]==1) {
                System.out.println("Class " + (column+1) + ": Present");
            }
            else{
                System.out.println("Class " + (column+1) + ": Absent");
            }
        }
    }
}