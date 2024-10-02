public class inverted{

public static void main(String[] args){  
// printing an inverted pyramid ;
 int n = 5;
for(int i = n; i >= 1; i--){ // for travelling in rows;

    for(int j = 5 ; j > i ; j--){ // for printing the  spaces before stars

        System.out.print(" ");


    }

    for(int j= 1; j <= 2 * i -1; j++ ){ // printing the stars
        System.out.print("*");
    }

    for(int j = 5 ; j > i ; j--){ // for printing the  spaces after stars

        System.out.print(" ");


    }
    System.out.println();

}






}
} 

 