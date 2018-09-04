package doogdoor ;


public class Remote {

  private DogDoor d00r;
  private Windows wind ;
  public Remote(DogDoor dor ) {
         d00r = dor;
  }
  
   public Remote(Windows Win ) {
         wind = Win;
  }

  public void useTheremoteDoor() {
    if (d00r.isOpen()) {
      d00r.close();
    } else {
      d00r.open();
    }
  }
   public void useTheremoteWindow() {
    if (wind.isOpen()) {
      wind.close();
    } 
    else {
      wind.open();
    }
  }
}