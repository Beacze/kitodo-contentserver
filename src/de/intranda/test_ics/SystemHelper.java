/*
 * This file is part of the ContentServer project.
 * Visit the websites for more information. 
 *         - http://gdz.sub.uni-goettingen.de 
 *         - http://www.intranda.com 
 *         - http://www.digiverso.com
 * 
 * Copyright 2009, Center for Retrospective Digitization, Göttingen (GDZ),
 * intranda software
 *
 * This is the extended version updated by intranda
 * Copyright 2012, intranda GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.intranda.test_ics;

public class SystemHelper {

    public static void dumpMemory() {
        System.out.println("\n" + "Max. memory: " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + " MB" + "\n" + "Tot. memory: "
                + Runtime.getRuntime().totalMemory() / 1024 / 1024 + " MB" + "\n" + "Free memory: " + Runtime.getRuntime().freeMemory() / 1024 / 1024
                + " MB");
    }
}
