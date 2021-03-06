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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AddLinkeantcodeAntcodeProjectreviewmemberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeantcodeAntcodeProjectreviewmemberResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long accessLevel;

	private String avatarUrl;

	private String email;

	private String expiresAt;

	private String externUid;

	private Long id;

	private String name;

	private Long responseStatusCode;

	private String state;

	private String username;

	private String webUrl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getAccessLevel() {
		return this.accessLevel;
	}

	public void setAccessLevel(Long accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getAvatarUrl() {
		return this.avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}

	public String getExternUid() {
		return this.externUid;
	}

	public void setExternUid(String externUid) {
		this.externUid = externUid;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	@Override
	public AddLinkeantcodeAntcodeProjectreviewmemberResponse getInstance(UnmarshallerContext context) {
		return	AddLinkeantcodeAntcodeProjectreviewmemberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
