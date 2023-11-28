public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] arr){
        int sum = 0;
        for (int i = 0; i< arr.length;i++){
            for (int j =0; j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // 2. sumRowN

    public static int sumRowN(int[][] arr, int i){
        int sum = 0;
        for(int j = 0;j < arr[i].length; j++) {
            sum += arr[i][j];
        }
        return sum;
    }

    // 3. sumColN
    public static int sumColN(int[][] arr, int j){
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][j];
        }
        return sum;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] arr,int row1,int column1,int row2,int column2){
        int sum = 0;
        boolean startCount = false;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(i == row1 && j == column1){
                    startCount = true;
                }
                if(startCount){
                    sum += arr[i][j];
                }
                if(i == row2 && j == column2){
                    startCount = false;
                }
            }
        }
        return sum;
    }
}

