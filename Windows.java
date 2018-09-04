package doogdoor;

public class Windows extends CloseOpenabstract {

    private boolean open ;
    
    @Override
    public void close() {
     System.out.println("The windows are unlocked ");
    open = false;
    }

    @Override
    public void open() {
      System.out.println("The windows are locked ");
    open = true;
    }
    
    @Override
     public boolean isOpen() {
    return open;
  }
}
