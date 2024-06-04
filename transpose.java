import java.util.Scanner;
public class transpose {
    int i,j;
    int a[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    void show1(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(" enter your number : ");
                a[i][j]= sc.nextInt();
            }
            System.out.println();
        }
    }
    void show2(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void show3(){
        System.out.println(("after transpose : "));
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[j][i]+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        transpose t=new transpose();
        t.show1();
        t.show2();
        t.show3();
    }
}
