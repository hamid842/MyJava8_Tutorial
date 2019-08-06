package com.mjv.app.repository;

import com.mjv.app.model.Account;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account , Long> {

}
