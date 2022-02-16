package com.dahal.fullstackrestaurant.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dahal.fullstackrestaurant.models.MenuItem;


//REPOSITORIES HAVE DIRECT ACCESS TO OUR SQL DB

@Repository //@Repository annotation flags this interface as a repository
public interface MenuItemRepository extends CrudRepository<MenuItem, Long>{ //we inherited a bunch of CRUD methods that translate to sql queries under the hood from the CrudRepository<> Interface

}
