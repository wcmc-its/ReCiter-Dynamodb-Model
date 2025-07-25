/*******************************************************************************
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
 *******************************************************************************/
package reciter.database.dynamodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reciter.engine.analysis.ReCiterFeature;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents the output of the ReCiter feature generator result.
 * * This model is mapped to a DynamoDB table
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class AnalysisOutput {

	 /**
     * The unique identifier of the person.
     * This acts as the partition key in DynamoDB.
     */
	private String uid;
	/**
     * Flag indicating whether the ReCiterFeature data is stored in S3 instead of DynamoDB.
     * Useful for reducing storage costs and avoiding item size limits.
     */
	private boolean isUsingS3;
	/**
     * The result of the feature generation step.
     */
	private ReCiterFeature reCiterFeature;

	 /**
     * Gets the user identifier.
     *
     * @return the UID .
     */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}
	
	/**
     * Indicates whether the output is stored in S3.
     *
     * @return true if stored in S3, false if stored in DynamoDB.
     */
	@DynamoDbAttribute("s3StorageFlag")
	@JsonProperty("s3StorageFlag")
	public boolean isUsingS3() {
		return isUsingS3;
	}
	
	/**
     * Gets the {@link ReCiterFeature} result of the analysis.
     *
     * @return the full feature vector for the given UID.
     */
	@DynamoDbAttribute("reCiterFeature")
	@JsonProperty("reCiterFeature")
	public ReCiterFeature getReCiterFeature() {
		return reCiterFeature;
	}
}
