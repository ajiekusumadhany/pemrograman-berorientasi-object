import java.util.Scanner;
public class branching3 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String nilai;
        String predikat;
        System.out.print("Nilai : ");
        nilai=in.nextLine();
        switch(nilai)
        {
            case "a":predikat="Excellent";
            break;
            case "b":predikat="Good";
            break;
            case "c":predikat="Fair";
            break;
            case "d":predikat="Dafuq";
            break;
            case "e":predikat="Fail";
            break;
            default:predikat="No Such Grade";
        }
        System.out.println("Nilai   :"+nilai);
        System.out.println("Predikat:"+predikat);
    }
}