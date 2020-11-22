
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Büçteye göre araç markası öneri programına Hoşgeldiniz....");
        System.out.println("2 adet fiyat belirlemenizi istiyoruz ");
        Scanner car = new Scanner(System.in);
        System.out.println("tavan fiyatınızı giriniz(10000...) : ");
        double tavan = car.nextDouble();
        System.out.println("taban fiyatınızı girin (2000...) : ");
        double taban = car.nextDouble();
        
        
        
        if(taban>=1000000  || tavan >1000000000){
            System.out.println("sizin için hazırlanmış önerilerimiz :");
            System.out.println("Bentley"+
                    "Cadillac\n"+
                    "Chrysler\n"+
                    "Ferrari\n"+
                    "Lamborghini\n"+
                    "Land-rover\n"+
                    "Lincoln\n"+
                    "Lotus\n"+
                    "Rolls Royce\n"+
                    "Porsche\n"+
                    "Saab\n");
            
        }
        else if(taban >=1000000 && taban<500000 || tavan ==1000000 ){
            System.out.println("sizin için önerilerimiz :");
            System.out.println("Saab\n"+
                    "Maserati\n"+
                    "Subaru\n"+
                    "Ssangyong\n"+
                    "Jaguar\n"+
                    "Jeep\n"+
                    "Aston Martin\n"+
                    "Lancia\n"+
                    "Cadillac\n");
            
        }
        else if (tavan <=1000000 || taban >= 250000 && taban<500000){
            System.out.println("sizin için önerilerimiz ");
            System.out.println("Dodge\n"+
                    "Mercedes-Benz\n"+
                    "Mini\n"+
                    "Skoda\n"+
                    "Mazda\n"+
                    "Geely\n"+
                    "Chery\n");
        }
        else if(tavan <1000000 || tavan>=250000 || taban>25000 && taban<50000){
            System.out.println("sizin için önerilerimiz :");
            System.out.println("Daewoo"+
                    "Chevrolet\n"+
                    "Honda\n"+
                    "Iveco\n"+
                    "Mini\n"+
                    "Mercedes-Benz\n"+
                    "Smart\n"+
                    "Volvo\n"+
                    "Daihatsu\n");
        }
        else if ( taban <25000 || tavan< 250000){
            System.out.println("sizin için önerilerimiz ....");
            System.out.println("lada\n"+
                    "Lancia\n"+
                    "Lexus\n"+
                    "Tata\n"+
                    "Fiat\n"+
                    "Hyundai\n");
            
        
    }else if(taban ==0 || tavan ==0){
            System.out.println("sizin için bir öeride bulunamıyoruz :(");
    }
    else{
            System.out.println("size daa iyi hizmet verebilmemiz için daha düzgün bir veri aralığı veriniz...");
    }
    
    
    
    
    
    }
    
}
