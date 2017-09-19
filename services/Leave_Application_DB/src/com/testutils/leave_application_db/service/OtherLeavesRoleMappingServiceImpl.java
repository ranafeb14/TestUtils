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

import com.testutils.leave_application_db.OtherLeavesRoleMapping;


/**
 * ServiceImpl object for domain model class OtherLeavesRoleMapping.
 *
 * @see OtherLeavesRoleMapping
 */
@Service("Leave_Application_DB.OtherLeavesRoleMappingService")
public class OtherLeavesRoleMappingServiceImpl implements OtherLeavesRoleMappingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OtherLeavesRoleMappingServiceImpl.class);


    @Autowired
    @Qualifier("Leave_Application_DB.OtherLeavesRoleMappingDao")
    private WMGenericDao<OtherLeavesRoleMapping, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<OtherLeavesRoleMapping, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
    @Override
	public OtherLeavesRoleMapping create(OtherLeavesRoleMapping otherLeavesRoleMapping) {
        LOGGER.debug("Creating a new OtherLeavesRoleMapping with information: {}", otherLeavesRoleMapping);
        OtherLeavesRoleMapping otherLeavesRoleMappingCreated = this.wmGenericDao.create(otherLeavesRoleMapping);
        return otherLeavesRoleMappingCreated;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public OtherLeavesRoleMapping getById(Integer otherleavesrolemappingId) throws EntityNotFoundException {
        LOGGER.debug("Finding OtherLeavesRoleMapping by id: {}", otherleavesrolemappingId);
        OtherLeavesRoleMapping otherLeavesRoleMapping = this.wmGenericDao.findById(otherleavesrolemappingId);
        if (otherLeavesRoleMapping == null){
            LOGGER.debug("No OtherLeavesRoleMapping found with id: {}", otherleavesrolemappingId);
            throw new EntityNotFoundException(String.valueOf(otherleavesrolemappingId));
        }
        return otherLeavesRoleMapping;
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public OtherLeavesRoleMapping findById(Integer otherleavesrolemappingId) {
        LOGGER.debug("Finding OtherLeavesRoleMapping by id: {}", otherleavesrolemappingId);
        return this.wmGenericDao.findById(otherleavesrolemappingId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "Leave_Application_DBTransactionManager")
	@Override
	public OtherLeavesRoleMapping update(OtherLeavesRoleMapping otherLeavesRoleMapping) throws EntityNotFoundException {
        LOGGER.debug("Updating OtherLeavesRoleMapping with information: {}", otherLeavesRoleMapping);
        this.wmGenericDao.update(otherLeavesRoleMapping);

        Integer otherleavesrolemappingId = otherLeavesRoleMapping.getId();

        return this.wmGenericDao.findById(otherleavesrolemappingId);
    }

    @Transactional(value = "Leave_Application_DBTransactionManager")
	@Override
	public OtherLeavesRoleMapping delete(Integer otherleavesrolemappingId) throws EntityNotFoundException {
        LOGGER.debug("Deleting OtherLeavesRoleMapping with id: {}", otherleavesrolemappingId);
        OtherLeavesRoleMapping deleted = this.wmGenericDao.findById(otherleavesrolemappingId);
        if (deleted == null) {
            LOGGER.debug("No OtherLeavesRoleMapping found with id: {}", otherleavesrolemappingId);
            throw new EntityNotFoundException(String.valueOf(otherleavesrolemappingId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
	@Override
	public Page<OtherLeavesRoleMapping> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all OtherLeavesRoleMappings");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Page<OtherLeavesRoleMapping> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all OtherLeavesRoleMappings");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "Leave_Application_DBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service Leave_Application_DB for table OtherLeavesRoleMapping to {} format", exportType);
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
