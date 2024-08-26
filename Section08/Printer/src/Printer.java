// Similar to encapsulation challenge, but with extra instructions
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            int addedToner = this.tonerLevel + tonerAmount;
            if (addedToner > 100) return -1;
            this.tonerLevel = addedToner;
            return this.tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = this.duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
