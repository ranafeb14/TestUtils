/*Generated by WaveMaker Studio*/
package com.testutils.testcorridor.service;

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

import com.testutils.testcorridor.EmployeeDetails;


/**
 * ServiceImpl object for domain model class EmployeeDetails.
 *
 * @see EmployeeDetails
 */
@Service("TestCorridor.EmployeeDetailsService")
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDetailsServiceImpl.class);


    @Autowired
    @Qualifier("TestCorridor.EmployeeDetailsDao")
    private WMGenericDao<EmployeeDetails, Long> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<EmployeeDetails, Long> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "TestCorridorTransactionManager")
    @Override
	public EmployeeDetails create(EmployeeDetails employeeDetails) {
        LOGGER.debug("Creating a new EmployeeDetails with information: {}", employeeDetails);
        EmployeeDetails employeeDetailsCreated = this.wmGenericDao.create(employeeDetails);
        return employeeDetailsCreated;
    }

	@Transactional(readOnly = true, value = "TestCorridorTransactionManager")
	@Override
	public EmployeeDetails getById(Long employeedetailsId) throws EntityNotFoundException {
        LOGGER.debug("Finding EmployeeDetails by id: {}", employeedetailsId);
        EmployeeDetails employeeDetails = this.wmGenericDao.findById(employeedetailsId);
        if (employeeDetails == null){
            LOGGER.debug("No EmployeeDetails found with id: {}", employeedetailsId);
            throw new EntityNotFoundException(String.valueOf(employeedetailsId));
        }
        return employeeDetails;
    }

    @Transactional(readOnly = true, value = "TestCorridorTransactionManager")
	@Override
	public EmployeeDetails findById(Long employeedetailsId) {
        LOGGER.debug("Finding EmployeeDetails by id: {}", employeedetailsId);
        return this.wmGenericDao.findById(employeedetailsId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "TestCorridorTransactionManager")
	@Override
	public EmployeeDetails update(EmployeeDetails employeeDetails) throws EntityNotFoundException {
        LOGGER.debug("Updating EmployeeDetails with information: {}", employeeDetails);
        this.wmGenericDao.update(employeeDetails);

        Long employeedetailsId = employeeDetails.getId();

        return this.wmGenericDao.findById(employeedetailsId);
    }

    @Transactional(value = "TestCorridorTransactionManager")
	@Override
	public EmployeeDetails delete(Long employeedetailsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting EmployeeDetails with id: {}", employeedetailsId);
        EmployeeDetails deleted = this.wmGenericDao.findById(employeedetailsId);
        if (deleted == null) {
            LOGGER.debug("No EmployeeDetails found with id: {}", employeedetailsId);
            throw new EntityNotFoundException(String.valueOf(employeedetailsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "TestCorridorTransactionManager")
	@Override
	public Page<EmployeeDetails> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeDetails");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "TestCorridorTransactionManager")
    @Override
    public Page<EmployeeDetails> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeDetails");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "TestCorridorTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service TestCorridor for table EmployeeDetails to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "TestCorridorTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "TestCorridorTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

