package com.agussuhardi.sig.dao;

import com.agussuhardi.sig.entity.CampusDepartementModel;
import com.agussuhardi.sig.entity.LocationModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by agussuhardi on 05/12/16.
 */
public interface CampusDepartementDao extends PagingAndSortingRepository<CampusDepartementModel, Integer> {

    //1
    @Query("SELECT l FROM CampusDepartementModel dc " +
            "JOIN dc.campus c " +
            "JOIN c.location l " +
            "WHERE dc.departement.name= :departement")
    Iterable<LocationModel> findByDepartement(
            @Param("departement") String departement
    );

    //2
    @Query("SELECT l FROM CampusDepartementModel dc " +
            "JOIN dc.campus c " +
            "JOIN c.location l " +
            "WHERE dc.accreditation= :accreditation")
    Iterable<LocationModel> findByAccreditation(
            @Param("accreditation") String accreditation
    );

    //3
    @Query("SELECT l FROM CampusDepartementModel dc " +
            "JOIN dc.campus c " +
            "JOIN c.location l " +
            "WHERE dc.level= :level")
    Iterable<LocationModel> findByLevel(
            @Param("level") String level
    );

    //4_____________________________________________________________________________________________________________________
    @Query("SELECT l FROM CampusDepartementModel dc " +
            "JOIN dc.campus c " +
            "JOIN c.location l " +
            "WHERE dc.departement.name= :departement AND dc.accreditation= :accreditation")
    Iterable<LocationModel> findByDepartementAndAccreditation(
            @Param("departement") String departement,
            @Param("accreditation") String accreditation
    );

    //5
    @Query("SELECT l FROM CampusDepartementModel dc " +
            "JOIN dc.campus c " +
            "JOIN c.location l " +
            "WHERE dc.departement.name= :departement AND dc.level= :level")
    Iterable<LocationModel> findByDepartementAndLevel(
            @Param("departement") String departement,
            @Param("level") String level
    );

    //6
    @Query("SELECT l FROM CampusDepartementModel dc " +
            "JOIN dc.campus c " +
            "JOIN c.location l " +
            "WHERE dc.accreditation= :accreditation AND dc.level= :level")
    Iterable<LocationModel> findByAccreditationAndLevel(
            @Param("accreditation") String accreditation,
            @Param("level") String level
    );



    @Query("SELECT cd from CampusDepartementModel cd JOIN cd.campus c WHERE c.code = :campus")
    Iterable<CampusDepartementModel> findByCampus(
            @Param("campus") String campus
    );


    @Query("SELECT cd from CampusDepartementModel cd JOIN cd.campus c WHERE c.name LIKE :name")
    Iterable<CampusDepartementModel> findLikeCampus(
            @Param("name") String name
    );
}

