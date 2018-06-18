/*  Red- 2 Red color blocks at front
    Green-2 Green color at tail
    Black-2 from front 1 from black delete
    init with 15 white blocks

    main guess number
    0 1 2

    match-> eat red or green
    nomatch->eat black
*/

import java.util.*;
class Snake extends ArrayDeque{

     Snake() {
        for(int i=0;i<12;i++){
            Block b1=new Block("W");
            this.add(b1);
        }
     }


     public void eatRed(){

         Block red=new Block("R");

         this.addFirst(red);
         this.addFirst(red);

     }

     public void eatGreen(){

         Block green=new Block("G");
         this.addLast(green);
         this.addLast(green);

     }


     public void eatBlack(){


         if(!this.isEmpty())this.removeFirst();
         if(!this.isEmpty())this.removeFirst();
         if(!this.isEmpty())this.removeLast();

     }


     public void show(){

         Iterator<Block> itr=this.iterator();
         System.out.print(">:-");
         while(itr.hasNext()){
             System.out.print(itr.next());
         }
         System.out.println("}-----");

     }

}


class Block{

    String color;

    public Block(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "|" + color + '\'' +
                "|";
    }
}

public class SnakeGameVar {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        Snake snake=new Snake();
        Random rand=new Random();

        int userint;
        int score=0;

     while(true){


         System.out.println("Enter an input");

          userint=sc.nextInt();

         if(userint==-1)
             return;


         int randum=rand.nextInt()%3;
         if(randum<0) randum=randum*(-1);
         System.out.println("Random number is:"+randum);

         if( randum==userint && (randum==0 || randum==1)){

             if(snake.size()>score) score=snake.size();
             snake.eatRed();
             snake.show();

         }
         else if(randum==userint && (randum==2)){
             if(snake.size()>score) score=snake.size();
             snake.eatGreen();
             snake.show();
         }
         else{
             if(snake.size()<3){
                 System.out.println("You lose");
                 System.out.println("Score"+score);
                 System.exit(0);
             }
             snake.eatBlack();
             snake.show();

         }

     }

    }

}
