/*Generated by WaveMaker Studio*/
package com.testutils.testdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testutils.testdb.EmployeeSkillsUtf8UnicodeCi;

/**
 * Service object for domain model class {@link EmployeeSkillsUtf8UnicodeCi}.
 */
public interface EmployeeSkillsUtf8UnicodeCiService {

    /**
     * Creates a new EmployeeSkillsUtf8UnicodeCi. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on EmployeeSkillsUtf8UnicodeCi if any.
     *
     * @param employeeSkillsUtf8unicodeCi Details of the EmployeeSkillsUtf8UnicodeCi to be created; value cannot be null.
     * @return The newly created EmployeeSkillsUtf8UnicodeCi.
     */
	EmployeeSkillsUtf8UnicodeCi create(@Valid EmployeeSkillsUtf8UnicodeCi employeeSkillsUtf8unicodeCi);


	/**
	 * Returns EmployeeSkillsUtf8UnicodeCi by given id if exists.
	 *
	 * @param employeeskillsutf8unicodeciId The id of the EmployeeSkillsUtf8UnicodeCi to get; value cannot be null.
	 * @return EmployeeSkillsUtf8UnicodeCi associated with the given employeeskillsutf8unicodeciId.
     * @throws EntityNotFoundException If no EmployeeSkillsUtf8UnicodeCi is found.
	 */
	EmployeeSkillsUtf8UnicodeCi getById(Integer employeeskillsutf8unicodeciId) throws EntityNotFoundException;

    /**
	 * Find and return the EmployeeSkillsUtf8UnicodeCi by given id if exists, returns null otherwise.
	 *
	 * @param employeeskillsutf8unicodeciId The id of the EmployeeSkillsUtf8UnicodeCi to get; value cannot be null.
	 * @return EmployeeSkillsUtf8UnicodeCi associated with the given employeeskillsutf8unicodeciId.
	 */
	EmployeeSkillsUtf8UnicodeCi findById(Integer employeeskillsutf8unicodeciId);


	/**
	 * Updates the details of an existing EmployeeSkillsUtf8UnicodeCi. It replaces all fields of the existing EmployeeSkillsUtf8UnicodeCi with the given employeeSkillsUtf8unicodeCi.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on EmployeeSkillsUtf8UnicodeCi if any.
     *
	 * @param employeeSkillsUtf8unicodeCi The details of the EmployeeSkillsUtf8UnicodeCi to be updated; value cannot be null.
	 * @return The updated EmployeeSkillsUtf8UnicodeCi.
	 * @throws EntityNotFoundException if no EmployeeSkillsUtf8UnicodeCi is found with given input.
	 */
	EmployeeSkillsUtf8UnicodeCi update(@Valid EmployeeSkillsUtf8UnicodeCi employeeSkillsUtf8unicodeCi) throws EntityNotFoundException;

    /**
	 * Deletes an existing EmployeeSkillsUtf8UnicodeCi with the given id.
	 *
	 * @param employeeskillsutf8unicodeciId The id of the EmployeeSkillsUtf8UnicodeCi to be deleted; value cannot be null.
	 * @return The deleted EmployeeSkillsUtf8UnicodeCi.
	 * @throws EntityNotFoundException if no EmployeeSkillsUtf8UnicodeCi found with the given id.
	 */
	EmployeeSkillsUtf8UnicodeCi delete(Integer employeeskillsutf8unicodeciId) throws EntityNotFoundException;

	/**
	 * Find all EmployeeSkillsUtf8UnicodeCis matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmployeeSkillsUtf8UnicodeCis.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<EmployeeSkillsUtf8UnicodeCi> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all EmployeeSkillsUtf8UnicodeCis matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching EmployeeSkillsUtf8UnicodeCis.
     *
     * @see Pageable
     * @see Page
	 */
    Page<EmployeeSkillsUtf8UnicodeCi> findAll(String query, Pageable pageable);

    /**
	 * Exports all EmployeeSkillsUtf8UnicodeCis matching the given input query to the given exportType format.
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
	 * Retrieve the count of the EmployeeSkillsUtf8UnicodeCis in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the EmployeeSkillsUtf8UnicodeCi.
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

