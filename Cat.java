/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

package lab1stage2;

/**
 *
 * @author HP
 */
public class Cat extends Animal{

    public Cat(String newName) {
        super(newName);
    }
    
    @Override
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
