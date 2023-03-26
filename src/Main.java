import java.time.LocalDate;

public class Main {
   public  static  void main(String[] args) {
       checkYear(2021);
       defineVersion(1,2021);
       defineVersion(0,2019);
       printCardDeliveryDays(7);
       printCardDeliveryDays(95);
       printCardDeliveryDays(147);
    }
    //Задание 1
    public static void checkYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високостный год");
        } else{
            System.out.println(year + "  не високостный год");
        }
    }
    //Задание 2
    public static void defineVersion (int mobileOs,int mobileYears){
        String mobileOsName;

        switch (mobileOs){
            case 0:
                mobileOsName = "Android";
                break;
            case 1:
                mobileOsName = "IOS";
                break;
            default:
                mobileOsName = "неизвестная ОС";
        }
        int currentYear = LocalDate.now().getYear();
        if (mobileYears != currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установите облегченую  версию ");
        }else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную  версию ");
        }
    }
    //Задание 3
    public  static  int calcCardDays (int distance){
       int deliveryDays = -1;
       if (distance <=20){
           deliveryDays = 1;
       } else if (distance <= 60) {
       deliveryDays = 2;
       } else if (distance <= 100) {
           deliveryDays = 3;
       }
       return deliveryDays;
    }
    public static void printCardDeliveryDays(int distance){
       int deliveryDays = calcCardDays(distance);
       if (deliveryDays == -1){
           System.out.println("Доставка не осуществляется  ");
       }else {
           System.out.println("Потребуется дней " + deliveryDays);
       }
    }
}