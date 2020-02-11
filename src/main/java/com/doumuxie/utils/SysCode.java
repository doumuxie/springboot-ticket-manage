package com.doumuxie.utils;

/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/10 16:04
 * @description 系统code
 **/
public class SysCode {

    /**
     * 参数错误
     */
    public static final String PARAM_ERROR = "参数错误";


    /**
     * 数据已存在
     */
    public static final String DATA_REPEAT = "数据已存在";



    /**
     * 新增失败
     */
    public static final String INSERT_ERROR = "新增失败";

    /**
     * 更新失败
     */
    public static final String UPDATE_ERROR = "更新失败";

    /**
     * 删除失败
     */
    public static final String DELETE_ERROR = "删除失败";

    /**
     * 删除状态
     */
    public interface DELETE_STATE {
        /**
         * 已删除
         */
        String TRUE = "1";

        /**
         * 未删除
         */
        String FALSE = "0";
    }

    /**
     * 用户状态
     */
    public interface USER_STATE {
        /**
         * 正常
         */
        String OK = "0";

        /**
         * 禁用
         */
        String BAND = "1";
    }

    public interface USER {
        String REPEAT = "用户已存在";

        String ERROR = "用户不存在";

        String NOT_ALLOW_UPDATE = "已实名信息无法再次修改";
    }
}
