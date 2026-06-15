void main(){
    int[][] marks=new int[5][5];
    int[][] studentMarks={
            {78,90,34},
            {89,65,89},
            {12,34,56},
            {66,12,89},
            {33,77,88},
    };
    for (int row = 0; row < studentMarks.length; row++) {
        for (int column = 0; column < studentMarks[row].length; column++) {
            System.out.print(studentMarks[row][column]+" ");
        }
        System.out.println();
    }
}

