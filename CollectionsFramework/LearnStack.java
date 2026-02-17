package CollectionsFramework;
//lifo
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("tiger");

        System.out.println("stack: " + animals);

        //topmost element
        System.out.println(animals.peek());

        //remove top ele
        animals.pop();
        System.out.println("stack after removal: " + animals);
        System.out.println(animals.peek());
    }
}
