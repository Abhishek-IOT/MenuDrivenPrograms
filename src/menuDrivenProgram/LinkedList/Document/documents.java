package menuDrivenProgram.LinkedList.Document;

public class documents {
    private Page page = null;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("documents{");
        sb.append("page=").append(page);
        sb.append('}');
        return sb.toString();
    }

    public documents(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }
}