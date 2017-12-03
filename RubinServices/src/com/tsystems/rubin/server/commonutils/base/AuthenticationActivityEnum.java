/*
 * Project : RubinServices
 * Version: 2.0
 * @author: Cognizant India Pvt Ltd.
 * 
 * File Name: AuthenticationActivityEnum.java
 * Java Version: 1.5.0_16
 * date of draft: 
 * last update:  Jun 25, 2009 
 * 
 * Copyright © 2008 by T-Systems International GmbH, 
 * Frankfurt/Main
 * All rights, including that of the extracts pressure, 
 * photomechanical reproduction (including microscopy),
 * and the evaluation of databases, or similar
 * organizations, reserved.
 * 
 */
package com.tsystems.rubin.server.commonutils.base;

/**
 * The Enum AuthenticationActivityEnum. - Enum for valid auditing activities in Rubin.
 */
public enum AuthenticationActivityEnum {

    /** The LOGGE d_ on. */
    LOGGED_ON,

    /** The LOGGE d_ off. */
    LOGGED_OFF,

    /** The TIMEDOUT. */
    TIMEDOUT
}
