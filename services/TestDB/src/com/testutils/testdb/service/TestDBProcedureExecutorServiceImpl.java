/*Generated by WaveMaker Studio*/

package com.testutils.testdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class TestDBProcedureExecutorServiceImpl implements TestDBProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestDBProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("TestDBWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}

