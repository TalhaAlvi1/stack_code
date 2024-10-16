import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
            // System.out.println(stack.empty());
            stack.push("Assassin's Creed IV Black Flag");
            stack.push("God Of War: Ragnarok");
            stack.push("Just Cause 3");
            stack.push("Just Cause 4");
            stack.push("GTA Vice City(Bachpan Ka Pyaar)");
            // System.out.println(stack.peek());
            // String MyFavGame = stack.pop();
            // System.out.println(MyFavGame);
            System.out.println(stack.search("Elden Ring"));
            stack.pop();
            // stack.pop();
            // stack.pop();
            // stack.pop();
            // stack.pop();
            System.out.println(stack);
            
    }
}