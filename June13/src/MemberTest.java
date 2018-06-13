import java.util.Date;

enum Rank{

    joiner("Less than one year of experience"),
    junior("between 1 to 3 years of experience"),
    senior("more then 3 years of experience");
    String desc;

    Rank(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}


interface NSSMember{
    Rank getRank();
    String getZone();

}

abstract class Member{

    static int libid;
    String name;

    Book books[]=new Book[6];
    int bookcount=0;

    public Member( String name) {
        libid++;
        this.name = name;
    }

    public static int getLibid() {
        return Book.libid;
    }

    public Book[] getB1() {
        return books;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setB1(Book[] books) {
        this.books = books;
    }

    abstract public int getIssueLimit();

    public void issueBook(Book b){


        if(bookcount<this.getIssueLimit()) {

            b.member = this;
            books[bookcount] = b;
            bookcount++;

        }
    }


    public String toString(){

        return "lib id:"+libid+"  name: "+name;

    }


}

class Student extends Member implements NSSMember{

   static int rollno;
    String section;

    Rank rank;
    private String zone=null;

    Book books[]=new Book[8];

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Student( String name, String section) {
        super( name);
        rollno++;
        this.section = section;
    }


    public int getRollno() {
        return Student.rollno;
    }

    public String getSection() {
        return section;
    }


    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return super.toString()+"rollno: "+rollno+" Section:"+section;
    }

    @Override
    public Rank getRank() {
        return rank;
    }

    @Override
    public String getZone() {
        return zone;
    }


    @Override
    public void issueBook(Book b){
        b.member=this;
        books[bookcount]=b;
        bookcount++;
    }

    @Override
    public int getIssueLimit() {
        if(this.rank==Rank.senior)
            return 7;
        else
            return 5;

    }
}


class Faculty extends Member{

    static int facultyid;
    String designation;

    public Faculty( String name, String designation) {
        super(name);
        facultyid++;
        this.designation = designation;
    }

    public static int getFacultyid() {
        return Faculty.facultyid;
    }

    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public int getIssueLimit() {
        return 6;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "libid=" + libid +
                ", name='" + name + '\'' +
                ", facultyid=" + facultyid +
                ", designation='" + designation + '\'' +
                '}';
    }
}


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


public class MemberTest {

    public static void main(String[] args){

        Member m1=new Student("Vivek Singh","MCA");
        Member m2=new Student("LPLk Singh","BCA");
        Member m3=new Student("asDDDk Singh","CA");

        Member m4=new Faculty("yan","HOD");
        Member m5=new Faculty("Kan","DPE");
        Member m6=new Faculty("Kaaasn","Dr");

        Book b1=new Book("java");
        Book b2=new Book("C");
        Book b3=new Book("C++");
        Book b4=new Book("bash");
        Book b5=new Book("python");
        Book b6=new Book("C#");




        m1.issueBook(b1);
        m2.issueBook(b2);
        m3.issueBook(b3);
        m4.issueBook(b4);
        m5.issueBook(b5);
        m6.issueBook(b6);


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);


    }


}










