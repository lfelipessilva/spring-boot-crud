package df.senac.spring.database;

import org.springframework.data.jpa.repository.JpaRepository;

import df.senac.spring.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
  
}
