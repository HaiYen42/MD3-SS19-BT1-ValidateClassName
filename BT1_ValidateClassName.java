import java.util.Scanner;
import java.util.regex.Pattern;

public class BT1_ValidateClassName {
    private static final String CLASS_NAME_REGEX= "^[CAP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp cần kiểm tra ");
        String className= scanner.nextLine();
        //Lớp Pattern để check validate, String regex: Chuỗi yêu cầu
        boolean checkValidClass = Pattern.matches(CLASS_NAME_REGEX,className);
        System.out.println(checkValidClass);
    }
}
