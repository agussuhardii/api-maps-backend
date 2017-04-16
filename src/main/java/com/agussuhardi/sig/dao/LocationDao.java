package com.agussuhardi.sig.dao;

import com.agussuhardi.sig.entity.LocationModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by agussuhardi on 05/12/16.
 */
public interface LocationDao extends PagingAndSortingRepository<LocationModel, Integer>{


}
/*
    @Query("SELECT " +
            "c.code, " +
            "c.name, " +
            "l.latitude, " +
            "l.longitude, " +
            "d.id, " +
            "d.departement.name " +
            "FROM LocationModel l " +
            "JOIN l.campus c " +
            "JOIN c.departement d")
    Iterable<LocationModel> findByLocations();

}


/*

    @Query("SELECT d.departement FROM CampusDepartementModel d LEFT JOIN d.departement l")
    Iterable<CampusDepartementModel> getDepartements();
 */