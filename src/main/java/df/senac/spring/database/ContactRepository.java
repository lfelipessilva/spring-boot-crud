package df.senac.spring.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import df.senac.spring.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
  @Override
  default List<Contact> findAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }

  @Override
  default <S extends Contact> S save(S entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

  @Override
  default void deleteById(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
  }
}
