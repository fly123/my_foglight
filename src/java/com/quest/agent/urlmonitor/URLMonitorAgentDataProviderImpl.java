/*
  Copyright 2012 Quest Software, Inc.
  ALL RIGHTS RESERVED.

  This software is the confidential and proprietary information of
  Quest Software Inc. ("Confidential Information").  You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered
  into with Quest Software Inc.

  QUEST SOFTWARE INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
  THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
  INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
  MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
  NON-INFRINGEMENT. QUEST SOFTWARE SHALL NOT BE LIABLE FOR ANY
  DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
  OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */  

package com.quest.agent.urlmonitor;

import com.quest.glue.api.services.ServiceFactory;

/**
 * This is (one of) the concrete implementations of the datqa provider interfacer for the
 * URLMonitorAgent agent.
 */
public class URLMonitorAgentDataProviderImpl implements URLMonitorAgentDataProvider {

private final ServiceFactory mServiceFactory;

public URLMonitorAgentDataProviderImpl(ServiceFactory factory) {
    mServiceFactory = factory;
}

}