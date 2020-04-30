//playing with arraylist

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add(0, "Audi");
    cars.add(1,"Bnez");
    cars.add(2," Estilo");
    System.out.println(cars);

    ArrayList<Integer> num = new ArrayList<Integer>();
    for (int i=0;i<10;i++) {
      num.add(i, i);
    }
    System.out.println(num);
  }
}
