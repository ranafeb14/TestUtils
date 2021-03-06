/*Generated by WaveMaker Studio*/
package com.testutils.testdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testutils.testdb.EmployeeOne;


/**
 * ServiceImpl object for domain model class EmployeeOne.
 *
 * @see EmployeeOne
 */
@Service("TestDB.EmployeeOneService")
@Validated
public class EmployeeOneServiceImpl implements EmployeeOneService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOneServiceImpl.class);


    @Autowired
    @Qualifier("TestDB.EmployeeOneDao")
    private WMGenericDao<EmployeeOne, Long> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<EmployeeOne, Long> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "TestDBTransactionManager")
    @Override
	public EmployeeOne create(EmployeeOne employeeOne) {
        LOGGER.debug("Creating a new EmployeeOne with information: {}", employeeOne);
        EmployeeOne employeeOneCreated = this.wmGenericDao.create(employeeOne);
        return employeeOneCreated;
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public EmployeeOne getById(Long employeeoneId) throws EntityNotFoundException {
        LOGGER.debug("Finding EmployeeOne by id: {}", employeeoneId);
        EmployeeOne employeeOne = this.wmGenericDao.findById(employeeoneId);
        if (employeeOne == null){
            LOGGER.debug("No EmployeeOne found with id: {}", employeeoneId);
            throw new EntityNotFoundException(String.valueOf(employeeoneId));
        }
        return employeeOne;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public EmployeeOne findById(Long employeeoneId) {
        LOGGER.debug("Finding EmployeeOne by id: {}", employeeoneId);
        return this.wmGenericDao.findById(employeeoneId);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public EmployeeOne getByLdapUid(String ldapUid) {
        Map<String, Object> ldapUidMap = new HashMap<>();
        ldapUidMap.put("ldapUid", ldapUid);

        LOGGER.debug("Finding EmployeeOne by unique keys: {}", ldapUidMap);
        EmployeeOne employeeOne = this.wmGenericDao.findByUniqueKey(ldapUidMap);

        if (employeeOne == null){
            LOGGER.debug("No EmployeeOne found with given unique key values: {}", ldapUidMap);
            throw new EntityNotFoundException(String.valueOf(ldapUidMap));
        }

        return employeeOne;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public EmployeeOne getByEmployeeCode(long employeeCode) {
        Map<String, Object> employeeCodeMap = new HashMap<>();
        employeeCodeMap.put("employeeCode", employeeCode);

        LOGGER.debug("Finding EmployeeOne by unique keys: {}", employeeCodeMap);
        EmployeeOne employeeOne = this.wmGenericDao.findByUniqueKey(employeeCodeMap);

        if (employeeOne == null){
            LOGGER.debug("No EmployeeOne found with given unique key values: {}", employeeCodeMap);
            throw new EntityNotFoundException(String.valueOf(employeeCodeMap));
        }

        return employeeOne;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public EmployeeOne getByEmailAndActive(String email, boolean active) {
        Map<String, Object> emailAndActiveMap = new HashMap<>();
        emailAndActiveMap.put("email", email);
        emailAndActiveMap.put("active", active);

        LOGGER.debug("Finding EmployeeOne by unique keys: {}", emailAndActiveMap);
        EmployeeOne employeeOne = this.wmGenericDao.findByUniqueKey(emailAndActiveMap);

        if (employeeOne == null){
            LOGGER.debug("No EmployeeOne found with given unique key values: {}", emailAndActiveMap);
            throw new EntityNotFoundException(String.valueOf(emailAndActiveMap));
        }

        return employeeOne;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "TestDBTransactionManager")
	@Override
	public EmployeeOne update(EmployeeOne employeeOne) throws EntityNotFoundException {
        LOGGER.debug("Updating EmployeeOne with information: {}", employeeOne);
        this.wmGenericDao.update(employeeOne);

        Long employeeoneId = employeeOne.getId();

        return this.wmGenericDao.findById(employeeoneId);
    }

    @Transactional(value = "TestDBTransactionManager")
	@Override
	public EmployeeOne delete(Long employeeoneId) throws EntityNotFoundException {
        LOGGER.debug("Deleting EmployeeOne with id: {}", employeeoneId);
        EmployeeOne deleted = this.wmGenericDao.findById(employeeoneId);
        if (deleted == null) {
            LOGGER.debug("No EmployeeOne found with id: {}", employeeoneId);
            throw new EntityNotFoundException(String.valueOf(employeeoneId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public Page<EmployeeOne> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeOnes");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Page<EmployeeOne> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeOnes");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service TestDB for table EmployeeOne to {} format", exportType);
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

