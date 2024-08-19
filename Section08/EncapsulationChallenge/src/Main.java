public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(20, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        System.out.println("Toner Level: " + printer.addToner(50));
        System.out.println("Toner Level - Intentional -1: " + printer.addToner(50));

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d%n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d%n", pagesPrinted, printer.getPagesPrinted());
    }
}
