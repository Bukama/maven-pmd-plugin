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
package org.apache.maven.plugins.pmd.it;

import static com.soebes.itf.extension.assertj.MavenITAssertions.assertThat;
import com.soebes.itf.jupiter.extension.MavenCLIOptions;
import com.soebes.itf.jupiter.extension.MavenGoal;
import com.soebes.itf.jupiter.extension.MavenJupiterExtension;
import com.soebes.itf.jupiter.extension.MavenOption;
import com.soebes.itf.jupiter.extension.MavenTest;
import com.soebes.itf.jupiter.maven.MavenExecutionResult;

@MavenJupiterExtension
public class Mpmd386_314_MultiRootIT {

    // https://github.com/khmarbaise/maven-it-extension

    // 1) Dependencies (Including JUnit 5) and plugins (including failsafe)
    // 2) IT under src/test/it
    // 3) Test resources under src/test/resources-its/
    //          Break build due apache-rat plugin due unapproved license and folders can't be excluded as it seems, so
    //        skipping rat totally for now and needing to add licens to all files later

    @MavenTest
    @MavenGoal("clean")
    @MavenGoal("verify")
    @MavenGoal("site")
    // @MavenOption("-f pom.xml")
    @MavenOption(value = MavenCLIOptions.FILE, parameter = "pom.xml")
    void mpmd_314_multiproject_with_pom_in_root_should_work(MavenExecutionResult result) {
        assertThat(result).isSuccessful();
    }
}
