/*Name:Ng Ke Rong*/
/*No.Matrik:271063*/

package lab1stage2;

/**
 *
 * @author HP
 */
public class Dog extends Animal{

    public Dog(String newName) {
        super(newName);
    }
    
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
