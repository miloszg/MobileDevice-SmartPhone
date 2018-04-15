package geek;

public class Geek {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone(3300,20,999,2);
        System.out.println(sm.producent);
        
        MobilePhone mb=new SmartPhone(3200,10,2,3);
       System.out.println("czas pracy dla MB: "+mb.getczasPracy());
       System.out.println("czas pracy smartDevice dla MB: "+mb.getczasPracySmartDevice());
       
       System.out.println("czas pracy dla SM: "+sm.getczasPracy());
       System.out.println("czas pracy smartDevice dla SM: "+sm.getczasPracySmartDevice());
       System.out.println("Imie dla SM: "+sm.getImie());
       System.out.println("Imie dla SM: "+sm.getImie1());
       
       //zmiana Imie na stringa wykonana na 2 sposoby Integer.toString(imie) i String.valueOf(imie)
       //LICZBA METOD JEST INNA BO ZASTOSOWALISMY UPCASTING I WTEDY MOBILE PHONE TRACI METODY KTORE ZAWIERA JEDYNIE SMARTPHONE A NIE MOBILEPHONE
    }
    
}
