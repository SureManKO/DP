package spring.dp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import spring.dp.models.Account;
import spring.dp.repositories.PeopleRepository;
import spring.dp.security.AccountDetails;

import java.util.Optional;


@Service
public class AccountDetailsService implements UserDetailsService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public AccountDetailsService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Account> account = peopleRepository.findByUsername(s);

        if (account.isEmpty())
            throw new UsernameNotFoundException("User not found");

        return new AccountDetails(account.get());
    }
}
