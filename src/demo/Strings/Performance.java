package demo.Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char)('a' + i );
            System.out.println(ch);
            series = series + ch ;   // it create various object for each character
        }
        System.out.println(series);
    }
}

// here it is not good way to print a-z
//bcz its time complexity is O(N^2)
//to add n no. it takes complexity N^2 which is not so good
//this is bcz a new data type is launch named as
//StringBuilder - it make only one class and print all the a to z
//and take O(N) time complexity
