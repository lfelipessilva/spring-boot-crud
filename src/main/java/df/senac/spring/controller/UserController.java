package df.senac.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import df.senac.spring.database.UserRepository;
import df.senac.spring.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping
  public List<User> list() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody User user) {
    repository.save(user);
  }

  @PutMapping
  public void update(@RequestBody User user) {
    if (user.getId() > 0) {
      repository.save(user);
    }
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }

  @GetMapping(value="findbyid")
  public User findById(@RequestParam(name="userId") Long userId) {
    return repository.findById(userId).get();
  }

  @GetMapping(value="findbyname")
  public List<User> findByName(@RequestParam(name="name") String name) {
    return repository.findByNameContaining(name);
  }
}
