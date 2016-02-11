/**
 * Created by Caroline on 2/11/16.
 */
public class Song {
    String songName;
    String artist;
    String album;
    String genre;
    int releaseYear;

    public void questions() {
        System.out.println("What is the name of your favorite song?");
        this.songName = Main.scanner.nextLine();
        System.out.println("Who is the artist?");
        this.artist = Main.scanner.nextLine();
        System.out.println("On which album is the song included?");
        this.album = Main.scanner.nextLine();
        System.out.println("What is the genre?");
        this.genre = Main.scanner.nextLine();
        System.out.println("What year was the song released?");
        this.releaseYear = Main.scanner.nextInt();

    }

    public String getSongName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
