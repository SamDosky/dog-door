package doogdoor ;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor extends CloseOpenabstract {

  private boolean open;
  private ArrayList ownerDogbarks;
  private ArrayList ownerDogscratch;
 
  public DogDoor() {
    ownerDogbarks = new ArrayList();
    ownerDogscratch = new ArrayList();
    open = false;
  }

  public void theownerDogBark(Bark bark) {
    ownerDogbarks.add(bark);
  }
  
   public void theownerDogScratch(Scratch scratch) {
    ownerDogscratch.add(scratch);
  }

  public ArrayList getBarks() {
    return ownerDogbarks;
  }
  
   public ArrayList getScratch() {
    return ownerDogscratch ;
  }
   
@Override
  public void open() {
    System.out.println("The door is open ");
    open = true;
    timer();
  }
  
  public void timer(){
    final Timer time = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
        close();
        time.cancel();
      }
     }; time.schedule(task , 4000);
  }

  @Override
  public void close() {
    System.out.println("The door is close ");
    open = false;
  }
 
  @Override
  public boolean isOpen() {
    return open;
  }
}
