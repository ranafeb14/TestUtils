/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.math.BigInteger;
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

import com.testutils.leave_application_db.TestEmployeeDetails;
import com.testutils.leave_application_db.service.TestEmployeeDetailsService;


/**
 * Controller object for domain model class TestEmployeeDetails.
 * @see TestEmployeeDetails
 */
@RestController("Leave_Application_DB.TestEmployeeDetailsController")
@Api(value = "TestEmployeeDetailsController", description = "Exposes APIs to work with TestEmployeeDetails resource.")
@RequestMapping("/Leave_Application_DB/TestEmployeeDetails")
public class TestEmployeeDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestEmployeeDetailsController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.TestEmployeeDetailsService")
	private TestEmployeeDetailsService testEmployeeDetailsService;

	@ApiOperation(value = "Creates a new TestEmployeeDetails instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public TestEmployeeDetails createTestEmployeeDetails(@RequestBody TestEmployeeDetails testEmployeeDetails) {
		LOGGER.debug("Create TestEmployeeDetails with information: {}" , testEmployeeDetails);

		testEmployeeDetails = testEmployeeDetailsService.create(testEmployeeDetails);
		LOGGER.debug("Created TestEmployeeDetails with information: {}" , testEmployeeDetails);

	    return testEmployeeDetails;
	}


    @ApiOperation(value = "Returns the TestEmployeeDetails instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TestEmployeeDetails getTestEmployeeDetails(@PathVariable("id") BigInteger id) throws EntityNotFoundException {
        LOGGER.debug("Getting TestEmployeeDetails with id: {}" , id);

        TestEmployeeDetails foundTestEmployeeDetails = testEmployeeDetailsService.getById(id);
        LOGGER.debug("TestEmployeeDetails details with id: {}" , foundTestEmployeeDetails);

        return foundTestEmployeeDetails;
    }

    @ApiOperation(value = "Updates the TestEmployeeDetails instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TestEmployeeDetails editTestEmployeeDetails(@PathVariable("id") BigInteger id, @RequestBody TestEmployeeDetails testEmployeeDetails) throws EntityNotFoundException {
        LOGGER.debug("Editing TestEmployeeDetails with id: {}" , testEmployeeDetails.getId());

        testEmployeeDetails.setId(id);
        testEmployeeDetails = testEmployeeDetailsService.update(testEmployeeDetails);
        LOGGER.debug("TestEmployeeDetails details with id: {}" , testEmployeeDetails);

        return testEmployeeDetails;
    }

    @ApiOperation(value = "Deletes the TestEmployeeDetails instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTestEmployeeDetails(@PathVariable("id") BigInteger id) throws EntityNotFoundException {
        LOGGER.debug("Deleting TestEmployeeDetails with id: {}" , id);

        TestEmployeeDetails deletedTestEmployeeDetails = testEmployeeDetailsService.delete(id);

        return deletedTestEmployeeDetails != null;
    }

    /**
     * @deprecated Use {@link #findTestEmployeeDetails(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of TestEmployeeDetails instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TestEmployeeDetails> searchTestEmployeeDetailsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TestEmployeeDetails list");
        return testEmployeeDetailsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TestEmployeeDetails instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TestEmployeeDetails> findTestEmployeeDetails(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TestEmployeeDetails list");
        return testEmployeeDetailsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TestEmployeeDetails instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TestEmployeeDetails> filterTestEmployeeDetails(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TestEmployeeDetails list");
        return testEmployeeDetailsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTestEmployeeDetails(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return testEmployeeDetailsService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of TestEmployeeDetails instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTestEmployeeDetails( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting TestEmployeeDetails");
		return testEmployeeDetailsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTestEmployeeDetailsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return testEmployeeDetailsService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TestEmployeeDetailsService instance
	 */
	protected void setTestEmployeeDetailsService(TestEmployeeDetailsService service) {
		this.testEmployeeDetailsService = service;
	}

}
