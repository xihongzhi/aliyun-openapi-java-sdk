/*
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

package com.aliyuncs.rdc.transform.v20180821;

import com.aliyuncs.rdc.model.v20180821.GetJoinCodeResponse;
import com.aliyuncs.rdc.model.v20180821.GetJoinCodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJoinCodeResponseUnmarshaller {

	public static GetJoinCodeResponse unmarshall(GetJoinCodeResponse getJoinCodeResponse, UnmarshallerContext context) {
		
		getJoinCodeResponse.setRequestId(context.stringValue("GetJoinCodeResponse.RequestId"));
		getJoinCodeResponse.setSuccess(context.booleanValue("GetJoinCodeResponse.Success"));
		getJoinCodeResponse.setCode(context.integerValue("GetJoinCodeResponse.Code"));
		getJoinCodeResponse.setMessage(context.stringValue("GetJoinCodeResponse.Message"));

		Data data = new Data();
		data.setCode(context.stringValue("GetJoinCodeResponse.Data.Code"));
		getJoinCodeResponse.setData(data);
	 
	 	return getJoinCodeResponse;
	}
}