/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.math.BigInteger;
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

import com.testutils.leave_application_db.TestEmployeeDetails;


/**
 * ServiceImpl object for domain model class TestEmployeeDetails.
 *
 * @see TestEmployeeDetails
 */
@Service("Leave_Application_DB.TestEmployeeDetailsService")
public class TestEmployeeDetailsServiceImpl implements TestEmployeeDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestEmployeeDetailsServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.TestEmployeeDetailsDao")
    private WMGenericDao<TestEmployeeDetails, BigInteger> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TestEmployeeDetails, BigInteger> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public TestEmployeeDetails create(TestEmployeeDetails testEmployeeDetails) {
        LOGGER.debug("Creating a new TestEmployeeDetails with information: {}", testEmployeeDetails);
        TestEmployeeDetails testEmployeeDetailsCreated = this.wmGenericDao.create(testEmployeeDetails);
        return testEmployeeDetailsCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public TestEmployeeDetails getById(BigInteger testemployeedetailsId) throws EntityNotFoundException {
        LOGGER.debug("Finding TestEmployeeDetails by id: {}", testemployeedetailsId);
        TestEmployeeDetails testEmployeeDetails = this.wmGenericDao.findById(testemployeedetailsId);
        if (testEmployeeDetails == null){
            LOGGER.debug("No TestEmployeeDetails found with id: {}", testemployeedetailsId);
            throw new EntityNotFoundException(String.valueOf(testemployeedetailsId));
        }
        return testEmployeeDetails;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public TestEmployeeDetails findById(BigInteger testemployeedetailsId) {
        LOGGER.debug("Finding TestEmployeeDetails by id: {}", testemployeedetailsId);
        return this.wmGenericDao.findById(testemployeedetailsId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public TestEmployeeDetails update(TestEmployeeDetails testEmployeeDetails) throws EntityNotFoundException {
        LOGGER.debug("Updating TestEmployeeDetails with information: {}", testEmployeeDetails);
        this.wmGenericDao.update(testEmployeeDetails);

        BigInteger testemployeedetailsId = testEmployeeDetails.getId();

        return this.wmGenericDao.findById(testemployeedetailsId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public TestEmployeeDetails delete(BigInteger testemployeedetailsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting TestEmployeeDetails with id: {}", testemployeedetailsId);
        TestEmployeeDetails deleted = this.wmGenericDao.findById(testemployeedetailsId);
        if (deleted == null) {
            LOGGER.debug("No TestEmployeeDetails found with id: {}", testemployeedetailsId);
            throw new EntityNotFoundException(String.valueOf(testemployeedetailsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<TestEmployeeDetails> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all TestEmployeeDetails");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<TestEmployeeDetails> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all TestEmployeeDetails");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table TestEmployeeDetails to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}
