package df.senac.spring.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import df.senac.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
  @Query(value="select u from User u where upper(trim(u.name)) like %?1%")
  List<User> findByName(String name);

}
