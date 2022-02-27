import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik ;
        int sayac = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();
        if (mat > 100 || mat <0){
            mat = 0;
            sayac -=1 ;
        }
        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik > 100 || fizik <0){
            fizik = 0;
            sayac -=1 ;
        }
        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce > 100 || turkce <0){
            turkce = 0;
            sayac -=1 ;
        }
        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya > 100 || kimya <0){
            kimya = 0;
            sayac -=1 ;
        }
        System.out.println("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik > 100 || muzik <0){
            muzik = 0;
            sayac -=1 ;
        }
        double average = (mat + fizik + turkce + kimya + muzik)/sayac;
        System.out.println("Ortalamanız :" + average);
        if(average >55 ) {
            System.out.println("Sınıfı geçtiniz,tebrikler");
        }else{
            System.out.println("Sınıfta kaldınız , aferini hakettiniz");
        }
    }
}