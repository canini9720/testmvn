package com.testservice.common;



public final class CommonConstants {
	
	public static final int LANG_AR = 1;
	public static final int LANG_EN = 2;
	public static final String LANG_ID = "langId";
	
    public static final String LATITUDE="latitude";
    public static final String LONGITUDE="longitude";
    public static final String POLICESTATION="policeStation";
    public static final String REFERENCE_ID="referenceId";
    public static final String REFERENCE_NO="referenceNo";
    public static final String EMIRATES_ID="emiratesId";
    public static final String EMAIL = "email"; 
    
    public static final String STR_ZERO ="0";
    public static final String STR_ONE ="1";
    public static final String STR_TWO ="2";
    public static final String STR_QUESTION_MARK ="?";
    
    public static final int INT_ZERO_NO = 0;
    public static final int INT_ONE_YES = 1;
    
    public static final int INT_ZERO = 0;
    public static final int INT_ONE = 1;
    public static final int INT_TWO = 2;
    public static final int CUSTOMER_TYPE_RESIDENT = 1;
    public static final int CUSTOMER_TYPE_VISITOR = 2;
    public static final int INT_THREE = 3;
    
    public static final long LONG_ZERO = 0L;
    public static final long LONG_100 = 100L;
    public static final long LONG_200 = 200L;
    public static final long LONG_300 = 300L;
    public static final long LONG_400 = 400L;
    public static final long LONG_500 = 500L;
    
    public static final String RESULT = "result";
    public static final String RESPONSE_CODE="responseCode";
    public static final String RESPONSE_DESC="responseDesc";
    
    public static final String APP_STATUS_NEW_DTLS = "1";
    public static final String APP_STATUS_OTP = "3";
    public static final String APP_STATUS_PAYMENT = "4";
    public static final String APP_STATUS_USER_COMPLETED = "6";
    public static final String APP_STATUS_E_REJECTED = "48";
    public static final String APP_STATUS_E_REJECTED_DESC = "مرفض إلكترونيا";
    
    
    public static final String APP_STATUS_BC_REQUEST = "10";
    public static final String APP_STATUS_BC_ACCUSED = "11";
    public static final String APP_STATUS_BC_CHEQUES = "12";
    public static final String APP_STATUS_BC_QUESTIONS = "13";
    public static final String APP_STATUS_CGC_APPROVED = "27";
    
    public static final String STR_1000=   "1000";
    public static final String STR_2000=   "2000";
    
    public static final String IS_FORM_VALID = "isFormValid";
    public static final String IS_VALID_VEHICLE= "isValidVehicle";
    public static final String IS_VALID_LICENSE="isValidLicense";
    
    public static final String LIST= "list";
    
    public static final String CHARSET_UTF8 = ";charset=" + "UTF-8";
    public static final String UTF8 = "UTF-8";
    
    
    
    /**
     * dd/MM/yyyy
     * */
    public static final String DATE_ddMMyyyy = "dd/MM/yyyy";
    /**
     * dd-MM-yyyy
     * */
    public static final String DATE_dd_MM_yyyy = "dd-MM-yyyy";
    /**
     * HH:mm:ss
     * */
    public static final String DATE_HHMMSS = "HH:mm:ss";
    /**
     * yyyy/MM/dd
     * */
    public static final String DATE_yyyyMMdd = "yyyy/MM/dd";
    
    /**
     * yyyy-MM-dd
     * */
    public static final String DATE_yyyy_MM_dd = "yyyy-MM-dd";
    
    public static final String DATE_dd_MMM_yy = "dd-MMM-yy";
    
    public static final int ATTACHMENT_TYPE_ALL = 0;
    public static final int ATTACHMENT_TYPE_IMAGE = 1;
    public static final int ATTACHMENT_TYPE_AUDIO = 2;
    public static final int ATTACHMENT_TYPE_VIDEO = 3;
    public static final int ATTACHMENT_TYPE_DOCS = 4;
    
    public static final int EXC_NO_DATA_FOUND = 1403;
    public static final String EXC_NO_DATA_FOUND_ERROR = "ORA-01403: no data found";
    public static final String EXC_NO_DATA_FOUND_JPA_STR = "returned no results";
    public static final String EXC_NO_DATA_FOUND_JPA_ERROR = "Error calling CallableStatement.getMoreResults";
    
    public static final String EXC_SERVER_ERROR = "Server Error";
    
    public static final String SUBSCRIBE = "Y";
    public static final String UNSUBSCRIBE = "N";
    
    public static final int SUCCESS_CODE = 1;
    public static final String SUCCESS_DESC = "SUCCESS";
    
    public static final int PENDING_CODE = 2;
    public static final String PENDING_DESC = "PENDING";
    
    public static final int TRANS_FAILED_CODE = 3;
    public static final String TRANS_FAILED_DESC = "FAILURE";
    
    public static final int FAILURE_CODE = 0;
    public static final String FAILURE_DESC = "FAILURE";
    
    public static final int INVALID_USER_ID = 2;
    public static final int INVALID_PASSWORD = 3;
     
    
    public static final int SIDE_TYPE = 3;
    public static final int CAN_CONTACT = 2;
    
    public static final int DEST_EXPL_CAT_A = 1;
    
    public static final String PAYMENT_STATUS_PENDING = "Pending";
    public static final String PAYMENT_STATUS_PROCESSED = "Processed";
    public static final String PAYMENT_ERROR_AMOUNT = "TXN0013";

    public static final int WHOM_MAY_CONC_TRAFFIC_CASE = 1;
    public static final int WHOM_MAY_CONC_CRIMINAL_CASE = 2;
    public static final int WHOM_MAY_CONC_PASSPORT_CASE = 4;
    public static final int WHOM_MAY_CONC_PASSPORT_ONHOLD_CASE = 3;
    public static final int WHOM_MAY_CONC_PERSON_CUSTODY_CASE = 5;
    
    public static final int BOUNCED_CHEQUE_PERSON = 1;
    public static final int BOUNCED_CHEQUE_COMPANY = 2;
    
    public static final String EMIRATE_DXB = "DXB";

    public static final String DB_EXC_ORA_UNIQUE = "ORA-00001";
    public static final String DB_EXC_ORA_FK = "ORA-02291";
    public static final String DB_EXC_ORA_NO_DATA_FOUND = "ORA-01403";

    public static final int GOOD_CONDUCT_INSIDE = 1;
    public static final int GOOD_CONDUCT_OUTSIDE = 2;
    
    public static final int NAT_ID_LOCAL = 101;
    
    public static final int TRAFFIC_TRAINING_REQ_TYPE_COMPANY = 2;

    public static final int FINE_PAYMENT_BY_TCNO = 1;
    public static final int FINE_PAYMENT_BY_LIC = 2;
    public static final int FINE_PAYMENT_BY_PLATE = 3;
    public static final int FINE_PAYMENT_BY_FINENO = 4;
    public static final int FINE_PAYMENT_BY_CLEARANCE_CERTIFICATE = 5;
    
    public static final int FINE_PAYMENT_FLOW_LIST_FINES = 1;
    public static final int FINE_PAYMENT_FLOW_USER_VALIDATION = 2;
    public static final int FINE_PAYMENT_FLOW_PAYMENT = 3;
    public static final int FINE_PAYMENT_FLOW_CLEARANCE_INQUIRY = 4;
    
    public static final String SERVICE_INVOKE_LOG_FINEMNG_REQ = "fmngmt-req";
    public static final String SERVICE_INVOKE_LOG_FINEMNG_RESP = "fmngmt-resp";
    public static final String SERVICE_INVOKE_LOG_PAYCONFIRM_REQ = "payconfirm-req";
    public static final String SERVICE_INVOKE_LOG_PAYCONFIRM_RESP = "payconfirm-resp";
    public static final String SERVICE_INVOKE_LOG_CREATETRNS_REQ = "createtrns-req";
    public static final String SERVICE_INVOKE_LOG_CREATETRNS_RESP = "createtrns-resp";
    public static final String SERVICE_INVOKE_LOG_LOCKTRNS_REQ = "locktrns-req";
    public static final String SERVICE_INVOKE_LOG_LOCKTRNS_RESP = "locktrns-resp";
    
    public static final String SERVICE_INVOKE_LOG_RECEIPT_REQ = "receipt-req";
    public static final String SERVICE_INVOKE_LOG_RECEIPT_RESP = "receipt-resp";
    
    public static final int OTP_TYPE_DPSERVICES = 1;
    public static final int OTP_TYPE_TRAFFIC = 2;
    public static final int OTP_TYPE_USERPROFILE = 3;
    public static final int OTP_TYPE_EMIRATESID = 4;
    public static final int OTP_TYPE_MOBILE = 5;
    
    public static final String SERVICE_ID_ForStatus = "1";
    
    public static final int PROFILE_TYPE_USER = 1;
    public static final int PROFILE_TYPE_BP = 2;
    
    public static final String LIC_ACTIVE = "\u0641\u0639\u0627\u0644";
    public static final String LIC_WITH_OWNER ="\u0645\u0639 \u0627\u0644\u0645\u0627\u0644\u0643";

    
    public static final String IP_ADDRESS_NA = "NA";
    
    public static final String PASSWORD_UPDATED = "New Password Updated";
    
	public static final String FAILURE_URL = "/dpservices-web-1.0.0/paymentfailure.jsp";
	
	public static final String TOKEN_DELETED = "Token Deleted.";
	
	public static final String EMAIL_ALREADY_VALIDATE = "Email Already Verified";
    
	public static final int TOTAL_BLACK_POINTS = 24;
	// Person verified flags
	public static final String PERSON_VERIFIED_DEFAULT_STATUS = "1";
	public static final String PERSON_VERIFIED_BY_PS_STATUS = "2";
	
	public static final String FINE_TICKET_NO="7";
	public static final String SERVICE_ID_ForREPLY = "0";
	
	public static final String DEFAULT_PAGINATION_PAGE_START = "0";
	public static final String DEFAULT_PAGINATION_PAGE_END = "50";
	
	public static final String EMAIL_NOT_FOUND = "Email Not Found";
	
	public static final String PASSPORT_TYPE = "Passport";
	
	public static final String PAID_FINE = "PAID";
	
	public static final String APPL_LOG_NEW_APP = "NEW.APP.CREATED";
	public static final String APP_LOG_SAMEPERSON = "NEW.APP.CREATED.FORSAMEPERSON";
	public static final String APPL_LOG_OTP_DONE = "OTP.DONE";
	public static final String APPL_LOG_VERIF_DONE = "VERIF.DONE";
	public static final String APPL_LOG_PAYMENT_DONE = "PAYMENT.DONE";
	public static final String APP_STATUS_BANK_REPLY = "17";
	public static final String APP_STATUS_BANK_REPLY_REJECTED = "47";
	public static final String APP_STATUS_APPROVED = "9";
	public static final String APP_STATUS_REJECT   = "8";	
	public static final String APP_STATUS_PRINT   = "5";	
	public static final String APP_STATUS_COMPLETED   = "20";	
	public static final String APP_STATUS_SAVE_SERVICE   = "1";
	public static final String APP_STATUS_PRINT_RECIEPT   = "4";
	public static final String APP_STATUS_TRANSFER_TO_ONLINE_TEST   = "40";
	public static final String APP_STATUS_TRANSFER_TO_COMMITE   = "42";
	public static final String APP_STATUS_TRANSFER_TO_MEDICAL_TEST   = "43";
	public static final int SERVICE_TYPE_TRAFFIC = 2;
	public static final int SERVICE_TYPE_CID = 1;
	public static final String APP_STATUS_UNDER_PROCCESS   = "7";
	public static final String APP_STATUS_ONLINE_TEST_DONE   = "44";
	public static final String APP_STATUS_COMMITEE_DONE   = "45";
	public static final String APP_STATUS_MEDICAL_TEST_DONE   = "46";

	public static final int POLICE_STN_ID_CID = 1000;
	
	public static final String COMPL_BY_CUST_MSG_CODE = "";
	
	public static final String SMS_MESSAGE_OTP1 = "MSG001";
	public static final String SMS_MESSAGE_OTP2 = "MSG002";
	public static final String SMS_MESSAGE_COMPL_APPL = "MSG003";
	public static final String SMS_MESSAGE_JOB_APPL = "MSG016";
	public static final String SMS_MESSAGE_JOB_GCC = "MSG017";
	public static final String SMS_GOOD_CONDUCT_MOI = "MSG025";
	public static final String SMS_VERIFY_IDENTITY  = "MSG004";
	public static final String SMS_DETECTIVE_KIOSK = "MSG026";
	public static final String SMS_PENDING_NOTIF = "MSG027";
	
	public static final String NOTIF_STATUS_NOT_UPDATED_FILE_NAME = "NOTIF_SENT_NOT_UPDATED.file";
	
	public static final int PAYMENT_CHANNEL_COUNTER = 4;
	public static final int PAYMENT_CHANNEL_CASH_COUNTER = 4;
	public static final int PAYMENT_CHANNEL_POS_COUNTER = 3;
	public static final int CHANNEL_MASTER_FINANCE = 11;
	public static final int CHANNEL_MASTER_OSS = 1;
	public static final int CHANNEL_MASTER_TYPE_SPS = 1;
	public static final int UPDATE_SERVICE_DETAIL =0;
	public static final int DEFAULT_ROLE_ID =1;
	public static final String RELPY_TEXT_ID ="1";
	
	public static final String LOGGER_DPSERVICES_ERROR = "DPServices";
	public static final String LOGGER_DPSERVICES_INFO = "dpservicesinfo";
	public static final String LOGGER_TRAFFIC_SERVICES_INFO = "trafficservices";
	public static final String LOGGER_RECEIPT_SYSTEM_INFO = "receiptsystem";
	public static final String JOB_VACANCY_PERSON_APROVED_BY_COMMITEE = "MSG018";
	public static final String JOB_VACANCY_PERSON_REJECT_BY_COMMITEE = "MSG019	";
	public static final String JOB_VACANCY_PERSON_POSTPONED_BY_COMMITEE = "MSG020";
	public static final String JOB_VACANCY_MEDICAL_DONE = "MSG021";
	

	
	//device notification messages
	public static final String DEV_NOTIF_COMP_APPL = "NTF001";
	
	public static final String SERV_HEART_DISEASE = "Heart Disease Service";
	public static final String SERV_REPORT_ACCIDENT = "Report Accident Service";
	public static final String SERV_REPORT_BOUNCED_CHEQUES = "Report Bounced Cheques Service";
	public static final String SERV_REPORT_CRIME = "Report Crime Service";
	public static final String SERV_VIST_REQUEST = "Visit Request Service";
	
	//impound release failure reasons
	public static final String IMP_FAIL_FINE_EXISTS = "Fine Exists";
	public static final String IMP_FAIL_NO_CONFISCATION= "No confiscation exists";
	public static final String IMP_FAIL_MORE_THAN_ONE_CONFIS_EXIST = "More than one confiscation exists";
	public static final String IMP_FAIL_VEHICLE_IS_WANTED = "Vehicle wanted in CID and/or Traffic";
	
	//impound release failure reasons codes
	public static final String IMP_FAIL_FE = "IMP001";
	public static final String IMP_FAIL_NC = "IMP002";
	public static final String IMP_FAIL_MTOCE = "IMP003";
	public static final String IMP_FAIL_VW = "IMP004";
	
	//system properties
	public static final Integer IMP_SURROGATE  = 1;
	
	//application actions
	public static final String APP_ACT_SMART_APPROVAL  = "SMART_APPROVAL";
	public static final String APP_ACT_SMART_ERROR  = "SMART_ERROR";
	public static final String APP_ACT_SMART_REJECT  = "SMART_REJECT";
	
	 public static final String DATE_ddMMyyyy_HH_MM_SS = "dd/MM/YYYY hh:mm:ss";

	 public static final Integer LOST_ITEM_TYPE_MATERIAL = 1;
	 public static final Integer LOST_ITEM_TYPE_MONEY = 2;
	 public static final Integer LOST_ITEM_TYPE_JEWELERY = 3;
	 public static final String COOMENTS_LIST_NOT_FOUND = "Comments not found against offerId";
	 
	 public static final String TRAFFIC_POINTS  = "trafficPoints";
	 
	 public static final String PAY_METHOD_CASH = "1";
	 public static final String PAY_METHOD_CREDIT_CARD = "3";
	 
	 public static final String Y = "Y";
	 public static final String N = "N";
	 
	public static final int RANDOM_NUM_LENGTH = 32;
		
	public static final String[] ATTACHMENT_IMAGE_TYPES = {"image/jpeg", "image/png", "image/jpg"};
	public static final int MAX_IMAGE_SIZE = 512;
	
	public static final int IS_VISIT_FIRST_TIME =1;
	
	public static final int CUST_MOBILE_SRC_MOI = 1;
	public static final int CUST_MOBILE_SRC_MYID = 2;
	public static final int CUST_MOBILE_SRC_EIDA = 3;
	public static final int CUST_MOBILE_SRC_OFFICER = 4;
	public static final int CUST_MOBILE_SRC_CUSTOMER = 5;
	public static final int CUSTOMERINFO_PERSON_NOT_VERIFIED =0; 

	public static final String VSD_BLOCKING_NODE_CODE = "DEF_NODE_CODE";
	public static final String VSD_BLOCKING_REASON_AR = "DEF_REASON_AR";
	public static final String VSD_BLOCKING_REASON_EN = "DEF_REASON_EN";
	
	public static final int TRAFFIC_NOC_SETVICE_CODE=253;
	public static final int TRAFFIC_NOC_CENTER_CODE =1461;
	
	public static final String EMPTY_STR ="";
	public static final String 	UNDEFINED ="undefined";
	public static final int CRIMINAL_CASE_ATTACH_TYPE =3;

}
