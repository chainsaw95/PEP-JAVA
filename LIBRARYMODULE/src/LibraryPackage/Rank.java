package LibraryPackage;
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


