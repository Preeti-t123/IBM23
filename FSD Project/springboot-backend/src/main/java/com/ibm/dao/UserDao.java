package com.ibm.dao;
import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import com.ibm.model.Users;;

public interface UserDao extends CrudRepository<Users, BigInteger>{

}