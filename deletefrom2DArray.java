public class TwoDimensionalArray {
    int arr[][]=null;
    //Constructor

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int row =0;row<arr.length;row++){
            for(int col = 0;col<arr.length;col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }

    //Inserting value in the array

    public void insertValueInTheArray(int row, int col, int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("Value is sucessfully inserted");
            }else{
                System.out.println("This cell is already occupied");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2d array");
        }
    }

    // Access value of array

    public void accessCell(int row , int col){
        System.out.println("\nAccessing Rows#" + row + ", Col#" + col);
        try{
            System.out.println("Cell value is " + arr[row][col]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    // Traverse 2d Array

    public void traverse2DArray(){
        for(int row = 0; row <arr.length;row++){
            for(int col = 0; col < arr[0].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }

    // Searching in 2d array 
    public void searchingValue(int value){
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[0].length;col++){
                if(arr[row][col]==value){
                    System.out.println("Value is found at row: "+ row + " Col: "+col);
                    return;
                } 
            }
        }
        System.out.println("Value is not found");

         
    }

 // Deleting value from 2d array
    
    public void deleteValuefromArray(int row, int col){
        try{
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for array");
        }
    }
    
    
}

/*import java.util.Arrays;
class Main{
    public static void main(String[] args){
        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(0, 2, 30);
        sda.insertValueInTheArray(1, 0, 40);
        sda.insertValueInTheArray(1, 1, 50);
        sda.insertValueInTheArray(1, 2, 60);
        sda.insertValueInTheArray(2, 0, 70);
        sda.insertValueInTheArray(2, 1, 80);
        sda.insertValueInTheArray(2, 2, 90);

        sda.traverse2DArray();
        sda.deleteValuefromArray(2, 0);
        sda.traverse2DArray();


        //sda.searchingValue(40);
        //sda.accessCell(0, 2);
        //System.out.println(Arrays.deepToString(sda.arr));
    }
} */

// Name of file should be TwoDimensionalArray.java
