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
import com.testutils.leave_application_db.EmpRolesId;

/**
 * Service object for domain model class {@link EmpRoles}.
 */
public interface EmpRolesService {

    /**
     * Creates a new EmpRoles. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmpRoles if any.
     *
     * @param empRoles Details of the EmpRoles to be created; value cannot be null.
     * @return The newly created EmpRoles.
     */
	EmpRoles create(EmpRoles empRoles);


	/**
	 * Returns EmpRoles by given id if exists.
	 *
	 * @param emprolesId The id of the EmpRoles to get; value cannot be null.
	 * @return EmpRoles associated with the given emprolesId.
     * @throws EntityNotFoundException If no EmpRoles is found.
	 */
	EmpRoles getById(EmpRolesId emprolesId) throws EntityNotFoundException;

    /**
	 * Find and return the EmpRoles by given id if exists, returns null otherwise.
	 *
	 * @param emprolesId The id of the EmpRoles to get; value cannot be null.
	 * @return EmpRoles associated with the given emprolesId.
	 */
	EmpRoles findById(EmpRolesId emprolesId);


	/**
	 * Updates the details of an existing EmpRoles. It replaces all fields of the existing EmpRoles with the given empRoles.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on EmpRoles if any.
     *
	 * @param empRoles The details of the EmpRoles to be updated; value cannot be null.
	 * @return The updated EmpRoles.
	 * @throws EntityNotFoundException if no EmpRoles is found with given input.
	 */
	EmpRoles update(EmpRoles empRoles) throws EntityNotFoundException;

    /**
	 * Deletes an existing EmpRoles with the given id.
	 *
	 * @param emprolesId The id of the EmpRoles to be deleted; value cannot be null.
	 * @return The deleted EmpRoles.
	 * @throws EntityNotFoundException if no EmpRoles found with the given id.
	 */
	EmpRoles delete(EmpRolesId emprolesId) throws EntityNotFoundException;

	/**
	 * Find all EmpRoles matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmpRoles.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<EmpRoles> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all EmpRoles matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmpRoles.
     *
     * @see Pageable
     * @see Page
	 */
    Page<EmpRoles> findAll(String query, Pageable pageable);

    /**
	 * Exports all EmpRoles matching the given input query to the given exportType format.
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
	 * Retrieve the count of the EmpRoles in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the EmpRoles.
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


}

