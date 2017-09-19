/*Generated by WaveMaker Studio*/
package com.testutils.leave_application_db.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testutils.leave_application_db.EmpRoles;
import com.testutils.leave_application_db.LeaveTypeRoleMapping;
import com.testutils.leave_application_db.OtherLeavesRoleMapping;
import com.testutils.leave_application_db.Roles;

/**
 * Service object for domain model class {@link Roles}.
 */
public interface RolesService {

    /**
     * Creates a new Roles. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Roles if any.
     *
     * @param roles Details of the Roles to be created; value cannot be null.
     * @return The newly created Roles.
     */
	Roles create(Roles roles);


	/**
	 * Returns Roles by given id if exists.
	 *
	 * @param rolesId The id of the Roles to get; value cannot be null.
	 * @return Roles associated with the given rolesId.
     * @throws EntityNotFoundException If no Roles is found.
	 */
	Roles getById(Integer rolesId) throws EntityNotFoundException;

    /**
	 * Find and return the Roles by given id if exists, returns null otherwise.
	 *
	 * @param rolesId The id of the Roles to get; value cannot be null.
	 * @return Roles associated with the given rolesId.
	 */
	Roles findById(Integer rolesId);


	/**
	 * Updates the details of an existing Roles. It replaces all fields of the existing Roles with the given roles.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Roles if any.
     *
	 * @param roles The details of the Roles to be updated; value cannot be null.
	 * @return The updated Roles.
	 * @throws EntityNotFoundException if no Roles is found with given input.
	 */
	Roles update(Roles roles) throws EntityNotFoundException;

    /**
	 * Deletes an existing Roles with the given id.
	 *
	 * @param rolesId The id of the Roles to be deleted; value cannot be null.
	 * @return The deleted Roles.
	 * @throws EntityNotFoundException if no Roles found with the given id.
	 */
	Roles delete(Integer rolesId) throws EntityNotFoundException;

	/**
	 * Find all Roles matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Roles.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Roles> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Roles matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Roles.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Roles> findAll(String query, Pageable pageable);

    /**
	 * Exports all Roles matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Roles in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Roles.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated empRoleses for given Roles id.
     *
     * @param roleId value of roleId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated EmpRoles instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<EmpRoles> findAssociatedEmpRoleses(Integer roleId, Pageable pageable);

    /*
     * Returns the associated leaveTypeRoleMappings for given Roles id.
     *
     * @param roleId value of roleId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated LeaveTypeRoleMapping instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<LeaveTypeRoleMapping> findAssociatedLeaveTypeRoleMappings(Integer roleId, Pageable pageable);

    /*
     * Returns the associated otherLeavesRoleMappings for given Roles id.
     *
     * @param roleId value of roleId; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated OtherLeavesRoleMapping instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<OtherLeavesRoleMapping> findAssociatedOtherLeavesRoleMappings(Integer roleId, Pageable pageable);

}

