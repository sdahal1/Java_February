import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListDemo {
  public static void main(String[] args){

    //how to initialize an arraylist with values
    // ArrayList<String> names = new ArrayList<String>(Arrays.asList("Patrick", "Kelvin"));

    // initialize an empty arraylist with no values
    ArrayList<String> names = new ArrayList<String>();


    names.add("Patrick");
    names.add("Kelvin");
    
    
    // names[0] = "new name";
    names.set(0,"Gianni"); //UPDATING the value at index 0 to be "Gianni"
    
    System.out.println(names);

    for(int i = 0; i<names.size(); i++){

        System.out.println("looping . I is-->" + i);
        System.out.println(names.get(i)); //its like saying names[i] in JS or python
    }




    //enhanced for loop is when we dont need the index numbers, just the values at the index numbers
    for(String name : names){
        System.out.println(name);
    }
    

  }  
}
