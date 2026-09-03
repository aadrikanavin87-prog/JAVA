package demo.RECURSION;
class Main {
    public static void main(String[] args) {
//        Q. print array using recursion
        int[] arr = {3,7,8,9,5,3};
        recArray(arr , 0);


    }

    public static void recArray(int[]arr , int i){
        if(i == arr.length ){
            System.out.print("}");
            return;
        }
        if( i == 0){
            System.out.print("{");
        }
        System.out.print(arr[i]);
        if(i != arr.length-1){
            System.out.print(",");
        }


        recArray(arr , i+1);
    }
}
