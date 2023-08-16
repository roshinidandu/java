package com.PassportOffice;

public class Delhi extends PassportHead{
    @Override
    public void verification() {
        System.out.println("verification is done for delhi");
    }
    public static void main(String[] args){
        PassportHead ph=null;

        ph=new Chennai();
        ph.registration();
        ph.verification();
        ph=new Delhi();
        ph.verification();
        ph.registration();

    }
}
