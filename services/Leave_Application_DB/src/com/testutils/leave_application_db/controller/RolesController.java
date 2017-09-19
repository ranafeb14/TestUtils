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

import com.testutils.leave_application_db.EmpRoles;
import com.testutils.leave_application_db.LeaveTypeRoleMapping;
import com.testutils.leave_application_db.OtherLeavesRoleMapping;
import com.testutils.leave_application_db.Roles;
import com.testutils.leave_application_db.service.RolesService;


/**
 * Controller object for domain model class Roles.
 * @see Roles
 */
@RestController("Leave_Application_DB.RolesController")
@Api(value = "RolesController", description = "Exposes APIs to work with Roles resource.")
@RequestMapping("/Leave_Application_DB/Roles")
public class RolesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RolesController.class);

    @Autowired
	@Qualifier("Leave_Application_DB.RolesService")
	private RolesService rolesService;

	@ApiOperation(value = "Creates a new Roles instance.")
	@RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Roles createRoles(@RequestBody Roles roles) {
		LOGGER.debug("Create Roles with information: {}" , roles);

		roles = rolesService.create(roles);
		LOGGER.debug("Created Roles with information: {}" , roles);

	    return roles;
	}


    @ApiOperation(value = "Returns the Roles instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Roles getRoles(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Roles with id: {}" , id);

        Roles foundRoles = rolesService.getById(id);
        LOGGER.debug("Roles details with id: {}" , foundRoles);

        return foundRoles;
    }

    @ApiOperation(value = "Updates the Roles instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Roles editRoles(@PathVariable("id") Integer id, @RequestBody Roles roles) throws EntityNotFoundException {
        LOGGER.debug("Editing Roles with id: {}" , roles.getRoleId());

        roles.setRoleId(id);
        roles = rolesService.update(roles);
        LOGGER.debug("Roles details with id: {}" , roles);

        return roles;
    }

    @ApiOperation(value = "Deletes the Roles instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteRoles(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Roles with id: {}" , id);

        Roles deletedRoles = rolesService.delete(id);

        return deletedRoles != null;
    }

    /**
     * @deprecated Use {@link #findRoles(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Roles instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Roles> searchRolesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Roles list");
        return rolesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Roles instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Roles> findRoles(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Roles list");
        return rolesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Roles instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Roles> filterRoles(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Roles list");
        return rolesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportRoles(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return rolesService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of Roles instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countRoles( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Roles");
		return rolesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getRolesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return rolesService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/empRoleses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the empRoleses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<EmpRoles> findAssociatedEmpRoleses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated empRoleses");
        return rolesService.findAssociatedEmpRoleses(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/leaveTypeRoleMappings", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the leaveTypeRoleMappings instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<LeaveTypeRoleMapping> findAssociatedLeaveTypeRoleMappings(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated leaveTypeRoleMappings");
        return rolesService.findAssociatedLeaveTypeRoleMappings(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/otherLeavesRoleMappings", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the otherLeavesRoleMappings instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<OtherLeavesRoleMapping> findAssociatedOtherLeavesRoleMappings(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated otherLeavesRoleMappings");
        return rolesService.findAssociatedOtherLeavesRoleMappings(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service RolesService instance
	 */
	protected void setRolesService(RolesService service) {
		this.rolesService = service;
	}

}
