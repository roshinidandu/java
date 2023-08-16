public class ExtracNum {
      public String Number;
      public String splChar;
      public String enter="twFvLrl2xQjyrWrxeNI21@#9w";
      public static void main(String[] args){
          ExtracNum en=new ExtracNum();
          en.enter="twFvLrl2xQjyrWrxeNI21@#9w";
          en.splChar=en.enter.replaceAll("[!^0-9 a-z A-z]","");
          en.Number=en.enter.replaceAll("[^0-9]","");

          System.out.println(en.Number);
          System.out.println(en.splChar);

      }
}
