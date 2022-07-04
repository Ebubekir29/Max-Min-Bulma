import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayiAdedi,sayi,max=0,min=0;
        System.out.print("Kac tane sayi gireceksiniz : ");
        sayiAdedi=scan.nextInt();
        for (int i=1;i<=sayiAdedi;i++)
        {
            System.out.print(i+". Sayiyi giriniz : ");
            sayi =scan.nextInt();
            if(i==1)
            {
                max = sayi;
                min = sayi;
            }
            if(sayi>max)
            {
                max = sayi;
            }
            if(sayi<min)
            {
                min=sayi;
            }
        }
        System.out.println("Max sayi : "+max);
        System.out.println("Min sayi : "+min);
    }
}
