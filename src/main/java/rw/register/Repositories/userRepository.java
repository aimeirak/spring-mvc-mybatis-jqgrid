package rw.register.Repositories;

import java.util.List;

import org.apache.ibatis.annotations.*;

import rw.register.Models.User;

@Mapper
public interface userRepository {
	@Insert("INSERT INTO users(FIRSTNAME,LASTNAME,MOBILEPHONE,PASSWORD)"
			+ "VALUES(#{firstName},#{lastName},#{mobilePhone},#{password})")
	int insert(User user);
	@Select("SELECT * FROM users")
	List<User> findAll();
	
	@Select("SELECT MOBILEPHONE,PASSWORD FROM users where MOBILEPHONE = #{mobilePhone}")
	User  selectByPhone(@Param("mobilePhone") String mobilePhone);
}
