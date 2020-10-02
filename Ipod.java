package javath4;
/**
 * @author Ayesha Qamar
 */
public class Ipod
{
   public static void main (String[] args) throws Exception
   {

      Playlist newPlayList = new Playlist("Ayesha's fav");
      try {
         System.out.println("Adding songs to the Playlist:");
         newPlayList.addSong("Despacito");
         newPlayList.addSong("Shape of you");
         newPlayList.addSong("Colors of the wind");
         newPlayList.addSong("Perfect");
         newPlayList.addSong("What doesn't kill you makes you stronger");
         System.out.println("\n\n\nTurning up the volume:");
         newPlayList.volumeUp();
         newPlayList.volumeUp();
         newPlayList.volumeUp();
         System.out.println("\n\n\nNormal Mode: ");
         newPlayList.setRandomPlay(false);
         newPlayList.updateDisplay();
         for (int counter = 0; counter < 9; counter++) {
            newPlayList.nextSong();
         }
         System.out.println("About to mute the song");
         newPlayList.mute();
         System.out.println("Trying to reduce volume below zero: ");
         newPlayList.volumeDown();
         System.out.println("\n\n\nRandom Play: ");
         newPlayList.setRandomPlay(true);
         newPlayList.updateDisplay();
         for (int counter = 0; counter < 9; counter++) {
            newPlayList.nextSong();
         }
         System.out.println("\n\n\nGetting the entire Playlist");
         System.out.println(newPlayList.getPlaylist());
         System.out.println("\n\n\nBonus:");
         newPlayList.gotoSongPosition("Colors of the wind");
      }
      catch (Exception err) {
         System.out.println(err.getMessage());
      }

   }
}
