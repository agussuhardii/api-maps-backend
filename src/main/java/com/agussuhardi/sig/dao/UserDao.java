package com.agussuhardi.sig.dao;

import com.agussuhardi.sig.entity.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by agussuhardi on 11/12/16.
 */
public interface UserDao extends PagingAndSortingRepository<UserModel, String> {

    @Query("SELECT u FROM UserModel u WHERE u.userName= :username AND u.password= :password")
    UserModel findUser(
            @Param("username") String userName,
            @Param("password") String password
    );
}
