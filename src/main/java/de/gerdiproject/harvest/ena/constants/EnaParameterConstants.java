/**
 * Copyright © 2017 Jan Frömberg (http://www.gerdi-project.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.gerdiproject.harvest.ena.constants;

/**
 * A static collection of constant parameters for configuring the ENA harvester.
 *
 * @author Jan Frömberg
 */
public class EnaParameterConstants
{
    // KEYS
    public static final String PROPERTY_FROM_KEY = "accFrom";
    public static final String PROPERTY_TAXON_KEY = "taxon";
    public static final String PROPERTY_FASTQ_KEY = "errFrom";

    // DEFAULT VALUES
    public static final String ENTRY_DEFAULT_FROM = "BC000001";
    public static final String ENTRY_DEFAULT_TAXON = "10088";
    public static final String ENTRY_DEFAULT_FASTQ = "ERR000000";

    /**
     * Private Constructor, because this is a static class.
     */
    private EnaParameterConstants()
    {
    }
}
