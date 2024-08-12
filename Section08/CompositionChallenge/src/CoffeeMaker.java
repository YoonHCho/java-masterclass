public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (this.hasWorkToDo) {
            System.out.println("Brewing Coffee");
            this.hasWorkToDo = false;
        }
    }
}
