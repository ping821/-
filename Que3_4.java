package study;

import java.util.Scanner;
//Exercise 3.4:Verify Goethe Conjecture
public class Que3_4 {
    int a;
    int f;
    public boolean sushu(int b){
        if (b==2){
            return true;
        }
            for (int i = 2; i < b; i++) {
                if (b % i != 0) {
                    if (i==b-1&&b % i != 0){
                        return true;
                    }
                    continue;
                }
                break;
                }
        return false;
    }
    public boolean guess(int g){
        if (g<=6){
            System.out.println("6 is not allowed");
            return false;
        }
        for(int i=2;i<=g/2;i++){
            if(sushu(i)&&sushu(g-i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Que3_4 s=new Que3_4();
        //System.out.println(s.sushu(61));
        Scanner y =new Scanner(System.in);
        System.out.println("enter a number to Goethe");
        int num=y.nextInt();
        System.out.println(s.guess(num));
    }
}
