/////////////////////////////////////////
/////////////Pattern question///////////
////////////////////////////////////////

// Solid rectangel pattern

import java.util.*;
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //input=4
        int m=sc.nextInt(); //input=5
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

Ans=>  *****
       *****
       *****
       *****



    // Hollow Rectangal

    import java.util.*;
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //input=4
        int m=sc.nextInt(); //input=5
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

Ans=>   *****
        *   *
        *   *
        *****


// Half Pyramid
        import java.util.*;
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //Input as 5
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

Ans=> *
      **
      ***
      ****
      *****


// Reverse Half pyramid 
import java.util.*;
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

Ans=> *****
      ****
      ***
      **
      *


    import java.util.*;
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //input as 5
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
Ans=>        *
            **
           ***
          ****
         *****   



import java.util.*;
class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //input as 5
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        
    }
}


Ans=>   1
        12
        123
        1234
        12345


        import java.util.*;
        class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        
    }
}

Ans=>   12345
        1234
        123
        12
        1