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

import com.testutils.leave_application_db.LeaveApplication;
import com.testutils.leave_application_db.service.LeaveApplicationService;


/**
 * Controller object for domain model class LeaveApplication.
 * @see LeaveApplication
 */
@RestController("Leave_Application_DB.LeaveApplicationController")
@Api(value = "LeaveApplicationController", description = "Exposes APIs to work with LeaveApplication resource.")
@RequestMapping("/Leave_Application_DB/LeaveApplication")
public class LeaveApplicationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LeaveApplicationController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.LeaveApplicationService")
	private LeaveApplicationService leaveApplicationService;

	@ApiOperation(value = "Creates a new LeaveApplication instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public LeaveApplication createLeaveApplication(@RequestBody LeaveApplication leaveApplication) {
		LOGGER.debug("Create LeaveApplication with information: {}" , leaveApplication);

		leaveApplication = leaveApplicationService.create(leaveApplication);
		LOGGER.debug("Created LeaveApplication with information: {}" , leaveApplication);

	    return leaveApplication;
	}


    @ApiOperation(value = "Returns the LeaveApplication instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public LeaveApplication getLeaveApplication(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting LeaveApplication with id: {}" , id);

        LeaveApplication foundLeaveApplication = leaveApplicationService.getById(id);
        LOGGER.debug("LeaveApplication details with id: {}" , foundLeaveApplication);

        return foundLeaveApplication;
    }

    @ApiOperation(value = "Updates the LeaveApplication instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public LeaveApplication editLeaveApplication(@PathVariable("id") Integer id, @RequestBody LeaveApplication leaveApplication) throws EntityNotFoundException {
        LOGGER.debug("Editing LeaveApplication with id: {}" , leaveApplication.getRecordId());

        leaveApplication.setRecordId(id);
        leaveApplication = leaveApplicationService.update(leaveApplication);
        LOGGER.debug("LeaveApplication details with id: {}" , leaveApplication);

        return leaveApplication;
    }

    @ApiOperation(value = "Deletes the LeaveApplication instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteLeaveApplication(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting LeaveApplication with id: {}" , id);

        LeaveApplication deletedLeaveApplication = leaveApplicationService.delete(id);

        return deletedLeaveApplication != null;
    }

    /**
     * @deprecated Use {@link #findLeaveApplications(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of LeaveApplication instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<LeaveApplication> searchLeaveApplicationsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering LeaveApplications list");
        return leaveApplicationService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of LeaveApplication instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<LeaveApplication> findLeaveApplications(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering LeaveApplications list");
        return leaveApplicationService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of LeaveApplication instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<LeaveApplication> filterLeaveApplications(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering LeaveApplications list");
        return leaveApplicationService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportLeaveApplications(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return leaveApplicationService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of LeaveApplication instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countLeaveApplications( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting LeaveApplications");
		return leaveApplicationService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getLeaveApplicationAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return leaveApplicationService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service LeaveApplicationService instance
	 */
	protected void setLeaveApplicationService(LeaveApplicationService service) {
		this.leaveApplicationService = service;
	}

}
