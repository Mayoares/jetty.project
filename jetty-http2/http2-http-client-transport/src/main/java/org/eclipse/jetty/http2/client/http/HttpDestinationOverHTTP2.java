//
//  ========================================================================
//  Copyright (c) 1995-2016 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.http2.client.http;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.client.MultiplexHttpDestination;
import org.eclipse.jetty.client.Origin;
import org.eclipse.jetty.client.SendFailure;

public class HttpDestinationOverHTTP2 extends MultiplexHttpDestination<HttpConnectionOverHTTP2>
{
    public HttpDestinationOverHTTP2(HttpClient client, Origin origin)
    {
        super(client, origin);
    }

    @Override
    protected SendFailure send(HttpConnectionOverHTTP2 connection, HttpExchange exchange)
    {
        return connection.send(exchange);
    }
}
