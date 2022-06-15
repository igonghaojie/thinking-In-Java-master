package MyTest;

public class ValueTransferTest {
    public static void main(String[] args){
        String s1="hello";
        ValueTransferTest test =new ValueTransferTest();
        s1=test.change(s1);
        System.out.println(s1);
    }

    public String change(String s){
        s="hi";
        return s;
    }

}
