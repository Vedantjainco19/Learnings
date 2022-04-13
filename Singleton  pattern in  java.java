import java.io.* ;

class Singleton  // creating a singleton class
{
  private static Singleton ved;
  private String name;
  private Singleton(String name)
  {this.name = name;}
  
  public static Singleton getInstance(String a)
  {    
    if (ved==null)
    {  
     ved=new Singleton(a); 
    }  
  return ved;
}
public String getName()
{
return this.name;
}
   
}
}

class Main {
   public static void main(String[] args) {
      Singleton a;  // refers to the only object of Database
      Singleton b;  // will not work
      a= Singleton.getInstance("sd");
      b= Singleton.getInstance("sdsd");
      
      a.getName();
      b.getName();
   }
}
