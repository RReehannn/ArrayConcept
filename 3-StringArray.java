class StringArray {
    public static void main(String[] args) {
        String[] strArr = new String[5];
        strArr[0] = "A";
        strArr[1] = "AA";
        strArr[2] = "AAA";
        strArr[3] = "AAAA";
        strArr[4] = "AAAAA";


        int index = 0;
        while (index < strArr.length){
            System.out.println(strArr[index]);
            index++;
        }

        System.out.println("\nArray in Direct value\n");


        String[] mystrArr = {"B", "BB", "BBB", "BBBB", "BBBBB"};
//        System.out.println(mystrArr.length);

        int index1 = 0;
        while (index1 < mystrArr.length){
            System.out.println(mystrArr[index1]);
            index1++;
        }


    }
}
