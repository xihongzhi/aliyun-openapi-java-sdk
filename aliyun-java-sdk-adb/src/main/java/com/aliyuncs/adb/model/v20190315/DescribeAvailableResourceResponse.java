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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableResourceResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<AvailableZone> availableZoneList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<AvailableZone> getAvailableZoneList() {
		return this.availableZoneList;
	}

	public void setAvailableZoneList(List<AvailableZone> availableZoneList) {
		this.availableZoneList = availableZoneList;
	}

	public static class AvailableZone {

		private String zoneId;

		private List<SupportedSerial> supportedSerialList;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<SupportedSerial> getSupportedSerialList() {
			return this.supportedSerialList;
		}

		public void setSupportedSerialList(List<SupportedSerial> supportedSerialList) {
			this.supportedSerialList = supportedSerialList;
		}

		public static class SupportedSerial {

			private String serial;

			private List<SupportedInstanceClass> supportedInstanceClassList;

			public String getSerial() {
				return this.serial;
			}

			public void setSerial(String serial) {
				this.serial = serial;
			}

			public List<SupportedInstanceClass> getSupportedInstanceClassList() {
				return this.supportedInstanceClassList;
			}

			public void setSupportedInstanceClassList(List<SupportedInstanceClass> supportedInstanceClassList) {
				this.supportedInstanceClassList = supportedInstanceClassList;
			}

			public static class SupportedInstanceClass {

				private String instanceClass;

				private String tips;

				private List<SupportedNodeCount> supportedNodeCountList;

				public String getInstanceClass() {
					return this.instanceClass;
				}

				public void setInstanceClass(String instanceClass) {
					this.instanceClass = instanceClass;
				}

				public String getTips() {
					return this.tips;
				}

				public void setTips(String tips) {
					this.tips = tips;
				}

				public List<SupportedNodeCount> getSupportedNodeCountList() {
					return this.supportedNodeCountList;
				}

				public void setSupportedNodeCountList(List<SupportedNodeCount> supportedNodeCountList) {
					this.supportedNodeCountList = supportedNodeCountList;
				}

				public static class SupportedNodeCount {

					private String nodeCount;

					private List<String> storageSize;

					public String getNodeCount() {
						return this.nodeCount;
					}

					public void setNodeCount(String nodeCount) {
						this.nodeCount = nodeCount;
					}

					public List<String> getStorageSize() {
						return this.storageSize;
					}

					public void setStorageSize(List<String> storageSize) {
						this.storageSize = storageSize;
					}
				}
			}
		}
	}

	@Override
	public DescribeAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
