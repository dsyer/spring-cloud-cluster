/*
 * Copyright 2014 the original author or authors.
 *
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

package org.springframework.cloud.cluster.leader;

/**
 * Interface that defines the context for candidate leadership.
 * Instances of this object are passed to {@link Candidate candidates}
 * upon granting and revoking of leadership.
 *
 * @author Patrick Peralta
 */
public interface Context {

	/**
	 * @see Candidate#getRole
	 */
	String getRole();

	/**
	 * @see Candidate#getId
	 */
	String getId();

	/**
	 * @return true if the {@link Candidate} this context was
	 *         passed to is the leader
	 */
	boolean isLeader();

	/**
	 * Causes the {@link Candidate} this context was passed to
	 * to relinquish leadership.
	 */
	void renounce();
}
