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
package com.axway.ats.testexplorer.pages.runs;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.axway.ats.testexplorer.pages.BasePage;
import com.axway.ats.testexplorer.pages.WelcomePage;

public class RunsPage extends BasePage {

    private static final long serialVersionUID = 1L;

    public RunsPage( PageParameters parameters ) {

        super( parameters );
        add( new RunsPanel( "runs_info", this, parameters ) );
        
        // organize navigation links
        addNavigationLink( WelcomePage.class, new PageParameters(), "Home", null );
    }

    @Override
    public String getPageName() {

        return "Runs";
    }
}
