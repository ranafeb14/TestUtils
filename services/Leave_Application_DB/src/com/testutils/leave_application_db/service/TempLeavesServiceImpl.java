/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.service;

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

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testutils.leave_application_db.TempLeaves;


/**
 * ServiceImpl object for domain model class TempLeaves.
 *
 * @see TempLeaves
 */
@Service("Leave_Application_DB.TempLeavesService")
public class TempLeavesServiceImpl implements TempLeavesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TempLeavesServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.TempLeavesDao")
    private WMGenericDao<TempLeaves, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TempLeaves, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public TempLeaves create(TempLeaves tempLeaves) {
        LOGGER.debug("Creating a new TempLeaves with information: {}", tempLeaves);
        TempLeaves tempLeavesCreated = this.wmGenericDao.create(tempLeaves);
        return tempLeavesCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public TempLeaves getById(Integer templeavesId) throws EntityNotFoundException {
        LOGGER.debug("Finding TempLeaves by id: {}", templeavesId);
        TempLeaves tempLeaves = this.wmGenericDao.findById(templeavesId);
        if (tempLeaves == null){
            LOGGER.debug("No TempLeaves found with id: {}", templeavesId);
            throw new EntityNotFoundException(String.valueOf(templeavesId));
        }
        return tempLeaves;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public TempLeaves findById(Integer templeavesId) {
        LOGGER.debug("Finding TempLeaves by id: {}", templeavesId);
        return this.wmGenericDao.findById(templeavesId);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public TempLeaves getByEmpIdAndFiscalYearAndMonth(int empId, String fiscalYear, String month) {
        Map<String, Object> empIdAndFiscalYearAndMonthMap = new HashMap<>();
        empIdAndFiscalYearAndMonthMap.put("empId", empId);
        empIdAndFiscalYearAndMonthMap.put("fiscalYear", fiscalYear);
        empIdAndFiscalYearAndMonthMap.put("month", month);

        LOGGER.debug("Finding TempLeaves by unique keys: {}", empIdAndFiscalYearAndMonthMap);
        TempLeaves tempLeaves = this.wmGenericDao.findByUniqueKey(empIdAndFiscalYearAndMonthMap);

        if (tempLeaves == null){
            LOGGER.debug("No TempLeaves found with given unique key values: {}", empIdAndFiscalYearAndMonthMap);
            throw new EntityNotFoundException(String.valueOf(empIdAndFiscalYearAndMonthMap));
        }

        return tempLeaves;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public TempLeaves update(TempLeaves tempLeaves) throws EntityNotFoundException {
        LOGGER.debug("Updating TempLeaves with information: {}", tempLeaves);
        this.wmGenericDao.update(tempLeaves);

        Integer templeavesId = tempLeaves.getRecordId();

        return this.wmGenericDao.findById(templeavesId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public TempLeaves delete(Integer templeavesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting TempLeaves with id: {}", templeavesId);
        TempLeaves deleted = this.wmGenericDao.findById(templeavesId);
        if (deleted == null) {
            LOGGER.debug("No TempLeaves found with id: {}", templeavesId);
            throw new EntityNotFoundException(String.valueOf(templeavesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<TempLeaves> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all TempLeaves");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<TempLeaves> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all TempLeaves");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table TempLeaves to {} format", exportType);
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
