package com.doumuxie.service;

import com.doumuxie.dto.UserDto;
import com.github.pagehelper.PageInfo;

/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/7 11:06
 * @description 业务接口层
 **/
public interface UserService {

    /**
     * 查询详情
     * @param dto
     * @return
     */
    UserDto query(UserDto dto);

    /**
     * 分页查询
     * @param dto
     * @return
     */
    PageInfo<UserDto> page(UserDto dto);

    /**
     * 删除数据
     * @param dto
     */
    void delete(UserDto dto);

    /**
     * 新增 和 更新数据
     * @param dto
     * @return
     */
    String createUser(UserDto dto);

    /**
     * 完善信息
     *
     * @param dto 个人信息
     * @return
     */
    String perfectInfo(UserDto dto);

}
