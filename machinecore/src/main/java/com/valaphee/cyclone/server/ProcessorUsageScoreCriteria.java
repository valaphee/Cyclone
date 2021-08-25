/*
 * Copyright (c) by Valaphee 2019.
 *
 * Licensed under the 4-clause BSD license (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      https://deploy.valaphee.com/license/BSD-4-Clause.txt
 *
 * THIS SOFTWARE IS PROVIDED BY VALAPHEE "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.
 */

package com.valaphee.cyclone.server;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

/**
 * Default
 *
 * @author valaphee
 */
public final class ProcessorUsageScoreCriteria
		implements ScoreCriteria
{
	private static final ProcessorUsageScoreCriteria INSTANCE = new ProcessorUsageScoreCriteria();

	public static ProcessorUsageScoreCriteria getInstance()
	{
		return INSTANCE;
	}

	@Override
	public String getName()
	{
		return "ProcessorUsage";
	}

	@Override
	public double value()
	{
		return ((OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getSystemCpuLoad();
	}
}
