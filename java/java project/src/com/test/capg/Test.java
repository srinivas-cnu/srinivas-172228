package com.test.capg;   




public class Test {
 public static void main(String[] args) {
  Account a=new Account();
  a.setId("111");
  a.setName("srinivas");
  a.setBalance(10000);
  a.credit();
  a.debit();
  a.transferTo();
  a.toString();
  
 }
}
