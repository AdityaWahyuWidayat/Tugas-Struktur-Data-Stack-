/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tumpukansuttlecock;

/**
 *
 * @author SMHab
 */
public class TumpukanSuttlecock {
    static int[] data;
    static int size;
    static int top;
 
        static void inisialisasi(int i)
    {
        size=i;
        data=new int[size];
        top=0;
    }
    
    static boolean Kosong()
    {
        return top<=0;
    }
    
    static boolean Penuh()
    {
        return top>=size;
    }
    
    static void Push(int i)
    {
        if(Penuh())
            System.out.println("Dus penuh");
        else
        {
            System.out.println("Suttlecock kode "+i+" telah dimasukkan");
            data[top++]=i;
        }
    }
    
    static void Pop()
    {
        if(Kosong())
            System.out.println("Dus kosog");
        else
        {
            top--;
            System.out.println("Suttlecock kode "+data[top]+" telah dikeluarkan");            
        }
    }
    static void display()
    {
     int i=top-1;
        System.out.println("\ndetail tumpukan :");
     
     while(i>=0)
     {
         System.out.println("Suttlecok kode "+(i+1)+" berada di tumpukan ke-"+data[i]);
         i--;
     }
    }            
       
    public static void main(String[] args) {
        // TODO code application logic here
        
        TumpukanSuttlecock a=new TumpukanSuttlecock();
        a.inisialisasi(5);
       // a.pick();
        a.Push(43);
        a.Push(2);
        a.Push(34);
        a.Push(4);
        a.Push(6);
        a.Push(9);
        a.Pop();
        a.display();
      
    }
}
