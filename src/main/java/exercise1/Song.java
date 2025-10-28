package exercise1;

public class Song {

    //Declare Vars
    private String titel;
    private int duration;
    private String artist;

    //Create Constructor
    public Song(String titel, int duration, String artist) {
        this.titel = titel;
        this.duration = duration;
        this.artist = artist;
    }

    public String songTime() {
      int minutes = duration / 60;
      int seconds = duration % 60;
      return minutes + " Minuten " + seconds + " Sekunden";
    }

    @Override
    public String toString() {
        //Change toString Method output
        return "The song Imagine from John Lennon is " + duration + " seconds long" ;
    }
}
