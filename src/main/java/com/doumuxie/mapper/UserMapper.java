package com.doumuxie.mapper;

import com.doumuxie.dto.UserDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper {

    @Select("<script>" +
            "select * from user where delete_state = '0' " +
            "<if test='context != null'>" +
            " and " +
            "(" +
            "username like CONCAT('%',#{context},'%')" +
            "or sm_name like CONCAT('%',#{context},'%')" +
            ")"+
            "</if>" +
            "order by update_time desc" +
            "</script>")
    List<UserDto> list(UserDto dto);

    @Select("<script>" +
            "select * " +
            "from " +
            "user " +
            "where delete_state = '0' " +
            "<if test='id != null'>" +
            " and id = #{id}" +
            "</if>" +
            "<if test='username != null'>" +
            " and username = #{username}" +
            "</if>" +
            " limit 1" +
            "</script>")
    UserDto query(UserDto dto);

    @Delete("update user set delete_state = '1' where id = #{id}")
    void delete(UserDto dto);

    @Insert("insert into user " +
            "(id, username, password, create_time, update_time,state, delete_state) " +
            "values " +
            "(#{id}, #{username}, #{password}, #{createTime}, #{updateTime}, #{state}, #{deleteState})")
    int insert(UserDto dto);

    @Update("update user set " +
            "password = #{password}," +
            "sm_name = #{smName}," +
            "sm_sfzh = #{smSfzh}," +
            "sm_yhk = #{smYhk}," +
            "sm_zfb = #{smZfb}," +
            "state = #{state}," +
            "delete_state = #{deleteState}," +
            "update_time = #{updateTime}" +
            "where id = #{id}")
    int update(UserDto dto);
}
