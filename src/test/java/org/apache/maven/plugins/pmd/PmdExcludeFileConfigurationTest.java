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

/*
public class PmdExcludeFileConfigurationTest extends AbstractPmdReportTestCase {


//    Notes:
//
//       src/it seem to be files for integration tests, but they are not called by any failsafe test under src/test
//
//       all tests that are executed are using reproducer projects under src/test/resources/unit
//
//       and seem to use the maven-plugin-testing-harness
//
//
//
//    https://maven.apache.org/plugin-testing/maven-plugin-testing-harness/getting-started/index.html
//
//    1) Having a plugin with Mojo  => PmdReport extends AbstractPmdReport (check)
//    2) maven-plugin-testing-harness depency added (check)
//    3) Create Mojo test (check, this one extending AbstractPmdReportTestCase with setup, teardown and prepared)
//        Based on PmdReportTest, generateReport gets the path to the pom or the path of a stubbed project, but as I have full projects I should be able to link to the pom
//
//        question: how to pass parameter as that's what the bug seems to be around?
//           harness docs don't show anything for that...



    public void test315MultiRoot() throws Exception {
        File report = generateReport("pmd", "MPMD-386/3_15/MultiRoot/pom.xml");

        assertNotNull("Report should be generated", report);

        //         >> org.apache.maven.plugin.testing.ConfigurationException: Cannot find a configuration element for a
        // plugin with an artifactId of maven-pmd-plugin.

        // ??? The Pmd-plugin is configured in the pom.xml ???

    }
}
*/
