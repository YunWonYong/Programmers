import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 뉴스 클러스터링
 */
public class NewsClustering {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        List<String> a = divide(str1);
        List<String> b = divide(str2);

        Collections.sort(a);
        Collections.sort(b);

        int intersection = searchDuplication(a, b);
        int union = a.size() + b.size() - intersection;
        return (union == 0) ? 65536 : intersection * 65536 / union;
    }

    public List<String> divide(String str) {
        List<String> list = new ArrayList<>();
        String pattern = "^[A-Z]*$";

        int length = str.length();
        int last = length - 1;
        String sub;
        for (int i = 0; i < last; i++) {
            sub = str.substring(i, i + 2);
            if (Pattern.matches(pattern, sub)) {
                list.add(sub);
            }
        }

        return list;
    }

    private int searchDuplication(List<String> a, List<String> b) {
        int pointer = 0;
        int duplication = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = pointer; j < b.size(); j++) {
                if (a.get(i).equals(b.get(j))) {
                    pointer = j + 1;
                    duplication++;
                    break;
                }
            }
        }
        return duplication;
    }
}
