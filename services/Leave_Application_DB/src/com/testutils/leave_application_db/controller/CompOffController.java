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

import com.testutils.leave_application_db.CompOff;
import com.testutils.leave_application_db.service.CompOffService;


/**
 * Controller object for domain model class CompOff.
 * @see CompOff
 */
@RestController("Leave_Application_DB.CompOffController")
@Api(value = "CompOffController", description = "Exposes APIs to work with CompOff resource.")
@RequestMapping("/Leave_Application_DB/CompOff")
public class CompOffController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompOffController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.CompOffService")
	private CompOffService compOffService;

	@ApiOperation(value = "Creates a new CompOff instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public CompOff createCompOff(@RequestBody CompOff compOff) {
		LOGGER.debug("Create CompOff with information: {}" , compOff);

		compOff = compOffService.create(compOff);
		LOGGER.debug("Created CompOff with information: {}" , compOff);

	    return compOff;
	}


    @ApiOperation(value = "Returns the CompOff instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public CompOff getCompOff(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting CompOff with id: {}" , id);

        CompOff foundCompOff = compOffService.getById(id);
        LOGGER.debug("CompOff details with id: {}" , foundCompOff);

        return foundCompOff;
    }

    @ApiOperation(value = "Updates the CompOff instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public CompOff editCompOff(@PathVariable("id") Integer id, @RequestBody CompOff compOff) throws EntityNotFoundException {
        LOGGER.debug("Editing CompOff with id: {}" , compOff.getId());

        compOff.setId(id);
        compOff = compOffService.update(compOff);
        LOGGER.debug("CompOff details with id: {}" , compOff);

        return compOff;
    }

    @ApiOperation(value = "Deletes the CompOff instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteCompOff(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting CompOff with id: {}" , id);

        CompOff deletedCompOff = compOffService.delete(id);

        return deletedCompOff != null;
    }

    /**
     * @deprecated Use {@link #findCompOffs(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of CompOff instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<CompOff> searchCompOffsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering CompOffs list");
        return compOffService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of CompOff instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<CompOff> findCompOffs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering CompOffs list");
        return compOffService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of CompOff instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<CompOff> filterCompOffs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering CompOffs list");
        return compOffService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportCompOffs(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return compOffService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of CompOff instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countCompOffs( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting CompOffs");
		return compOffService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getCompOffAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return compOffService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service CompOffService instance
	 */
	protected void setCompOffService(CompOffService service) {
		this.compOffService = service;
	}

}
