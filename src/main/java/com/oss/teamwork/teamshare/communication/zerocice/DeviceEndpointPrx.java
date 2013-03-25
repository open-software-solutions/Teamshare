// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `DeviceEndpointPrx.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.oss.teamwork.teamshare.communication.zerocice;

public interface DeviceEndpointPrx extends Ice.ObjectPrx
{
    public void notifyRevision(String teamId, String filename, String swarmId);

    public void notifyRevision(String teamId, String filename, String swarmId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_notifyRevision(String teamId, String filename, String swarmId);

    public Ice.AsyncResult begin_notifyRevision(String teamId, String filename, String swarmId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_notifyRevision(String teamId, String filename, String swarmId, Ice.Callback __cb);

    public Ice.AsyncResult begin_notifyRevision(String teamId, String filename, String swarmId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_notifyRevision(String teamId, String filename, String swarmId, Callback_DeviceEndpoint_notifyRevision __cb);

    public Ice.AsyncResult begin_notifyRevision(String teamId, String filename, String swarmId, java.util.Map<String, String> __ctx, Callback_DeviceEndpoint_notifyRevision __cb);

    public void end_notifyRevision(Ice.AsyncResult __result);

    public String getLatestRevisionHash(String teamId, String filename);

    public String getLatestRevisionHash(String teamId, String filename, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getLatestRevisionHash(String teamId, String filename);

    public Ice.AsyncResult begin_getLatestRevisionHash(String teamId, String filename, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getLatestRevisionHash(String teamId, String filename, Ice.Callback __cb);

    public Ice.AsyncResult begin_getLatestRevisionHash(String teamId, String filename, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getLatestRevisionHash(String teamId, String filename, Callback_DeviceEndpoint_getLatestRevisionHash __cb);

    public Ice.AsyncResult begin_getLatestRevisionHash(String teamId, String filename, java.util.Map<String, String> __ctx, Callback_DeviceEndpoint_getLatestRevisionHash __cb);

    public String end_getLatestRevisionHash(Ice.AsyncResult __result);
}
