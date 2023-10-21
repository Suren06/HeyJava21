public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    int bearing() {
        return switch (this) {                          // (1)
            case NORTH -> 0;                            // (2), (3)
            case SOUTH -> 180;
            case EAST -> 90;
            case WEST -> {
                System.out.println("Go west!");
                yield 270;                              // (4)
            }
        };
    }
}