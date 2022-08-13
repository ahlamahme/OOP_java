//1)Polymorphism 
 public interface shape{  //interface includes only abstact methods an variables.
 void get_shap_name();    //2 astract methods.
 void  get_area(int v);
}  
class circle implements shape{   // first class to implement abstracte method 
public void get_shap_name(){System.out.println("I am circle ");} 
public void get_area(int r ){ System.out.println(r*r*3.14);}
}  
class square implements shape{   // second class to implement abstracte method 
public void get_shap_name(){System.out.println("I am aquare");}
public void get_area(int l ){System.out.println (l*l);}
}  
class TestInterface1{          //test class includes main to test.
public static void display_shape_info(shape c){
c.get_area(4);
c.get_shap_name();
}
public static void main(String[] args){  
shape c=new circle();
shape s=new square();
TestInterface1 t =new TestInterface1();
t.display_shape_info(c);
t.display_shape_info(s);
cars car =new cars();
cars car2 =new cars();
cars car3 =new cars();
System.out.println (cars.get_count());
}  
}  
 //2)Encapsulation
class cars{                   //class include private variable to count num of its objects.
private static int count=0;
public cars()                 //constractor
{ count += 1;}
public static int get_count() //getter
{return count;}
}
