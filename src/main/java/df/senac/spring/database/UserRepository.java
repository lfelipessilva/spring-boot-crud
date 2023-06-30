package df.senac.spring.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import df.senac.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
  List<User> findByNameContaining(String name);

}
