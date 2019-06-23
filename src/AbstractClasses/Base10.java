package AbstractClasses;

import java.util.Date;

public class Base10 extends Base9{


    public void displayDate(){

        Date dateNow;
        dateNow = new Date();
        System.out.println(dateNow);
    }

    public static void main(String[] args) {
        Base10 b10 = new Base10();
        b10.displayDate();
    }


}
