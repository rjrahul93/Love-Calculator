 /* This Project created by Rahul Jaiswar.
 * Linkedin: https://www.linkedin.com/in/rjrahul93
 * GitHub: https://github.com/rjrahul93
 * EMail: rjrahul9322@gmail.com
 */

import java.util.ArrayList;
import java.util.Scanner;

public class loveCalculator1 {

    static ArrayList charCount=new ArrayList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter First Person Name : ");
        String name1 = sc.nextLine();
        System.out.print("Please enter Your Crush Names : ");
        String name2 = sc.nextLine();
       

      // String name1="Mary";
      // String name2="James";

        String name = name1.toLowerCase() + "loves" + name2.toLowerCase();

        for (int i = 0; i < name.length(); i++) {

            int count = 1;
            int j = 0;

            for (; j < name.length(); j++) {

                if (i != j) {

                    if (name.charAt(i) == name.charAt(j)) {

                       if(i<j)
                       {
                         count++;
                         
                       }
                       else{
                        count--;
                       }
                        
                    }

                }
                
            }
            
            if(count>0)
            {
                charCount.add(count);

            }
           
        }
        
        calLove(charCount);

    }

    public static void calLove(ArrayList charAdd)
    {
        ArrayList temp=new ArrayList();
       
        while(charAdd.size()>2)
        {
        for(int i=0;i<charAdd.size();i++)
        {
            if(i<charAdd.size()-1-i){

               int a=(int) charAdd.get(i)+(int) charAdd.get(charAdd.size()-1-i);
               if(a>=10)
               {
                temp.add(a/10);
                temp.add(a%10);
               }
               else{
                 temp.add(a);
               }
            
            }
           
        }

         if(charAdd.size()%2==1)
            {
                temp.add(charAdd.get(charAdd.size()/2));
            }

            charAdd.removeAll(charAdd);
            charAdd.addAll(temp);
            temp.removeAll(temp);
            //System.out.println(charAdd);
        }

        System.out.println("=============================");
        System.out.println("Your Love percentage is " +charAdd.get(0)+""+charAdd.get(1) +"%");
        System.out.println("=============================");
        

    }

}
