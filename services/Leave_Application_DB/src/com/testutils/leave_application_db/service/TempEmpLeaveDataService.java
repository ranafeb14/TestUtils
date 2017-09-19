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

import com.testutils.leave_application_db.TempEmpLeaveData;

/**
 * Service object for domain model class {@link TempEmpLeaveData}.
 */
public interface TempEmpLeaveDataService {

    /**
     * Creates a new TempEmpLeaveData. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on TempEmpLeaveData if any.
     *
     * @param tempEmpLeaveData Details of the TempEmpLeaveData to be created; value cannot be null.
     * @return The newly created TempEmpLeaveData.
     */
	TempEmpLeaveData create(TempEmpLeaveData tempEmpLeaveData);


	/**
	 * Returns TempEmpLeaveData by given id if exists.
	 *
	 * @param tempempleavedataId The id of the TempEmpLeaveData to get; value cannot be null.
	 * @return TempEmpLeaveData associated with the given tempempleavedataId.
     * @throws EntityNotFoundException If no TempEmpLeaveData is found.
	 */
	TempEmpLeaveData getById(Integer tempempleavedataId) throws EntityNotFoundException;

    /**
	 * Find and return the TempEmpLeaveData by given id if exists, returns null otherwise.
	 *
	 * @param tempempleavedataId The id of the TempEmpLeaveData to get; value cannot be null.
	 * @return TempEmpLeaveData associated with the given tempempleavedataId.
	 */
	TempEmpLeaveData findById(Integer tempempleavedataId);


	/**
	 * Updates the details of an existing TempEmpLeaveData. It replaces all fields of the existing TempEmpLeaveData with the given tempEmpLeaveData.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on TempEmpLeaveData if any.
     *
	 * @param tempEmpLeaveData The details of the TempEmpLeaveData to be updated; value cannot be null.
	 * @return The updated TempEmpLeaveData.
	 * @throws EntityNotFoundException if no TempEmpLeaveData is found with given input.
	 */
	TempEmpLeaveData update(TempEmpLeaveData tempEmpLeaveData) throws EntityNotFoundException;

    /**
	 * Deletes an existing TempEmpLeaveData with the given id.
	 *
	 * @param tempempleavedataId The id of the TempEmpLeaveData to be deleted; value cannot be null.
	 * @return The deleted TempEmpLeaveData.
	 * @throws EntityNotFoundException if no TempEmpLeaveData found with the given id.
	 */
	TempEmpLeaveData delete(Integer tempempleavedataId) throws EntityNotFoundException;

	/**
	 * Find all TempEmpLeaveDatas matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TempEmpLeaveDatas.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<TempEmpLeaveData> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all TempEmpLeaveDatas matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching TempEmpLeaveDatas.
     *
     * @see Pageable
     * @see Page
	 */
    Page<TempEmpLeaveData> findAll(String query, Pageable pageable);

    /**
	 * Exports all TempEmpLeaveDatas matching the given input query to the given exportType format.
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
	 * Retrieve the count of the TempEmpLeaveDatas in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the TempEmpLeaveData.
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

