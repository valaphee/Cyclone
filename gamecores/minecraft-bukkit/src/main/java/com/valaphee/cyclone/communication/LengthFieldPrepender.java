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

package com.valaphee.cyclone.communication;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Default
 *
 * @author valaphee
 */
public final class LengthFieldPrepender
		extends MessageToByteEncoder<ByteBuf>
{
	@Override
	protected void encode(final ChannelHandlerContext ctx, final ByteBuf msg, final ByteBuf out)
			throws Exception
	{
		out.writeInt(msg.readableBytes());
		out.writeBytes(msg);
	}
}
