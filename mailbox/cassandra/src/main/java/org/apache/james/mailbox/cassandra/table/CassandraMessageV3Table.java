/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.mailbox.cassandra.table;

public interface CassandraMessageV3Table {

    String TABLE_NAME = "messageV3";
    String INTERNAL_DATE = "internalDate";
    String BODY_START_OCTET = "bodyStartOctet";
    String FULL_CONTENT_OCTETS = "fullContentOctets";
    String BODY_OCTECTS = "bodyOctets";
    String TEXTUAL_LINE_COUNT = "textualLineCount";
    String BODY_CONTENT = "bodyContent";
    String HEADER_CONTENT = "headerContent";
    String ATTACHMENTS = "attachments";

    interface Properties {
        String MEDIA_TYPE = "mediaType";
        String SUB_TYPE = "subType";
        String CONTENT_ID = "contentId";
        String CONTENT_LOCATION = "contentLocation";
        String CONTENT_DESCRIPTION = "contentDescription";
        String CONTENT_TRANSFER_ENCODING = "contentTransferEncoding";
        String CONTENT_DISPOSITION_TYPE = "contentDispositionType";
        String CONTENT_DISPOSITION_PARAMETERS = "contentDispositionParameters";
        String CONTENT_TYPE_PARAMETERS = "contentTypeParameters";
        String CONTENT_MD5 = "contentMd5";
        String CONTENT_LANGUAGE = "contentLanguage";
    }

    interface Attachments {
        String ID = "id";
        String NAME = "name";
        String CID = "cid";
        String IS_INLINE = "isInline";
    }

}
