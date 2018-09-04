package doogdoor;


public class Scratch {
    
 private String dogScratch;

  public Scratch(String scrch) {
        dogScratch = scrch ;
  }

  public String getScratch() {
    return dogScratch;
  }

  public boolean equals(Scratch scratch) {
    if (scratch instanceof Scratch) {
      Scratch otherScratch = (Scratch) scratch;
    if (dogScratch.equals(otherScratch.dogScratch)) {
        return true;
      }
    }
    return false;
  }

}