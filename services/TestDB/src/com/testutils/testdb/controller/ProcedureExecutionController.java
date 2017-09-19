/*Generated by WaveMaker Studio*/
package com.testutils.testdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wordnik.swagger.annotations.Api;

import com.testutils.testdb.service.TestDBProcedureExecutorService;

@RestController(value = "TestDB.ProcedureExecutionController")
@RequestMapping("/TestDB/procedureExecutor")
@Api(value = "ProcedureExecutionController", description = "controller class for procedure execution")
public class ProcedureExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

    @Autowired
    private TestDBProcedureExecutorService procedureService;


}

