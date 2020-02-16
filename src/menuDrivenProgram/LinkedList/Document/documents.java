package menuDrivenProgram.LinkedList.Document;

public class documents {
    private Page page = null;
    private documents CV = null;
    private documents coverletter = null;

    public documents getCV() {
        return CV;
    }

    public documents getCoverletter() {
        return coverletter;
    }

    public documents(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }
}