/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2scomplementver;

/**
 *
 * @author cswan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String strA = "1100";
        String strB = "1111";

        char[] a = strA.toCharArray();
        char[] b = strB.toCharArray();

        if (a[0] != b[0])
        {
                System.out.println("No overflow");
        }
        else
        {
            if (a[0] == '0')
            {
                if (a[1] == b[1] && a[0] != a[1])
                {
                    System.out.println("Overflow 1");
                }
                else if (a[2] == b[2] && a[1] != b[1] && a[0] != a[2])	
                {
                    System.out.println("Overflow 2");
                }
                else if ((a[3] == b[3]) && (a[2] != b[2]) && (a[1] != b[1]) && (a[0] != a[3]))
                {
                    System.out.println("Overflow 3");
                }
                else
                {
                    System.out.println("No overflow");
                }
            }
            else
            {
                if (a[0] != a[1] || b[0] != b[1])
                {
                    System.out.println("Overflow 4");
                }
                else if (a[0] == a[2] || b[0] == b[2])
                {
                    System.out.println("Overflow 5");
                }
                else
                {
                    System.out.println("No overflow");
                }
            }
        }
    }
}
