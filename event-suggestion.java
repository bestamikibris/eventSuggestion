import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
      
     int temp;
        
    Scanner input = new Scanner(System.in); 
    System.out.print("Etkinlik Yapmak İstediğiniz Günün Hava Sıcaklığını Giriniz: ");
    temp = input.nextInt();
     
     if(temp>25){
        System.out.println("Yüzmeye gidebilirsiniz.");
    }else if(temp >=15){
        System.out.println("Pikniğe gidebilirsiniz.");
    }else if(temp>=10 ){
        System.out.println("Pikniğe gidebilirsiniz.");
        System.out.println("Sinemaya gidebilirsiniz.");
    }else if (temp>=5){
        System.out.println("Sinemaya gidebilirsiniz.");
    }else{
        System.out.println("Kayak yapmaya gidebilirsiniz.");
        }   
        
        
    }
}