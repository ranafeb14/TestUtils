/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testutils.leave_application_db.Audit;
import com.testutils.leave_application_db.service.AuditService;


/**
 * Controller object for domain model class Audit.
 * @see Audit
 */
@RestController("Leave_Application_DB.AuditController")
@Api(value = "AuditController", description = "Exposes APIs to work with Audit resource.")
@RequestMapping("/Leave_Application_DB/Audit")
public class AuditController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuditController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.AuditService")
	private AuditService auditService;

	@ApiOperation(value = "Creates a new Audit instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Audit createAudit(@RequestBody Audit audit) {
		LOGGER.debug("Create Audit with information: {}" , audit);

		audit = auditService.create(audit);
		LOGGER.debug("Created Audit with information: {}" , audit);

	    return audit;
	}


    @ApiOperation(value = "Returns the Audit instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Audit getAudit(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Audit with id: {}" , id);

        Audit foundAudit = auditService.getById(id);
        LOGGER.debug("Audit details with id: {}" , foundAudit);

        return foundAudit;
    }

    @ApiOperation(value = "Updates the Audit instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Audit editAudit(@PathVariable("id") Integer id, @RequestBody Audit audit) throws EntityNotFoundException {
        LOGGER.debug("Editing Audit with id: {}" , audit.getId());

        audit.setId(id);
        audit = auditService.update(audit);
        LOGGER.debug("Audit details with id: {}" , audit);

        return audit;
    }

    @ApiOperation(value = "Deletes the Audit instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAudit(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Audit with id: {}" , id);

        Audit deletedAudit = auditService.delete(id);

        return deletedAudit != null;
    }

    /**
     * @deprecated Use {@link #findAudits(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Audit instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Audit> searchAuditsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Audits list");
        return auditService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Audit instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Audit> findAudits(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Audits list");
        return auditService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Audit instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Audit> filterAudits(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Audits list");
        return auditService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportAudits(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return auditService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of Audit instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countAudits( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Audits");
		return auditService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getAuditAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return auditService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AuditService instance
	 */
	protected void setAuditService(AuditService service) {
		this.auditService = service;
	}

}

