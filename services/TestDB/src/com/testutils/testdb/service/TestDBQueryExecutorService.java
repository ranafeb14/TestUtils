/*Generated by WaveMaker Studio*/

package com.testutils.testdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testutils.testdb.models.query.*;

public interface TestDBQueryExecutorService {

    Page<TestResponse> executeTest(List<String> name, Pageable pageable);

    Downloadable exportTest(ExportType exportType, List<String> name, Pageable pageable);

    Integer executeSaveEmployee(SaveEmployeeRequest saveEmployeeRequest);

}


