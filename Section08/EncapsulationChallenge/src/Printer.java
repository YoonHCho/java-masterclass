public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (this.tonerLevel + tonerAmount > 100 || this.tonerLevel + tonerAmount < 0) return -1;
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int currentJobPages = this.duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += currentJobPages;
        return currentJobPages;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
