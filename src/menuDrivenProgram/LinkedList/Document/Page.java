package menuDrivenProgram.LinkedList.Document;

public class Page {
    private int pageNo=0;
    private String pageDetails="";

    public int getPageNo() {
        return pageNo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Page{");
        sb.append("pageNo=").append(pageNo);
        sb.append(", pageDetails='").append(pageDetails).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getPageDetails() {
        return pageDetails;
    }

    public Page(int pageNo, String pageDetails) {
        this.pageNo = pageNo;
        this.pageDetails = pageDetails;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageDetails(String pageDetails) {
        this.pageDetails = pageDetails;
    }
}
