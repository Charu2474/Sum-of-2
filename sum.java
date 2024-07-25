import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int num=k.nextInt();
        int sum=0,temp=0;
        if(num>0&&num<100)
        {
            for(int i=0;i<num;i++){
                temp=num%10;
                sum+=temp;
                num/=10;
            }
            System.out.println(sum);
        }
    }
}
