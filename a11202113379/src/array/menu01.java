import java.util.Scanner;

public class menu01 {
    static void nasi()
    {
        System.out.println("Nasi Rames");
        System.out.println("Nasi Gudeg");
        System.out.println("Nasi Goreng");
        System.out.println("Nasi Pindang");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        String ulang="Y";
        int pilih=0,jml=0;
        
        nasi();
        while (ulang.equals("Y") || ulang.equals("Y"))
        {
            System.out.print("Pilih Menu: ");
            pilih=sc.nextInt();
            if (pilih==1)
            {
                System.out.println("Anda Memilih Nasi Rames");                
            }
            else if (pilih==2)
            {
                System.out.println("Anda Memilih Nasi Gudeg");
            }
            else if (pilih==3)
            {
                System.out.println("Anda Memilih Nasi Goreng");
            }
            else
            {
                System.out.println("Anda Memilih Nasi Pindang");
            }
            System.out.print("Jumlah Menu: ");
            jml=sc.nextInt();
            
            System.out.print("Pilih lagi Y/N: ");
            ulang=sc.next();
            if (ulang.equals("N") || ulang.equals("n"))
            {
                break;
            }
        }
    }    
}
