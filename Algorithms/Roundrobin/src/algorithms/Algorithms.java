package algorithms;

//https://www.youtube.com/watch?v=f5OD9CKrZEw&list=PLGLfVvz_LVvReUrWr94U-ZMgjYTQ538nT
public class Algorithms {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array");
        printArray(array);

        System.out.println("\nShift left");
        shiftLeft(array);
        printArray(array);

        System.out.println("\nShift left");
        shiftLeft(array);
        printArray(array);

        System.out.println("\nShift right");
        shiftRight(array);
        printArray(array);

        System.out.println("\nnShift right");
        shiftRight(array);
        printArray(array);
    }

    //print values of array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    //Shift array values to left    1 2 3 4 5 --> 2 3 4 5 1
    public static void shiftLeft(int[] array) {
        int temp = array[0]; //temp = array[0]
        for (int index = 1; index < array.length; index++) {
            array[index - 1] = array[index];
        }
        array[array.length - 1] = temp; //array[4]=temp
    }

    //Shift array values to right    1 2 3 4 5 --> 5 1 2 3 4
    public static void shiftRight(int[] array) {
        int temp = array[array.length - 1]; //temp = array[4]
        for (int index = array.length - 1; index > 0; index--) {
            array[index] = array[index - 1];
        }
        array[0] = temp;
    }
}
