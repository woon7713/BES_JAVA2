class Box<T>{
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println(content + " " + extraInfo);
    }

}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("난 커서 박스가 될래.");
        System.out.println(stringBox.getContent());
        stringBox.setContent("실패!");
        System.out.println(stringBox.getContent());
        stringBox.printContent(123);
    }
}