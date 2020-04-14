package webadv.s99201105.p02;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Inputusername = sc.next();
        String Inputpassword = sc.next();
        Inputpassword = sha256hex(Inputpassword);
        String username = "zhou";
        String password = sha256hex("123456");
        if(Inputusername.equals(username)&&Inputpassword.equals(password)){
              System.out.println("ok");
        }
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
