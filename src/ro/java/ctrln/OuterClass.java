package ro.java.ctrln;

public class OuterClass {

    private final static int SIZE = 5;
    private String[] messageList = {"Message1", "Message2", "Message3","Message4","Message5"};

    private class InnerClass{
        private int nextindex = 0;

        public boolean hasNext(){
            return (this.nextindex <= SIZE - 1);
        }

        public String next(){
            String returnedMessage = messageList[this.nextindex];
            this.nextindex++;
            return returnedMessage;
        }
    }

    public void showMessages(){
        InnerClass innerClass = this.new InnerClass();
        while(innerClass.hasNext()){
            System.out.println("Mesajul este: " + innerClass.next());
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.showMessages();
    }
}
