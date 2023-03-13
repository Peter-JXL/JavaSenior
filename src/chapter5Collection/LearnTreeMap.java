package chapter5Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
  public static void main(String[] args) {
    Map<Wife2, String> myWives = new TreeMap<>(new Comparator<Wife2>() {
      public int compare(Wife2 w1, Wife2 w2){
        return w1.getName().compareTo(w2.getName());
      }
    });
    Wife2 wife21 = new Wife2("ai li xi ya");
    Wife2 wife2 = new Wife2("bu luo ni ya");
    Wife2 wife23 = new Wife2("mei bi wu si");
    myWives.put(wife23, "My fisrt wife is 梅比乌斯!");
    myWives.put(wife2, "My second wife is 布洛尼娅!");
    myWives.put(wife21, "My third wife is 爱丽希雅!");

    for (Wife2 wife2Key : myWives.keySet()) {
      System.out.println(wife2Key);
    }
  }
}


class Wife2 {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wife2(String name){
    this.name = name;
  }

  public String toString(){
    return "{Wife: " + name + "}";
  }
}