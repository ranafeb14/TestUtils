/*Generated by WaveMaker Studio*/
package com.testutils.testdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
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

import com.testutils.testdb.EmployeeSkillsUtf8UnicodeCi;
import com.testutils.testdb.EmployeeUtf8mb4;


/**
 * ServiceImpl object for domain model class EmployeeUtf8mb4.
 *
 * @see EmployeeUtf8mb4
 */
@Service("TestDB.EmployeeUtf8mb4Service")
@Validated
public class EmployeeUtf8mb4ServiceImpl implements EmployeeUtf8mb4Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeUtf8mb4ServiceImpl.class);

    @Lazy
    @Autowired
	@Qualifier("TestDB.EmployeeSkillsUtf8UnicodeCiService")
	private EmployeeSkillsUtf8UnicodeCiService employeeSkillsUtf8UnicodeCiService;

    @Autowired
    @Qualifier("TestDB.EmployeeUtf8mb4Dao")
    private WMGenericDao<EmployeeUtf8mb4, Long> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<EmployeeUtf8mb4, Long> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "TestDBTransactionManager")
    @Override
	public EmployeeUtf8mb4 create(EmployeeUtf8mb4 employeeUtf8mb4) {
        LOGGER.debug("Creating a new EmployeeUtf8mb4 with information: {}", employeeUtf8mb4);
        EmployeeUtf8mb4 employeeUtf8mb4Created = this.wmGenericDao.create(employeeUtf8mb4);
        if(employeeUtf8mb4Created.getEmployeeSkillsUtf8unicodeCis() != null) {
            for(EmployeeSkillsUtf8UnicodeCi employeeSkillsUtf8unicodeCi : employeeUtf8mb4Created.getEmployeeSkillsUtf8unicodeCis()) {
                employeeSkillsUtf8unicodeCi.setEmployeeUtf8mb4(employeeUtf8mb4Created);
                LOGGER.debug("Creating a new child EmployeeSkillsUtf8UnicodeCi with information: {}", employeeSkillsUtf8unicodeCi);
                employeeSkillsUtf8UnicodeCiService.create(employeeSkillsUtf8unicodeCi);
            }
        }
        return employeeUtf8mb4Created;
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public EmployeeUtf8mb4 getById(Long employeeutf8mb4Id) throws EntityNotFoundException {
        LOGGER.debug("Finding EmployeeUtf8mb4 by id: {}", employeeutf8mb4Id);
        EmployeeUtf8mb4 employeeUtf8mb4 = this.wmGenericDao.findById(employeeutf8mb4Id);
        if (employeeUtf8mb4 == null){
            LOGGER.debug("No EmployeeUtf8mb4 found with id: {}", employeeutf8mb4Id);
            throw new EntityNotFoundException(String.valueOf(employeeutf8mb4Id));
        }
        return employeeUtf8mb4;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public EmployeeUtf8mb4 findById(Long employeeutf8mb4Id) {
        LOGGER.debug("Finding EmployeeUtf8mb4 by id: {}", employeeutf8mb4Id);
        return this.wmGenericDao.findById(employeeutf8mb4Id);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public EmployeeUtf8mb4 getByLdapUid(String ldapUid) {
        Map<String, Object> ldapUidMap = new HashMap<>();
        ldapUidMap.put("ldapUid", ldapUid);

        LOGGER.debug("Finding EmployeeUtf8mb4 by unique keys: {}", ldapUidMap);
        EmployeeUtf8mb4 employeeUtf8mb4 = this.wmGenericDao.findByUniqueKey(ldapUidMap);

        if (employeeUtf8mb4 == null){
            LOGGER.debug("No EmployeeUtf8mb4 found with given unique key values: {}", ldapUidMap);
            throw new EntityNotFoundException(String.valueOf(ldapUidMap));
        }

        return employeeUtf8mb4;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public EmployeeUtf8mb4 getByEmployeeCode(long employeeCode) {
        Map<String, Object> employeeCodeMap = new HashMap<>();
        employeeCodeMap.put("employeeCode", employeeCode);

        LOGGER.debug("Finding EmployeeUtf8mb4 by unique keys: {}", employeeCodeMap);
        EmployeeUtf8mb4 employeeUtf8mb4 = this.wmGenericDao.findByUniqueKey(employeeCodeMap);

        if (employeeUtf8mb4 == null){
            LOGGER.debug("No EmployeeUtf8mb4 found with given unique key values: {}", employeeCodeMap);
            throw new EntityNotFoundException(String.valueOf(employeeCodeMap));
        }

        return employeeUtf8mb4;
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public EmployeeUtf8mb4 getByEmailAndActive(String email, boolean active) {
        Map<String, Object> emailAndActiveMap = new HashMap<>();
        emailAndActiveMap.put("email", email);
        emailAndActiveMap.put("active", active);

        LOGGER.debug("Finding EmployeeUtf8mb4 by unique keys: {}", emailAndActiveMap);
        EmployeeUtf8mb4 employeeUtf8mb4 = this.wmGenericDao.findByUniqueKey(emailAndActiveMap);

        if (employeeUtf8mb4 == null){
            LOGGER.debug("No EmployeeUtf8mb4 found with given unique key values: {}", emailAndActiveMap);
            throw new EntityNotFoundException(String.valueOf(emailAndActiveMap));
        }

        return employeeUtf8mb4;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "TestDBTransactionManager")
	@Override
	public EmployeeUtf8mb4 update(EmployeeUtf8mb4 employeeUtf8mb4) throws EntityNotFoundException {
        LOGGER.debug("Updating EmployeeUtf8mb4 with information: {}", employeeUtf8mb4);
        this.wmGenericDao.update(employeeUtf8mb4);

        Long employeeutf8mb4Id = employeeUtf8mb4.getId();

        return this.wmGenericDao.findById(employeeutf8mb4Id);
    }

    @Transactional(value = "TestDBTransactionManager")
	@Override
	public EmployeeUtf8mb4 delete(Long employeeutf8mb4Id) throws EntityNotFoundException {
        LOGGER.debug("Deleting EmployeeUtf8mb4 with id: {}", employeeutf8mb4Id);
        EmployeeUtf8mb4 deleted = this.wmGenericDao.findById(employeeutf8mb4Id);
        if (deleted == null) {
            LOGGER.debug("No EmployeeUtf8mb4 found with id: {}", employeeutf8mb4Id);
            throw new EntityNotFoundException(String.valueOf(employeeutf8mb4Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "TestDBTransactionManager")
	@Override
	public Page<EmployeeUtf8mb4> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeUtf8mb4s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Page<EmployeeUtf8mb4> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all EmployeeUtf8mb4s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service TestDB for table EmployeeUtf8mb4 to {} format", exportType);
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

    @Transactional(readOnly = true, value = "TestDBTransactionManager")
    @Override
    public Page<EmployeeSkillsUtf8UnicodeCi> findAssociatedEmployeeSkillsUtf8unicodeCis(Long id, Pageable pageable) {
        LOGGER.debug("Fetching all associated employeeSkillsUtf8unicodeCis");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("employeeUtf8mb4.id = '" + id + "'");

        return employeeSkillsUtf8UnicodeCiService.findAll(queryBuilder.toString(), pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service EmployeeSkillsUtf8UnicodeCiService instance
	 */
	protected void setEmployeeSkillsUtf8UnicodeCiService(EmployeeSkillsUtf8UnicodeCiService service) {
        this.employeeSkillsUtf8UnicodeCiService = service;
    }

}

