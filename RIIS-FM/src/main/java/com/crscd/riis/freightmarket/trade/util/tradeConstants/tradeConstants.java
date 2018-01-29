package com.crscd.riis.freightmarket.trade.util.tradeConstants;

public class tradeConstants {
	/** 默认每页4条数据*/		
	public static int PAGE_DEFAULT_SIZE = 4;
	
	/** 默认集装箱运输的标志位为3*/
	public static int BOX_FREIGHT_FLAG = 3;
	
	/** 默认快运的起始标志位为4*/
	public static int FAST_FREIGHT_FLAG_START = 4;
	
	/** 默认快运的终止标志位为6*/
	public static int FAST_FREIGHT_FLAG_END = 6;
	
	/** 默认整车运输的起始标志位为7*/
	public static int WHOLE_VEGICLE_FLAG_START = 7;
	
	/** 默认整车运输的终止标志位为10*/
	public static int WHOLE_VEGICLE_FLAG_END = 10;
	
    /** 默认人工审核的标志位为1*/
	public static int PEOPLE_AUDIT_TYPE_FLAG = 1;
	
	/** 默认系统审核的标志位为0*/
	public static int SYS_AUDIT_TYPE_FLAG = 0;

	/** 20英寸集装箱*/
	public static int BOX_TYPE_20INCH = 0;
	
	/** 40英寸集装箱*/
	public static int BOX_TYPE_40INCH = 1;
	
	/** 运单未支付标志为0*/
	public static int WAYBILL_STATE_NON_PAYMENT = 0;
	
	/** 运单已支付标志为1*/
	public static int WAYBILL_STATE_PAYMENT = 1;
	
	/** 运单待发货标志位为0*/
	public static int WAYBILL_STATE_WAIT_SEND = 0;
	
	/** 运单待收货标志位为1*/
	public static int WAYBILL_STATE_WAIT_RECEIVE = 1;
	
	/** 运单待评价标志位为2*/
	public static int WAYBILL_STATE_WAIT_ESTIMATE = 2;
	
	/** 运单已完成标志位为3*/
	public static int WAYBILL_STATE_COMPLETE = 3;
	
	/** 运单已取消标志位为4*/
	public static int WAYBILL_STATE_CANCEL = 4;
	
	/** 审核未通过标识位 0*/
	public static int AUDIT_NOT_PASS_FLAG = 0;
	
	/** 审核通过标识位 1*/
	public static int AUDIT_PASS_FLAG = 1;

	/** 未选择承运方案标志位为0*/
	public static int TRANSPORT_SCHEME_NOT_SELECT_FLAG = 0;
	
	/** 选择承运方案标志位为1*/
	public static int TRANSPORT_SCHEME_SELECT_FLAG = 1;
	
	/** 运费标识位 0 */
	public static int FEE_FLAG = 0;
	
	/** 订单草稿标志位为0*/
	public static int ORDER_DRAFT = 0;
	
	/** 订单待审核标志位为1*/
	public static int ORDER_WAIT_AUDIT = 1;
	
	/** 订单确认承运方案标志位为2*/
	public static int ORDER_COMMIT_TRANSPORT_SCHEME = 2;
	
	/** 订单已审核未通过标志位为3*/
	public static int ORDER_AUDIT_NOT_PASS = 3;
	
	/** 订单待付款标志位为4*/
	public static int ORDER_WAIT_PAYMENT = 4;
	
	/** 订单运输中标志位为5*/
	public static int ORDER_IN_TRANSIT = 5;
	
	/** 订单待评价标志位为6*/
	public static int ORDER_WAIT_ESTIMATE = 6;
	
	/** 订单已完成标志位为7*/
	public static int ORDER_COMPLETE = 7;
	
	/** 订单已取消标志位为8*/
	public static int ORDER_CANCEL = 8;
	
	/** 日运输订单标识位 0*/
	public static int  TRANSFER_INFO= 0;
	
	/** 阶段运输标识位 1*/
	public static int   STAGE_PLAN_ORDER = 1;
	

}