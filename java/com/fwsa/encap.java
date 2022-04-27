package com.fwsa;

public class encap {
    public static void main(String[] args) {
        normal obj = new normal();
        
        obj.setpw("abi");
        System.out.println(obj.getpw());

    }
}

class normal {
    private String pw;

    public void setpw(String pw) {
        this.pw = pw;
    }

    public String getpw() {
        return pw;
    }

}
