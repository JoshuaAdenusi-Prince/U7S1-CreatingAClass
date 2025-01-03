package partA.example01;

public class Person {
    public String name;//creates property that can assign a name for person
    public int age;//creates property that can assign an age for person
    public String address;//creates property that can assign an address for person

    public String greet(String personToGreet){

        return name + " says `Hello " + personToGreet +", how are you?`";
    }// creates a behavior that returns;(sends out as a response kinda?); the greeting (in green)
    // to whoever "personToGreet" is assigned as. so if personToGreet was assigned as "Jackson" and the properity(variable) "name" was "Gio"
    // calling this behavior(method) would return "Gio says hello Jackson, how are you?"

    public String tellJoke(){

        return "What has two thumbs and writes bad code? .... " + name +"!";
    }//does similar thing as behavior above, returns the joke "What has two thumbs and writes bad code? .... Gio!"
    // for both behaviors, when put in a print statement("System.out.println"), the messages described will be printed
}
