package LibraryPackage;

enum Zone {
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
