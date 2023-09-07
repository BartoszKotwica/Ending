package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.entity.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, String> {

    List<User> findUserById (Integer id);
    List<User> findUserByFirst_name (String first_name);
    List<User> findUserByLast_name (String last_name);
    List<User> findUserByUser_name (String user_name);
    List<User> findUserByEmail (String email);

    @Query("select u from User u where u.id = :id")
    List<User> getUserById(@Param("id") Integer id);

    @Query("select u from User u where u.first_name like :first_name%")
    List<User> getUserByFirst_name(@Param("fist_name") String first_name);

    @Query("select u from User u where u.last_name like :last_name%")
    List<User> getUserByLast_name(@Param("last_name") String last_name);

    @Query("select u from User u where u.email like :email%")
    List<User> getUserByEmail(@Param("email") String email);

    @Query("select u from User u where u.user_name like :user_name%")
    List<User> getUserByUser_name(@Param("user_name") String user_name);
}
