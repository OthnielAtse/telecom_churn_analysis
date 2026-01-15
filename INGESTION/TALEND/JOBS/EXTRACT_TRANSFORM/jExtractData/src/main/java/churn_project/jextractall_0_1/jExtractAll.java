// ============================================================================
//
// Copyright (c) 2006-2015, Talend SA
//
// Ce code source a été automatiquement généré par_Talend Open Studio for Data Integration
// / Soumis à la Licence Apache, Version 2.0 (la "Licence") ;
// votre utilisation de ce fichier doit respecter les termes de la Licence.
// Vous pouvez obtenir une copie de la Licence sur
// http://www.apache.org/licenses/LICENSE-2.0
// 
// Sauf lorsqu'explicitement prévu par la loi en vigueur ou accepté par écrit, le logiciel
// distribué sous la Licence est distribué "TEL QUEL",
// SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
// Consultez la Licence pour connaître la terminologie spécifique régissant les autorisations et
// les limites prévues par la Licence.


package churn_project.jextractall_0_1;

import routines.ServiceHash;
import routines.Numeric;
import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.Relational;
import routines.TalendDate;
import routines.Mathematical;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 





@SuppressWarnings("unused")

/**
 * Job: jExtractAll Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jExtractAll implements TalendJob {

protected static void logIgnoredError(String message, Throwable cause) {
       System.err.println(message);
       if (cause != null) {
               cause.printStackTrace();
       }

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(schemaDwh != null){
				
					this.setProperty("schemaDwh", schemaDwh.toString());
				
			}
			
			if(churnFileName != null){
				
					this.setProperty("churnFileName", churnFileName.toString());
				
			}
			
			if(churnFileRepo != null){
				
					this.setProperty("churnFileRepo", churnFileRepo.toString());
				
			}
			
			if(exporteFileName != null){
				
					this.setProperty("exporteFileName", exporteFileName.toString());
				
			}
			
			if(populationFileName != null){
				
					this.setProperty("populationFileName", populationFileName.toString());
				
			}
			
			if(additionalParam != null){
				
					this.setProperty("additionalParam", additionalParam.toString());
				
			}
			
			if(database != null){
				
					this.setProperty("database", database.toString());
				
			}
			
			if(password != null){
				
					this.setProperty("password", password.toString());
				
			}
			
			if(port != null){
				
					this.setProperty("port", port.toString());
				
			}
			
			if(schemaParams != null){
				
					this.setProperty("schemaParams", schemaParams.toString());
				
			}
			
			if(serverName != null){
				
					this.setProperty("serverName", serverName.toString());
				
			}
			
			if(user != null){
				
					this.setProperty("user", user.toString());
				
			}
			
			if(dataFolder != null){
				
					this.setProperty("dataFolder", dataFolder.toString());
				
			}
			
			if(encodage != null){
				
					this.setProperty("encodage", encodage.toString());
				
			}
			
			if(fileSeparator != null){
				
					this.setProperty("fileSeparator", fileSeparator.toString());
				
			}
			
			if(projectFolder != null){
				
					this.setProperty("projectFolder", projectFolder.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String schemaDwh;
public String getSchemaDwh(){
	return this.schemaDwh;
}
public String churnFileName;
public String getChurnFileName(){
	return this.churnFileName;
}
public String churnFileRepo;
public String getChurnFileRepo(){
	return this.churnFileRepo;
}
public String exporteFileName;
public String getExporteFileName(){
	return this.exporteFileName;
}
public String populationFileName;
public String getPopulationFileName(){
	return this.populationFileName;
}
public String additionalParam;
public String getAdditionalParam(){
	return this.additionalParam;
}
public String database;
public String getDatabase(){
	return this.database;
}
public String password;
public String getPassword(){
	return this.password;
}
public String port;
public String getPort(){
	return this.port;
}
public String schemaParams;
public String getSchemaParams(){
	return this.schemaParams;
}
public String serverName;
public String getServerName(){
	return this.serverName;
}
public String user;
public String getUser(){
	return this.user;
}
public String dataFolder;
public String getDataFolder(){
	return this.dataFolder;
}
public String encodage;
public String getEncodage(){
	return this.encodage;
}
public String fileSeparator;
public String getFileSeparator(){
	return this.fileSeparator;
}
public String projectFolder;
public String getProjectFolder(){
	return this.projectFolder;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "jExtractAll";
	private final String projectName = "CHURN_PROJECT";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				jExtractAll.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jExtractAll.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tFileExist_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileExist_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tLogRow_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileExist_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
	





public void tFileExist_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileExist_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tFileExist_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileExist_1", false);
		start_Hash.put("tFileExist_1", System.currentTimeMillis());
		
	
	currentComponent="tFileExist_1";

	
		int tos_count_tFileExist_1 = 0;
		

 



/**
 * [tFileExist_1 begin ] stop
 */
	
	/**
	 * [tFileExist_1 main ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	



java.io.File file_tFileExist_1 = new java.io.File(context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv");
if (!file_tFileExist_1.exists()) {
    globalMap.put("tFileExist_1_EXISTS",false);
}else{
	globalMap.put("tFileExist_1_EXISTS",true);
}

globalMap.put("tFileExist_1_FILENAME",context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv");


 


	tos_count_tFileExist_1++;

/**
 * [tFileExist_1 main ] stop
 */
	
	/**
	 * [tFileExist_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	

 



/**
 * [tFileExist_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileExist_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	

 



/**
 * [tFileExist_1 process_data_end ] stop
 */
	
	/**
	 * [tFileExist_1 end ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	

 

ok_Hash.put("tFileExist_1", true);
end_Hash.put("tFileExist_1", System.currentTimeMillis());

   			if (!((Boolean)globalMap.get("tFileExist_1_EXISTS"))) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If1", 0, "true");
					}
				tFileInputDelimited_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If1", 0, "false");
					}   	 
   				}
   			if (((Boolean)globalMap.get("tFileExist_1_EXISTS"))) {
   				
					if(execStat){
   	 					runStat.updateStatOnConnection("If2", 0, "true");
					}
				tDie_1Process(globalMap);
			}

			   
   				else{
					if(execStat){   
   	 					runStat.updateStatOnConnection("If2", 0, "false");
					}   	 
   				}



/**
 * [tFileExist_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileExist_1 finally ] start
	 */

	

	
	
	currentComponent="tFileExist_1";

	

 



/**
 * [tFileExist_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileExist_1_SUBPROCESS_STATE", 1);
	}
	


public static class new_line_addedStruct implements routines.system.IPersistableRow<new_line_addedStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractAll = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractAll = new byte[0];

	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public String Gender;

				public String getGender () {
					return this.Gender;
				}
				
			    public Integer Age;

				public Integer getAge () {
					return this.Age;
				}
				
			    public String Married;

				public String getMarried () {
					return this.Married;
				}
				
			    public Integer NumberOfDependents;

				public Integer getNumberOfDependents () {
					return this.NumberOfDependents;
				}
				
			    public String City;

				public String getCity () {
					return this.City;
				}
				
			    public String ZipCode;

				public String getZipCode () {
					return this.ZipCode;
				}
				
			    public Float Lattitude;

				public Float getLattitude () {
					return this.Lattitude;
				}
				
			    public Float Longitude;

				public Float getLongitude () {
					return this.Longitude;
				}
				
			    public Integer NumberOfReferrals;

				public Integer getNumberOfReferrals () {
					return this.NumberOfReferrals;
				}
				
			    public Integer TenureInMonths;

				public Integer getTenureInMonths () {
					return this.TenureInMonths;
				}
				
			    public String Offer;

				public String getOffer () {
					return this.Offer;
				}
				
			    public String PhoneService;

				public String getPhoneService () {
					return this.PhoneService;
				}
				
			    public Float AvgMonthlyLongDistanceCharges;

				public Float getAvgMonthlyLongDistanceCharges () {
					return this.AvgMonthlyLongDistanceCharges;
				}
				
			    public String MultipleLines;

				public String getMultipleLines () {
					return this.MultipleLines;
				}
				
			    public String InternetService;

				public String getInternetService () {
					return this.InternetService;
				}
				
			    public String InternetType;

				public String getInternetType () {
					return this.InternetType;
				}
				
			    public Float AvgMonthlyGBDownload;

				public Float getAvgMonthlyGBDownload () {
					return this.AvgMonthlyGBDownload;
				}
				
			    public String OnlineSecurity;

				public String getOnlineSecurity () {
					return this.OnlineSecurity;
				}
				
			    public String OnlineBackup;

				public String getOnlineBackup () {
					return this.OnlineBackup;
				}
				
			    public String DeviceProtectionPlan;

				public String getDeviceProtectionPlan () {
					return this.DeviceProtectionPlan;
				}
				
			    public String PremiumTechSupport;

				public String getPremiumTechSupport () {
					return this.PremiumTechSupport;
				}
				
			    public String StreamingTV;

				public String getStreamingTV () {
					return this.StreamingTV;
				}
				
			    public String StreamingMovies;

				public String getStreamingMovies () {
					return this.StreamingMovies;
				}
				
			    public String StreamingMusic;

				public String getStreamingMusic () {
					return this.StreamingMusic;
				}
				
			    public String UnlimitedData;

				public String getUnlimitedData () {
					return this.UnlimitedData;
				}
				
			    public String Contract;

				public String getContract () {
					return this.Contract;
				}
				
			    public String PaperlessBilling;

				public String getPaperlessBilling () {
					return this.PaperlessBilling;
				}
				
			    public String PaymentMethod;

				public String getPaymentMethod () {
					return this.PaymentMethod;
				}
				
			    public Float MonthlyCharge;

				public Float getMonthlyCharge () {
					return this.MonthlyCharge;
				}
				
			    public Float TotalCharges;

				public Float getTotalCharges () {
					return this.TotalCharges;
				}
				
			    public Float TotalRefunds;

				public Float getTotalRefunds () {
					return this.TotalRefunds;
				}
				
			    public Float TotalExtraDataCharges;

				public Float getTotalExtraDataCharges () {
					return this.TotalExtraDataCharges;
				}
				
			    public Float TotalLongDistanceCharges;

				public Float getTotalLongDistanceCharges () {
					return this.TotalLongDistanceCharges;
				}
				
			    public Float TotalRevenue;

				public Float getTotalRevenue () {
					return this.TotalRevenue;
				}
				
			    public String CustomerStatus;

				public String getCustomerStatus () {
					return this.CustomerStatus;
				}
				
			    public String ChurnCategory;

				public String getChurnCategory () {
					return this.ChurnCategory;
				}
				
			    public String ChurnReason;

				public String getChurnReason () {
					return this.ChurnReason;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",Gender="+Gender);
		sb.append(",Age="+String.valueOf(Age));
		sb.append(",Married="+Married);
		sb.append(",NumberOfDependents="+String.valueOf(NumberOfDependents));
		sb.append(",City="+City);
		sb.append(",ZipCode="+ZipCode);
		sb.append(",Lattitude="+String.valueOf(Lattitude));
		sb.append(",Longitude="+String.valueOf(Longitude));
		sb.append(",NumberOfReferrals="+String.valueOf(NumberOfReferrals));
		sb.append(",TenureInMonths="+String.valueOf(TenureInMonths));
		sb.append(",Offer="+Offer);
		sb.append(",PhoneService="+PhoneService);
		sb.append(",AvgMonthlyLongDistanceCharges="+String.valueOf(AvgMonthlyLongDistanceCharges));
		sb.append(",MultipleLines="+MultipleLines);
		sb.append(",InternetService="+InternetService);
		sb.append(",InternetType="+InternetType);
		sb.append(",AvgMonthlyGBDownload="+String.valueOf(AvgMonthlyGBDownload));
		sb.append(",OnlineSecurity="+OnlineSecurity);
		sb.append(",OnlineBackup="+OnlineBackup);
		sb.append(",DeviceProtectionPlan="+DeviceProtectionPlan);
		sb.append(",PremiumTechSupport="+PremiumTechSupport);
		sb.append(",StreamingTV="+StreamingTV);
		sb.append(",StreamingMovies="+StreamingMovies);
		sb.append(",StreamingMusic="+StreamingMusic);
		sb.append(",UnlimitedData="+UnlimitedData);
		sb.append(",Contract="+Contract);
		sb.append(",PaperlessBilling="+PaperlessBilling);
		sb.append(",PaymentMethod="+PaymentMethod);
		sb.append(",MonthlyCharge="+String.valueOf(MonthlyCharge));
		sb.append(",TotalCharges="+String.valueOf(TotalCharges));
		sb.append(",TotalRefunds="+String.valueOf(TotalRefunds));
		sb.append(",TotalExtraDataCharges="+String.valueOf(TotalExtraDataCharges));
		sb.append(",TotalLongDistanceCharges="+String.valueOf(TotalLongDistanceCharges));
		sb.append(",TotalRevenue="+String.valueOf(TotalRevenue));
		sb.append(",CustomerStatus="+CustomerStatus);
		sb.append(",ChurnCategory="+ChurnCategory);
		sb.append(",ChurnReason="+ChurnReason);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(new_line_addedStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class null_customerIDStruct implements routines.system.IPersistableRow<null_customerIDStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractAll = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractAll = new byte[0];

	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public String Gender;

				public String getGender () {
					return this.Gender;
				}
				
			    public Integer Age;

				public Integer getAge () {
					return this.Age;
				}
				
			    public String Married;

				public String getMarried () {
					return this.Married;
				}
				
			    public Integer NumberOfDependents;

				public Integer getNumberOfDependents () {
					return this.NumberOfDependents;
				}
				
			    public String City;

				public String getCity () {
					return this.City;
				}
				
			    public String ZipCode;

				public String getZipCode () {
					return this.ZipCode;
				}
				
			    public Float Lattitude;

				public Float getLattitude () {
					return this.Lattitude;
				}
				
			    public Float Longitude;

				public Float getLongitude () {
					return this.Longitude;
				}
				
			    public Integer NumberOfReferrals;

				public Integer getNumberOfReferrals () {
					return this.NumberOfReferrals;
				}
				
			    public Integer TenureInMonths;

				public Integer getTenureInMonths () {
					return this.TenureInMonths;
				}
				
			    public String Offer;

				public String getOffer () {
					return this.Offer;
				}
				
			    public String PhoneService;

				public String getPhoneService () {
					return this.PhoneService;
				}
				
			    public Float AvgMonthlyLongDistanceCharges;

				public Float getAvgMonthlyLongDistanceCharges () {
					return this.AvgMonthlyLongDistanceCharges;
				}
				
			    public String MultipleLines;

				public String getMultipleLines () {
					return this.MultipleLines;
				}
				
			    public String InternetService;

				public String getInternetService () {
					return this.InternetService;
				}
				
			    public String InternetType;

				public String getInternetType () {
					return this.InternetType;
				}
				
			    public Float AvgMonthlyGBDownload;

				public Float getAvgMonthlyGBDownload () {
					return this.AvgMonthlyGBDownload;
				}
				
			    public String OnlineSecurity;

				public String getOnlineSecurity () {
					return this.OnlineSecurity;
				}
				
			    public String OnlineBackup;

				public String getOnlineBackup () {
					return this.OnlineBackup;
				}
				
			    public String DeviceProtectionPlan;

				public String getDeviceProtectionPlan () {
					return this.DeviceProtectionPlan;
				}
				
			    public String PremiumTechSupport;

				public String getPremiumTechSupport () {
					return this.PremiumTechSupport;
				}
				
			    public String StreamingTV;

				public String getStreamingTV () {
					return this.StreamingTV;
				}
				
			    public String StreamingMovies;

				public String getStreamingMovies () {
					return this.StreamingMovies;
				}
				
			    public String StreamingMusic;

				public String getStreamingMusic () {
					return this.StreamingMusic;
				}
				
			    public String UnlimitedData;

				public String getUnlimitedData () {
					return this.UnlimitedData;
				}
				
			    public String Contract;

				public String getContract () {
					return this.Contract;
				}
				
			    public String PaperlessBilling;

				public String getPaperlessBilling () {
					return this.PaperlessBilling;
				}
				
			    public String PaymentMethod;

				public String getPaymentMethod () {
					return this.PaymentMethod;
				}
				
			    public Float MonthlyCharge;

				public Float getMonthlyCharge () {
					return this.MonthlyCharge;
				}
				
			    public Float TotalCharges;

				public Float getTotalCharges () {
					return this.TotalCharges;
				}
				
			    public Float TotalRefunds;

				public Float getTotalRefunds () {
					return this.TotalRefunds;
				}
				
			    public Float TotalExtraDataCharges;

				public Float getTotalExtraDataCharges () {
					return this.TotalExtraDataCharges;
				}
				
			    public Float TotalLongDistanceCharges;

				public Float getTotalLongDistanceCharges () {
					return this.TotalLongDistanceCharges;
				}
				
			    public Float TotalRevenue;

				public Float getTotalRevenue () {
					return this.TotalRevenue;
				}
				
			    public String CustomerStatus;

				public String getCustomerStatus () {
					return this.CustomerStatus;
				}
				
			    public String ChurnCategory;

				public String getChurnCategory () {
					return this.ChurnCategory;
				}
				
			    public String ChurnReason;

				public String getChurnReason () {
					return this.ChurnReason;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",Gender="+Gender);
		sb.append(",Age="+String.valueOf(Age));
		sb.append(",Married="+Married);
		sb.append(",NumberOfDependents="+String.valueOf(NumberOfDependents));
		sb.append(",City="+City);
		sb.append(",ZipCode="+ZipCode);
		sb.append(",Lattitude="+String.valueOf(Lattitude));
		sb.append(",Longitude="+String.valueOf(Longitude));
		sb.append(",NumberOfReferrals="+String.valueOf(NumberOfReferrals));
		sb.append(",TenureInMonths="+String.valueOf(TenureInMonths));
		sb.append(",Offer="+Offer);
		sb.append(",PhoneService="+PhoneService);
		sb.append(",AvgMonthlyLongDistanceCharges="+String.valueOf(AvgMonthlyLongDistanceCharges));
		sb.append(",MultipleLines="+MultipleLines);
		sb.append(",InternetService="+InternetService);
		sb.append(",InternetType="+InternetType);
		sb.append(",AvgMonthlyGBDownload="+String.valueOf(AvgMonthlyGBDownload));
		sb.append(",OnlineSecurity="+OnlineSecurity);
		sb.append(",OnlineBackup="+OnlineBackup);
		sb.append(",DeviceProtectionPlan="+DeviceProtectionPlan);
		sb.append(",PremiumTechSupport="+PremiumTechSupport);
		sb.append(",StreamingTV="+StreamingTV);
		sb.append(",StreamingMovies="+StreamingMovies);
		sb.append(",StreamingMusic="+StreamingMusic);
		sb.append(",UnlimitedData="+UnlimitedData);
		sb.append(",Contract="+Contract);
		sb.append(",PaperlessBilling="+PaperlessBilling);
		sb.append(",PaymentMethod="+PaymentMethod);
		sb.append(",MonthlyCharge="+String.valueOf(MonthlyCharge));
		sb.append(",TotalCharges="+String.valueOf(TotalCharges));
		sb.append(",TotalRefunds="+String.valueOf(TotalRefunds));
		sb.append(",TotalExtraDataCharges="+String.valueOf(TotalExtraDataCharges));
		sb.append(",TotalLongDistanceCharges="+String.valueOf(TotalLongDistanceCharges));
		sb.append(",TotalRevenue="+String.valueOf(TotalRevenue));
		sb.append(",CustomerStatus="+CustomerStatus);
		sb.append(",ChurnCategory="+ChurnCategory);
		sb.append(",ChurnReason="+ChurnReason);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(null_customerIDStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class exportStruct implements routines.system.IPersistableRow<exportStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractAll = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractAll = new byte[0];

	
			    public String exportes;

				public String getExportes () {
					return this.exportes;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.exportes = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.exportes = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.exportes,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.exportes,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("exportes="+exportes);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(exportStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row1Struct implements routines.system.IPersistableRow<row1Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractAll = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractAll = new byte[0];

	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public String Gender;

				public String getGender () {
					return this.Gender;
				}
				
			    public Integer Age;

				public Integer getAge () {
					return this.Age;
				}
				
			    public String Married;

				public String getMarried () {
					return this.Married;
				}
				
			    public Integer NumberOfDependents;

				public Integer getNumberOfDependents () {
					return this.NumberOfDependents;
				}
				
			    public String City;

				public String getCity () {
					return this.City;
				}
				
			    public String ZipCode;

				public String getZipCode () {
					return this.ZipCode;
				}
				
			    public Float Lattitude;

				public Float getLattitude () {
					return this.Lattitude;
				}
				
			    public Float Longitude;

				public Float getLongitude () {
					return this.Longitude;
				}
				
			    public Integer NumberOfReferrals;

				public Integer getNumberOfReferrals () {
					return this.NumberOfReferrals;
				}
				
			    public Integer TenureInMonths;

				public Integer getTenureInMonths () {
					return this.TenureInMonths;
				}
				
			    public String Offer;

				public String getOffer () {
					return this.Offer;
				}
				
			    public String PhoneService;

				public String getPhoneService () {
					return this.PhoneService;
				}
				
			    public Float AvgMonthlyLongDistanceCharges;

				public Float getAvgMonthlyLongDistanceCharges () {
					return this.AvgMonthlyLongDistanceCharges;
				}
				
			    public String MultipleLines;

				public String getMultipleLines () {
					return this.MultipleLines;
				}
				
			    public String InternetService;

				public String getInternetService () {
					return this.InternetService;
				}
				
			    public String InternetType;

				public String getInternetType () {
					return this.InternetType;
				}
				
			    public Float AvgMonthlyGBDownload;

				public Float getAvgMonthlyGBDownload () {
					return this.AvgMonthlyGBDownload;
				}
				
			    public String OnlineSecurity;

				public String getOnlineSecurity () {
					return this.OnlineSecurity;
				}
				
			    public String OnlineBackup;

				public String getOnlineBackup () {
					return this.OnlineBackup;
				}
				
			    public String DeviceProtectionPlan;

				public String getDeviceProtectionPlan () {
					return this.DeviceProtectionPlan;
				}
				
			    public String PremiumTechSupport;

				public String getPremiumTechSupport () {
					return this.PremiumTechSupport;
				}
				
			    public String StreamingTV;

				public String getStreamingTV () {
					return this.StreamingTV;
				}
				
			    public String StreamingMovies;

				public String getStreamingMovies () {
					return this.StreamingMovies;
				}
				
			    public String StreamingMusic;

				public String getStreamingMusic () {
					return this.StreamingMusic;
				}
				
			    public String UnlimitedData;

				public String getUnlimitedData () {
					return this.UnlimitedData;
				}
				
			    public String Contract;

				public String getContract () {
					return this.Contract;
				}
				
			    public String PaperlessBilling;

				public String getPaperlessBilling () {
					return this.PaperlessBilling;
				}
				
			    public String PaymentMethod;

				public String getPaymentMethod () {
					return this.PaymentMethod;
				}
				
			    public Float MonthlyCharge;

				public Float getMonthlyCharge () {
					return this.MonthlyCharge;
				}
				
			    public Float TotalCharges;

				public Float getTotalCharges () {
					return this.TotalCharges;
				}
				
			    public Float TotalRefunds;

				public Float getTotalRefunds () {
					return this.TotalRefunds;
				}
				
			    public Float TotalExtraDataCharges;

				public Float getTotalExtraDataCharges () {
					return this.TotalExtraDataCharges;
				}
				
			    public Float TotalLongDistanceCharges;

				public Float getTotalLongDistanceCharges () {
					return this.TotalLongDistanceCharges;
				}
				
			    public Float TotalRevenue;

				public Float getTotalRevenue () {
					return this.TotalRevenue;
				}
				
			    public String CustomerStatus;

				public String getCustomerStatus () {
					return this.CustomerStatus;
				}
				
			    public String ChurnCategory;

				public String getChurnCategory () {
					return this.ChurnCategory;
				}
				
			    public String ChurnReason;

				public String getChurnReason () {
					return this.ChurnReason;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",Gender="+Gender);
		sb.append(",Age="+String.valueOf(Age));
		sb.append(",Married="+Married);
		sb.append(",NumberOfDependents="+String.valueOf(NumberOfDependents));
		sb.append(",City="+City);
		sb.append(",ZipCode="+ZipCode);
		sb.append(",Lattitude="+String.valueOf(Lattitude));
		sb.append(",Longitude="+String.valueOf(Longitude));
		sb.append(",NumberOfReferrals="+String.valueOf(NumberOfReferrals));
		sb.append(",TenureInMonths="+String.valueOf(TenureInMonths));
		sb.append(",Offer="+Offer);
		sb.append(",PhoneService="+PhoneService);
		sb.append(",AvgMonthlyLongDistanceCharges="+String.valueOf(AvgMonthlyLongDistanceCharges));
		sb.append(",MultipleLines="+MultipleLines);
		sb.append(",InternetService="+InternetService);
		sb.append(",InternetType="+InternetType);
		sb.append(",AvgMonthlyGBDownload="+String.valueOf(AvgMonthlyGBDownload));
		sb.append(",OnlineSecurity="+OnlineSecurity);
		sb.append(",OnlineBackup="+OnlineBackup);
		sb.append(",DeviceProtectionPlan="+DeviceProtectionPlan);
		sb.append(",PremiumTechSupport="+PremiumTechSupport);
		sb.append(",StreamingTV="+StreamingTV);
		sb.append(",StreamingMovies="+StreamingMovies);
		sb.append(",StreamingMusic="+StreamingMusic);
		sb.append(",UnlimitedData="+UnlimitedData);
		sb.append(",Contract="+Contract);
		sb.append(",PaperlessBilling="+PaperlessBilling);
		sb.append(",PaymentMethod="+PaymentMethod);
		sb.append(",MonthlyCharge="+String.valueOf(MonthlyCharge));
		sb.append(",TotalCharges="+String.valueOf(TotalCharges));
		sb.append(",TotalRefunds="+String.valueOf(TotalRefunds));
		sb.append(",TotalExtraDataCharges="+String.valueOf(TotalExtraDataCharges));
		sb.append(",TotalLongDistanceCharges="+String.valueOf(TotalLongDistanceCharges));
		sb.append(",TotalRevenue="+String.valueOf(TotalRevenue));
		sb.append(",CustomerStatus="+CustomerStatus);
		sb.append(",ChurnCategory="+ChurnCategory);
		sb.append(",ChurnReason="+ChurnReason);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tFileInputDelimited_1Struct implements routines.system.IPersistableRow<after_tFileInputDelimited_1Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractAll = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractAll = new byte[0];

	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public String Gender;

				public String getGender () {
					return this.Gender;
				}
				
			    public Integer Age;

				public Integer getAge () {
					return this.Age;
				}
				
			    public String Married;

				public String getMarried () {
					return this.Married;
				}
				
			    public Integer NumberOfDependents;

				public Integer getNumberOfDependents () {
					return this.NumberOfDependents;
				}
				
			    public String City;

				public String getCity () {
					return this.City;
				}
				
			    public String ZipCode;

				public String getZipCode () {
					return this.ZipCode;
				}
				
			    public Float Lattitude;

				public Float getLattitude () {
					return this.Lattitude;
				}
				
			    public Float Longitude;

				public Float getLongitude () {
					return this.Longitude;
				}
				
			    public Integer NumberOfReferrals;

				public Integer getNumberOfReferrals () {
					return this.NumberOfReferrals;
				}
				
			    public Integer TenureInMonths;

				public Integer getTenureInMonths () {
					return this.TenureInMonths;
				}
				
			    public String Offer;

				public String getOffer () {
					return this.Offer;
				}
				
			    public String PhoneService;

				public String getPhoneService () {
					return this.PhoneService;
				}
				
			    public Float AvgMonthlyLongDistanceCharges;

				public Float getAvgMonthlyLongDistanceCharges () {
					return this.AvgMonthlyLongDistanceCharges;
				}
				
			    public String MultipleLines;

				public String getMultipleLines () {
					return this.MultipleLines;
				}
				
			    public String InternetService;

				public String getInternetService () {
					return this.InternetService;
				}
				
			    public String InternetType;

				public String getInternetType () {
					return this.InternetType;
				}
				
			    public Float AvgMonthlyGBDownload;

				public Float getAvgMonthlyGBDownload () {
					return this.AvgMonthlyGBDownload;
				}
				
			    public String OnlineSecurity;

				public String getOnlineSecurity () {
					return this.OnlineSecurity;
				}
				
			    public String OnlineBackup;

				public String getOnlineBackup () {
					return this.OnlineBackup;
				}
				
			    public String DeviceProtectionPlan;

				public String getDeviceProtectionPlan () {
					return this.DeviceProtectionPlan;
				}
				
			    public String PremiumTechSupport;

				public String getPremiumTechSupport () {
					return this.PremiumTechSupport;
				}
				
			    public String StreamingTV;

				public String getStreamingTV () {
					return this.StreamingTV;
				}
				
			    public String StreamingMovies;

				public String getStreamingMovies () {
					return this.StreamingMovies;
				}
				
			    public String StreamingMusic;

				public String getStreamingMusic () {
					return this.StreamingMusic;
				}
				
			    public String UnlimitedData;

				public String getUnlimitedData () {
					return this.UnlimitedData;
				}
				
			    public String Contract;

				public String getContract () {
					return this.Contract;
				}
				
			    public String PaperlessBilling;

				public String getPaperlessBilling () {
					return this.PaperlessBilling;
				}
				
			    public String PaymentMethod;

				public String getPaymentMethod () {
					return this.PaymentMethod;
				}
				
			    public Float MonthlyCharge;

				public Float getMonthlyCharge () {
					return this.MonthlyCharge;
				}
				
			    public Float TotalCharges;

				public Float getTotalCharges () {
					return this.TotalCharges;
				}
				
			    public Float TotalRefunds;

				public Float getTotalRefunds () {
					return this.TotalRefunds;
				}
				
			    public Float TotalExtraDataCharges;

				public Float getTotalExtraDataCharges () {
					return this.TotalExtraDataCharges;
				}
				
			    public Float TotalLongDistanceCharges;

				public Float getTotalLongDistanceCharges () {
					return this.TotalLongDistanceCharges;
				}
				
			    public Float TotalRevenue;

				public Float getTotalRevenue () {
					return this.TotalRevenue;
				}
				
			    public String CustomerStatus;

				public String getCustomerStatus () {
					return this.CustomerStatus;
				}
				
			    public String ChurnCategory;

				public String getChurnCategory () {
					return this.ChurnCategory;
				}
				
			    public String ChurnReason;

				public String getChurnReason () {
					return this.ChurnReason;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
					this.Gender = readString(dis);
					
						this.Age = readInteger(dis);
					
					this.Married = readString(dis);
					
						this.NumberOfDependents = readInteger(dis);
					
					this.City = readString(dis);
					
					this.ZipCode = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Lattitude = null;
           				} else {
           			    	this.Lattitude = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.Longitude = null;
           				} else {
           			    	this.Longitude = dis.readFloat();
           				}
					
						this.NumberOfReferrals = readInteger(dis);
					
						this.TenureInMonths = readInteger(dis);
					
					this.Offer = readString(dis);
					
					this.PhoneService = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
					this.MultipleLines = readString(dis);
					
					this.InternetService = readString(dis);
					
					this.InternetType = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
					this.OnlineSecurity = readString(dis);
					
					this.OnlineBackup = readString(dis);
					
					this.DeviceProtectionPlan = readString(dis);
					
					this.PremiumTechSupport = readString(dis);
					
					this.StreamingTV = readString(dis);
					
					this.StreamingMovies = readString(dis);
					
					this.StreamingMusic = readString(dis);
					
					this.UnlimitedData = readString(dis);
					
					this.Contract = readString(dis);
					
					this.PaperlessBilling = readString(dis);
					
					this.PaymentMethod = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.MonthlyCharge = null;
           				} else {
           			    	this.MonthlyCharge = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalCharges = null;
           				} else {
           			    	this.TotalCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRefunds = null;
           				} else {
           			    	this.TotalRefunds = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalExtraDataCharges = null;
           				} else {
           			    	this.TotalExtraDataCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalLongDistanceCharges = null;
           				} else {
           			    	this.TotalLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.TotalRevenue = null;
           				} else {
           			    	this.TotalRevenue = dis.readFloat();
           				}
					
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// String
				
						writeString(this.Gender,dos);
					
					// Integer
				
						writeInteger(this.Age,dos);
					
					// String
				
						writeString(this.Married,dos);
					
					// Integer
				
						writeInteger(this.NumberOfDependents,dos);
					
					// String
				
						writeString(this.City,dos);
					
					// String
				
						writeString(this.ZipCode,dos);
					
					// Float
				
						if(this.Lattitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Lattitude);
		            	}
					
					// Float
				
						if(this.Longitude == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.Longitude);
		            	}
					
					// Integer
				
						writeInteger(this.NumberOfReferrals,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonths,dos);
					
					// String
				
						writeString(this.Offer,dos);
					
					// String
				
						writeString(this.PhoneService,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// String
				
						writeString(this.MultipleLines,dos);
					
					// String
				
						writeString(this.InternetService,dos);
					
					// String
				
						writeString(this.InternetType,dos);
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
					// String
				
						writeString(this.OnlineSecurity,dos);
					
					// String
				
						writeString(this.OnlineBackup,dos);
					
					// String
				
						writeString(this.DeviceProtectionPlan,dos);
					
					// String
				
						writeString(this.PremiumTechSupport,dos);
					
					// String
				
						writeString(this.StreamingTV,dos);
					
					// String
				
						writeString(this.StreamingMovies,dos);
					
					// String
				
						writeString(this.StreamingMusic,dos);
					
					// String
				
						writeString(this.UnlimitedData,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.PaymentMethod,dos);
					
					// Float
				
						if(this.MonthlyCharge == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.MonthlyCharge);
		            	}
					
					// Float
				
						if(this.TotalCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalCharges);
		            	}
					
					// Float
				
						if(this.TotalRefunds == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRefunds);
		            	}
					
					// Float
				
						if(this.TotalExtraDataCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalExtraDataCharges);
		            	}
					
					// Float
				
						if(this.TotalLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.TotalRevenue == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.TotalRevenue);
		            	}
					
					// String
				
						writeString(this.CustomerStatus,dos);
					
					// String
				
						writeString(this.ChurnCategory,dos);
					
					// String
				
						writeString(this.ChurnReason,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",Gender="+Gender);
		sb.append(",Age="+String.valueOf(Age));
		sb.append(",Married="+Married);
		sb.append(",NumberOfDependents="+String.valueOf(NumberOfDependents));
		sb.append(",City="+City);
		sb.append(",ZipCode="+ZipCode);
		sb.append(",Lattitude="+String.valueOf(Lattitude));
		sb.append(",Longitude="+String.valueOf(Longitude));
		sb.append(",NumberOfReferrals="+String.valueOf(NumberOfReferrals));
		sb.append(",TenureInMonths="+String.valueOf(TenureInMonths));
		sb.append(",Offer="+Offer);
		sb.append(",PhoneService="+PhoneService);
		sb.append(",AvgMonthlyLongDistanceCharges="+String.valueOf(AvgMonthlyLongDistanceCharges));
		sb.append(",MultipleLines="+MultipleLines);
		sb.append(",InternetService="+InternetService);
		sb.append(",InternetType="+InternetType);
		sb.append(",AvgMonthlyGBDownload="+String.valueOf(AvgMonthlyGBDownload));
		sb.append(",OnlineSecurity="+OnlineSecurity);
		sb.append(",OnlineBackup="+OnlineBackup);
		sb.append(",DeviceProtectionPlan="+DeviceProtectionPlan);
		sb.append(",PremiumTechSupport="+PremiumTechSupport);
		sb.append(",StreamingTV="+StreamingTV);
		sb.append(",StreamingMovies="+StreamingMovies);
		sb.append(",StreamingMusic="+StreamingMusic);
		sb.append(",UnlimitedData="+UnlimitedData);
		sb.append(",Contract="+Contract);
		sb.append(",PaperlessBilling="+PaperlessBilling);
		sb.append(",PaymentMethod="+PaymentMethod);
		sb.append(",MonthlyCharge="+String.valueOf(MonthlyCharge));
		sb.append(",TotalCharges="+String.valueOf(TotalCharges));
		sb.append(",TotalRefunds="+String.valueOf(TotalRefunds));
		sb.append(",TotalExtraDataCharges="+String.valueOf(TotalExtraDataCharges));
		sb.append(",TotalLongDistanceCharges="+String.valueOf(TotalLongDistanceCharges));
		sb.append(",TotalRevenue="+String.valueOf(TotalRevenue));
		sb.append(",CustomerStatus="+CustomerStatus);
		sb.append(",ChurnCategory="+ChurnCategory);
		sb.append(",ChurnReason="+ChurnReason);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(after_tFileInputDelimited_1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tFileInputDelimited_2Process(globalMap);

		row1Struct row1 = new row1Struct();
new_line_addedStruct new_line_added = new new_line_addedStruct();
null_customerIDStruct null_customerID = new null_customerIDStruct();
exportStruct export = new exportStruct();





	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"new_line_added");
					}
				
		int tos_count_tFileOutputDelimited_1 = 0;
		

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File(context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv")).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
        if(filetFileOutputDelimited_1.exists()){
            isFileGenerated_tFileOutputDelimited_1 = false;
        }
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */context.fileSeparator/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                            dir_tFileOutputDelimited_1.mkdirs();
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, true),context.encodage));
                                    if(filetFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("CustomerID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Gender");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Age");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Married");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("NumberOfDependents");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("City");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ZipCode");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Lattitude");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Longitude");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("NumberOfReferrals");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TenureInMonths");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Offer");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PhoneService");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("AvgMonthlyLongDistanceCharges");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("MultipleLines");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("InternetService");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("InternetType");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("AvgMonthlyGBDownload");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("OnlineSecurity");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("OnlineBackup");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("DeviceProtectionPlan");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PremiumTechSupport");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("StreamingTV");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("StreamingMovies");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("StreamingMusic");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("UnlimitedData");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("Contract");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PaperlessBilling");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PaymentMethod");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("MonthlyCharge");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TotalCharges");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TotalRefunds");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TotalExtraDataCharges");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TotalLongDistanceCharges");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("TotalRevenue");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("CustomerStatus");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ChurnCategory");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ChurnReason");
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */




	
	/**
	 * [tLogRow_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tLogRow_1", false);
		start_Hash.put("tLogRow_1", System.currentTimeMillis());
		
	
	currentComponent="tLogRow_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"null_customerID");
					}
				
		int tos_count_tLogRow_1 = 0;
		

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_tLogRow_1 = "|";
		java.io.PrintStream consoleOut_tLogRow_1 = null;	

 		StringBuilder strBuffer_tLogRow_1 = null;
		int nb_line_tLogRow_1 = 0;
///////////////////////    			



 



/**
 * [tLogRow_1 begin ] stop
 */




	
	/**
	 * [tFileOutputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_2", false);
		start_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"export");
					}
				
		int tos_count_tFileOutputDelimited_2 = 0;
		

String fileName_tFileOutputDelimited_2 = "";
    fileName_tFileOutputDelimited_2 = (new java.io.File(context.churnFileRepo + context.exporteFileName)).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_2 = null;
    String extension_tFileOutputDelimited_2 = null;
    String directory_tFileOutputDelimited_2 = null;
    if((fileName_tFileOutputDelimited_2.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") < fileName_tFileOutputDelimited_2.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_2.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(0, fileName_tFileOutputDelimited_2.lastIndexOf("."));
            extension_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2.substring(fileName_tFileOutputDelimited_2.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_2 = fileName_tFileOutputDelimited_2;
            extension_tFileOutputDelimited_2 = "";
        }
        directory_tFileOutputDelimited_2 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_2 = true;
    java.io.File filetFileOutputDelimited_2 = new java.io.File(fileName_tFileOutputDelimited_2);
    globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
        if(filetFileOutputDelimited_2.exists()){
            isFileGenerated_tFileOutputDelimited_2 = false;
        }
            int nb_line_tFileOutputDelimited_2 = 0;
            int splitedFileNo_tFileOutputDelimited_2 = 0;
            int currentRow_tFileOutputDelimited_2 = 0;

            final String OUT_DELIM_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:FIELDSEPARATOR */context.fileSeparator/** End field tFileOutputDelimited_2:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_2 = /** Start field tFileOutputDelimited_2:ROWSEPARATOR */"\n"/** End field tFileOutputDelimited_2:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_2 != null && directory_tFileOutputDelimited_2.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_2 = new java.io.File(directory_tFileOutputDelimited_2);
                        if(!dir_tFileOutputDelimited_2.exists()) {
                            dir_tFileOutputDelimited_2.mkdirs();
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_2 = null;

                        outtFileOutputDelimited_2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_2, true),context.encodage));


        resourceMap.put("out_tFileOutputDelimited_2", outtFileOutputDelimited_2);
resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

 



/**
 * [tFileOutputDelimited_2 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
					globalMap.get( "tHash_Lookup_row2" ))
					;					
					
	

row2Struct row2HashKey = new row2Struct();
row2Struct row2Default = new row2Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
new_line_addedStruct new_line_added_tmp = new new_line_addedStruct();
null_customerIDStruct null_customerID_tmp = new null_customerIDStruct();
exportStruct export_tmp = new exportStruct();
// ###############################

		List<new_line_addedStruct> new_line_added_List = new java.util.ArrayList<new_line_addedStruct>();
        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				int footer_tFileInputDelimited_1 = 0;
				int totalLinetFileInputDelimited_1 = 0;
				int limittFileInputDelimited_1 = -1;
				int lastLinetFileInputDelimited_1 = -1;	
				
				char fieldSeparator_tFileInputDelimited_1[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_1 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_1[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_1 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_1 = /** Start field tFileInputDelimited_1:FILENAME */context.churnFileRepo + context.churnFileName/** End field tFileInputDelimited_1:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_1 = null;
	
				try{
					
						String[] rowtFileInputDelimited_1=null;
						int currentLinetFileInputDelimited_1 = 0;
	        			int outputLinetFileInputDelimited_1 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0;
			if(footer_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_1, fieldSeparator_tFileInputDelimited_1[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_1),fieldSeparator_tFileInputDelimited_1[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_1.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_1[0] != '\n') && (rowSeparator_tFileInputDelimited_1[0] != '\r') )
	        			csvReadertFileInputDelimited_1.setLineEnd(""+rowSeparator_tFileInputDelimited_1[0]);
						
	        				csvReadertFileInputDelimited_1.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_1.setEscapeChar(csvReadertFileInputDelimited_1.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_1 > 0){
						for(totalLinetFileInputDelimited_1=0;totalLinetFileInputDelimited_1 < 1; totalLinetFileInputDelimited_1++){
							csvReadertFileInputDelimited_1.readNext();
						}
						csvReadertFileInputDelimited_1.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_1.readNext()) {
							
								rowtFileInputDelimited_1=csvReadertFileInputDelimited_1.getValues();
								if(!(rowtFileInputDelimited_1.length == 1 && ("\015").equals(rowtFileInputDelimited_1[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_1++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_1 = totalLinetFileInputDelimited_1 - footer_tFileInputDelimited_1   < 0? 0 : totalLinetFileInputDelimited_1 - footer_tFileInputDelimited_1 ;
	            		if(lastLinetFileInputDelimited_1 > 0){
	                		lastLinetFileInputDelimited_1 = lastLinetFileInputDelimited_1 < lastLineTemptFileInputDelimited_1 ? lastLinetFileInputDelimited_1 : lastLineTemptFileInputDelimited_1; 
	            		}else {
	                		lastLinetFileInputDelimited_1 = lastLineTemptFileInputDelimited_1;
	            		}
	         
			          	csvReadertFileInputDelimited_1.close();
				        if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_1, fieldSeparator_tFileInputDelimited_1[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_1=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_1),fieldSeparator_tFileInputDelimited_1[0], context.encodage);
						}
						csvReadertFileInputDelimited_1.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_1[0] != '\n') && (rowSeparator_tFileInputDelimited_1[0] != '\r') )	
	        				csvReadertFileInputDelimited_1.setLineEnd(""+rowSeparator_tFileInputDelimited_1[0]);
						
							csvReadertFileInputDelimited_1.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_1.setEscapeChar(csvReadertFileInputDelimited_1.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_1 != 0){
			        	for(currentLinetFileInputDelimited_1=0;currentLinetFileInputDelimited_1 < 1;currentLinetFileInputDelimited_1++){
			        		csvReadertFileInputDelimited_1.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_1.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
					
						throw e;
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_1 != 0 && csvReadertFileInputDelimited_1!=null && csvReadertFileInputDelimited_1.readNext() ) { 
	        		rowstate_tFileInputDelimited_1.reset();
	        
		        	rowtFileInputDelimited_1=csvReadertFileInputDelimited_1.getValues();
		        	
					
	        			if(rowtFileInputDelimited_1.length == 1 && ("\015").equals(rowtFileInputDelimited_1[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_1++;
	            
		            if(lastLinetFileInputDelimited_1 > -1 && currentLinetFileInputDelimited_1 > lastLinetFileInputDelimited_1) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_1++;
	            	if (limittFileInputDelimited_1 > 0 && outputLinetFileInputDelimited_1 > limittFileInputDelimited_1) {
	                	break;
	            	}  
	                                                                      
					
	    							row1 = null;			
								
								boolean whetherReject_tFileInputDelimited_1 = false;
								row1 = new row1Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_1_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_1_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_1.length == 1 && ("\015").equals(rowtFileInputDelimited_1[0])){//empty line when row separator is '\n'
					
							row1.CustomerID = null;
					
							row1.Gender = null;
					
							row1.Age = null;
					
							row1.Married = null;
					
							row1.NumberOfDependents = null;
					
							row1.City = null;
					
							row1.ZipCode = null;
					
							row1.Lattitude = null;
					
							row1.Longitude = null;
					
							row1.NumberOfReferrals = null;
					
							row1.TenureInMonths = null;
					
							row1.Offer = null;
					
							row1.PhoneService = null;
					
							row1.AvgMonthlyLongDistanceCharges = null;
					
							row1.MultipleLines = null;
					
							row1.InternetService = null;
					
							row1.InternetType = null;
					
							row1.AvgMonthlyGBDownload = null;
					
							row1.OnlineSecurity = null;
					
							row1.OnlineBackup = null;
					
							row1.DeviceProtectionPlan = null;
					
							row1.PremiumTechSupport = null;
					
							row1.StreamingTV = null;
					
							row1.StreamingMovies = null;
					
							row1.StreamingMusic = null;
					
							row1.UnlimitedData = null;
					
							row1.Contract = null;
					
							row1.PaperlessBilling = null;
					
							row1.PaymentMethod = null;
					
							row1.MonthlyCharge = null;
					
							row1.TotalCharges = null;
					
							row1.TotalRefunds = null;
					
							row1.TotalExtraDataCharges = null;
					
							row1.TotalLongDistanceCharges = null;
					
							row1.TotalRevenue = null;
					
							row1.CustomerStatus = null;
					
							row1.ChurnCategory = null;
					
							row1.ChurnReason = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_1 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_1 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.CustomerID = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.CustomerID = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.Gender = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.Gender = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.Age = ParserUtils.parseTo_Integer(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"Age", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.Age = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.Age = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 3;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.Married = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.Married = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 4;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.NumberOfDependents = ParserUtils.parseTo_Integer(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"NumberOfDependents", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.NumberOfDependents = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.NumberOfDependents = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 5;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.City = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.City = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 6;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.ZipCode = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.ZipCode = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 7;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.Lattitude = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"Lattitude", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.Lattitude = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.Lattitude = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 8;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.Longitude = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"Longitude", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.Longitude = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.Longitude = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 9;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.NumberOfReferrals = ParserUtils.parseTo_Integer(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"NumberOfReferrals", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.NumberOfReferrals = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.NumberOfReferrals = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 10;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.TenureInMonths = ParserUtils.parseTo_Integer(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TenureInMonths", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.TenureInMonths = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.TenureInMonths = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 11;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.Offer = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.Offer = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 12;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.PhoneService = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.PhoneService = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 13;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.AvgMonthlyLongDistanceCharges = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"AvgMonthlyLongDistanceCharges", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.AvgMonthlyLongDistanceCharges = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.AvgMonthlyLongDistanceCharges = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 14;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.MultipleLines = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.MultipleLines = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 15;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.InternetService = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.InternetService = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 16;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.InternetType = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.InternetType = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 17;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.AvgMonthlyGBDownload = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"AvgMonthlyGBDownload", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.AvgMonthlyGBDownload = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.AvgMonthlyGBDownload = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 18;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.OnlineSecurity = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.OnlineSecurity = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 19;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.OnlineBackup = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.OnlineBackup = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 20;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.DeviceProtectionPlan = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.DeviceProtectionPlan = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 21;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.PremiumTechSupport = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.PremiumTechSupport = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 22;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.StreamingTV = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.StreamingTV = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 23;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.StreamingMovies = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.StreamingMovies = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 24;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.StreamingMusic = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.StreamingMusic = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 25;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.UnlimitedData = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.UnlimitedData = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 26;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.Contract = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.Contract = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 27;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.PaperlessBilling = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.PaperlessBilling = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 28;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.PaymentMethod = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.PaymentMethod = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 29;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.MonthlyCharge = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"MonthlyCharge", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.MonthlyCharge = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.MonthlyCharge = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 30;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.TotalCharges = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TotalCharges", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.TotalCharges = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.TotalCharges = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 31;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.TotalRefunds = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TotalRefunds", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.TotalRefunds = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.TotalRefunds = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 32;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.TotalExtraDataCharges = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TotalExtraDataCharges", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.TotalExtraDataCharges = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.TotalExtraDataCharges = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 33;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.TotalLongDistanceCharges = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TotalLongDistanceCharges", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.TotalLongDistanceCharges = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.TotalLongDistanceCharges = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 34;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
								
									if(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1].length() > 0) {
										try {
									
										row1.TotalRevenue = ParserUtils.parseTo_Float(rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
											rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"TotalRevenue", "row1", rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1], ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
										}
    								}else{
    									
											
												row1.TotalRevenue = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row1.TotalRevenue = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 35;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.CustomerStatus = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.CustomerStatus = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 36;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.ChurnCategory = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.ChurnCategory = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_1 = 37;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_1 < rowtFileInputDelimited_1.length){
						
						
							
									row1.ChurnReason = rowtFileInputDelimited_1[columnIndexWithD_tFileInputDelimited_1];
									
							
						
						}else{
						
							
								row1.ChurnReason = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_1.getException()!=null) {
										throw rowstate_tFileInputDelimited_1.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_1 = true;
        							
            							throw(e);
            						
	    						}
	
							

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row1"
if(row1 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		
		              
			   	  		  if(
 				  		  			
 				  		  			(
 				  		  			
 				  		  			!(row1.CustomerID == null)
 				  		  			
 				  		  			)
  				  		  			
	  	  		  				) { // G_TM_M_280

							 // CALL close main tMap filter for table 'row1'
							

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    row2HashKey.ClientExportes = row1.CustomerID ;
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.ClientExportes = '" + row2HashKey.ClientExportes + "'");
								} // G 071
							

							row2Struct row2 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row2Struct fromLookup_row2 = null;
							row2 = row2Default;
										 
							
								 
							
							
								if (tHash_Lookup_row2 !=null && tHash_Lookup_row2.hasNext()) { // G 099
								
							
								
								fromLookup_row2 = tHash_Lookup_row2.next();

							
							
								} // G 099
							
							

							if(fromLookup_row2 != null) {
								row2 = fromLookup_row2;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

new_line_added = null;
new_line_added_List.clear();
export = null;
null_customerID = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'out1'
new_line_added_tmp= new new_line_addedStruct();

new_line_added_tmp.CustomerID = row1.CustomerID ;
new_line_added_tmp.Gender = row1.Gender ;
new_line_added_tmp.Age = row1.Age ;
new_line_added_tmp.Married = row1.Married ;
new_line_added_tmp.NumberOfDependents = row1.NumberOfDependents ;
new_line_added_tmp.City = row1.City ;
new_line_added_tmp.ZipCode = row1.ZipCode ;
new_line_added_tmp.Lattitude = row1.Lattitude ;
new_line_added_tmp.Longitude = row1.Longitude ;
new_line_added_tmp.NumberOfReferrals = row1.NumberOfReferrals ;
new_line_added_tmp.TenureInMonths = row1.TenureInMonths ;
new_line_added_tmp.Offer = row1.Offer ;
new_line_added_tmp.PhoneService = row1.PhoneService ;
new_line_added_tmp.AvgMonthlyLongDistanceCharges = row1.AvgMonthlyLongDistanceCharges ;
new_line_added_tmp.MultipleLines = row1.MultipleLines ;
new_line_added_tmp.InternetService = row1.InternetService ;
new_line_added_tmp.InternetType = row1.InternetType ;
new_line_added_tmp.AvgMonthlyGBDownload = row1.AvgMonthlyGBDownload ;
new_line_added_tmp.OnlineSecurity = row1.OnlineSecurity ;
new_line_added_tmp.OnlineBackup = row1.OnlineBackup ;
new_line_added_tmp.DeviceProtectionPlan = row1.DeviceProtectionPlan ;
new_line_added_tmp.PremiumTechSupport = row1.PremiumTechSupport ;
new_line_added_tmp.StreamingTV = row1.StreamingTV ;
new_line_added_tmp.StreamingMovies = row1.StreamingMovies ;
new_line_added_tmp.StreamingMusic = row1.StreamingMusic ;
new_line_added_tmp.UnlimitedData = row1.UnlimitedData ;
new_line_added_tmp.Contract = row1.Contract ;
new_line_added_tmp.PaperlessBilling = row1.PaperlessBilling ;
new_line_added_tmp.PaymentMethod = row1.PaymentMethod ;
new_line_added_tmp.MonthlyCharge = row1.MonthlyCharge ;
new_line_added_tmp.TotalCharges = row1.TotalCharges ;
new_line_added_tmp.TotalRefunds = row1.TotalRefunds ;
new_line_added_tmp.TotalExtraDataCharges = row1.TotalExtraDataCharges ;
new_line_added_tmp.TotalLongDistanceCharges = row1.TotalLongDistanceCharges ;
new_line_added_tmp.TotalRevenue = row1.TotalRevenue ;
new_line_added_tmp.CustomerStatus = row1.CustomerStatus ;
new_line_added_tmp.ChurnCategory = row1.ChurnCategory ;
new_line_added_tmp.ChurnReason = row1.ChurnReason ;
new_line_added_List.add(new_line_added_tmp);
new_line_added = new_line_added_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'new_line_added'
// # Filter conditions 
if( rejectedInnerJoin_tMap_1 ) {
new_line_added_tmp.CustomerID = row1.CustomerID ;
new_line_added_tmp.Gender = row1.Gender ;
new_line_added_tmp.Age = row1.Age ;
new_line_added_tmp.Married = row1.Married ;
new_line_added_tmp.NumberOfDependents = row1.NumberOfDependents ;
new_line_added_tmp.City = row1.City ;
new_line_added_tmp.ZipCode = row1.ZipCode ;
new_line_added_tmp.Lattitude = row1.Lattitude ;
new_line_added_tmp.Longitude = row1.Longitude ;
new_line_added_tmp.NumberOfReferrals = row1.NumberOfReferrals ;
new_line_added_tmp.TenureInMonths = row1.TenureInMonths ;
new_line_added_tmp.Offer = row1.Offer ;
new_line_added_tmp.PhoneService = row1.PhoneService ;
new_line_added_tmp.AvgMonthlyLongDistanceCharges = row1.AvgMonthlyLongDistanceCharges ;
new_line_added_tmp.MultipleLines = row1.MultipleLines ;
new_line_added_tmp.InternetService = row1.InternetService ;
new_line_added_tmp.InternetType = row1.InternetType ;
new_line_added_tmp.AvgMonthlyGBDownload = row1.AvgMonthlyGBDownload ;
new_line_added_tmp.OnlineSecurity = row1.OnlineSecurity ;
new_line_added_tmp.OnlineBackup = row1.OnlineBackup ;
new_line_added_tmp.DeviceProtectionPlan = row1.DeviceProtectionPlan ;
new_line_added_tmp.PremiumTechSupport = row1.PremiumTechSupport ;
new_line_added_tmp.StreamingTV = row1.StreamingTV ;
new_line_added_tmp.StreamingMovies = row1.StreamingMovies ;
new_line_added_tmp.StreamingMusic = row1.StreamingMusic ;
new_line_added_tmp.UnlimitedData = row1.UnlimitedData ;
new_line_added_tmp.Contract = row1.Contract ;
new_line_added_tmp.PaperlessBilling = row1.PaperlessBilling ;
new_line_added_tmp.PaymentMethod = row1.PaymentMethod ;
new_line_added_tmp.MonthlyCharge = row1.MonthlyCharge ;
new_line_added_tmp.TotalCharges = row1.TotalCharges ;
new_line_added_tmp.TotalRefunds = row1.TotalRefunds ;
new_line_added_tmp.TotalExtraDataCharges = row1.TotalExtraDataCharges ;
new_line_added_tmp.TotalLongDistanceCharges = row1.TotalLongDistanceCharges ;
new_line_added_tmp.TotalRevenue = row1.TotalRevenue ;
new_line_added_tmp.CustomerStatus = row1.CustomerStatus ;
new_line_added_tmp.ChurnCategory = row1.ChurnCategory ;
new_line_added_tmp.ChurnReason = row1.ChurnReason ;
new_line_added_List.add(new_line_added_tmp);
new_line_added = new_line_added_tmp;
} // closing filter/reject

// # Output reject table : 'export'
// # Filter conditions 
if( rejectedInnerJoin_tMap_1 ) {
export_tmp.exportes = row1.CustomerID ;
export = export_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_1 = false;










 


	tos_count_tMap_1++;

/**
 * [tMap_1 main ] stop
 */
	
	/**
	 * [tMap_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_begin ] stop
 */
// Start of branch "new_line_added"
if(new_line_added != null) { 
	 // start of joined table loop
	for (new_line_addedStruct cur_new_line_added :new_line_added_List) {
		new_line_added = cur_new_line_added;



	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"new_line_added"
						
						);
					}
					


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(new_line_added.CustomerID != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.CustomerID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Gender != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Gender
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Age != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Age
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Married != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Married
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.NumberOfDependents != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.NumberOfDependents
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.City != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.City
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.ZipCode != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.ZipCode
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Lattitude != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Lattitude
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Longitude != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Longitude
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.NumberOfReferrals != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.NumberOfReferrals
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.TenureInMonths != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.TenureInMonths
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Offer != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Offer
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.PhoneService != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.PhoneService
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.AvgMonthlyLongDistanceCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.AvgMonthlyLongDistanceCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.MultipleLines != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.MultipleLines
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.InternetService != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.InternetService
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.InternetType != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.InternetType
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.AvgMonthlyGBDownload != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.AvgMonthlyGBDownload
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.OnlineSecurity != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.OnlineSecurity
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.OnlineBackup != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.OnlineBackup
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.DeviceProtectionPlan != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.DeviceProtectionPlan
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.PremiumTechSupport != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.PremiumTechSupport
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.StreamingTV != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.StreamingTV
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.StreamingMovies != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.StreamingMovies
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.StreamingMusic != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.StreamingMusic
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.UnlimitedData != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.UnlimitedData
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.Contract != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.Contract
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.PaperlessBilling != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.PaperlessBilling
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.PaymentMethod != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.PaymentMethod
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.MonthlyCharge != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.MonthlyCharge
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.TotalCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.TotalCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.TotalRefunds != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.TotalRefunds
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.TotalExtraDataCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.TotalExtraDataCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.TotalLongDistanceCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.TotalLongDistanceCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.TotalRevenue != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.TotalRevenue
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.CustomerStatus != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.CustomerStatus
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.ChurnCategory != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.ChurnCategory
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(new_line_added.ChurnReason != null) {
                        sb_tFileOutputDelimited_1.append(
                            new_line_added.ChurnReason
                        );
                            }
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());




 


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */		} // end of joined table loop
		new_line_added_List.clear();

} // End of branch "new_line_added"




// Start of branch "null_customerID"
if(null_customerID != null) { 



	
	/**
	 * [tLogRow_1 main ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"null_customerID"
						
						);
					}
					
///////////////////////		
						



				strBuffer_tLogRow_1 = new StringBuilder();




   				
	    		if(null_customerID.CustomerID != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.CustomerID)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Gender != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.Gender)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Age != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.Age)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Married != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.Married)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.NumberOfDependents != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.NumberOfDependents)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.City != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.City)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.ZipCode != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.ZipCode)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Lattitude != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.Lattitude)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Longitude != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.Longitude)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.NumberOfReferrals != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.NumberOfReferrals)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.TenureInMonths != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.TenureInMonths)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Offer != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.Offer)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.PhoneService != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.PhoneService)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.AvgMonthlyLongDistanceCharges != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.AvgMonthlyLongDistanceCharges)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.MultipleLines != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.MultipleLines)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.InternetService != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.InternetService)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.InternetType != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.InternetType)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.AvgMonthlyGBDownload != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.AvgMonthlyGBDownload)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.OnlineSecurity != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.OnlineSecurity)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.OnlineBackup != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.OnlineBackup)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.DeviceProtectionPlan != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.DeviceProtectionPlan)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.PremiumTechSupport != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.PremiumTechSupport)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.StreamingTV != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.StreamingTV)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.StreamingMovies != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.StreamingMovies)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.StreamingMusic != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.StreamingMusic)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.UnlimitedData != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.UnlimitedData)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.Contract != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.Contract)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.PaperlessBilling != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.PaperlessBilling)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.PaymentMethod != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.PaymentMethod)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.MonthlyCharge != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.MonthlyCharge)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.TotalCharges != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.TotalCharges)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.TotalRefunds != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.TotalRefunds)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.TotalExtraDataCharges != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.TotalExtraDataCharges)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.TotalLongDistanceCharges != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.TotalLongDistanceCharges)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.TotalRevenue != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
								FormatterUtils.formatUnwithE(null_customerID.TotalRevenue)				
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.CustomerStatus != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.CustomerStatus)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.ChurnCategory != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.ChurnCategory)							
				);


							
	    		} //  			

    			strBuffer_tLogRow_1.append("|");
    			


   				
	    		if(null_customerID.ChurnReason != null) { //              
                    							
       
				strBuffer_tLogRow_1.append(
				                String.valueOf(null_customerID.ChurnReason)							
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_tLogRow_1);
                    }
                    consoleOut_tLogRow_1.println(strBuffer_tLogRow_1.toString());
                    consoleOut_tLogRow_1.flush();
                    nb_line_tLogRow_1++;
//////

//////                    
                    
///////////////////////    			

 


	tos_count_tLogRow_1++;

/**
 * [tLogRow_1 main ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_begin ] stop
 */
	
	/**
	 * [tLogRow_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 process_data_end ] stop
 */

} // End of branch "null_customerID"




// Start of branch "export"
if(export != null) { 



	
	/**
	 * [tFileOutputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"export"
						
						);
					}
					


                    StringBuilder sb_tFileOutputDelimited_2 = new StringBuilder();
                            if(export.exportes != null) {
                        sb_tFileOutputDelimited_2.append(
                            export.exportes
                        );
                            }
                    sb_tFileOutputDelimited_2.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_2);


                    nb_line_tFileOutputDelimited_2++;
                    resourceMap.put("nb_line_tFileOutputDelimited_2", nb_line_tFileOutputDelimited_2);

                        outtFileOutputDelimited_2.write(sb_tFileOutputDelimited_2.toString());




 


	tos_count_tFileOutputDelimited_2++;

/**
 * [tFileOutputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	

 



/**
 * [tFileOutputDelimited_2 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	

 



/**
 * [tFileOutputDelimited_2 process_data_end ] stop
 */

} // End of branch "export"



	
		} // G_TM_M_280 close main tMap filter for table 'row1'
	
	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "row1"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	


				nb_line_tFileInputDelimited_1++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_1 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_1!=null){
    					csvReadertFileInputDelimited_1.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_1!=null){
    				globalMap.put("tFileInputDelimited_1_NB_LINE",nb_line_tFileInputDelimited_1);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row2 != null) {
						tHash_Lookup_row2.endGet();
					}
					globalMap.remove( "tHash_Lookup_row2" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tMap_1", true);
end_Hash.put("tMap_1", System.currentTimeMillis());




/**
 * [tMap_1 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"new_line_added");
			  	}
			  	
 

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */




	
	/**
	 * [tLogRow_1 end ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	


//////
//////
globalMap.put("tLogRow_1_NB_LINE",nb_line_tLogRow_1);

///////////////////////    			

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"null_customerID");
			  	}
			  	
 

ok_Hash.put("tLogRow_1", true);
end_Hash.put("tLogRow_1", System.currentTimeMillis());




/**
 * [tLogRow_1 end ] stop
 */




	
	/**
	 * [tFileOutputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	



		
			
					if(outtFileOutputDelimited_2!=null) {
						outtFileOutputDelimited_2.flush();
						outtFileOutputDelimited_2.close();
					}
				
				globalMap.put("tFileOutputDelimited_2_NB_LINE",nb_line_tFileOutputDelimited_2);
				globalMap.put("tFileOutputDelimited_2_FILE_NAME",fileName_tFileOutputDelimited_2);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_2", true);
	

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"export");
			  	}
			  	
 

ok_Hash.put("tFileOutputDelimited_2", true);
end_Hash.put("tFileOutputDelimited_2", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_2 end ] stop
 */






				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row2"); 
				     			
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_1 finally ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
 */




	
	/**
	 * [tLogRow_1 finally ] start
	 */

	

	
	
	currentComponent="tLogRow_1";

	

 



/**
 * [tLogRow_1 finally ] stop
 */




	
	/**
	 * [tFileOutputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_2";

	


		if(resourceMap.get("finish_tFileOutputDelimited_2") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_2 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_2");
						if(outtFileOutputDelimited_2!=null) {
							outtFileOutputDelimited_2.flush();
							outtFileOutputDelimited_2.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_2 finally ] stop
 */






				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	

public void tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDie_1", false);
		start_Hash.put("tDie_1", System.currentTimeMillis());
		
	
	currentComponent="tDie_1";

	
		int tos_count_tDie_1 = 0;
		

 



/**
 * [tDie_1 begin ] stop
 */
	
	/**
	 * [tDie_1 main ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

	try {
	globalMap.put("tDie_1_DIE_PRIORITY", 5);
	System.err.println("Le fichier " +"CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv" +"  existe déjà dans le repertoire du jour " + context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" );
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le fichier " +"CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv" +"  existe déjà dans le repertoire du jour " + context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" );
	globalMap.put("tDie_1_DIE_MESSAGES", "Le fichier " +"CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv" +"  existe déjà dans le repertoire du jour " + context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" );
	
	} catch (Exception | Error e_tDie_1) {
	    globalMap.put("tDie_1_ERROR_MESSAGE",e_tDie_1.getMessage());
		logIgnoredError(String.format("tDie_1 - tDie failed to log message due to internal error: %s", e_tDie_1), e_tDie_1);
	}
	
	currentComponent = "tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_tDie_1++;

/**
 * [tDie_1 main ] stop
 */
	
	/**
	 * [tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 process_data_end ] stop
 */
	
	/**
	 * [tDie_1 end ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 

ok_Hash.put("tDie_1", true);
end_Hash.put("tDie_1", System.currentTimeMillis());




/**
 * [tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDie_1 finally ] start
	 */

	

	
	
	currentComponent="tDie_1";

	

 



/**
 * [tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDie_1_SUBPROCESS_STATE", 1);
	}
	


public static class row2Struct implements routines.system.IPersistableComparableLookupRow<row2Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractAll = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractAll = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ClientExportes;

				public String getClientExportes () {
					return this.ClientExportes;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ClientExportes == null) ? 0 : this.ClientExportes.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row2Struct other = (row2Struct) obj;
		
						if (this.ClientExportes == null) {
							if (other.ClientExportes != null)
								return false;
						
						} else if (!this.ClientExportes.equals(other.ClientExportes))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.ClientExportes = this.ClientExportes;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.ClientExportes = this.ClientExportes;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractAll.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractAll.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractAll = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractAll, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.ClientExportes = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractAll) {

        	try {

        		int length = 0;
		
					this.ClientExportes = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ClientExportes,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ClientExportes,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		

		

        }

		
        	finally {}

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		

		

        }

		
        	finally {}

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
        	}
        	finally {}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
        	}
        	finally {}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ClientExportes="+ClientExportes);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ClientExportes, other.ClientExportes);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row2Struct row2 = new row2Struct();




	
	/**
	 * [tAdvancedHash_row2 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row2", false);
		start_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row2");
					}
				
		int tos_count_tAdvancedHash_row2 = 0;
		

			   		// connection name:row2
			   		// source node:tFileInputDelimited_2 - inputs:(after_tFileInputDelimited_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row2) outputs:(new_line_added,null_customerID,export)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_2", false);
		start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_2";

	
		int tos_count_tFileInputDelimited_2 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				int footer_tFileInputDelimited_2 = 0;
				int totalLinetFileInputDelimited_2 = 0;
				int limittFileInputDelimited_2 = -1;
				int lastLinetFileInputDelimited_2 = -1;	
				
				char fieldSeparator_tFileInputDelimited_2[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_2 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_2[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_2 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_2 = /** Start field tFileInputDelimited_2:FILENAME */context.churnFileRepo + context.exporteFileName/** End field tFileInputDelimited_2:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_2 = null;
	
				try{
					
						String[] rowtFileInputDelimited_2=null;
						int currentLinetFileInputDelimited_2 = 0;
	        			int outputLinetFileInputDelimited_2 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_2 = 0;
			if(footer_value_tFileInputDelimited_2 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_2, fieldSeparator_tFileInputDelimited_2[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_2),fieldSeparator_tFileInputDelimited_2[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_2.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_2[0] != '\n') && (rowSeparator_tFileInputDelimited_2[0] != '\r') )
	        			csvReadertFileInputDelimited_2.setLineEnd(""+rowSeparator_tFileInputDelimited_2[0]);
						
	        				csvReadertFileInputDelimited_2.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_2.setEscapeChar(csvReadertFileInputDelimited_2.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_2 > 0){
						for(totalLinetFileInputDelimited_2=0;totalLinetFileInputDelimited_2 < 1; totalLinetFileInputDelimited_2++){
							csvReadertFileInputDelimited_2.readNext();
						}
						csvReadertFileInputDelimited_2.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_2.readNext()) {
							
								rowtFileInputDelimited_2=csvReadertFileInputDelimited_2.getValues();
								if(!(rowtFileInputDelimited_2.length == 1 && ("\015").equals(rowtFileInputDelimited_2[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_2++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_2 = totalLinetFileInputDelimited_2 - footer_tFileInputDelimited_2   < 0? 0 : totalLinetFileInputDelimited_2 - footer_tFileInputDelimited_2 ;
	            		if(lastLinetFileInputDelimited_2 > 0){
	                		lastLinetFileInputDelimited_2 = lastLinetFileInputDelimited_2 < lastLineTemptFileInputDelimited_2 ? lastLinetFileInputDelimited_2 : lastLineTemptFileInputDelimited_2; 
	            		}else {
	                		lastLinetFileInputDelimited_2 = lastLineTemptFileInputDelimited_2;
	            		}
	         
			          	csvReadertFileInputDelimited_2.close();
				        if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_2, fieldSeparator_tFileInputDelimited_2[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_2=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_2),fieldSeparator_tFileInputDelimited_2[0], context.encodage);
						}
						csvReadertFileInputDelimited_2.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_2[0] != '\n') && (rowSeparator_tFileInputDelimited_2[0] != '\r') )	
	        				csvReadertFileInputDelimited_2.setLineEnd(""+rowSeparator_tFileInputDelimited_2[0]);
						
							csvReadertFileInputDelimited_2.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_2.setEscapeChar(csvReadertFileInputDelimited_2.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_2 != 0){
			        	for(currentLinetFileInputDelimited_2=0;currentLinetFileInputDelimited_2 < 1;currentLinetFileInputDelimited_2++){
			        		csvReadertFileInputDelimited_2.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_2.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
					
						throw e;
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_2 != 0 && csvReadertFileInputDelimited_2!=null && csvReadertFileInputDelimited_2.readNext() ) { 
	        		rowstate_tFileInputDelimited_2.reset();
	        
		        	rowtFileInputDelimited_2=csvReadertFileInputDelimited_2.getValues();
		        	
					
	        			if(rowtFileInputDelimited_2.length == 1 && ("\015").equals(rowtFileInputDelimited_2[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_2++;
	            
		            if(lastLinetFileInputDelimited_2 > -1 && currentLinetFileInputDelimited_2 > lastLinetFileInputDelimited_2) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_2++;
	            	if (limittFileInputDelimited_2 > 0 && outputLinetFileInputDelimited_2 > limittFileInputDelimited_2) {
	                	break;
	            	}  
	                                                                      
					
	    							row2 = null;			
								
	    							row2 = null;			
								
								boolean whetherReject_tFileInputDelimited_2 = false;
								row2 = new row2Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_2_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_2_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_2.length == 1 && ("\015").equals(rowtFileInputDelimited_2[0])){//empty line when row separator is '\n'
					
							row2.ClientExportes = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_2 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_2 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
									row2.ClientExportes = rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2];
									
							
						
						}else{
						
							
								row2.ClientExportes = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_2.getException()!=null) {
										throw rowstate_tFileInputDelimited_2.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_2 = true;
        							
            							throw(e);
            						
	    						}
	
							

 



/**
 * [tFileInputDelimited_2 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 


	tos_count_tFileInputDelimited_2++;

/**
 * [tFileInputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 process_data_begin ] stop
 */
// Start of branch "row2"
if(row2 != null) { 



	
	/**
	 * [tAdvancedHash_row2 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row2"
						
						);
					}
					


			   
			   

					row2Struct row2_HashRow = new row2Struct();
		   	   	   
				
				row2_HashRow.ClientExportes = row2.ClientExportes;
				
			tHash_Lookup_row2.put(row2_HashRow);
			
            




 


	tos_count_tAdvancedHash_row2++;

/**
 * [tAdvancedHash_row2 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row2 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 process_data_end ] stop
 */

} // End of branch "row2"




	
	/**
	 * [tFileInputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	


				nb_line_tFileInputDelimited_2++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_2 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_2!=null){
    					csvReadertFileInputDelimited_2.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_2!=null){
    				globalMap.put("tFileInputDelimited_2_NB_LINE",nb_line_tFileInputDelimited_2);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_2", true);
end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());




/**
 * [tFileInputDelimited_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

tHash_Lookup_row2.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row2");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row2", true);
end_Hash.put("tAdvancedHash_row2", System.currentTimeMillis());




/**
 * [tAdvancedHash_row2 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row2 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row2";

	

 



/**
 * [tAdvancedHash_row2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final jExtractAll jExtractAllClass = new jExtractAll();

        int exitCode = jExtractAllClass.runJobInTOS(args);

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

    	
    	

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        if (inOSGi) {
            java.util.Dictionary<String, Object> jobProperties = routines.system.BundleUtils.getJobProperties(jobName);

            if (jobProperties != null && jobProperties.get("context") != null) {
                contextStr = (String)jobProperties.get("context");
            }
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = jExtractAll.class.getClassLoader().getResourceAsStream("churn_project/jextractall_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jExtractAll.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("schemaDwh", "id_String");
                        if(context.getStringValue("schemaDwh") == null) {
                            context.schemaDwh = null;
                        } else {
                            context.schemaDwh=(String) context.getProperty("schemaDwh");
                        }
                        context.setContextType("churnFileName", "id_String");
                        if(context.getStringValue("churnFileName") == null) {
                            context.churnFileName = null;
                        } else {
                            context.churnFileName=(String) context.getProperty("churnFileName");
                        }
                        context.setContextType("churnFileRepo", "id_String");
                        if(context.getStringValue("churnFileRepo") == null) {
                            context.churnFileRepo = null;
                        } else {
                            context.churnFileRepo=(String) context.getProperty("churnFileRepo");
                        }
                        context.setContextType("exporteFileName", "id_String");
                        if(context.getStringValue("exporteFileName") == null) {
                            context.exporteFileName = null;
                        } else {
                            context.exporteFileName=(String) context.getProperty("exporteFileName");
                        }
                        context.setContextType("populationFileName", "id_String");
                        if(context.getStringValue("populationFileName") == null) {
                            context.populationFileName = null;
                        } else {
                            context.populationFileName=(String) context.getProperty("populationFileName");
                        }
                        context.setContextType("additionalParam", "id_String");
                        if(context.getStringValue("additionalParam") == null) {
                            context.additionalParam = null;
                        } else {
                            context.additionalParam=(String) context.getProperty("additionalParam");
                        }
                        context.setContextType("database", "id_String");
                        if(context.getStringValue("database") == null) {
                            context.database = null;
                        } else {
                            context.database=(String) context.getProperty("database");
                        }
                        context.setContextType("password", "id_String");
                        if(context.getStringValue("password") == null) {
                            context.password = null;
                        } else {
                            context.password=(String) context.getProperty("password");
                        }
                        context.setContextType("port", "id_String");
                        if(context.getStringValue("port") == null) {
                            context.port = null;
                        } else {
                            context.port=(String) context.getProperty("port");
                        }
                        context.setContextType("schemaParams", "id_String");
                        if(context.getStringValue("schemaParams") == null) {
                            context.schemaParams = null;
                        } else {
                            context.schemaParams=(String) context.getProperty("schemaParams");
                        }
                        context.setContextType("serverName", "id_String");
                        if(context.getStringValue("serverName") == null) {
                            context.serverName = null;
                        } else {
                            context.serverName=(String) context.getProperty("serverName");
                        }
                        context.setContextType("user", "id_String");
                        if(context.getStringValue("user") == null) {
                            context.user = null;
                        } else {
                            context.user=(String) context.getProperty("user");
                        }
                        context.setContextType("dataFolder", "id_String");
                        if(context.getStringValue("dataFolder") == null) {
                            context.dataFolder = null;
                        } else {
                            context.dataFolder=(String) context.getProperty("dataFolder");
                        }
                        context.setContextType("encodage", "id_String");
                        if(context.getStringValue("encodage") == null) {
                            context.encodage = null;
                        } else {
                            context.encodage=(String) context.getProperty("encodage");
                        }
                        context.setContextType("fileSeparator", "id_String");
                        if(context.getStringValue("fileSeparator") == null) {
                            context.fileSeparator = null;
                        } else {
                            context.fileSeparator=(String) context.getProperty("fileSeparator");
                        }
                        context.setContextType("projectFolder", "id_String");
                        if(context.getStringValue("projectFolder") == null) {
                            context.projectFolder = null;
                        } else {
                            context.projectFolder=(String) context.getProperty("projectFolder");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("schemaDwh")) {
                context.schemaDwh = (String) parentContextMap.get("schemaDwh");
            }if (parentContextMap.containsKey("churnFileName")) {
                context.churnFileName = (String) parentContextMap.get("churnFileName");
            }if (parentContextMap.containsKey("churnFileRepo")) {
                context.churnFileRepo = (String) parentContextMap.get("churnFileRepo");
            }if (parentContextMap.containsKey("exporteFileName")) {
                context.exporteFileName = (String) parentContextMap.get("exporteFileName");
            }if (parentContextMap.containsKey("populationFileName")) {
                context.populationFileName = (String) parentContextMap.get("populationFileName");
            }if (parentContextMap.containsKey("additionalParam")) {
                context.additionalParam = (String) parentContextMap.get("additionalParam");
            }if (parentContextMap.containsKey("database")) {
                context.database = (String) parentContextMap.get("database");
            }if (parentContextMap.containsKey("password")) {
                context.password = (String) parentContextMap.get("password");
            }if (parentContextMap.containsKey("port")) {
                context.port = (String) parentContextMap.get("port");
            }if (parentContextMap.containsKey("schemaParams")) {
                context.schemaParams = (String) parentContextMap.get("schemaParams");
            }if (parentContextMap.containsKey("serverName")) {
                context.serverName = (String) parentContextMap.get("serverName");
            }if (parentContextMap.containsKey("user")) {
                context.user = (String) parentContextMap.get("user");
            }if (parentContextMap.containsKey("dataFolder")) {
                context.dataFolder = (String) parentContextMap.get("dataFolder");
            }if (parentContextMap.containsKey("encodage")) {
                context.encodage = (String) parentContextMap.get("encodage");
            }if (parentContextMap.containsKey("fileSeparator")) {
                context.fileSeparator = (String) parentContextMap.get("fileSeparator");
            }if (parentContextMap.containsKey("projectFolder")) {
                context.projectFolder = (String) parentContextMap.get("projectFolder");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();


this.globalResumeTicket = true;//to run tPreJob





this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tFileExist_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tFileExist_1) {
globalMap.put("tFileExist_1_SUBPROCESS_STATE", -1);

e_tFileExist_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jExtractAll");
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     290870 characters generated by Talend Open Studio for Data Integration 
 *     on the 31 décembre 2025 à 11:36:15 EET
 ************************************************************************************************/