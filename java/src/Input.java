import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {

    private static final String ASK_PEOPLE_NAME = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String ASK_LADDER_HIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final Scanner scanner = new Scanner(System.in);

    private List<String> people;
    private int hight;

    public Input() {
        start();
    }

    private void start() {
        askPeople();
        askHight();
        scanner.close();
    }

    private void askPeople() {
        System.out.println(ASK_PEOPLE_NAME);
        String value = scanner.nextLine();
        String[] group = value.split(",");
        people = new ArrayList<>(Arrays.asList(group));
    }

    private void askHight() {
        System.out.println(ASK_LADDER_HIGHT);
        String value = scanner.nextLine();
        Number number = new Number(value);
        hight = number.get();
    }

    private int checkZero(int value) {
        if (people.size() == 0 || hight == 0) {
            return 0;
        }
        return value;
    }

    public List<String> getPeople() {
        return people;
    }

    public int getHight() {
        return checkZero(hight);
    }

}
