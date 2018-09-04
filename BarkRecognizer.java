package doogdoor ;

import java.util.ArrayList;
import java.util.Iterator;

public class BarkRecognizer  {

  private DogDoor D;

  public BarkRecognizer(DogDoor door) {
    D = door ;
  }

  public void recognizeBarking(Bark b) {
   
    ArrayList Barks = D.getBarks();
    for (Iterator i = Barks.iterator(); i.hasNext(); ) {
     Bark rightBark = (Bark)i.next();
      if (rightBark.equals(b)) {
        D.open();
        return;
      }
    } 
    System.out.println(" the door is still close ");
  }
  
  public void recognizeScratching(Scratch S) {
   
    ArrayList Scratchs = D.getScratch();
    for (Iterator i = Scratchs.iterator(); i.hasNext(); ) {
      Scratch rightScratch = (Scratch)i.next();
      if (rightScratch.equals(S)) {
        D.open();
        return;
      }
    } 
    System.out.println(" the door is still close ");
  }
}