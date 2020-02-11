package com.doumuxie.service.impl;

import com.doumuxie.dto.UserDto;
import com.doumuxie.mapper.UserMapper;
import com.doumuxie.service.UserService;
import com.doumuxie.utils.SysCode;
import com.doumuxie.utils.UUIDUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/7 11:06
 * @description 业务实现层
 **/
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    @SuppressWarnings("all")
    private UserMapper userMapper;

    /**
     * 查询详情
     *
     * @param dto
     * @return
     */
    @Override
    public UserDto query(UserDto dto) {
        UserDto userDto = userMapper.query(dto);
        return userDto;
    }

    /**
     * 分页查询
     *
     * @param dto
     * @return
     */
    @Override
    public PageInfo<UserDto> page(UserDto dto) {
        PageHelper.startPage(dto.getPageNo(), dto.getPageSize());
        List<UserDto> list = userMapper.list(dto);
        PageInfo<UserDto> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 删除数据
     *
     * @param dto
     */
    @Override
    public void delete(UserDto dto) {
        userMapper.delete(dto);
    }

    /**
     * 保存和更新数据
     *
     * @param dto
     * @return
     */
    @Override
    public String createUser(UserDto dto) {
        // 新增
        UserDto findDto = new UserDto();
        BeanUtils.copyProperties(dto, findDto);
        // id 置空
        findDto.setId(null);
        UserDto result = userMapper.query(findDto);
        if (result == null) {
            dto.setId(UUIDUtil.getUUID());
            dto.setUpdateTime(new Date());
            dto.setCreateTime(new Date());
            // 开启
            dto.setState(SysCode.USER_STATE.OK);
            // 未删除
            dto.setDeleteState(SysCode.DELETE_STATE.FALSE);
            if (userMapper.insert(dto) > 0) {
                // 成功
                return StringUtils.EMPTY;
            }
            return SysCode.INSERT_ERROR;
        }
        return SysCode.USER.REPEAT;
    }


    /**
     * 完善信息
     *
     * @param dto 个人信息
     * @return
     */
    public String perfectInfo(UserDto dto) {
        UserDto findDto = new UserDto();
        findDto.setId(dto.getId());
        UserDto result = userMapper.query(findDto);
        if (result == null) {
            return SysCode.USER.ERROR;
        }
        if (StringUtils.isNotBlank(dto.getSmName())){
            return SysCode.USER.NOT_ALLOW_UPDATE;
        }
        // 更新数据
        result.setSmName(dto.getSmName());
        result.setSmZfb(dto.getSmZfb());
        result.setSmYhk(dto.getSmYhk());
        result.setSmSfzh(dto.getSmSfzh());
        result.setUpdateTime(new Date());
        userMapper.update(result);
        return StringUtils.EMPTY;
    }
}
