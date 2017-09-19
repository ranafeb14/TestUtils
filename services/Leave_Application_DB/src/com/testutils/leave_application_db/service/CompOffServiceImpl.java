/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.service;

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

import com.testutils.leave_application_db.CompOff;


/**
 * ServiceImpl object for domain model class CompOff.
 *
 * @see CompOff
 */
@Service("Leave_Application_DB.CompOffService")
public class CompOffServiceImpl implements CompOffService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompOffServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.CompOffDao")
    private WMGenericDao<CompOff, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<CompOff, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public CompOff create(CompOff compOff) {
        LOGGER.debug("Creating a new CompOff with information: {}", compOff);
        CompOff compOffCreated = this.wmGenericDao.create(compOff);
        return compOffCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public CompOff getById(Integer compoffId) throws EntityNotFoundException {
        LOGGER.debug("Finding CompOff by id: {}", compoffId);
        CompOff compOff = this.wmGenericDao.findById(compoffId);
        if (compOff == null){
            LOGGER.debug("No CompOff found with id: {}", compoffId);
            throw new EntityNotFoundException(String.valueOf(compoffId));
        }
        return compOff;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public CompOff findById(Integer compoffId) {
        LOGGER.debug("Finding CompOff by id: {}", compoffId);
        return this.wmGenericDao.findById(compoffId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public CompOff update(CompOff compOff) throws EntityNotFoundException {
        LOGGER.debug("Updating CompOff with information: {}", compOff);
        this.wmGenericDao.update(compOff);

        Integer compoffId = compOff.getId();

        return this.wmGenericDao.findById(compoffId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public CompOff delete(Integer compoffId) throws EntityNotFoundException {
        LOGGER.debug("Deleting CompOff with id: {}", compoffId);
        CompOff deleted = this.wmGenericDao.findById(compoffId);
        if (deleted == null) {
            LOGGER.debug("No CompOff found with id: {}", compoffId);
            throw new EntityNotFoundException(String.valueOf(compoffId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<CompOff> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all CompOffs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<CompOff> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all CompOffs");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table CompOff to {} format", exportType);
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
