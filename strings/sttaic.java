package strings;

public class sttaic {
    public static void main(String[] args) {
        Mobile ob1=new Mobile();
        ob1.name="Samsung";
        ob1.price=10000;
        Mobile.type="Android";
      


        Mobile ob2=new Mobile();
        ob2.name="Apple";
        ob2.price=14000;
        Mobile.type="IOS";
        

        Mobile ob3=new Mobile();
        ob3.name="NOKIA";
        ob3.price=150;
        Mobile.type="Symbian";
        

        //Mobile.type="Aditya";  
        ob1.show();
        ob2.show();
        ob3.show();
    }
}

    class Mobile
    {
        String name;
        int price;
       static  String type;
        public void show()
        {
            System.out.println(name+" "+price+" "+type+" ");
        }
    }
    

//STATIC KEYWORDS IS USED BY ALL THE OBJECTS ,HENCE IF YOU USE STATIC , IT WILL BE USED BY ALL THE OBJECTS\
//STATIC KEYWORD IS USED TO MAKE THE VARIABLE COMMON TO ALL THE OBJECTS
  //static--this is called once , irrespective of objects
//  {
//    name="phone"
//  }
// if we create constructor - it is called eveyrtime which is not good for memroy
//class loads , objects intialise
//jvm -class loader -once , static block called first
//if no objects created , then Class -- class loads first
//Class.forname(classname:"MOBILE");//loads the class
/// WHY MAIN IS STATIC , BECAUSE IT IS STARTING POINT OF PROGRAM 
// AND WE HAVE TO CREATE A OBJECT OF CLASS - TO CALL METHOD 
// CONDITION OF DEADLOCK ARISES IN THIS CASE
