import java.util.Scanner;
public class ToggleCase {
    static void toggle(String str)
    {
        int n=str.length();
        char ch[]=str.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90) {
                ch[i] += 32;
            }
            if(str.charAt(i)>=97 && str.charAt(i)<=128) {
               ch[i]-=32;
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        toggle(str);
    }
}
