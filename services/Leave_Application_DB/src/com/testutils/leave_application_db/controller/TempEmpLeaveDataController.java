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

import com.testutils.leave_application_db.TempEmpLeaveData;
import com.testutils.leave_application_db.service.TempEmpLeaveDataService;


/**
 * Controller object for domain model class TempEmpLeaveData.
 * @see TempEmpLeaveData
 */
@RestController("Leave_Application_DB.TempEmpLeaveDataController")
@Api(value = "TempEmpLeaveDataController", description = "Exposes APIs to work with TempEmpLeaveData resource.")
@RequestMapping("/Leave_Application_DB/TempEmpLeaveData")
public class TempEmpLeaveDataController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TempEmpLeaveDataController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.TempEmpLeaveDataService")
	private TempEmpLeaveDataService tempEmpLeaveDataService;

	@ApiOperation(value = "Creates a new TempEmpLeaveData instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public TempEmpLeaveData createTempEmpLeaveData(@RequestBody TempEmpLeaveData tempEmpLeaveData) {
		LOGGER.debug("Create TempEmpLeaveData with information: {}" , tempEmpLeaveData);

		tempEmpLeaveData = tempEmpLeaveDataService.create(tempEmpLeaveData);
		LOGGER.debug("Created TempEmpLeaveData with information: {}" , tempEmpLeaveData);

	    return tempEmpLeaveData;
	}


    @ApiOperation(value = "Returns the TempEmpLeaveData instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TempEmpLeaveData getTempEmpLeaveData(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting TempEmpLeaveData with id: {}" , id);

        TempEmpLeaveData foundTempEmpLeaveData = tempEmpLeaveDataService.getById(id);
        LOGGER.debug("TempEmpLeaveData details with id: {}" , foundTempEmpLeaveData);

        return foundTempEmpLeaveData;
    }

    @ApiOperation(value = "Updates the TempEmpLeaveData instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TempEmpLeaveData editTempEmpLeaveData(@PathVariable("id") Integer id, @RequestBody TempEmpLeaveData tempEmpLeaveData) throws EntityNotFoundException {
        LOGGER.debug("Editing TempEmpLeaveData with id: {}" , tempEmpLeaveData.getRecordId());

        tempEmpLeaveData.setRecordId(id);
        tempEmpLeaveData = tempEmpLeaveDataService.update(tempEmpLeaveData);
        LOGGER.debug("TempEmpLeaveData details with id: {}" , tempEmpLeaveData);

        return tempEmpLeaveData;
    }

    @ApiOperation(value = "Deletes the TempEmpLeaveData instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTempEmpLeaveData(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting TempEmpLeaveData with id: {}" , id);

        TempEmpLeaveData deletedTempEmpLeaveData = tempEmpLeaveDataService.delete(id);

        return deletedTempEmpLeaveData != null;
    }

    /**
     * @deprecated Use {@link #findTempEmpLeaveDatas(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of TempEmpLeaveData instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TempEmpLeaveData> searchTempEmpLeaveDatasByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TempEmpLeaveDatas list");
        return tempEmpLeaveDataService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TempEmpLeaveData instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TempEmpLeaveData> findTempEmpLeaveDatas(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TempEmpLeaveDatas list");
        return tempEmpLeaveDataService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TempEmpLeaveData instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TempEmpLeaveData> filterTempEmpLeaveDatas(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TempEmpLeaveDatas list");
        return tempEmpLeaveDataService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTempEmpLeaveDatas(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return tempEmpLeaveDataService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of TempEmpLeaveData instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTempEmpLeaveDatas( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting TempEmpLeaveDatas");
		return tempEmpLeaveDataService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTempEmpLeaveDataAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return tempEmpLeaveDataService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TempEmpLeaveDataService instance
	 */
	protected void setTempEmpLeaveDataService(TempEmpLeaveDataService service) {
		this.tempEmpLeaveDataService = service;
	}

}
