package com.dahal.fullstackrestaurant.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dahal.fullstackrestaurant.models.MenuItem;


//REPOSITORIES HAVE DIRECT ACCESS TO OUR SQL DB

@Repository
public interface MenuItemRepository extends CrudRepository<MenuItem, Long>{

}
