package com.keerthana;


class myclass{
    protected int num = 100;
      //there is a variable in this class(non-sub ) 
    
      void main() {
        System.out.println(num);
    }
} 
  

public class abisha{
    public static void main(String[] args) {
        myclass obj = new myclass(); // creating object  to access variable
        System.out.println(obj.num);
    }
}
