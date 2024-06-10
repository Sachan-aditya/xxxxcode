package ENCAPSULATIONS;

class human {

    private int age=11;// only be used in a class
    private  String name="Aditya";

    public int getage()//GETTERS
    {
        return age;
    }  
      public int Setage(int age)//SETTERS
    {
       return this.age=age;
       //this keywords calls the current object
    }
        
   
    public String getname()
    {
        return name;
    }
    public String Setname(String name)//SETTERS
    {
       return this.name=name;
       //this keywords calls the current object
    }
}
public class demo
{
    public static void main(String[] args) {
        human obj =new human();
          obj.Setage(45);
          obj.Setname("ARVING");
        //obj.name="arvind";
        System.out.println(obj.getname());
        System.out.println(obj.getage());

    }
}