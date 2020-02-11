package com.doumuxie.dto;

import java.util.List;

/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/11 16:30
 * @description 用户dto
 **/
public class UserDto extends BaseDto {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 实名姓名
     */
    private String smName;

    /**
     * 实名身份证号码
     */
    private String smSfzh;

    /**
     * 实名银行卡卡号
     */
    private String smYhk;

    /**
     * 实名支付宝号码
     */
    private String smZfb;

    /**
     * 状态  0 正常 1 禁用
     */
    private String state;

    /**
     * 删除状态 0 未删除 1 已删除
     */
    private String deleteState;

    /**
     * 角色列表
     */
    private List<RoleDto> roleDtoList;

    public List<RoleDto> getRoleDtoList() {
        return roleDtoList;
    }

    public void setRoleDtoList(List<RoleDto> roleDtoList) {
        this.roleDtoList = roleDtoList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
    }

    public String getSmSfzh() {
        return smSfzh;
    }

    public void setSmSfzh(String smSfzh) {
        this.smSfzh = smSfzh;
    }

    public String getSmYhk() {
        return smYhk;
    }

    public void setSmYhk(String smYhk) {
        this.smYhk = smYhk;
    }

    public String getSmZfb() {
        return smZfb;
    }

    public void setSmZfb(String smZfb) {
        this.smZfb = smZfb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState;
    }
}
