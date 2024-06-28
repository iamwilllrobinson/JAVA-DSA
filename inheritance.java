class CAr{
  static   String name1;
}
class mini extends CAr{
    public static void setname1(String name){
       name1=name;
    }
}
class mini1 extends mini{

    String gettname(){
        return name1;
    }
}

public class inheritance {
      public static void main(String args[]){
         mini m1 = new mini();
         m1.setname1("HELLO");
         mini1 m2 = new mini1();
          System.out.println(m2.gettname());
      }

}
