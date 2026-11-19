class Launch {
    static int count = 0;

    static {
        System.out.println("Initialized");
    }

    Launch() {
        count++;
        System.out.println("Object created");
    }
}
