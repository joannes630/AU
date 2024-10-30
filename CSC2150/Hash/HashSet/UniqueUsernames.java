import java.util.Arrays;
import java.util.HashSet;

public class UniqueUsernames {
    public static void main(String[] args) {
        String log = "user43, user6, user12, user19, user47, user18, user21, user5, user49, user34, user1, user50, user40, user35, user32, user9, user37, user24, user48, user15, user42, user26, user11, user33, user17, user20, user13, user22, user8, user31, user28, user15, user38, user3, user16, user45, user7, user25, user4, user14, user21, user36, user19, user23, user47, user6, user39, user10, user41, user2, user30, user12, user24, user50, user13, user27, user29, user38, user5, user43, user37, user20, user8, user44, user9, user48, user1, user18, user40, user16, user31, user35, user25, user41, user7, user14, user29, user26, user10, user49, user28, user45, user36, user33, user39, user2, user4, user22, user32, user17, user42, user11, user34, user3, user44, user30";
        String[] usernames = log.split(", ");
        System.out.println(Arrays.toString(usernames));
        System.out.println(usernames.length);

        HashSet<String> uniqueUsers = new HashSet<>();
        for (String username: usernames) {
            uniqueUsers.add(username);
        }

        for (String username: uniqueUsers) {
            System.out.println(username);
        }
        System.out.println(uniqueUsers.size());

    }

}
