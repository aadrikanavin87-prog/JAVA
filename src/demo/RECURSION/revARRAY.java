package demo. RECURSION;
class main {
    public static void main(String[] args) {
        int[]arr = {2,4,6,4,8,2,9};
        System.out.print("{");
        revArray(arr,0);
        System.out.print("}");
//        int key = 8;
//        System.out.println(Search(arr,key,0 ));
    }
//    public static boolean Search(int[]arr ,int  key , int i ){
//        if(arr[i] == key) return true;
//        if(i== arr.length) return false;
//        return Search(arr, key , i+1);
//
//    }
    public static void revArray(int[]arr , int i){
        if(i==arr.length)  return;
        // System.out.print(arr[i]+ " ");
        revArray(arr,i+1);     // first call then print (it give  reverse the values)
        System.out.print(arr[i]+ " ");
    }
}
// first print then call it give array element in real
// first print then call it print rev of array
