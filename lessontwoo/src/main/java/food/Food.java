package food;

public abstract class Food {
    private String food;

    public Food(String food) {
        this.food = food;
    }


    @Override
    public String toString() {
        return food;
    }
}
