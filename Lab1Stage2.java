/*Name:NG KE RONG*/
/*No.Matrik:271063*/


package lab1stage2;


public class Lab1Stage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal kurre = new Cat("Kurre");
        Animal vilma = new Dog("Vilma");

        kurre.age = 6;
        vilma.age = 3;

        kurre.introduceYourself();
        vilma.introduceYourself();
    }
    
}
