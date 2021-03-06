/* Copyright 2011 SpringSource.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import grails.plugin.memcached.MemcachedBeanPostprocessor

class MemcachedGrailsPlugin {
	String version = '1.0.3.2'
	String grailsVersion = '1.3.3 > *'
	String title = 'Memcached 2nd-level cache provider plugin'
	String author = 'Burt Beckwith'
	String authorEmail = 'beckwithb@vmware.com'
	String description = 'Integrates Memcached as the Hibernate 2nd-level cache provider'
	String documentation = 'http://grails.org/plugin/memcached'
	List pluginExcludes = [
		'grails-app/domain/**',
		'docs/**',
		'src/docs/**'
	]

	String license = 'APACHE'
	def organization = [name: 'SpringSource', url: 'http://www.springsource.org/']
	def issueManagement = [system: 'JIRA', url: 'http://jira.grails.org/browse/GPMEMCACHED']
	def scm = [url: 'https://github.com/grails-plugins/grails-memcached']

	def doWithSpring = {
		memcachedBeanPostprocessor(MemcachedBeanPostprocessor)
	}
}
