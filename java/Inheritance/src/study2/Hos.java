package study2;

public class Hos {
  public static void main(String[] args) {
    Animal[] cage = new Animal[5];

    cage[0] = new Dog();
    cage[1] = new Cat();
    cage[2] = new Cow();
    cage[3] = new Cow();
    cage[4] = new Dog();

    for(int i = 0; i < cage.length ; i++){
      cage[i].cry();
    }


    Dog[] dogCage = new Dog[5];
    Cat[] catCage = new Cat[5];
    Cow[] cowCage = new Cow[5];

    dogCage[0] = new Dog();
    dogCage[1] = new Dog();
    catCage[0] = new Cat();
    catCage[1] = new Cat();
    cowCage[0] = new Cow();
    cowCage[1] = new Cow();

    dogCage[0].cryDog();
    catCage[0].cryCat();
    cowCage[0].cryCow();

  }
}
