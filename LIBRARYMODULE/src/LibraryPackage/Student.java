package LibraryPackage;

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



