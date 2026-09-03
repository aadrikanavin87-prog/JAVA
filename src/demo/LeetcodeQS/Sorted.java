package demo.LeetcodeQS;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10 ; i++){
            arr[10] = sc.nextInt();
        }
        for(int i=0;i<10 ; i++){
            if(arr[i]< arr[i+1]){
                System.out.print(true);
            }
            System.out.print(false);
        }
    }

}
