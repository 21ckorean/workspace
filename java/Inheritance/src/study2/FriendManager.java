package study2;

public class FriendManager {
  public static void main(String[] args) {
    Friend[] fs = new Friend[10];
    int cnt = 0; //저장된 인맥 수

    fs[cnt++] = new UnivFriend("kim","computer","010");
    fs[cnt++] = new UnivFriend("Lee","math","222");
    fs[cnt++] = new CompFriend("Hong", "human", "333");
    fs[cnt++] = new CompFriend("Park", "dev", "444");

    for(int i = 0; i < cnt; i++){
      fs[i].showInfo();
    }


//    //대학 동창 5명을 저장할 수 있는 공간
//    UnivFriend[] ufs = new UnivFriend[5];
//    int ucnt = 0;//대학 동창 수
//
//    //직장 동료 5명을 저장할 수 있는 공간
//    CompFriend[] cfs = new CompFriend[5];
//    int ccnt = 0;//직장 동료 수
//
//    ufs[ucnt++] = new UnivFriend("kim","computer","010");
//    ufs[ucnt++] = new UnivFriend("Lee","math","222");
//
//    cfs[ccnt++] = new CompFriend("Hong", "human", "333");
//    cfs[ccnt++] = new CompFriend("Park", "dev", "444");
//
//    for(int i = 0; i < ucnt; i++){
//      ufs[i].showUnivInfo();
//    }
//
//    for(int i = 0; i < ccnt; i++){
//      cfs[i].showCompInfo();
//    }
  }
}
