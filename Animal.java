/*Name:NG KE RONG*/
/*No.Matrik:271063*/


package lab1stage2;

/**
 *
 * @author HP
 */
public class Animal {
    
    protected String name;
    public int age;


    public Animal(String name) {
        this.name = name;
    }

    
    public void introduceYourself()
    {
        System.out.println("Morr. I am an animal. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
    
}
