package LibraryPackage;

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


