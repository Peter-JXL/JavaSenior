package chapter5Collection;
import java.util.HashMap;

public class LearnMap3 {
  public static void main(String[] args) {
    Wife2 wife21 = new Wife2("爱丽希雅");
    Wife2 wife2 = new Wife2("爱丽希雅");
    HashMap<Wife2, String> myWives = new HashMap<>();
    myWives.put(wife21, "My fisrt wife is 爱丽希雅!");
    System.out.println(myWives.get(wife2)); //null
  }
}

class Wife{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wife(String name){
    this.name = name;
  }

}
