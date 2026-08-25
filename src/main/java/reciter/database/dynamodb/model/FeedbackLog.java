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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

/**
 * A class model for a DynamoDB record representing curator/user feedback
 * on a publication article.
 * @author ved4006
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class FeedbackLog {

	/**
	 * The unique identifier of the user or entity the feedback is associated with.
	 * Serves as the DynamoDB partition key.
	 */
	private String uid;
	
	/**
	 * The sort key used to distinguish records within the same partition (uid).
	 */
	private String sk;
	
	/**
	 * The identifier of the article the feedback pertains to.
	 */
	private String articleId;
	
	/**
	 * The feedback content or classification provided for the article.
	 */
	private String feedback;
	
	/**
	 * The identifier of the curator who provided or reviewed the feedback.
	 */
	private int curatedBy;
	
	/**
	 * The source system or origin of the feedback.
	 */
	private String src;
	
	/**
	 * The timestamp (epoch millis) when this feedback record was created.
	 */
	private long createTimestamp;
	
	/**
	 * The timestamp (epoch millis) when this feedback record was last modified.
	 */
	private long modifyTimestamp;

	/**
	 * Gets the unique identifier of the user or entity the feedback is associated with.
	 * @return the uid
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}

	/**
	 * Gets the sort key used to distinguish records within the same partition.
	 * @return the sort key
	 */
	@DynamoDbSortKey
	@DynamoDbAttribute("sk")
	public String getSk() {
		return sk;
	}

	/**
	 * Gets the identifier of the article the feedback pertains to.
	 * @return the article ID
	 */
	@DynamoDbAttribute("articleId")
	public String getArticleId() {
		return articleId;
	}

	/**
	 * Gets the feedback content or classification provided for the article.
	 * @return the feedback
	 */
	@DynamoDbAttribute("feedback")
	public String getFeedback() {
		return feedback;
	}

	/**
	 * Gets the identifier of the curator who provided or reviewed the feedback.
	 * @return the curator ID
	 */
	@DynamoDbAttribute("curatedBy")
	public int getCuratedBy() {
		return curatedBy;
	}

	/**
	 * Gets the source system or origin of the feedback.
	 * @return the source
	 */
	@DynamoDbAttribute("src")
	public String getSrc() {
		return src;
	}

	/**
	 * Gets the timestamp when this feedback record was created.
	 * @return the create timestamp (epoch millis)
	 */
	@DynamoDbAttribute("createTimestamp")
	public long getCreateTimestamp() {
		return createTimestamp;
	}

	/**
	 * Gets the timestamp when this feedback record was last modified.
	 * @return the modify timestamp (epoch millis)
	 */
	@DynamoDbAttribute("modifyTimestamp")
	public long getModifyTimestamp() {
		return modifyTimestamp;
	}

}