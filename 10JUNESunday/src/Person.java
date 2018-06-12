public class Person {

    private String name;
    public Person father=null;
    public Person son=null;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person getFather() {
        return father;
    }

    public Person getSon() {
        return son;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather(Person father) {
        this.father = father;
        father.son=this;
    }

    public void setSon(Person son) {
        this.son = son;
        son.father=this;
    }


    public void printFamily(){

        Person temp=this;
        Person p=this;

        while(p.father!=null) {
            temp = p;
            p = p.father;
        }

        while(temp!=null){
            System.out.println(temp.name);

          if(temp.son!=null) System.out.println("|");
            temp=temp.son;
        }


    }


}
