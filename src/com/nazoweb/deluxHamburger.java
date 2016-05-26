package com.nazoweb;

/**
 * Created by zertekes on 29/02/2016.
 */
public class deluxHamburger extends basicHamburger {
        private String drink;
        private String chips;
//        int sum;

    public deluxHamburger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.drink = "drinks";
        this.chips = "chips";

        }

    @Override
    public int getPrice() {
        return 10;

    }

    public void add() {
        System.out.println("Delux Burger and adds: "+drink+" and "+chips);
    }

    public void deluxHambills() {

        sum = (id*1)+getPrice();
        System.out.println("basic "+getBreadRollType()+" "+getMeat()+" Hamburger price: "+ getPrice()+" £");
        System.out.println("Addition price 1 £* " +id+ " = "+id*1+ " £ " );
        System.out.println("total: "+sum+" £");
    }
}
