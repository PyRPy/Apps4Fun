// like dictionary in python
// 面向对象程序设计-Java语言-翁恺（浙江大学）
import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();

    public Coin() {
        coinnames.put(1, "penny");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dollar");
        System.out.println("what we have here: ");
        // System.out.print(coinnames);
        // for (Integer k : coinnames.keySet() ) {
        //     String s = coinnames.get(k);
        //     System.out.println(s);
        // }
    }

    public String getName(int amount) {
        if ( coinnames.containsKey(amount))
            return coinnames.get(amount);
        else 
            return "not found!";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a coin number: ");
        int amount = in.nextInt();
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);
        
    }
}