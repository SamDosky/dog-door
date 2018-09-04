package doogdoor;

public class Bark {

	private String dogvoice;

	  public Bark(String sound) {
	    dogvoice = sound;
	  }

	  public String getSound() {
	    return dogvoice;
	  }

	  public boolean equals(Bark bark) {
	    if (bark instanceof Bark) {
	      Bark otherBark = (Bark) bark;
	      if (dogvoice.equals(otherBark.dogvoice)) {
	        return true;
	      }
	    }
	    return false;
	  }

}
