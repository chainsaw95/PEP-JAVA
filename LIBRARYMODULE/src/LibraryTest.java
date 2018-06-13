/*













 */



import java.util.Arrays;
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


enum Zone{

    north("North Zone NSS member"),
    east("East zone NSS member"),
    south("South Zone NSS member"),
    west("West Zone NSS member");

    String desc;

    Zone(String desc){
        this.desc=desc;
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
    Zone getZone();

}

abstract class Member{

    int libid;
    String name;
    static int count;

    Book books[]=new Book[6];
    int bookcount=0;

    public Member( String name) {
        count++;
        libid=count;
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
    static int countroll;

    Rank rank;
    Zone zone;


    Book books[]=new Book[8];

    public void setRank(Rank rank) {
        this.rank = rank;
    }


    public Student(String name, String section) {
        super( name);
        countroll++;
        rollno=countroll;
        this.section = section;
    }


    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Zone getZone(){
        return this.zone;

    }

    public int getRollno() {
        return rollno;
    }

    public String getSection() {
        return section;
    }


    public void setSection(String section) {
        this.section = section;
    }


    @Override
    public Rank getRank() {
        return rank;
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


    @Override
    public String toString() {
        return "Student{" +
                "libid=" + libid +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                ", section='" + section + '\'' +
                ", rank=" + rank +
                ", zone=" + zone ;
    }
}


class Faculty extends Member{

    static int countfacultyid;
    String designation;
    int facultyid;

    public Faculty( String name, String designation) {
        super(name);
        countfacultyid++;
        facultyid=countfacultyid;
        this.designation = designation;
    }

    public int getFacultyid() {
        return facultyid;
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


public class LibraryTest {

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

        ((Student) m1).setRank(Rank.senior);
        ((Student) m1).setZone(Zone.east);

        System.out.println(m1);


    }


}




