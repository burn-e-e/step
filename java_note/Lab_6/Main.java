package Lab_6;

public class Main {
     public static void main(String[] args) {
          Student[] s = new Student[3];
          s[0] = new Student("Bataashka", 29, 3.9);
          s[1] = new Student("Baterdene", 21, 3.6);
          s[2] = new Student("Batkhuslen", 22, 3.7);
          String searchName = new String("Bataashka");
          s[2].charName();
          for (int i = 0; i < s.length; i++) {
               if (s[i].getName().equals(searchName) == true) {
                    System.out.println(s[i].toString());
               }
          }
     }
}
