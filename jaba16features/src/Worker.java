public interface Worker {
    default String work() {
        return "Done";
    }
}
