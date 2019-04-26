package za.ac.cputassignment.Repository.impl.loginRepositoryImpl;

import za.ac.cputassignment.Repository.loginRepository.AuthenticationRepository;
import za.ac.cputassignment.domain.login.Authentication;

import java.util.Set;

public class AuthenticationRepositoryImpl implements AuthenticationRepository {

   private static AuthenticationRepositoryImpl repository=null;
   private Set<Authentication> authentications;


   private AuthenticationRepositoryImpl getRepository()
   {
       if(repository==null) repository =new AuthenticationRepositoryImpl();
       return repository;
   }

    @Override
    public Set<Authentication> getAll() {
        return this.authentications;
    }

    @Override
    public Authentication create(Authentication authentication) {
       this.authentications.add(authentication);
       return authentication;
    }

    @Override
    public Authentication update(Authentication authentication) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Authentication read(String s) {
        return null;
    }
}
