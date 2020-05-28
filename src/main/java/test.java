import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        System.out.println("Test Docker");
        ArrayList<Integer>  list = new ArrayList<>(List.of(1,2,3,4));
        list.stream().forEach(System.out::println);
    }
}
