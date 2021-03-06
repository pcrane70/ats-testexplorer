/*
 * Copyright 2017 Axway Software
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.axway.ats.testexplorer.pages.errors;

import javax.servlet.http.HttpServletResponse;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.http.WebResponse;

/**
 * Internal error display page.
 *
 */
public class InternalErrorPage extends WebPage {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     */
    public InternalErrorPage() {

        add(homePageLink("homePageLink"));
    }

    /**
     * Set status code
     */
    @Override
    protected void setHeaders(
                               WebResponse response ) {

        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        super.setHeaders(response);
    }

    /**
     * @see org.apache.wicket.Component#isVersioned()
     */
    @Override
    public boolean isVersioned() {

        return false;
    }

    /**
     * @see org.apache.wicket.Page#isErrorPage()
     */
    @Override
    public boolean isErrorPage() {

        return true;
    }
}
