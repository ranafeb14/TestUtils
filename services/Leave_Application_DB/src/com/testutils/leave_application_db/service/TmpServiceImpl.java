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

import com.testutils.leave_application_db.Tmp;


/**
 * ServiceImpl object for domain model class Tmp.
 *
 * @see Tmp
 */
@Service("Leave_Application_DB.TmpService")
public class TmpServiceImpl implements TmpService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TmpServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.TmpDao")
    private WMGenericDao<Tmp, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Tmp, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public Tmp create(Tmp tmp) {
        LOGGER.debug("Creating a new Tmp with information: {}", tmp);
        Tmp tmpCreated = this.wmGenericDao.create(tmp);
        return tmpCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Tmp getById(Integer tmpId) throws EntityNotFoundException {
        LOGGER.debug("Finding Tmp by id: {}", tmpId);
        Tmp tmp = this.wmGenericDao.findById(tmpId);
        if (tmp == null){
            LOGGER.debug("No Tmp found with id: {}", tmpId);
            throw new EntityNotFoundException(String.valueOf(tmpId));
        }
        return tmp;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Tmp findById(Integer tmpId) {
        LOGGER.debug("Finding Tmp by id: {}", tmpId);
        return this.wmGenericDao.findById(tmpId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public Tmp update(Tmp tmp) throws EntityNotFoundException {
        LOGGER.debug("Updating Tmp with information: {}", tmp);
        this.wmGenericDao.update(tmp);

        Integer tmpId = tmp.getId();

        return this.wmGenericDao.findById(tmpId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public Tmp delete(Integer tmpId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Tmp with id: {}", tmpId);
        Tmp deleted = this.wmGenericDao.findById(tmpId);
        if (deleted == null) {
            LOGGER.debug("No Tmp found with id: {}", tmpId);
            throw new EntityNotFoundException(String.valueOf(tmpId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<Tmp> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Tmps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<Tmp> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Tmps");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table Tmp to {} format", exportType);
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
