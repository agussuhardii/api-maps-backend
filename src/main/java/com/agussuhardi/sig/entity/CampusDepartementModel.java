package com.agussuhardi.sig.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by agussuhardi on 04/11/16.
 */
@Entity
@Table(name = "campus_departement")
public class CampusDepartementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String level;
    private String accreditation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "campus_code", nullable = false)
    private CampusModel campus;

    @ManyToOne
    @JoinColumn(name = "departement_code", nullable = false)
    private DepartementModel departement;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public CampusModel getCampus() {
        return campus;
    }

    public void setCampus(CampusModel campus) {
        this.campus = campus;
    }

    public DepartementModel getDepartement() {
        return departement;
    }

    public void setDepartement(DepartementModel departement) {
        this.departement = departement;
    }
}