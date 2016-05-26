package com.nazoweb;

/**
 * Created by zertekes on 29/02/2016.
 */
public class basicHamburger {
        int sum;
        static int count=0;
        int id;
        private String breadRollType;
        private String meat;
        private int price;

        private String add1 = "lettuce";
        private String add2 = "tomato";
        private String add3 = "carrot";
        private String add4 = "egg";


    public basicHamburger(String breadRollType, String meat) {

        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 8;

    }

    public void add ( int addNumber) {
        if (addNumber>0 && addNumber<5) {

        count = count+1;
        id = count;

            if (addNumber == 1) {
                System.out.println("additonal for basic burger: " + add1);
            } else if (addNumber == 2) {
                System.out.println("additonal for basic burger: " + add2);
            } else if (addNumber == 3) {
                System.out.println("additonal for basic burger: " + add3);
            } else if (addNumber == 4) {
                System.out.println("additonal for basic burger: " + add4);
            }
        } else {
            count = count-1;
            System.out.println("Please chose adds 1-4.");
        }

    }

    public void basicHambills() {

        sum = (id*1)+price;
        System.out.println("basic "+breadRollType+" "+meat+" Hamburger price: "+ price+" £");
        System.out.println("Addition price 1 £* " +id+ " = "+id*1+ " £" );
        System.out.println("total: "+sum+" £");
    }


    public int getId() {
        return id;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public int getPrice() {

        return price;
    }


    public String getAdd1() {
        return add1;
    }


    public String getAdd2() {
        return add2;
    }

    public String getAdd3() {
        return add3;
    }

    public String getAdd4() {
        return add4;
    }

}
