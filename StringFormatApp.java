public class StringFormatApp {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        System.out.printf("name: %-20s Age: %3d Height: %4.2fm%n", name, age, height);
    }
}