package com.agussuhardi.sig.dao;

import com.agussuhardi.sig.entity.CampusModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by agussuhardi on 05/12/16.
 */
public interface CampusDao extends PagingAndSortingRepository<CampusModel, String> {

    
}
/*
"select distinct c, count(part.id) from TestCategory c left join c.parts part group by c"

select u from UserGroup ug inner join ug.user u
where ug.group_id = :groupId
order by u.lastname



select employee.id, employee.surname, subject.name from Employee employee
join employee.subject subject
*/