package com.lcxuan.issues.core.convert;

import com.lcxuan.issues.core.pojo.Address;
import com.lcxuan.issues.core.pojo.User;
import com.lcxuan.issues.core.pojo.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    /**
     * 将 User 对象转换为 UserDTO 对象
     *
     * @param user User 对象
     * @return UserDTO 对象
     */
    UserDTO toUserDTO(User user);

    @Mappings(value = {
            @Mapping(source = "id", target = "userId")
    })
    UserDTO toUserDTO02(User user);

    /**
     * 将 User 对象转换为 UserDTO 对象
     *
     * @param user User 对象
     * @param address Address 对象
     * @return UserDTO 对象
     */
    @Mappings(value = {
            @Mapping(source = "user.id", target = "userId"),
            @Mapping(source = "address.addressName", target = "address")
    })
    UserDTO toUserDTO03(User user, Address address);
}
