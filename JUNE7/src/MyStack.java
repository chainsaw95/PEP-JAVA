import java.util.Arrays;

public class MyStack {

    int top;
    char[] data;



    public MyStack(int size){

        data=new char[size];
        top=-1;

    }


    public void push(char elem){

        if(!isFull()) {

            top++;
            data[top] = elem;

        }
        else{

            data=Arrays.copyOf(data,data.length*2);
            this.push(elem);
        }



    }

    public char pop(){

        char item;
        if(!isEmpty()) {
            item = data[top];
            top--;
            return item;
        }
        else{
            System.out.println("Stack empty");
            return '\0';
        }

    }

    public int size(){

        return top+1;

    }


    public char peek(){

        return data[top];

    }


    public boolean isEmpty(){

        if(top==-1){
            return true;
        }
        else
            return false;

    }

    public boolean isFull(){

        if(top==data.length-1)
            return true;
        else
            return false;

    }


}
