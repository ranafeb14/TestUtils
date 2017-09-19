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

import com.testutils.leave_application_db.Appraisal;


/**
 * ServiceImpl object for domain model class Appraisal.
 *
 * @see Appraisal
 */
@Service("Leave_Application_DB.AppraisalService")
public class AppraisalServiceImpl implements AppraisalService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppraisalServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.AppraisalDao")
    private WMGenericDao<Appraisal, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Appraisal, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public Appraisal create(Appraisal appraisal) {
        LOGGER.debug("Creating a new Appraisal with information: {}", appraisal);
        Appraisal appraisalCreated = this.wmGenericDao.create(appraisal);
        return appraisalCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Appraisal getById(Integer appraisalId) throws EntityNotFoundException {
        LOGGER.debug("Finding Appraisal by id: {}", appraisalId);
        Appraisal appraisal = this.wmGenericDao.findById(appraisalId);
        if (appraisal == null){
            LOGGER.debug("No Appraisal found with id: {}", appraisalId);
            throw new EntityNotFoundException(String.valueOf(appraisalId));
        }
        return appraisal;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Appraisal findById(Integer appraisalId) {
        LOGGER.debug("Finding Appraisal by id: {}", appraisalId);
        return this.wmGenericDao.findById(appraisalId);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Appraisal getByUniqueKeyId(int id) {
        Map<String, Object> uniqueKeyIdMap = new HashMap<>();
        uniqueKeyIdMap.put("id", id);

        LOGGER.debug("Finding Appraisal by unique keys: {}", uniqueKeyIdMap);
        Appraisal appraisal = this.wmGenericDao.findByUniqueKey(uniqueKeyIdMap);

        if (appraisal == null){
            LOGGER.debug("No Appraisal found with given unique key values: {}", uniqueKeyIdMap);
            throw new EntityNotFoundException(String.valueOf(uniqueKeyIdMap));
        }

        return appraisal;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public Appraisal update(Appraisal appraisal) throws EntityNotFoundException {
        LOGGER.debug("Updating Appraisal with information: {}", appraisal);
        this.wmGenericDao.update(appraisal);

        Integer appraisalId = appraisal.getId();

        return this.wmGenericDao.findById(appraisalId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public Appraisal delete(Integer appraisalId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Appraisal with id: {}", appraisalId);
        Appraisal deleted = this.wmGenericDao.findById(appraisalId);
        if (deleted == null) {
            LOGGER.debug("No Appraisal found with id: {}", appraisalId);
            throw new EntityNotFoundException(String.valueOf(appraisalId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<Appraisal> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Appraisals");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<Appraisal> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Appraisals");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table Appraisal to {} format", exportType);
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

