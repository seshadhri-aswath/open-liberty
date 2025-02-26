/*******************************************************************************
 * Copyright (c) 2020, 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.restfulWS30.fat;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import componenttest.rules.repeater.FeatureReplacementAction;
import componenttest.rules.repeater.JakartaEE10Action;
import componenttest.rules.repeater.RepeatTests;

@RunWith(Suite.class)
@SuiteClasses({
                AppAndResourceTest.class,
                AppAndResourceCDIBeanDiscoveryModeDisabledTest.class,
                CDIInjectIntoAppTest.class,
                ExceptionTest.class,
                InjectAppTest.class,
                JakartaPackageTest.class,
                JsonbTest.class,
                ManagedBeansTest.class,
                ResponseRelativePathTest.class,
                RestfulWsPrototypeTest.class,
                ValidatorTest.class,
                WebXmlAppTest.class,
                WebXmlNoAppTest.class,
                XmlWithJaxbTest.class,
                XmlWithoutJaxbTest.class
})
public class FATSuite {
    @ClassRule
    public static RepeatTests r = RepeatTests.withoutModification()
        .andWith(new JakartaEE10Action().withID("EE10"))
        .andWith(FeatureReplacementAction.EE11_FEATURES().withID("EE11"));

}
