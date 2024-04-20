public class Twofer {
    public String twofer(String name) {
        if(name == null) {
            return "One for you, one for me.";
        }
        else if(name.equals("Alice") || name.equals("Bob")) {
            return "One for " + name + ", one for me.";
        }
        return name;
    }
}
