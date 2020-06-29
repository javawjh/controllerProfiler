package com.github.xjs.ezprofiler.scanner;

import java.util.Date;

/**
 * @author 605162215@qq.com
 *
 * @date 2017年9月21日 下午3:30:10
 */
//<!--"method": "hello",//方法名-->
//<!--"uri": "/hello",     //url路径-->
//<!--"invokeCount": 2,  //总的调用次数-->
//<!--"okCount": 2,       //总的成功的次数-->
//<!--"errorCount": 0,   //总的失败的次数-->
//<!--"minMills": 0,       //最小用时-->
//<!--"maxMills": 0,      //最大用时-->
//<!--"avgMills": 0,       //平均用时-->
//<!--"maxInvokeAt": "2018-08-09 10:28:08", //最大用时发生时间点-->
//<!--"lastDayCount": 2,  //最近一天总调用次数-->
//<!--"lastDayOkCount": 2,//最近一天成功次数-->
//<!--"lastDayErrorCount": 0,//最近一天失败次数-->
//<!--"lastDayMinMills": 0,//最近一天最小用时-->
//<!--"lastDayMaxMills": 0,//最近一天最大用时-->
//<!--"lastDayAvgMills": 0,//最近一天平均用时-->
//<!--"lastDayMaxInvokeAt": "2018-08-09 10:28:12",//最近一天最大用时发生时间点-->
//<!--"lastMills": 0,       //上次用时-->
//<!--"lastInvokeAt": "2018-08-09 10:30:11"//上次调用时间点-->
public class MethodAccessInfo {
	private String method;
	private String uri;
	//历史的调用信息
	private long invokeCount;
	private long okCount;
	private long errorCount;
	private long minMills;
	private long maxMills;
	private long avgMills;
	private Date maxInvokeAt;
	//最近一天的调用信息
	private long lastDayCount;
	private long lastDayOkCount;
	private long lastDayErrorCount;
	private long lastDayMinMills;
	private long lastDayMaxMills;
	private long lastDayAvgMills;
	private Date lastDayMaxInvokeAt;
	//上一次的调用信息
	private long lastMills;
	private Date lastInvokeAt;
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public long getInvokeCount() {
		return invokeCount;
	}
	public void setInvokeCount(long invokeCount) {
		this.invokeCount = invokeCount;
	}
	public long getOkCount() {
		return okCount;
	}
	public void setOkCount(long okCount) {
		this.okCount = okCount;
	}
	public long getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(long errorCount) {
		this.errorCount = errorCount;
	}
	public long getMinMills() {
		return minMills;
	}
	public void setMinMills(long minMills) {
		this.minMills = minMills;
	}
	public long getMaxMills() {
		return maxMills;
	}
	public void setMaxMills(long maxMills) {
		this.maxMills = maxMills;
	}
	public long getAvgMills() {
		return avgMills;
	}
	public void setAvgMills(long avgMills) {
		this.avgMills = avgMills;
	}
	public Date getMaxInvokeAt() {
		return maxInvokeAt;
	}
	public void setMaxInvokeAt(Date maxInvokeAt) {
		this.maxInvokeAt = maxInvokeAt;
	}
	public long getLastDayCount() {
		return lastDayCount;
	}
	public void setLastDayCount(long lastDayCount) {
		this.lastDayCount = lastDayCount;
	}
	public long getLastDayOkCount() {
		return lastDayOkCount;
	}
	public void setLastDayOkCount(long lastDayOkCount) {
		this.lastDayOkCount = lastDayOkCount;
	}
	public long getLastDayErrorCount() {
		return lastDayErrorCount;
	}
	public void setLastDayErrorCount(long lastDayErrorCount) {
		this.lastDayErrorCount = lastDayErrorCount;
	}
	public long getLastDayMinMills() {
		return lastDayMinMills;
	}
	public void setLastDayMinMills(long lastDayMinMills) {
		this.lastDayMinMills = lastDayMinMills;
	}
	public long getLastDayMaxMills() {
		return lastDayMaxMills;
	}
	public void setLastDayMaxMills(long lastDayMaxMills) {
		this.lastDayMaxMills = lastDayMaxMills;
	}
	public long getLastDayAvgMills() {
		return lastDayAvgMills;
	}
	public void setLastDayAvgMills(long lastDayAvgMills) {
		this.lastDayAvgMills = lastDayAvgMills;
	}
	public Date getLastDayMaxInvokeAt() {
		return lastDayMaxInvokeAt;
	}
	public void setLastDayMaxInvokeAt(Date lastDayMaxInvokeAt) {
		this.lastDayMaxInvokeAt = lastDayMaxInvokeAt;
	}
	public long getLastMills() {
		return lastMills;
	}
	public void setLastMills(long lastMills) {
		this.lastMills = lastMills;
	}
	public Date getLastInvokeAt() {
		return lastInvokeAt;
	}
	public void setLastInvokeAt(Date lastInvokeAt) {
		this.lastInvokeAt = lastInvokeAt;
	}
}
