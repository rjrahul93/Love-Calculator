 /* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import java.util.ArrayList;
import java.util.Scanner;

public class loveCalculator2 {

    static ArrayList a= new ArrayList();
    public static void main(String[]args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter First Person Name :");
        String name1=sc.nextLine();
        System.out.print("Please enter second mean Your Loves Names :");
        String name2=sc.nextLine();

       // String name1="declan donnelly";
       //S String name2="ashley roberts";
        
        String name=name1.toLowerCase()+name2.toLowerCase();
        String loves="loves";

        for(int i=0;i<loves.length();i++)
        {
            int count=0;
            for(int j=0;j<name.length();j++)
            {
                if(loves.charAt(i)==name.charAt(j))
                {
                    count++;
                    
                }
                
            }

            a.add(count);
            
        }
        
        calLove();
    }

    public static void calLove()
    {
        ArrayList b=new ArrayList();

        while(a.size()>2)
        {
        for(int i=0;i<a.size()-1;i++)
        { 
            int c=(int) a.get(i)+(int)a.get(i+1);
            if(c>=10)
            {
                b.add(c/10);
                b.add(c%10);
            }
            else{
              b.add(c);
            }
            
        }
        a.removeAll(a);
        a.addAll(b);
        b.removeAll(b);
        // System.out.println(a);
        
    }
      System.out.println("=============================");
      System.out.println("Your Love percentage is " +a.get(0)+""+a.get(1) +"%");
      System.out.println("=============================");

    }
    
}
