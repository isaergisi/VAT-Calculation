
package vat.calculation;

import java.util.Scanner;

public class VATCalculation {
public static void main(String[] args) {
   /* KDV Tutarı Hesaplayan Program

Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
    
    System.out.print("welcome mr..Invoice amount ?");
    Scanner input = new Scanner(System.in);

    double fatura ;
    fatura = input.nextDouble();
   if ( fatura >1000){
       double kdv = 0.08;
       double kdvsizfatura=0;
       kdvsizfatura = fatura*(1-kdv);
       System.out.println("Invoice amount excluding VAT:"+kdvsizfatura);
   }
   else {
       double kdv = 0.18;
       double kdvsizfatura=0;
       kdvsizfatura = fatura*(1-kdv);
       System.out.println("Invoice amount excluding VAT:"+kdvsizfatura);
       
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
