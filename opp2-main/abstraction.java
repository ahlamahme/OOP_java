//3)abstracte class 
 abstract class cars{  
  abstract void get_fule();  
}  
class lada extends cars
{void get_fule(){System.out.println("lada get fule function called");}}
class BMW extends cars
{void get_fule(){System.out.println("BMW get fule function called");}}
class test{
public static void main(String args[]){  
  cars obj;
  obj = new lada(); 
  obj.get_fule();
  obj =new BMW();
  obj.get_fule();
}  
}  
    

