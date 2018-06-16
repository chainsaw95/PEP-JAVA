package LibraryPackage;


public abstract class Member {

        int libid;
        String name;
        static int count;

        Book[] books=new Book[6];
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


