/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.plugins.pmd;

import java.io.File;

public class PmdExcludeFileConfigurationTest extends AbstractPmdReportTestCase {

    public void test315MultiRoot() throws Exception {
        generateReport("pmd", "default-configuration/pmd-report-mpmd386-configuration-plugin-config.xml");

        // clear the output from previous pmd:pmd execution
        CapturingPrintStream.init(true);

        try {
            final File testPom = new File(getBasedir(), "src/test/resources/unit/MPMD-386/3_15/MultiRoot/pom.xml");
            final PmdViolationCheckMojo mojo = (PmdViolationCheckMojo) lookupMojo("check", testPom);
            mojo.execute();

            fail("MojoFailureException should be thrown.");
        } catch (final Exception e) {
            // the version should be logged
            String output = CapturingPrintStream.getOutput();
            assertTrue(output.contains("exclude-pmd.properties"));
        }
    }
}
