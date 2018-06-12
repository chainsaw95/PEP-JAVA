import java.util.Date;

interface NSSMember{
    String getRank();
    String getZone();

}

abstract class Member{

     int libid;
     String name;

    Book books[]=new Book[6];
    int bookcount=0;

    public Member(int libid, String name) {
        this.libid = libid;
        this.name = name;
    }

    public int getLibid() {
        return libid;
    }

    public Book[] getB1() {
        return books;
    }

    public String getName() {
        return name;
    }

    public void setLibid(int libid) {
        this.libid = libid;
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

    int rollno;
    String section;


    private String rank=null;
    private String zone=null;

    Book books[]=new Book[8];


    public Student(int libid, String name, int rollno, String section) {
        super(libid, name);
        this.rollno = rollno;
        this.section = section;
    }


    public int getRollno() {
        return rollno;
    }

    public String getSection() {
        return section;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return super.toString()+"rollno: "+rollno+" Section:"+section;
    }

    @Override
    public String getRank() {
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
        if(this.rank!=null && this.rank.equals("Senior"))
        return 7;
        else
            return 5;

    }
}


class Faculty extends Member{

    int facultyid;
    String designation;

    public Faculty(int libid, String name, int facultyid, String designation) {
        super(libid, name);
        this.facultyid = facultyid;
        this.designation = designation;
    }

    public int getFacultyid() {
        return facultyid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setFacultyid(int facultyid) {
        this.facultyid = facultyid;
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

    int bookid;
    String title;
    Member member;
    Date issuedate;

    public Book(int bookid, String title) {
        this.bookid = bookid;
        this.title = title;
        issuedate=new Date();
    }


    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
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

        Member m1=new Student(151,"Vivek Singh",22,"MCA");
        Member m2=new Student(152,"LPLk Singh",24,"BCA");
        Member m3=new Student(153,"asDDDk Singh",26,"CA");

        Member m4=new Faculty(154,"yan",877,"HOD");
        Member m5=new Faculty(155,"Kan",878,"DPE");
        Member m6=new Faculty(156,"Kaaasn",879,"Dr");

        Book b1=new Book(888,"java");
        Book b2=new Book(889,"C");
        Book b3=new Book(866,"C++");
        Book b4=new Book(867,"bash");
        Book b5=new Book(868,"python");
        Book b6=new Book(856,"C#");


        m1.issueBook(b1);
        m2.issueBook(b2);
        m3.issueBook(b3);
        m4.issueBook(b4);
        m5.issueBook(b5);
        m6.issueBook(b6);


        System.out.print(b1);

    }


}
