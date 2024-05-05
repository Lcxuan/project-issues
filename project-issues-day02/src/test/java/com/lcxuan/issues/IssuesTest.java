package com.lcxuan.issues;

import com.lcxuan.issues.core.convert.UserConvert;
import com.lcxuan.issues.core.pojo.Address;
import com.lcxuan.issues.core.pojo.User;
import com.lcxuan.issues.core.pojo.UserDTO;
import org.junit.jupiter.api.Test;

public class IssuesTest {

    @Test
    public void test01() {
        User user = new User(1001, "张三", 18);
        UserDTO userDTO = UserConvert.INSTANCE.toUserDTO(user);
        System.out.println("userDTO = " + userDTO);
    }

    @Test
    public void test02() {
        User user = new User(1001, "张三", 18);
        UserDTO userDTO = UserConvert.INSTANCE.toUserDTO02(user);
        System.out.println("userDTO = " + userDTO);
    }

    @Test
    public void test03() {
        User user = new User(1001, "张三", 18);
        Address address = new Address("广东省");
        UserDTO userDTO = UserConvert.INSTANCE.toUserDTO03(user, address);
        System.out.println("userDTO = " + userDTO);
    }
}
