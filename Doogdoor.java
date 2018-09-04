package doogdoor;
/* 
Name Alaa al sudani
the Dog door program 
this program would help you to control opening and closing your dog door either by using the remote or automatically by the Bark rcognizer .
the door could recognize your dog bark and scratch automatically 
other feature of the program it helps you to lock your windows using the remote control .
*/
import javax.swing.JOptionPane;

public class Doogdoor {

  public static void main(String[] args) {
    // creating door , window , remote objects 
    DogDoor door = new DogDoor();
    Windows window = new Windows();
    Remote remotee = new Remote(door);
    Remote remote = new Remote(window);
    
    // insert the action you looking to do .
    String Action ;
     Action = JOptionPane.showInputDialog(" choose the action\n type 1 for usning the Remote \n type 2 for Barking \n type 3 for Scratching \n if you just want to use the remote lock the windows please type window ");
    // locking the windows 
     if (Action.equals("window")){
       remote.useTheremoteWindow();
        System.exit(0);  
      }
     
   //insert the name of the dog 
      String dogName = JOptionPane.showInputDialog(" Please enter your Dog name ");

   // create the owner dog barks 
    Bark bark1 = new Bark ("woooof");
    Bark bark2 = new Bark("grrrrr");
    Bark bark3 = new Bark("hoho");
 
    // creat the owner scratchs
    Scratch scratch1 = new Scratch ("khkhkh");
    Scratch scratch2 = new Scratch ("kkkkkk");

    // add the dog barks to the object door
    door.theownerDogBark(bark1);
    door.theownerDogBark(bark2);
    door.theownerDogBark(bark3);
    
    // add the dog scratches to the object door
    door.theownerDogScratch(scratch1);
    door.theownerDogScratch(scratch2);
   
    // create a recognizer object
    BarkRecognizer Recognizer = new BarkRecognizer(door);
    
    // using the remote
    if (Action.equals("1")){
        
    remotee.useTheremoteDoor();
   }
    //using the bark recognizer to open and close the door
   else if  
    (Action.equals("2")){
    System.out.println(dogName + " starts barking.");
    
    Recognizer.recognizeBarking(bark1);
  }
   // using the scratch recognizer to open and close the door
   else if
    (Action.equals("3")){
    System.out.println(dogName + " starts Scratching the door");
    Recognizer.recognizeScratching(scratch1);
     }
   // not choosing the right action would end the system
   else if (!Action.equals("window")||!Action.equals("1")|| !Action.equals("2") || !Action.equals("3") || !Action.equals(" ")){
        JOptionPane.showMessageDialog(null," you didn't enter right entry  ");
        System.exit(0);
    }
      
    System.out.println(dogName+ " is outside now.");
    
    try {
      Thread.sleep(7000);
    } catch (InterruptedException e) { }

  
    System.out.println(" ");

    System.out.println(dogName+" finished but the dog neighbor start barking");
   
    // the bark recognizer hearing another dog bark 
      Bark neighborDogBark = new Bark("yohoo");
      Recognizer.recognizeBarking(neighborDogBark);

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) { }

    System.out.println(" ");
    
    // choosing the action again when the dog want to back home 
    String Ation = JOptionPane.showInputDialog( dogName + " wants to back home ... choose the action\n type 1 for using the remote again \n type 2 for barking \n type 3 for scratching ");
    if(Ation.equals("1")){
      remotee.useTheremoteDoor();
    }
    
    else if (Ation.equals("2")){
    System.out.println(dogName + " starts barking .");
    Recognizer.recognizeBarking(bark1);
    }
   else
 {
     System.out.println(dogName + " start scratching the door  ");
    Recognizer.recognizeScratching(scratch1);
 }
    // the dog back home
    System.out.println(dogName + " back inside...");
  }
}
