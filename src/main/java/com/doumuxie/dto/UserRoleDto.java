package com.doumuxie.dto;

/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/11 16:30
 * @description 用户 - 角色 关联dto
 **/
public class UserRoleDto extends BaseDto {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 角色id
     */
    private String roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
