import java.util.Arrays;

class OverflowException extends Exception{

    public OverflowException(String message) {
        super(message);
    }
}

class UnderflowException extends Exception{

    public UnderflowException(String message) {
        super(message);
    }
}


class MyStack {

    int top;
    char[] data;



    public MyStack(int size){

        data=new char[size];
        top=-1;

    }


    public void push(char elem)throws OverflowException{


        if(isFull())
        {
            OverflowException ox=new OverflowException("Stack Full");
            throw ox;

        }


        if(!isFull()) {

            top++;
            data[top] = elem;

        }
        else{

            data=Arrays.copyOf(data,data.length*2);
            this.push(elem);
        }



    }

    public char pop()throws UnderflowException{


        char item;

        if(isEmpty())
        {
            UnderflowException ux=new UnderflowException("Stack empty");
            throw ux;

        }

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


public class TestStack{

    public static void main(String[] agrs)throws OverflowException,UnderflowException{

    MyStack s1=new MyStack(5);

    s1.push('c');
    s1.push('4');
    s1.push('d');
    s1.push('4');


    StringBuffer str=new StringBuffer();
    while(!s1.isEmpty()){

      str=str.append(add(s1));

    }

    System.out.println(str);


    }

    public static char add(MyStack s1)throws UnderflowException{

        char s=s1.pop();

        return s;

    }

}