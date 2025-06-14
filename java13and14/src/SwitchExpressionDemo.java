public class SwitchExpressionDemo {
    public static void main(String[] args) {

        int key=2;
        String result=switch(key){
            case 1:{
                yield "Choice 1";
            }
            default:
                yield "Default";
        };

        System.out.println(result);

        String response=switch (key) {
            case 1 -> {
                yield "you have 0 balance";
            }
            case 2 -> {
                yield "you have 1 balance";
            }
            case 3->{
                yield "you have 2 balance";
            }
            default -> {
                throw new IllegalArgumentException("Unexpected value" + key);
            }
        };
        System.out.println(response);
    }
}
