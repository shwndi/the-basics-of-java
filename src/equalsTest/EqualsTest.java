package equalsTest;

import VO.UserVO;

import java.util.Objects;

import static java.util.Objects.deepEquals;

/**
 * 自定义对象不管用
 */
public class EqualsTest {
    public static void main(String[] args) {
        UserVO user1 = new UserVO();
        user1.setId(1);
        user1.setName("狐狸");
        UserVO user2 = new UserVO();
        user2.setId(1);
        user2.setName("狐狸");
        boolean b = Objects.deepEquals(user1, user2);
        System.out.println(b);

        String i1[] = new String[]{"1","2","4"};
        String i2[] = new String[]{"1","2","4"};
        String i3[] = i2;
        boolean c1 = deepEquals(i1, i2);
        boolean c2 = deepEquals(i1, i3);
        System.out.println(c1);
        System.out.println(c2);
    }
}
