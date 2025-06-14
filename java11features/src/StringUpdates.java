import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {
        String str = "              ";
        System.out.println(str.isBlank());

        str="I\nm\na\n\nn\nffer\n";
        System.out.println(str.lines().collect(Collectors.toList()));

        char c = '\u2000';
        str=str.replace('\u2000', c);
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

        System.out.println("-".repeat(100));
    }
}
