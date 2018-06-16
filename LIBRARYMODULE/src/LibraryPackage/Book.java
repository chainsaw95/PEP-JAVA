import java.util.Date;


package LibraryPackage;

class Book{

    static int bookid;
    String title;
    Member member;
    Date issuedate;

    public Book(String title) {

        this.title = title;
        issuedate=new Date();
    }


    public static int getBookid() {
        return Book.bookid;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;

    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", member=" + member +
                ", issuedate=" + issuedate +
                '}';
    }
}

