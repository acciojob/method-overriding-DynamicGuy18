package com.driver;

public class Main {
  B ob=new B();
  ob.meth();
  
}

class A{
  public String meth(){
    return "Invoking method from class A";
}
}
class B extends A{
  public String meth(){
    return "Method is overridden in Extendend class B";
  }

}

