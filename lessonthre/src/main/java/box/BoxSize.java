package box;


public enum BoxSize {
    SMALL(8), MEDIUM(17), LARGE(30), HUGE(34);
    private int size;


    BoxSize(int size) {
        this.size = size;


    }

    public int getSize() {
        return size;
    }


}
