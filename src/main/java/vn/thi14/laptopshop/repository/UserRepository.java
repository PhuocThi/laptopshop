package vn.thi14.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.thi14.laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User save(User hoidanit);
    List<User> findByEmail(String email);
    List<User> findAll();
    User findById(long id);
    void deleteById(long id);
}
