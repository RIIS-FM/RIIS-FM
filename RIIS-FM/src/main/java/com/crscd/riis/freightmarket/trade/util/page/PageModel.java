<<<<<<< HEAD:RIIS-FM/src/main/java/com/crscd/riis/freightmarket/trade/util/page/PageModel.java
package com.crscd.riis.freightmarket.trade.util.page;

import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

public class PageModel {
	/** 分页总数据条数  */
	private int recordCount;
	/** 当前页面 */
	private int pageIndex ;
	/** 每页分多少条数据   默认每页4条数据*/
	private int pageSize = tradeConstants.PAGE_DEFAULT_SIZE;
	
	/** 总页数  */
	private int totalSize;

	public int getRecordCount() {
		this.recordCount = this.recordCount <= 0 ? 0:this.recordCount;
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageIndex() {
		this.pageIndex = this.pageIndex <= 0?1:this.pageIndex;
		/** 判断当前页面是否超过了总页数:如果超过了默认给最后一页作为当前页  */
		this.pageIndex = this.pageIndex>=this.getTotalSize()?this.getTotalSize():this.pageIndex;
		
		return pageIndex;
	}	
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		this.pageSize = this.pageSize <= tradeConstants.PAGE_DEFAULT_SIZE?tradeConstants.PAGE_DEFAULT_SIZE:this.pageSize;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getTotalSize() {
		if(this.getRecordCount() <=0){
			totalSize = 0 ;
		}else{
			totalSize = (this.getRecordCount() -1)/this.getPageSize() + 1;
		}
		return totalSize;
	}
	
	
	public int getFirstLimitParam(){
		return (this.getPageIndex()-1)*this.getPageSize() ;
	}

}
=======
package com.crscd.riis.freightmarket.trade.util.page;

import com.crscd.riis.freightmarket.trade.util.tradeConstants.tradeConstants;

public class PageModel {
	/** 分页总数据条数  */
	private int recordCount;
	/** 当前页面 */
	private int pageIndex ;
	/** 每页分多少条数据   默认每页4条数据*/
	private int pageSize = tradeConstants.PAGE_DEFAULT_SIZE;
	
	/** 总页数  */
	private int totalSize;

	public int getRecordCount() {
		this.recordCount = this.recordCount <= 0 ? 0:this.recordCount;
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageIndex() {
		this.pageIndex = this.pageIndex <= 0?1:this.pageIndex;
		/** 判断当前页面是否超过了总页数:如果超过了默认给最后一页作为当前页  */
		this.pageIndex = this.pageIndex>=this.getTotalSize()?this.getTotalSize():this.pageIndex;
		
		return pageIndex;
	}	
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		this.pageSize = this.pageSize <= tradeConstants.PAGE_DEFAULT_SIZE?tradeConstants.PAGE_DEFAULT_SIZE:this.pageSize;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getTotalSize() {
		if(this.getRecordCount() <=0){
			totalSize = 0 ;
		}else{
			totalSize = (this.getRecordCount() -1)/this.getPageSize() + 1;
		}
		return totalSize;
	}
	
	
	public int getFirstLimitParam(){
		return (this.getPageIndex()-1)*this.getPageSize() ;
	}

}
>>>>>>> 4beca1a88c27f2eaadfe4360e22b0cfdc5fe97a8:RIIS-FM/src/main/java/com/crscd/riis/freightmarket/trade/util/page/PageModel.java
