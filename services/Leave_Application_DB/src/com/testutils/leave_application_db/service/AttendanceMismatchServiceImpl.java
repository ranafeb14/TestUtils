/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;
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

import com.testutils.leave_application_db.AttendanceMismatch;


/**
 * ServiceImpl object for domain model class AttendanceMismatch.
 *
 * @see AttendanceMismatch
 */
@Service("Leave_Application_DB.AttendanceMismatchService")
public class AttendanceMismatchServiceImpl implements AttendanceMismatchService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AttendanceMismatchServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.AttendanceMismatchDao")
    private WMGenericDao<AttendanceMismatch, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<AttendanceMismatch, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public AttendanceMismatch create(AttendanceMismatch attendanceMismatch) {
        LOGGER.debug("Creating a new AttendanceMismatch with information: {}", attendanceMismatch);
        AttendanceMismatch attendanceMismatchCreated = this.wmGenericDao.create(attendanceMismatch);
        return attendanceMismatchCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public AttendanceMismatch getById(Integer attendancemismatchId) throws EntityNotFoundException {
        LOGGER.debug("Finding AttendanceMismatch by id: {}", attendancemismatchId);
        AttendanceMismatch attendanceMismatch = this.wmGenericDao.findById(attendancemismatchId);
        if (attendanceMismatch == null){
            LOGGER.debug("No AttendanceMismatch found with id: {}", attendancemismatchId);
            throw new EntityNotFoundException(String.valueOf(attendancemismatchId));
        }
        return attendanceMismatch;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public AttendanceMismatch findById(Integer attendancemismatchId) {
        LOGGER.debug("Finding AttendanceMismatch by id: {}", attendancemismatchId);
        return this.wmGenericDao.findById(attendancemismatchId);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public AttendanceMismatch getByEmployeeIdAndMismatchedDate(int employeeId, Date mismatchedDate) {
        Map<String, Object> employeeIdAndMismatchedDateMap = new HashMap<>();
        employeeIdAndMismatchedDateMap.put("employeeId", employeeId);
        employeeIdAndMismatchedDateMap.put("mismatchedDate", mismatchedDate);

        LOGGER.debug("Finding AttendanceMismatch by unique keys: {}", employeeIdAndMismatchedDateMap);
        AttendanceMismatch attendanceMismatch = this.wmGenericDao.findByUniqueKey(employeeIdAndMismatchedDateMap);

        if (attendanceMismatch == null){
            LOGGER.debug("No AttendanceMismatch found with given unique key values: {}", employeeIdAndMismatchedDateMap);
            throw new EntityNotFoundException(String.valueOf(employeeIdAndMismatchedDateMap));
        }

        return attendanceMismatch;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public AttendanceMismatch update(AttendanceMismatch attendanceMismatch) throws EntityNotFoundException {
        LOGGER.debug("Updating AttendanceMismatch with information: {}", attendanceMismatch);
        this.wmGenericDao.update(attendanceMismatch);

        Integer attendancemismatchId = attendanceMismatch.getId();

        return this.wmGenericDao.findById(attendancemismatchId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public AttendanceMismatch delete(Integer attendancemismatchId) throws EntityNotFoundException {
        LOGGER.debug("Deleting AttendanceMismatch with id: {}", attendancemismatchId);
        AttendanceMismatch deleted = this.wmGenericDao.findById(attendancemismatchId);
        if (deleted == null) {
            LOGGER.debug("No AttendanceMismatch found with id: {}", attendancemismatchId);
            throw new EntityNotFoundException(String.valueOf(attendancemismatchId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<AttendanceMismatch> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all AttendanceMismatches");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<AttendanceMismatch> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all AttendanceMismatches");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table AttendanceMismatch to {} format", exportType);
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
