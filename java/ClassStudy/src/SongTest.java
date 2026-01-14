public class SongTest {
  public static void main(String[] args) {

    Song s = new Song();

    String[] a = {"A", "B", "C"};
    s.setSongData("aa","bb", "cc", 2025, a);
    s.printSongData();

  }
}
