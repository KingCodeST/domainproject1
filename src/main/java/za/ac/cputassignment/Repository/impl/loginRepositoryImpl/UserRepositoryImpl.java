package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.UserRepository;
import za.ac.cputassignment.domain.login.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    private static UserRepositoryImpl repository =null;
    private Set<User> users;

    private UserRepositoryImpl()
    {
        this.users = new HashSet<>();
    }

    public static UserRepository getRepository()
    {
        if(repository ==null) repository =new UserRepositoryImpl();
        return repository;
    }


    @Override
    public Set<User> getAll() {
        return this.users;
    }

    @Override
    public User create(User user) {
        this.users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public User read(String s) {
        return null;
    }
}
