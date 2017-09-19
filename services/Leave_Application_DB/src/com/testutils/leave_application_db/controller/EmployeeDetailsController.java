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

import com.testutils.leave_application_db.AccruedElapsedLeaves;
import com.testutils.leave_application_db.EmployeeDetails;
import com.testutils.leave_application_db.service.EmployeeDetailsService;


/**
 * Controller object for domain model class EmployeeDetails.
 * @see EmployeeDetails
 */
@RestController("Leave_Application_DB.EmployeeDetailsController")
@Api(value = "EmployeeDetailsController", description = "Exposes APIs to work with EmployeeDetails resource.")
@RequestMapping("/Leave_Application_DB/EmployeeDetails")
public class EmployeeDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDetailsController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.EmployeeDetailsService")
	private EmployeeDetailsService employeeDetailsService;

	@ApiOperation(value = "Creates a new EmployeeDetails instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public EmployeeDetails createEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
		LOGGER.debug("Create EmployeeDetails with information: {}" , employeeDetails);

		employeeDetails = employeeDetailsService.create(employeeDetails);
		LOGGER.debug("Created EmployeeDetails with information: {}" , employeeDetails);

	    return employeeDetails;
	}


    @ApiOperation(value = "Returns the EmployeeDetails instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public EmployeeDetails getEmployeeDetails(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting EmployeeDetails with id: {}" , id);

        EmployeeDetails foundEmployeeDetails = employeeDetailsService.getById(id);
        LOGGER.debug("EmployeeDetails details with id: {}" , foundEmployeeDetails);

        return foundEmployeeDetails;
    }

    @ApiOperation(value = "Updates the EmployeeDetails instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public EmployeeDetails editEmployeeDetails(@PathVariable("id") Integer id, @RequestBody EmployeeDetails employeeDetails) throws EntityNotFoundException {
        LOGGER.debug("Editing EmployeeDetails with id: {}" , employeeDetails.getEmployeeId());

        employeeDetails.setEmployeeId(id);
        employeeDetails = employeeDetailsService.update(employeeDetails);
        LOGGER.debug("EmployeeDetails details with id: {}" , employeeDetails);

        return employeeDetails;
    }

    @ApiOperation(value = "Deletes the EmployeeDetails instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteEmployeeDetails(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting EmployeeDetails with id: {}" , id);

        EmployeeDetails deletedEmployeeDetails = employeeDetailsService.delete(id);

        return deletedEmployeeDetails != null;
    }

    /**
     * @deprecated Use {@link #findEmployeeDetails(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of EmployeeDetails instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmployeeDetails> searchEmployeeDetailsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering EmployeeDetails list");
        return employeeDetailsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of EmployeeDetails instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmployeeDetails> findEmployeeDetails(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering EmployeeDetails list");
        return employeeDetailsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of EmployeeDetails instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmployeeDetails> filterEmployeeDetails(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering EmployeeDetails list");
        return employeeDetailsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportEmployeeDetails(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return employeeDetailsService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of EmployeeDetails instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countEmployeeDetails( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting EmployeeDetails");
		return employeeDetailsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getEmployeeDetailsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return employeeDetailsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/accruedElapsedLeaveses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the accruedElapsedLeaveses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AccruedElapsedLeaves> findAssociatedAccruedElapsedLeaveses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated accruedElapsedLeaveses");
        return employeeDetailsService.findAssociatedAccruedElapsedLeaveses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service EmployeeDetailsService instance
	 */
	protected void setEmployeeDetailsService(EmployeeDetailsService service) {
		this.employeeDetailsService = service;
	}

}

