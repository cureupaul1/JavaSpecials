package ro.java.ctrln;

public class OuterCLassWithLocalClass {
    private final static int SIZE = 5;
    private String[] messageList ={ "Message1", "Message2", "Message3", "Message4"};

    public void showMessages(){
        class LocalClass {
            private int nextIndex = 0;

            public boolean hasNext(){
                return ( this.nextIndex <= messageList.length - 1);
            }

            public String next(){
                return messageList[this.nextIndex++];

            }

        }
        LocalClass localClass = new  LocalClass();
        while(localClass.hasNext()){
            System.out.println("Mesajul este " +localClass.next());
        }

    }

    public static void main(String[] args) {
        OuterCLassWithLocalClass outerCLassWithLocalClass = new OuterCLassWithLocalClass();
        outerCLassWithLocalClass.showMessages();
    }
}
