package spring.dp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.dp.models.Account;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findByUsername(String username);
}
