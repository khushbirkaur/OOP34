/* Aim:- Practical No.4
   Author:- Khushbir Kaur Bamrah
*/

public class PracticalNo4
{
    public static void printName(String name) 
{
       
        name = name.trim();

        String[] names = name.split("\\s+");
       
        String firstName = names[0];
        String lastName = names[names.length - 1];
       
 
        System.out.println(lastName + ", " + firstName);
    }
   
    public static void main(String[] args) 
{
        
        printName("Bill Joy");
    }
}