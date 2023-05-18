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
import org.springframework.web.bind.annotation.RestController;

import df.senac.spring.database.ContactRepository;
import df.senac.spring.entity.Contact;

@RestController
@RequestMapping("/contact")
public class ContactController {

  @Autowired
  private ContactRepository repository;

  @GetMapping
  public List<Contact> list() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody Contact contact) {
    repository.save(contact);
  }

  @PutMapping
  public void update(@RequestBody Contact contact) {
    if (contact.getId() > 0) {
      repository.save(contact);
    }
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
