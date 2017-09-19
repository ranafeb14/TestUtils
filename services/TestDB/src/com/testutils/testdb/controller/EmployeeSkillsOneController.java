/*Generated by WaveMaker Studio*/
package com.testutils.testdb.controller;

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

import com.testutils.testdb.EmployeeSkillsOne;
import com.testutils.testdb.service.EmployeeSkillsOneService;


/**
 * Controller object for domain model class EmployeeSkillsOne.
 * @see EmployeeSkillsOne
 */
@RestController("TestDB.EmployeeSkillsOneController")
@Api(value = "EmployeeSkillsOneController", description = "Exposes APIs to work with EmployeeSkillsOne resource.")
@RequestMapping("/TestDB/EmployeeSkillsOne")
public class EmployeeSkillsOneController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeSkillsOneController.class);

    @Autowired
	@Qualifier("TestDB.EmployeeSkillsOneService")
	private EmployeeSkillsOneService employeeSkillsOneService;

	@ApiOperation(value = "Creates a new EmployeeSkillsOne instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public EmployeeSkillsOne createEmployeeSkillsOne(@RequestBody EmployeeSkillsOne employeeSkillsOne) {
		LOGGER.debug("Create EmployeeSkillsOne with information: {}" , employeeSkillsOne);

		employeeSkillsOne = employeeSkillsOneService.create(employeeSkillsOne);
		LOGGER.debug("Created EmployeeSkillsOne with information: {}" , employeeSkillsOne);

	    return employeeSkillsOne;
	}


    @ApiOperation(value = "Returns the EmployeeSkillsOne instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public EmployeeSkillsOne getEmployeeSkillsOne(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting EmployeeSkillsOne with id: {}" , id);

        EmployeeSkillsOne foundEmployeeSkillsOne = employeeSkillsOneService.getById(id);
        LOGGER.debug("EmployeeSkillsOne details with id: {}" , foundEmployeeSkillsOne);

        return foundEmployeeSkillsOne;
    }

    @ApiOperation(value = "Updates the EmployeeSkillsOne instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public EmployeeSkillsOne editEmployeeSkillsOne(@PathVariable("id") Integer id, @RequestBody EmployeeSkillsOne employeeSkillsOne) throws EntityNotFoundException {
        LOGGER.debug("Editing EmployeeSkillsOne with id: {}" , employeeSkillsOne.getId());

        employeeSkillsOne.setId(id);
        employeeSkillsOne = employeeSkillsOneService.update(employeeSkillsOne);
        LOGGER.debug("EmployeeSkillsOne details with id: {}" , employeeSkillsOne);

        return employeeSkillsOne;
    }

    @ApiOperation(value = "Deletes the EmployeeSkillsOne instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteEmployeeSkillsOne(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting EmployeeSkillsOne with id: {}" , id);

        EmployeeSkillsOne deletedEmployeeSkillsOne = employeeSkillsOneService.delete(id);

        return deletedEmployeeSkillsOne != null;
    }

    /**
     * @deprecated Use {@link #findEmployeeSkillsOnes(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of EmployeeSkillsOne instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmployeeSkillsOne> searchEmployeeSkillsOnesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering EmployeeSkillsOnes list");
        return employeeSkillsOneService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of EmployeeSkillsOne instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmployeeSkillsOne> findEmployeeSkillsOnes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering EmployeeSkillsOnes list");
        return employeeSkillsOneService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of EmployeeSkillsOne instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmployeeSkillsOne> filterEmployeeSkillsOnes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering EmployeeSkillsOnes list");
        return employeeSkillsOneService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportEmployeeSkillsOnes(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return employeeSkillsOneService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of EmployeeSkillsOne instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countEmployeeSkillsOnes( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting EmployeeSkillsOnes");
		return employeeSkillsOneService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getEmployeeSkillsOneAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return employeeSkillsOneService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service EmployeeSkillsOneService instance
	 */
	protected void setEmployeeSkillsOneService(EmployeeSkillsOneService service) {
		this.employeeSkillsOneService = service;
	}

}
