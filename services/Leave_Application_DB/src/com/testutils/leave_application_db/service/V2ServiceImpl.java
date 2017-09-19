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

import com.testutils.leave_application_db.V2;
import com.testutils.leave_application_db.V2Id;


/**
 * ServiceImpl object for domain model class V2.
 *
 * @see V2
 */
@Service("Leave_Application_DB.V2Service")
public class V2ServiceImpl implements V2Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(V2ServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.V2Dao")
    private WMGenericDao<V2, V2Id> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<V2, V2Id> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public V2 create(V2 v2) {
        LOGGER.debug("Creating a new V2 with information: {}", v2);
        V2 v2Created = this.wmGenericDao.create(v2);
        return v2Created;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public V2 getById(V2Id v2Id) throws EntityNotFoundException {
        LOGGER.debug("Finding V2 by id: {}", v2Id);
        V2 v2 = this.wmGenericDao.findById(v2Id);
        if (v2 == null){
            LOGGER.debug("No V2 found with id: {}", v2Id);
            throw new EntityNotFoundException(String.valueOf(v2Id));
        }
        return v2;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public V2 findById(V2Id v2Id) {
        LOGGER.debug("Finding V2 by id: {}", v2Id);
        return this.wmGenericDao.findById(v2Id);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public V2 update(V2 v2) throws EntityNotFoundException {
        LOGGER.debug("Updating V2 with information: {}", v2);
        this.wmGenericDao.update(v2);

        V2Id v2Id = new V2Id();
        v2Id.setEmpId(v2.getEmpId());
        v2Id.setRoleId(v2.getRoleId());

        return this.wmGenericDao.findById(v2Id);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public V2 delete(V2Id v2Id) throws EntityNotFoundException {
        LOGGER.debug("Deleting V2 with id: {}", v2Id);
        V2 deleted = this.wmGenericDao.findById(v2Id);
        if (deleted == null) {
            LOGGER.debug("No V2 found with id: {}", v2Id);
            throw new EntityNotFoundException(String.valueOf(v2Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<V2> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all V2s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<V2> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all V2s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table V2 to {} format", exportType);
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
