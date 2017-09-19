/*Generated by WaveMaker Studio*/
package com.testutils.testdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testutils.testdb.EmployeeSkillsOne;


/**
 * ServiceImpl object for domain model class EmployeeSkillsOne.
 *
 * @see EmployeeSkillsOne
 */
@Service("TestDB.EmployeeSkillsOneService")
public class EmployeeSkillsOneServiceImpl implements EmployeeSkillsOneService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeSkillsOneServiceImpl.class);


    @Autowired
    @Qualifier("TestDB.EmployeeSkillsOneDao")
    private WMGenericDao<EmployeeSkillsOne, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<EmployeeSkillsOne, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "TestDBTransactionManager")
    @Override
	public EmployeeSkillsOne create(EmployeeSkillsOne employeeSkillsOne) {
        LOGGER.debug("Creating a new EmployeeSkillsOne with information: {}", employeeSkillsOne);
        EmployeeSkillsOne employeeSkillsOneCreated = this.wmGenericDao.create(employeeSkillsOne);
        return employeeSkillsOneCreated;
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public EmployeeSkillsOne getById(Integer employeeskillsoneId) throws EntityNotFoundException {
        LOGGER.debug("Finding EmployeeSkillsOne by id: {}", employeeskillsoneId);
        EmployeeSkillsOne employeeSkillsOne = this.wmGenericDao.findById(employeeskillsoneId);
        if (employeeSkillsOne == null){
            LOGGER.debug("No EmployeeSkillsOne found with id: {}", employeeskillsoneId);
            throw new EntityNotFoundException(String.valueOf(employeeskillsoneId));
        }
        return employeeSkillsOne;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public EmployeeSkillsOne findById(Integer employeeskillsoneId) {
        LOGGER.debug("Finding EmployeeSkillsOne by id: {}", employeeskillsoneId);
        return this.wmGenericDao.findById(employeeskillsoneId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "TestDBTransactionManager")
	@Override
	public EmployeeSkillsOne update(EmployeeSkillsOne employeeSkillsOne) throws EntityNotFoundException {
        LOGGER.debug("Updating EmployeeSkillsOne with information: {}", employeeSkillsOne);
        this.wmGenericDao.update(employeeSkillsOne);

        Integer employeeskillsoneId = employeeSkillsOne.getId();

        return this.wmGenericDao.findById(employeeskillsoneId);
    }

    @Transactional(value = "TestDBTransactionManager")
	@Override
	public EmployeeSkillsOne delete(Integer employeeskillsoneId) throws EntityNotFoundException {
        LOGGER.debug("Deleting EmployeeSkillsOne with id: {}", employeeskillsoneId);
        EmployeeSkillsOne deleted = this.wmGenericDao.findById(employeeskillsoneId);
        if (deleted == null) {
            LOGGER.debug("No EmployeeSkillsOne found with id: {}", employeeskillsoneId);
            throw new EntityNotFoundException(String.valueOf(employeeskillsoneId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public Page<EmployeeSkillsOne> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeSkillsOnes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Page<EmployeeSkillsOne> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeSkillsOnes");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service TestDB for table EmployeeSkillsOne to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

