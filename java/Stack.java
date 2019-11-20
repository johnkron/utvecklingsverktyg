import java.util.Stack;

class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push("Foo");
        stack.push("Bar");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());    
    }
}