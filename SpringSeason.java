import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        if((m==3&&d>=20)||(m>3&&m<6)||(m==6&&d<=20)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
