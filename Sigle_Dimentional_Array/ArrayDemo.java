package Sigle_Dimentional_Array;

public class ArrayDemo 
{
    public static void main(String[] args) 
    {
        
        int[] a = new int[3];
        int b[] = {110,120,130};

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        System.out.println("Array Length : " + a.length);

        for(int i = 0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        
        for(int i = 0; i<b.length;i++)
        {
            System.out.println(b[i]);
        }

    }
}

//Output :-

// Array Length : 3
// 10
// 20
// 30
// 110
// 120
// 130
