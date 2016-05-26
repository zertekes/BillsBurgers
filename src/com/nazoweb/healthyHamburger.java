package com.nazoweb;

/**
 * Created by zertekes on 29/02/2016.
 */
public class healthyHamburger extends basicHamburger {
        private String add5;
        private String add6;
        static int count=0;
//        int id;
//        int sum;

    public healthyHamburger(String breadRollType, String meat) {
        super(breadRollType, meat);

        this.add5 = "onion";
        this.add6 = "cucumber";
    }

    @Override
    public int getPrice() {
        return 9;
    }

    @Override
    public String getBreadRollType() {
        return "brown rye roll";
    }

    public void add ( int addNumber) {

        if (addNumber>0 && addNumber<7) {

        count = count+1;
        id = count;

          if (addNumber == 1) {
              System.out.println("additonal for healthy burger: " + getAdd1());
          } else if (addNumber == 2) {
              System.out.println("additonal for healthy burger: " + getAdd2());
          } else if (addNumber == 3) {
              System.out.println("additonal for healthy burger: " + getAdd3());
          } else if (addNumber == 4) {
              System.out.println("additonal for healthy burger: " + getAdd4());
          } else if (addNumber == 5) {
              System.out.println("additonal for healthy burger: " + add5);
          } else if (addNumber == 6) {
              System.out.println("additonal for healthy burger: " + add6);
          }
        } else {
              count = count-1;
              System.out.println("Please chose adds 1-7.");
          }
      }

    @Override
    public int getId() {
        return id;
    }


        public void healthyHambills() {

        sum = (id*1)+getPrice();
        System.out.println("basic "+getBreadRollType()+" "+getMeat()+" Hamburger price: "+ getPrice()+" £");
        System.out.println("Addition price 1 £* " +id+ " = "+id*1+ " £" );
        System.out.println("total: "+sum+" £");
    }
}
