package com.PassportOffice;

public class Duplication {
    public static void main(String[] args) {
        String[] str = {"raju", "reddy", "rishi", "marr", "roshini"};
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if ((str[i].equals(str[j])) && (i != j)) {
                    System.out.println("Duplicate array" + str[j]);


                }
            }
        }
        String str1="roshini dandu";
        for(int i=0;i<str1.length()-1;i++){
            for(int j=i+1;j<str1.length();i++){
                if(str1.charAt(i)==str1.charAt(j)){
                    System.out.println("duplicate of string"+str1.charAt(i));
                }
            }
        }
    }
}




