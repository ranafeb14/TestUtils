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

import com.testutils.leave_application_db.TempLeaves;

/**
 * Service object for domain model class {@link TempLeaves}.
 */
public interface TempLeavesService {

    /**
     * Creates a new TempLeaves. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on TempLeaves if any.
     *
     * @param tempLeaves Details of the TempLeaves to be created; value cannot be null.
     * @return The newly created TempLeaves.
     */
	TempLeaves create(TempLeaves tempLeaves);


	/**
	 * Returns TempLeaves by given id if exists.
	 *
	 * @param templeavesId The id of the TempLeaves to get; value cannot be null.
	 * @return TempLeaves associated with the given templeavesId.
     * @throws EntityNotFoundException If no TempLeaves is found.
	 */
	TempLeaves getById(Integer templeavesId) throws EntityNotFoundException;

    /**
	 * Find and return the TempLeaves by given id if exists, returns null otherwise.
	 *
	 * @param templeavesId The id of the TempLeaves to get; value cannot be null.
	 * @return TempLeaves associated with the given templeavesId.
	 */
	TempLeaves findById(Integer templeavesId);

    /**
	 * Find and return the TempLeaves for given empId  andfiscalYear  andmonth  if exists.
	 *
	 * @param empId value of empId; value cannot be null.
	 * @param fiscalYear value of fiscalYear; value cannot be null.
	 * @param month value of month; value cannot be null.
	 * @return TempLeaves associated with the given inputs.
     * @throws EntityNotFoundException if no matching TempLeaves found.
	 */
    TempLeaves getByEmpIdAndFiscalYearAndMonth(int empId, String fiscalYear, String month)throws EntityNotFoundException;

	/**
	 * Updates the details of an existing TempLeaves. It replaces all fields of the existing TempLeaves with the given tempLeaves.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on TempLeaves if any.
     *
	 * @param tempLeaves The details of the TempLeaves to be updated; value cannot be null.
	 * @return The updated TempLeaves.
	 * @throws EntityNotFoundException if no TempLeaves is found with given input.
	 */
	TempLeaves update(TempLeaves tempLeaves) throws EntityNotFoundException;

    /**
	 * Deletes an existing TempLeaves with the given id.
	 *
	 * @param templeavesId The id of the TempLeaves to be deleted; value cannot be null.
	 * @return The deleted TempLeaves.
	 * @throws EntityNotFoundException if no TempLeaves found with the given id.
	 */
	TempLeaves delete(Integer templeavesId) throws EntityNotFoundException;

	/**
	 * Find all TempLeaves matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TempLeaves.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<TempLeaves> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all TempLeaves matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TempLeaves.
     *
     * @see Pageable
     * @see Page
	 */
    Page<TempLeaves> findAll(String query, Pageable pageable);

    /**
	 * Exports all TempLeaves matching the given input query to the given exportType format.
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
	 * Retrieve the count of the TempLeaves in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the TempLeaves.
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

