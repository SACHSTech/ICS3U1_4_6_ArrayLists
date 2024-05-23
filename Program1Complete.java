import java.util.ArrayList;
import java.util.Collections;

class Program1Complete extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // create an ArrayList object
    ArrayList<String> strCars = new ArrayList<String>();
    //String[] strCarsArray = {"Volvo", "BMW", "Ford", "Mazda"};

    // add items
    strCars.add("Mercedes");
    strCars.add("Tesla");
    strCars.add("BMW");
    strCars.add("Honda");

    // print the arrayList
    System.out.println(strCars);

    // access items
    System.out.println(strCars.get(1));
    
    
    // change items
    strCars.set(1, "Nissan");
    System.out.println(strCars);
    
    // remove items
    strCars.remove(2);
    System.out.println(strCars);

    
    // add to specific position
    strCars.add(0, "Toyota");
    System.out.println(strCars);
    
    
    // length of ArrayList
    System.out.println(strCars.size());

    
    // iteration
    for (int i = 0; i < strCars.size(); i++){
      System.out.println(strCars.get(i));
    }

    // for each style
    for (String car:strCars){
      System.out.println(car);
    }

    

    // sorting
    Collections.sort(strCars);
    System.out.println(strCars);
    

  }
}
