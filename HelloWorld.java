import java.lang.Math; // headers MUST be above the first class

import java.util.*;
import java.util.function.*;





interface StateChange
{


    public void onStateChange(String e);
}


class ConsumerPredicatePatterns
{
  private ArrayList<String> al;
  //declaring a constructor for initialization of 
  ConsumerPredicatePatterns()
  {
     al = new ArrayList<String>();
  }
  
  void addElements()
  {
   al.add("hello");
   al.add("bye");
   al.add("Wssup"); 
  }
  
  
  void usePredicatePattern()
  {
   
   Predicate<String> p1 = s1 -> s1.length() < 4;
   //System.out.println("Predicate Pattern Output:"+al.forEach(p1));
    al.removeIf(p1);
    System.out.println(""+al.size());
  }
  
  void useConsumerPattern()
  {
    Consumer<String> c1 = System.out::println;
    al.forEach(c1);
    
  }
  
}


class lambda_learnings
{
  
  private ArrayList<Integer> al;
  
  lambda_learnings()
  {
    al = new ArrayList<Integer>();
  }
  
  
  void addElements()
  {
   
    al.add(1);
    al.add(2);
    
  }
    
  //using lambda to do processing of data
  void doOperationOnEachElement()
  {
   
    al.forEach(element -> System.out.println(element));
    
  }
  
  
}



// one class needs to have a main() method
public class HelloWorld
{
  
  //lamda expression simplified the way we used to initialize lamdas
  
  void init_anonymous_class_the_old_way()
  {
    
   //old way of doing things
    StateChange sc = new StateChange() {
        @Override
        public void onStateChange(String e) {
                e = "ON";
        }
    }; 
    
  }
  
  
  void init_anonymous_class_the_lamda_way()
  {
    
    StateChange sc2 = (String c) -> c = "ON";
  }
  
  
  void init_and_execute_lambda_learnings()
  {
    lambda_learnings lm = new lambda_learnings();
    lm.addElements();
    lm.doOperationOnEachElement();
      
  }
  
  
  void init_and_execute_predicate_consumer_learnings()
  {
    ConsumerPredicatePatterns cpp = new ConsumerPredicatePatterns();
    cpp.addElements();
    cpp.useConsumerPattern();
    cpp.usePredicatePattern();
    
   
    
  }
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	HelloWorld hw = new HelloWorld();
    hw.init_and_execute_lambda_learnings();
    hw.init_and_execute_predicate_consumer_learnings();
    
  }
}

