//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 20;

        l1: {
            System.out.println("Block Begins");

            if (x == 20) {
                break l1;
            }
            System.out.println("Block Ends");
        }

        System.out.println("Outside the block");

    }

}
