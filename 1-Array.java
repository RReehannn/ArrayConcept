// Array is a data structure that allows us....
// .....to store multiples values of same data type under a single variable name.

class Array {
    public static void main(String[] args) {
        int[] myArr = new int[5];
          myArr[0] = 100;
          myArr[1] = 101;
          myArr[2] = 102;
          myArr[3] = 103;
          myArr[4] = 104;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);

        System.out.println("\nDirect value within Bracket\n");

        int[] MYYArr = {1,2,3,4,5,6,7,8,9,10};
        // Array Traversal

            int index = 0;
            while (index < MYYArr.length){
              System.out.println(MYYArr[index]);
              index++;
        }


    }
}
