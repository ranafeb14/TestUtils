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

import com.testutils.leave_application_db.Appraisal;
import com.testutils.leave_application_db.service.AppraisalService;


/**
 * Controller object for domain model class Appraisal.
 * @see Appraisal
 */
@RestController("Leave_Application_DB.AppraisalController")
@Api(value = "AppraisalController", description = "Exposes APIs to work with Appraisal resource.")
@RequestMapping("/Leave_Application_DB/Appraisal")
public class AppraisalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppraisalController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.AppraisalService")
	private AppraisalService appraisalService;

	@ApiOperation(value = "Creates a new Appraisal instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Appraisal createAppraisal(@RequestBody Appraisal appraisal) {
		LOGGER.debug("Create Appraisal with information: {}" , appraisal);

		appraisal = appraisalService.create(appraisal);
		LOGGER.debug("Created Appraisal with information: {}" , appraisal);

	    return appraisal;
	}


    @ApiOperation(value = "Returns the Appraisal instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Appraisal getAppraisal(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Appraisal with id: {}" , id);

        Appraisal foundAppraisal = appraisalService.getById(id);
        LOGGER.debug("Appraisal details with id: {}" , foundAppraisal);

        return foundAppraisal;
    }

    @ApiOperation(value = "Updates the Appraisal instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Appraisal editAppraisal(@PathVariable("id") Integer id, @RequestBody Appraisal appraisal) throws EntityNotFoundException {
        LOGGER.debug("Editing Appraisal with id: {}" , appraisal.getId());

        appraisal.setId(id);
        appraisal = appraisalService.update(appraisal);
        LOGGER.debug("Appraisal details with id: {}" , appraisal);

        return appraisal;
    }

    @ApiOperation(value = "Deletes the Appraisal instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAppraisal(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Appraisal with id: {}" , id);

        Appraisal deletedAppraisal = appraisalService.delete(id);

        return deletedAppraisal != null;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the matching Appraisal with given unique key values.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Appraisal getByUniqueKeyId(@PathVariable("id") int id) {
        LOGGER.debug("Getting Appraisal with uniques key UniqueKeyId");
        return appraisalService.getByUniqueKeyId(id);
    }

    /**
     * @deprecated Use {@link #findAppraisals(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Appraisal instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Appraisal> searchAppraisalsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Appraisals list");
        return appraisalService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Appraisal instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Appraisal> findAppraisals(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Appraisals list");
        return appraisalService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Appraisal instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Appraisal> filterAppraisals(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Appraisals list");
        return appraisalService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportAppraisals(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return appraisalService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of Appraisal instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countAppraisals( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Appraisals");
		return appraisalService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getAppraisalAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return appraisalService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AppraisalService instance
	 */
	protected void setAppraisalService(AppraisalService service) {
		this.appraisalService = service;
	}

}
