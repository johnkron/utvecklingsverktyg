import java.util.ArrayList;

class Arrays {
    public static void main(String[] args) {
        String[] simpleArray = {"Foo", "Bar"};
        System.out.println("Simple Array");
        System.out.println(simpleArray[0]);

        ArrayList list = new ArrayList<String>();
        list.add("Foo");
        list.add("Bar");
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
    }
}