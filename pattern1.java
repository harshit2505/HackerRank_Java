/*
print pattern
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
import java.util.Scanner;
class pattern1{
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter for how long you want to print pattern");
    int num = sc.nextInt(); 
       for(int i =0;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" "+i);
            
        }
        System.out.println(" ");
    }  
    }
    
}