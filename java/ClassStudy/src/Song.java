public class Song {
  //필드에 초기값을 주기보단 선언만 하는경우가 많다.
  //클래스 안에는 모든 자료형이 들어올 수 있다.
  String title;
  String artist;
  String album;
  int year;
  //배열 사용을 위해서는 반드시 배열 생성까지!!
  //배열은 반드시 초기화도 해줘야한다. 하지만 필드에 하는것이 문법적으로 잘못된건 아니지만.. 좋은방법은아니다.
  String[] composer = new String[3];

  //모든 멤버변수의 값을 변경하는 메서드
  public void setSongData(String title1, String artist1, String album1, int year1, String[] composer1){
    title = title1;
    artist = artist1;
    album = album1;
    year = year1;
    composer = composer1;
    //변수명은 껍데기일뿐, 자료형만 정확하게 맞춰줘야한다...
  }

  //모든 멤버변수 출력 메서드
  public void printSongData(){
    System.out.println("제목 : " + title);
    System.out.println("가수 : " + artist);
    System.out.println("앨범 : " + album);
    System.out.println("년도 : " + year);
    System.out.print("작곡가 : ");

    for(int i = 0; i < composer.length; i++){
      System.out.print(composer[i] + " ");

    }
  }





}
