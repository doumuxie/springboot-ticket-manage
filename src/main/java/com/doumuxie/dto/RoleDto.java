package com.doumuxie.dto;

/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/11 16:30
 * @description 角色dto
 **/
public class RoleDto extends BaseDto {

    /**
     * 角色名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
