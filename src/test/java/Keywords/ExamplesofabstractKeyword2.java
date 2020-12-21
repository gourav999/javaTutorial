//Example2:Abstract class containing the abstract and non-abstract method
/*//

//A good example of real time found from here:-
//
A concrete example of an abstract class would be a class called Lion. 
You see many animals in real life, but there are only kinds of animals. 
That is, you never look at something purple and furry and say "that is an animal and there is no more specific way of defining it". 
Instead, you see a dog or a cat or a pig... all animals. The point is, that you can never see an animal walking around that isn't more specifically something else (duck, pig, etc.). 
The Lion is the abstract class and Duck/Pig/Cat are all classes that derive from that base class. 
Animals might provide a function called "Age" that adds 1 year of life to the animals. 
It might also provide an abstract method called "IsDead" that, when called, will tell you if the animal has died. 
Since IsDead is abstract, each animal must implement it. 
So, a Cat might decide it is dead after it reaches 14 years of age, but a Duck might decide it dies after 5 years of age. 
The abstract class Lion provides the Age function to all classes that derive from it, but each of those classes has to implement IsDead on their own.
*/
package Keywords;

abstract class Vehicle  
{  
    abstract void bike();  
      
    void car()  
    {  
        System.out.println("Car is running");  
    }  
      
}  
class Honda extends Vehicle  
{  
  
    @Override  
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
      
}  
  
public class ExamplesofabstractKeyword2 {  
  
    public static void main(String[] args) {  
  
    Honda obj=new Honda();  
    obj.bike();  
    obj.car();  
      
    }     
      
}  