package com.agussuhardi.sig.dao;

import com.agussuhardi.sig.entity.DepartementModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by agussuhardi on 05/12/16.
 */
public interface DepartementDao extends PagingAndSortingRepository<DepartementModel, String>{

}
