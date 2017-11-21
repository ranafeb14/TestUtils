/*Generated by WaveMaker Studio*/
package com.testutils.testdb.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testutils.testdb.EmployeeOne;

/**
 * Specifies methods used to obtain and modify EmployeeOne related information
 * which is stored in the database.
 */
@Repository("TestDB.EmployeeOneDao")
public class EmployeeOneDao extends WMGenericDaoImpl<EmployeeOne, Long> {

    @Autowired
    @Qualifier("TestDBTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

