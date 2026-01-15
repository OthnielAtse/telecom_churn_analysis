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


package churn_project.jextractfacttable_0_1;

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
 * Job: jExtractFactTable Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jExtractFactTable implements TalendJob {

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
	private final String jobName = "jExtractFactTable";
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
				jExtractFactTable.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jExtractFactTable.this, new Object[] { e , currentComponent, globalMap});
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
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tFileInputDelimited_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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

	



java.io.File file_tFileExist_1 = new java.io.File(context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_FACT_TABLE.csv");
if (!file_tFileExist_1.exists()) {
    globalMap.put("tFileExist_1_EXISTS",false);
}else{
	globalMap.put("tFileExist_1_EXISTS",true);
}

globalMap.put("tFileExist_1_FILENAME",context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_FACT_TABLE.csv");


 


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
	


public static class customersStruct implements routines.system.IPersistableRow<customersStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];

	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public Integer OfferID;

				public Integer getOfferID () {
					return this.OfferID;
				}
				
			    public Integer ContractID;

				public Integer getContractID () {
					return this.ContractID;
				}
				
			    public Integer PaymentModeID;

				public Integer getPaymentModeID () {
					return this.PaymentModeID;
				}
				
			    public Integer ServiceID;

				public Integer getServiceID () {
					return this.ServiceID;
				}
				
			    public Integer ChurnID;

				public Integer getChurnID () {
					return this.ChurnID;
				}
				
			    public Float AvgMonthlyLongDistanceCharges;

				public Float getAvgMonthlyLongDistanceCharges () {
					return this.AvgMonthlyLongDistanceCharges;
				}
				
			    public Float AvgMonthlyGBDownload;

				public Float getAvgMonthlyGBDownload () {
					return this.AvgMonthlyGBDownload;
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
				
			    public Integer TenureInMonth;

				public Integer getTenureInMonth () {
					return this.TenureInMonth;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
						this.OfferID = readInteger(dis);
					
						this.ContractID = readInteger(dis);
					
						this.PaymentModeID = readInteger(dis);
					
						this.ServiceID = readInteger(dis);
					
						this.ChurnID = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
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
					
						this.TenureInMonth = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
						this.OfferID = readInteger(dis);
					
						this.ContractID = readInteger(dis);
					
						this.PaymentModeID = readInteger(dis);
					
						this.ServiceID = readInteger(dis);
					
						this.ChurnID = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
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
					
						this.TenureInMonth = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// Integer
				
						writeInteger(this.OfferID,dos);
					
					// Integer
				
						writeInteger(this.ContractID,dos);
					
					// Integer
				
						writeInteger(this.PaymentModeID,dos);
					
					// Integer
				
						writeInteger(this.ServiceID,dos);
					
					// Integer
				
						writeInteger(this.ChurnID,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
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
					
					// Integer
				
						writeInteger(this.TenureInMonth,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// Integer
				
						writeInteger(this.OfferID,dos);
					
					// Integer
				
						writeInteger(this.ContractID,dos);
					
					// Integer
				
						writeInteger(this.PaymentModeID,dos);
					
					// Integer
				
						writeInteger(this.ServiceID,dos);
					
					// Integer
				
						writeInteger(this.ChurnID,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
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
					
					// Integer
				
						writeInteger(this.TenureInMonth,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",OfferID="+String.valueOf(OfferID));
		sb.append(",ContractID="+String.valueOf(ContractID));
		sb.append(",PaymentModeID="+String.valueOf(PaymentModeID));
		sb.append(",ServiceID="+String.valueOf(ServiceID));
		sb.append(",ChurnID="+String.valueOf(ChurnID));
		sb.append(",AvgMonthlyLongDistanceCharges="+String.valueOf(AvgMonthlyLongDistanceCharges));
		sb.append(",AvgMonthlyGBDownload="+String.valueOf(AvgMonthlyGBDownload));
		sb.append(",MonthlyCharge="+String.valueOf(MonthlyCharge));
		sb.append(",TotalCharges="+String.valueOf(TotalCharges));
		sb.append(",TotalRefunds="+String.valueOf(TotalRefunds));
		sb.append(",TotalExtraDataCharges="+String.valueOf(TotalExtraDataCharges));
		sb.append(",TotalLongDistanceCharges="+String.valueOf(TotalLongDistanceCharges));
		sb.append(",TotalRevenue="+String.valueOf(TotalRevenue));
		sb.append(",TenureInMonth="+String.valueOf(TenureInMonth));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(customersStruct other) {

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

public static class out1Struct implements routines.system.IPersistableRow<out1Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];

	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public Integer OfferID;

				public Integer getOfferID () {
					return this.OfferID;
				}
				
			    public Integer ContractID;

				public Integer getContractID () {
					return this.ContractID;
				}
				
			    public Integer PaymentModeID;

				public Integer getPaymentModeID () {
					return this.PaymentModeID;
				}
				
			    public Integer ServiceID;

				public Integer getServiceID () {
					return this.ServiceID;
				}
				
			    public Integer ChurnID;

				public Integer getChurnID () {
					return this.ChurnID;
				}
				
			    public Float AvgMonthlyLongDistanceCharges;

				public Float getAvgMonthlyLongDistanceCharges () {
					return this.AvgMonthlyLongDistanceCharges;
				}
				
			    public Float AvgMonthlyGBDownload;

				public Float getAvgMonthlyGBDownload () {
					return this.AvgMonthlyGBDownload;
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
				
			    public String ServiceHash;

				public String getServiceHash () {
					return this.ServiceHash;
				}
				
			    public Integer TenureInMonth;

				public Integer getTenureInMonth () {
					return this.TenureInMonth;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
						this.OfferID = readInteger(dis);
					
						this.ContractID = readInteger(dis);
					
						this.PaymentModeID = readInteger(dis);
					
						this.ServiceID = readInteger(dis);
					
						this.ChurnID = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
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
					
					this.ServiceHash = readString(dis);
					
						this.TenureInMonth = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
						this.OfferID = readInteger(dis);
					
						this.ContractID = readInteger(dis);
					
						this.PaymentModeID = readInteger(dis);
					
						this.ServiceID = readInteger(dis);
					
						this.ChurnID = readInteger(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyLongDistanceCharges = null;
           				} else {
           			    	this.AvgMonthlyLongDistanceCharges = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AvgMonthlyGBDownload = null;
           				} else {
           			    	this.AvgMonthlyGBDownload = dis.readFloat();
           				}
					
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
					
					this.ServiceHash = readString(dis);
					
						this.TenureInMonth = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// Integer
				
						writeInteger(this.OfferID,dos);
					
					// Integer
				
						writeInteger(this.ContractID,dos);
					
					// Integer
				
						writeInteger(this.PaymentModeID,dos);
					
					// Integer
				
						writeInteger(this.ServiceID,dos);
					
					// Integer
				
						writeInteger(this.ChurnID,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
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
				
						writeString(this.ServiceHash,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonth,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
					// Integer
				
						writeInteger(this.OfferID,dos);
					
					// Integer
				
						writeInteger(this.ContractID,dos);
					
					// Integer
				
						writeInteger(this.PaymentModeID,dos);
					
					// Integer
				
						writeInteger(this.ServiceID,dos);
					
					// Integer
				
						writeInteger(this.ChurnID,dos);
					
					// Float
				
						if(this.AvgMonthlyLongDistanceCharges == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyLongDistanceCharges);
		            	}
					
					// Float
				
						if(this.AvgMonthlyGBDownload == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AvgMonthlyGBDownload);
		            	}
					
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
				
						writeString(this.ServiceHash,dos);
					
					// Integer
				
						writeInteger(this.TenureInMonth,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",OfferID="+String.valueOf(OfferID));
		sb.append(",ContractID="+String.valueOf(ContractID));
		sb.append(",PaymentModeID="+String.valueOf(PaymentModeID));
		sb.append(",ServiceID="+String.valueOf(ServiceID));
		sb.append(",ChurnID="+String.valueOf(ChurnID));
		sb.append(",AvgMonthlyLongDistanceCharges="+String.valueOf(AvgMonthlyLongDistanceCharges));
		sb.append(",AvgMonthlyGBDownload="+String.valueOf(AvgMonthlyGBDownload));
		sb.append(",MonthlyCharge="+String.valueOf(MonthlyCharge));
		sb.append(",TotalCharges="+String.valueOf(TotalCharges));
		sb.append(",TotalRefunds="+String.valueOf(TotalRefunds));
		sb.append(",TotalExtraDataCharges="+String.valueOf(TotalExtraDataCharges));
		sb.append(",TotalLongDistanceCharges="+String.valueOf(TotalLongDistanceCharges));
		sb.append(",TotalRevenue="+String.valueOf(TotalRevenue));
		sb.append(",ServiceHash="+ServiceHash);
		sb.append(",TenureInMonth="+String.valueOf(TenureInMonth));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(out1Struct other) {

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
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];

	
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

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
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];

	
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

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
		tFileInputDelimited_3Process(globalMap);
		tFileInputDelimited_4Process(globalMap);
		tFileInputDelimited_5Process(globalMap);
		tFileInputDelimited_7Process(globalMap);
		tFileInputDelimited_6Process(globalMap);

		row1Struct row1 = new row1Struct();
out1Struct out1 = new out1Struct();
customersStruct customers = new customersStruct();






	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"customers");
					}
				
		int tos_count_tFileOutputDelimited_1 = 0;
		

String fileName_tFileOutputDelimited_1 = "";
    fileName_tFileOutputDelimited_1 = (new java.io.File(context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_FACT_TABLE.csv")).getAbsolutePath().replace("\\","/");
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
            throw new RuntimeException("The particular file \""+filetFileOutputDelimited_1.getAbsoluteFile() +
            "\" already exist. If you want to overwrite the file, please uncheck the" + 
            " \"Throw an error if the file already exist\" option in Advanced settings.");
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

                        java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
                        if(fileToDelete_tFileOutputDelimited_1.exists()) {
                            fileToDelete_tFileOutputDelimited_1.delete();
                        }
                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false),context.encodage));
                                    if(filetFileOutputDelimited_1.length()==0){
                                        outtFileOutputDelimited_1.write("CustomerID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("OfferID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ContractID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("PaymentModeID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ServiceID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("ChurnID");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("AvgMonthlyLongDistanceCharges");
                                            outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write("AvgMonthlyGBDownload");
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
                                        outtFileOutputDelimited_1.write("TenureInMonth");
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */



	
	/**
	 * [tMap_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_1", false);
		start_Hash.put("tMap_1", System.currentTimeMillis());
		
	
	currentComponent="tMap_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"out1");
					}
				
		int tos_count_tMap_1 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
					globalMap.get( "tHash_Lookup_row7" ))
					;					
					
	

row7Struct row7HashKey = new row7Struct();
row7Struct row7Default = new row7Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
					globalMap.get( "tHash_Lookup_row6" ))
					;					
					
	

row6Struct row6HashKey = new row6Struct();
row6Struct row6Default = new row6Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_1__Struct  {
}
Var__tMap_1__Struct Var__tMap_1 = new Var__tMap_1__Struct();
// ###############################

// ###############################
// # Outputs initialization
customersStruct customers_tmp = new customersStruct();
// ###############################

        
        



        









 



/**
 * [tMap_1 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row1");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct>) 
					globalMap.get( "tHash_Lookup_row2" ))
					;					
					
	

row2Struct row2HashKey = new row2Struct();
row2Struct row2Default = new row2Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
					globalMap.get( "tHash_Lookup_row5" ))
					;					
					
	

row5Struct row5HashKey = new row5Struct();
row5Struct row5Default = new row5Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
	String serviceHash;
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
out1Struct out1_tmp = new out1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
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
			
				Object filename_tFileInputDelimited_1 = /** Start field tFileInputDelimited_1:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER_ALL.csv"/** End field tFileInputDelimited_1:FILENAME */;		
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
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row2HashKey.Offer = row1.Offer ;
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.Offer = '" + row2HashKey.Offer + "'");
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
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row3HashKey.CustomerStatus = row1.CustomerStatus ;
                        		    		
                        		    		    row3HashKey.ChurnCategory = row1.ChurnCategory ;
                        		    		
                        		    		    row3HashKey.ChurnReason = row1.ChurnReason ;
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row3.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.CustomerStatus = '" + row3HashKey.CustomerStatus + "', row3.ChurnCategory = '" + row3HashKey.ChurnCategory + "', row3.ChurnReason = '" + row3HashKey.ChurnReason + "'");
								} // G 071
							

							row3Struct row3 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row3Struct fromLookup_row3 = null;
							row3 = row3Default;
										 
							
								 
							
							
								if (tHash_Lookup_row3 !=null && tHash_Lookup_row3.hasNext()) { // G 099
								
							
								
								fromLookup_row3 = tHash_Lookup_row3.next();

							
							
								} // G 099
							
							

							if(fromLookup_row3 != null) {
								row3 = fromLookup_row3;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row4HashKey.PaperlessBilling = row1.PaperlessBilling ;
                        		    		
                        		    		    row4HashKey.Contract = row1.Contract ;
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.PaperlessBilling = '" + row4HashKey.PaperlessBilling + "', row4.Contract = '" + row4HashKey.Contract + "'");
								} // G 071
							

							row4Struct row4 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row4Struct fromLookup_row4 = null;
							row4 = row4Default;
										 
							
								 
							
							
								if (tHash_Lookup_row4 !=null && tHash_Lookup_row4.hasNext()) { // G 099
								
							
								
								fromLookup_row4 = tHash_Lookup_row4.next();

							
							
								} // G 099
							
							

							if(fromLookup_row4 != null) {
								row4 = fromLookup_row4;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row5" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow5 = false;
       		  	    	
       		  	    	
 							row5Struct row5ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    row5HashKey.PaymentMethod = row1.PaymentMethod ;
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row5.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.PaymentMethod = '" + row5HashKey.PaymentMethod + "'");
								} // G 071
							

							row5Struct row5 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row5Struct fromLookup_row5 = null;
							row5 = row5Default;
										 
							
								 
							
							
								if (tHash_Lookup_row5 !=null && tHash_Lookup_row5.hasNext()) { // G 099
								
							
								
								fromLookup_row5 = tHash_Lookup_row5.next();

							
							
								} // G 099
							
							

							if(fromLookup_row5 != null) {
								row5 = fromLookup_row5;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.serviceHash = StringHandling.TRIM(
	ServiceHash.buildServiceHash(
    row1.PhoneService,
    row1.MultipleLines,
    row1.InternetService,
    row1.InternetType,
    row1.OnlineSecurity,
    row1.OnlineBackup,
    row1.DeviceProtectionPlan,
    row1.PremiumTechSupport,
    row1.StreamingTV,
    row1.StreamingMovies,
    row1.StreamingMusic,
    row1.UnlimitedData
	) 
) ;// ###############################
        // ###############################
        // # Output tables

out1 = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'out1'
out1_tmp.CustomerID = row1.CustomerID ;
out1_tmp.OfferID = row2.OfferID ;
out1_tmp.ContractID = row4.ContractId ;
out1_tmp.PaymentModeID = row5.PaymentModeID ;
out1_tmp.ServiceID = null;
out1_tmp.ChurnID = row3.ChurnId ;
out1_tmp.AvgMonthlyLongDistanceCharges = row1.AvgMonthlyLongDistanceCharges ;
out1_tmp.AvgMonthlyGBDownload = row1.AvgMonthlyGBDownload ;
out1_tmp.MonthlyCharge = row1.MonthlyCharge ;
out1_tmp.TotalCharges = row1.TotalCharges ;
out1_tmp.TotalRefunds = row1.TotalRefunds ;
out1_tmp.TotalExtraDataCharges = row1.TotalExtraDataCharges ;
out1_tmp.TotalLongDistanceCharges = row1.TotalLongDistanceCharges ;
out1_tmp.TotalRevenue = row1.TotalRevenue ;
out1_tmp.ServiceHash = Var.serviceHash ;
out1_tmp.TenureInMonth = row1.TenureInMonths ;
out1 = out1_tmp;
}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "out1"
if(out1 != null) { 



	
	/**
	 * [tMap_1 main ] start
	 */

	

	
	
	currentComponent="tMap_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"out1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_1 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_1 = false;
		  boolean mainRowRejected_tMap_1 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row7" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow7 = false;
       		  	    	
       		  	    	
 							row7Struct row7ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    row7HashKey.CustomerID = out1.CustomerID ;
                        		    		

								
		                        	row7HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row7.lookup( row7HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row7.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7' and it contains more one result from keys :  row7.CustomerID = '" + row7HashKey.CustomerID + "'");
								} // G 071
							

							row7Struct row7 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row7Struct fromLookup_row7 = null;
							row7 = row7Default;
										 
							
								 
							
							
								if (tHash_Lookup_row7 !=null && tHash_Lookup_row7.hasNext()) { // G 099
								
							
								
								fromLookup_row7 = tHash_Lookup_row7.next();

							
							
								} // G 099
							
							

							if(fromLookup_row7 != null) {
								row7 = fromLookup_row7;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "row6" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow6 = false;
       		  	    	
       		  	    	
 							row6Struct row6ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    row6HashKey.ServiceHash = StringHandling.TRIM(out1.ServiceHash) ;
                        		    		

								
		                        	row6HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row6.lookup( row6HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row6.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row6 != null && tHash_Lookup_row6.getCount(row6HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row6' and it contains more one result from keys :  row6.ServiceHash = '" + row6HashKey.ServiceHash + "'");
								} // G 071
							

							row6Struct row6 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row6Struct fromLookup_row6 = null;
							row6 = row6Default;
										 
							
								 
							
							
								if (tHash_Lookup_row6 !=null && tHash_Lookup_row6.hasNext()) { // G 099
								
							
								
								fromLookup_row6 = tHash_Lookup_row6.next();

							
							
								} // G 099
							
							

							if(fromLookup_row6 != null) {
								row6 = fromLookup_row6;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_1__Struct Var = Var__tMap_1;// ###############################
        // ###############################
        // # Output tables

customers = null;

if(!rejectedInnerJoin_tMap_1 ) {

// # Output table : 'customers'
customers_tmp.CustomerID = row7.CustomerID ;
customers_tmp.OfferID = out1.OfferID ;
customers_tmp.ContractID = out1.ContractID ;
customers_tmp.PaymentModeID = out1.PaymentModeID ;
customers_tmp.ServiceID = row6.ServiceID ;
customers_tmp.ChurnID = out1.ChurnID ;
customers_tmp.AvgMonthlyLongDistanceCharges = out1.AvgMonthlyLongDistanceCharges ;
customers_tmp.AvgMonthlyGBDownload = out1.AvgMonthlyGBDownload ;
customers_tmp.MonthlyCharge = out1.MonthlyCharge ;
customers_tmp.TotalCharges = out1.TotalCharges ;
customers_tmp.TotalRefunds = out1.TotalRefunds ;
customers_tmp.TotalExtraDataCharges = out1.TotalExtraDataCharges ;
customers_tmp.TotalLongDistanceCharges = out1.TotalLongDistanceCharges ;
customers_tmp.TotalRevenue = out1.TotalRevenue ;
customers_tmp.TenureInMonth = out1.TenureInMonth ;
customers = customers_tmp;
}  // closing inner join bracket (2)
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
// Start of branch "customers"
if(customers != null) { 



	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"customers"
						
						);
					}
					


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            if(customers.CustomerID != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.CustomerID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.OfferID != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.OfferID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.ContractID != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.ContractID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.PaymentModeID != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.PaymentModeID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.ServiceID != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.ServiceID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.ChurnID != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.ChurnID
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.AvgMonthlyLongDistanceCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.AvgMonthlyLongDistanceCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.AvgMonthlyGBDownload != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.AvgMonthlyGBDownload
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.MonthlyCharge != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.MonthlyCharge
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.TotalCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.TotalCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.TotalRefunds != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.TotalRefunds
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.TotalExtraDataCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.TotalExtraDataCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.TotalLongDistanceCharges != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.TotalLongDistanceCharges
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.TotalRevenue != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.TotalRevenue
                        );
                            }
                            sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                            if(customers.TenureInMonth != null) {
                        sb_tFileOutputDelimited_1.append(
                            customers.TenureInMonth
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
 */

} // End of branch "customers"




	
	/**
	 * [tMap_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	

 



/**
 * [tMap_1 process_data_end ] stop
 */

} // End of branch "out1"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
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
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row2 != null) {
						tHash_Lookup_row2.endGet();
					}
					globalMap.remove( "tHash_Lookup_row2" );

					
					
				
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
					if(tHash_Lookup_row5 != null) {
						tHash_Lookup_row5.endGet();
					}
					globalMap.remove( "tHash_Lookup_row5" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row1");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tMap_1 end ] start
	 */

	

	
	
	currentComponent="tMap_1";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row7 != null) {
						tHash_Lookup_row7.endGet();
					}
					globalMap.remove( "tHash_Lookup_row7" );

					
					
				
					if(tHash_Lookup_row6 != null) {
						tHash_Lookup_row6.endGet();
					}
					globalMap.remove( "tHash_Lookup_row6" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"out1");
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
			  		runStat.updateStat(resourceMap,iterateId,2,0,"customers");
			  	}
			  	
 

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
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
					     			globalMap.remove("tHash_Lookup_row7"); 
				     			
					     			//free memory for "tMap_1"
					     			globalMap.remove("tHash_Lookup_row6"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row2"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
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
	System.err.println("Le fichier " +"CHURN_"+ TalendDate.getDate("YYYYMMDD") +" _FACT_TABLE.csv" +"  existe déjà dans le repertoire du jour "+ context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" );
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le fichier " +"CHURN_"+ TalendDate.getDate("YYYYMMDD") +" _FACT_TABLE.csv" +"  existe déjà dans le repertoire du jour "+ context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" );
	globalMap.put("tDie_1_DIE_MESSAGES", "Le fichier " +"CHURN_"+ TalendDate.getDate("YYYYMMDD") +" _FACT_TABLE.csv" +"  existe déjà dans le repertoire du jour "+ context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" );
	
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
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer OfferID;

				public Integer getOfferID () {
					return this.OfferID;
				}
				
			    public String Offer;

				public String getOffer () {
					return this.Offer;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.Offer == null) ? 0 : this.Offer.hashCode());
					
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
		
						if (this.Offer == null) {
							if (other.Offer != null)
								return false;
						
						} else if (!this.Offer.equals(other.Offer))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.OfferID = this.OfferID;
	            other.Offer = this.Offer;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.Offer = this.Offer;
	            	
	}



	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.Offer = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.Offer = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.Offer,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.Offer,dos);
					
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
		
						this.OfferID = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.OfferID = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.OfferID, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.OfferID, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("OfferID="+String.valueOf(OfferID));
		sb.append(",Offer="+Offer);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.Offer, other.Offer);
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
			   		// linked node: tMap_3 - inputs:(row1,row2,row3,row4,row5) outputs:(out1)
			   
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
			
				Object filename_tFileInputDelimited_2 = /** Start field tFileInputDelimited_2:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_OFFER.csv"/** End field tFileInputDelimited_2:FILENAME */;		
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
					
						
						System.err.println(e.getMessage());
					
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
					
							row2.OfferID = null;
					
							row2.Offer = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_2 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_2 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
								
									if(rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2].length() > 0) {
										try {
									
										row2.OfferID = ParserUtils.parseTo_Integer(rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
											rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"OfferID", "row2", rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2], ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
										}
    								}else{
    									
											
												row2.OfferID = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row2.OfferID = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_2 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_2 < rowtFileInputDelimited_2.length){
						
						
							
									row2.Offer = rowtFileInputDelimited_2[columnIndexWithD_tFileInputDelimited_2];
									
							
						
						}else{
						
							
								row2.Offer = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_2.getException()!=null) {
										throw rowstate_tFileInputDelimited_2.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_2 = true;
        							
                							System.err.println(e.getMessage());
                							row2 = null;
                						
            							globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE", e.getMessage());
            							
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
		   	   	   
				
				row2_HashRow.OfferID = row2.OfferID;
				
				row2_HashRow.Offer = row2.Offer;
				
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
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer ChurnId;

				public Integer getChurnId () {
					return this.ChurnId;
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
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CustomerStatus == null) ? 0 : this.CustomerStatus.hashCode());
					
						result = prime * result + ((this.ChurnCategory == null) ? 0 : this.ChurnCategory.hashCode());
					
						result = prime * result + ((this.ChurnReason == null) ? 0 : this.ChurnReason.hashCode());
					
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
		final row3Struct other = (row3Struct) obj;
		
						if (this.CustomerStatus == null) {
							if (other.CustomerStatus != null)
								return false;
						
						} else if (!this.CustomerStatus.equals(other.CustomerStatus))
						
							return false;
					
						if (this.ChurnCategory == null) {
							if (other.ChurnCategory != null)
								return false;
						
						} else if (!this.ChurnCategory.equals(other.ChurnCategory))
						
							return false;
					
						if (this.ChurnReason == null) {
							if (other.ChurnReason != null)
								return false;
						
						} else if (!this.ChurnReason.equals(other.ChurnReason))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.ChurnId = this.ChurnId;
	            other.CustomerStatus = this.CustomerStatus;
	            other.ChurnCategory = this.ChurnCategory;
	            other.ChurnReason = this.ChurnReason;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.CustomerStatus = this.CustomerStatus;
	            	other.ChurnCategory = this.ChurnCategory;
	            	other.ChurnReason = this.ChurnReason;
	            	
	}



	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerStatus = readString(dis);
					
					this.ChurnCategory = readString(dis);
					
					this.ChurnReason = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
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
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
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



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		
						this.ChurnId = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ChurnId = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.ChurnId, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.ChurnId, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ChurnId="+String.valueOf(ChurnId));
		sb.append(",CustomerStatus="+CustomerStatus);
		sb.append(",ChurnCategory="+ChurnCategory);
		sb.append(",ChurnReason="+ChurnReason);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CustomerStatus, other.CustomerStatus);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ChurnCategory, other.ChurnCategory);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.ChurnReason, other.ChurnReason);
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
public void tFileInputDelimited_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 0);

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



		row3Struct row3 = new row3Struct();




	
	/**
	 * [tAdvancedHash_row3 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row3", false);
		start_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row3");
					}
				
		int tos_count_tAdvancedHash_row3 = 0;
		

			   		// connection name:row3
			   		// source node:tFileInputDelimited_3 - inputs:(after_tFileInputDelimited_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_3 - inputs:(row1,row2,row3,row4,row5) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_3", false);
		start_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_3";

	
		int tos_count_tFileInputDelimited_3 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_3 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_3 = 0;
				int footer_tFileInputDelimited_3 = 0;
				int totalLinetFileInputDelimited_3 = 0;
				int limittFileInputDelimited_3 = -1;
				int lastLinetFileInputDelimited_3 = -1;	
				
				char fieldSeparator_tFileInputDelimited_3[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_3 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_3[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_3 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_3 = /** Start field tFileInputDelimited_3:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CHURN.csv"/** End field tFileInputDelimited_3:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_3 = null;
	
				try{
					
						String[] rowtFileInputDelimited_3=null;
						int currentLinetFileInputDelimited_3 = 0;
	        			int outputLinetFileInputDelimited_3 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_3 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_3 = 0;
			if(footer_value_tFileInputDelimited_3 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_3, fieldSeparator_tFileInputDelimited_3[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_3),fieldSeparator_tFileInputDelimited_3[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_3.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_3[0] != '\n') && (rowSeparator_tFileInputDelimited_3[0] != '\r') )
	        			csvReadertFileInputDelimited_3.setLineEnd(""+rowSeparator_tFileInputDelimited_3[0]);
						
	        				csvReadertFileInputDelimited_3.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_3.setEscapeChar(csvReadertFileInputDelimited_3.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_3 > 0){
						for(totalLinetFileInputDelimited_3=0;totalLinetFileInputDelimited_3 < 1; totalLinetFileInputDelimited_3++){
							csvReadertFileInputDelimited_3.readNext();
						}
						csvReadertFileInputDelimited_3.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_3.readNext()) {
							
								rowtFileInputDelimited_3=csvReadertFileInputDelimited_3.getValues();
								if(!(rowtFileInputDelimited_3.length == 1 && ("\015").equals(rowtFileInputDelimited_3[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_3++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_3 = totalLinetFileInputDelimited_3 - footer_tFileInputDelimited_3   < 0? 0 : totalLinetFileInputDelimited_3 - footer_tFileInputDelimited_3 ;
	            		if(lastLinetFileInputDelimited_3 > 0){
	                		lastLinetFileInputDelimited_3 = lastLinetFileInputDelimited_3 < lastLineTemptFileInputDelimited_3 ? lastLinetFileInputDelimited_3 : lastLineTemptFileInputDelimited_3; 
	            		}else {
	                		lastLinetFileInputDelimited_3 = lastLineTemptFileInputDelimited_3;
	            		}
	         
			          	csvReadertFileInputDelimited_3.close();
				        if(filename_tFileInputDelimited_3 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_3, fieldSeparator_tFileInputDelimited_3[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_3=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_3),fieldSeparator_tFileInputDelimited_3[0], context.encodage);
						}
						csvReadertFileInputDelimited_3.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_3[0] != '\n') && (rowSeparator_tFileInputDelimited_3[0] != '\r') )	
	        				csvReadertFileInputDelimited_3.setLineEnd(""+rowSeparator_tFileInputDelimited_3[0]);
						
							csvReadertFileInputDelimited_3.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_3.setEscapeChar(csvReadertFileInputDelimited_3.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_3 != 0){
			        	for(currentLinetFileInputDelimited_3=0;currentLinetFileInputDelimited_3 < 1;currentLinetFileInputDelimited_3++){
			        		csvReadertFileInputDelimited_3.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_3.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_3 != 0 && csvReadertFileInputDelimited_3!=null && csvReadertFileInputDelimited_3.readNext() ) { 
	        		rowstate_tFileInputDelimited_3.reset();
	        
		        	rowtFileInputDelimited_3=csvReadertFileInputDelimited_3.getValues();
		        	
					
	        			if(rowtFileInputDelimited_3.length == 1 && ("\015").equals(rowtFileInputDelimited_3[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_3++;
	            
		            if(lastLinetFileInputDelimited_3 > -1 && currentLinetFileInputDelimited_3 > lastLinetFileInputDelimited_3) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_3++;
	            	if (limittFileInputDelimited_3 > 0 && outputLinetFileInputDelimited_3 > limittFileInputDelimited_3) {
	                	break;
	            	}  
	                                                                      
					
	    							row3 = null;			
								
	    							row3 = null;			
								
								boolean whetherReject_tFileInputDelimited_3 = false;
								row3 = new row3Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_3_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_3_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_3.length == 1 && ("\015").equals(rowtFileInputDelimited_3[0])){//empty line when row separator is '\n'
					
							row3.ChurnId = null;
					
							row3.CustomerStatus = null;
					
							row3.ChurnCategory = null;
					
							row3.ChurnReason = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_3 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_3 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_3 < rowtFileInputDelimited_3.length){
						
						
							
								
									if(rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3].length() > 0) {
										try {
									
										row3.ChurnId = ParserUtils.parseTo_Integer(rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_3) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",ex_tFileInputDelimited_3.getMessage());
											rowstate_tFileInputDelimited_3.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ChurnId", "row3", rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3], ex_tFileInputDelimited_3), ex_tFileInputDelimited_3));
										}
    								}else{
    									
											
												row3.ChurnId = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row3.ChurnId = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_3 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_3 < rowtFileInputDelimited_3.length){
						
						
							
									row3.CustomerStatus = rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3];
									
							
						
						}else{
						
							
								row3.CustomerStatus = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_3 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_3 < rowtFileInputDelimited_3.length){
						
						
							
									row3.ChurnCategory = rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3];
									
							
						
						}else{
						
							
								row3.ChurnCategory = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_3 = 3;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_3 < rowtFileInputDelimited_3.length){
						
						
							
									row3.ChurnReason = rowtFileInputDelimited_3[columnIndexWithD_tFileInputDelimited_3];
									
							
						
						}else{
						
							
								row3.ChurnReason = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_3.getException()!=null) {
										throw rowstate_tFileInputDelimited_3.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_3 = true;
        							
                							System.err.println(e.getMessage());
                							row3 = null;
                						
            							globalMap.put("tFileInputDelimited_3_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_3 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 


	tos_count_tFileInputDelimited_3++;

/**
 * [tFileInputDelimited_3 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 



/**
 * [tFileInputDelimited_3 process_data_begin ] stop
 */
// Start of branch "row3"
if(row3 != null) { 



	
	/**
	 * [tAdvancedHash_row3 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row3"
						
						);
					}
					


			   
			   

					row3Struct row3_HashRow = new row3Struct();
		   	   	   
				
				row3_HashRow.ChurnId = row3.ChurnId;
				
				row3_HashRow.CustomerStatus = row3.CustomerStatus;
				
				row3_HashRow.ChurnCategory = row3.ChurnCategory;
				
				row3_HashRow.ChurnReason = row3.ChurnReason;
				
			tHash_Lookup_row3.put(row3_HashRow);
			
            




 


	tos_count_tAdvancedHash_row3++;

/**
 * [tAdvancedHash_row3 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row3 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 process_data_end ] stop
 */

} // End of branch "row3"




	
	/**
	 * [tFileInputDelimited_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 



/**
 * [tFileInputDelimited_3 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_3 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	


				nb_line_tFileInputDelimited_3++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_3 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_3!=null){
    					csvReadertFileInputDelimited_3.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_3!=null){
    				globalMap.put("tFileInputDelimited_3_NB_LINE",nb_line_tFileInputDelimited_3);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_3", true);
end_Hash.put("tFileInputDelimited_3", System.currentTimeMillis());




/**
 * [tFileInputDelimited_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

tHash_Lookup_row3.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row3");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row3", true);
end_Hash.put("tAdvancedHash_row3", System.currentTimeMillis());




/**
 * [tAdvancedHash_row3 end ] stop
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
	 * [tFileInputDelimited_3 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_3";

	

 



/**
 * [tFileInputDelimited_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row3 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row3";

	

 



/**
 * [tAdvancedHash_row3 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_3_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer ContractId;

				public Integer getContractId () {
					return this.ContractId;
				}
				
			    public String PaperlessBilling;

				public String getPaperlessBilling () {
					return this.PaperlessBilling;
				}
				
			    public String Contract;

				public String getContract () {
					return this.Contract;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.PaperlessBilling == null) ? 0 : this.PaperlessBilling.hashCode());
					
						result = prime * result + ((this.Contract == null) ? 0 : this.Contract.hashCode());
					
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
		final row4Struct other = (row4Struct) obj;
		
						if (this.PaperlessBilling == null) {
							if (other.PaperlessBilling != null)
								return false;
						
						} else if (!this.PaperlessBilling.equals(other.PaperlessBilling))
						
							return false;
					
						if (this.Contract == null) {
							if (other.Contract != null)
								return false;
						
						} else if (!this.Contract.equals(other.Contract))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.ContractId = this.ContractId;
	            other.PaperlessBilling = this.PaperlessBilling;
	            other.Contract = this.Contract;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.PaperlessBilling = this.PaperlessBilling;
	            	other.Contract = this.Contract;
	            	
	}



	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.PaperlessBilling = readString(dis);
					
					this.Contract = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.PaperlessBilling = readString(dis);
					
					this.Contract = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.PaperlessBilling,dos);
					
					// String
				
						writeString(this.Contract,dos);
					
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
		
						this.ContractId = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ContractId = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.ContractId, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.ContractId, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ContractId="+String.valueOf(ContractId));
		sb.append(",PaperlessBilling="+PaperlessBilling);
		sb.append(",Contract="+Contract);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.PaperlessBilling, other.PaperlessBilling);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.Contract, other.Contract);
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
public void tFileInputDelimited_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_4_SUBPROCESS_STATE", 0);

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



		row4Struct row4 = new row4Struct();




	
	/**
	 * [tAdvancedHash_row4 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row4", false);
		start_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row4");
					}
				
		int tos_count_tAdvancedHash_row4 = 0;
		

			   		// connection name:row4
			   		// source node:tFileInputDelimited_4 - inputs:(after_tFileInputDelimited_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_3 - inputs:(row1,row2,row3,row4,row5) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_4", false);
		start_Hash.put("tFileInputDelimited_4", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_4";

	
		int tos_count_tFileInputDelimited_4 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_4 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_4 = 0;
				int footer_tFileInputDelimited_4 = 0;
				int totalLinetFileInputDelimited_4 = 0;
				int limittFileInputDelimited_4 = -1;
				int lastLinetFileInputDelimited_4 = -1;	
				
				char fieldSeparator_tFileInputDelimited_4[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_4 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_4[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_4 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_4 = /** Start field tFileInputDelimited_4:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CONTRACT.csv"/** End field tFileInputDelimited_4:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_4 = null;
	
				try{
					
						String[] rowtFileInputDelimited_4=null;
						int currentLinetFileInputDelimited_4 = 0;
	        			int outputLinetFileInputDelimited_4 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_4 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_4 = 0;
			if(footer_value_tFileInputDelimited_4 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_4=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_4, fieldSeparator_tFileInputDelimited_4[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_4=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_4),fieldSeparator_tFileInputDelimited_4[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_4.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_4[0] != '\n') && (rowSeparator_tFileInputDelimited_4[0] != '\r') )
	        			csvReadertFileInputDelimited_4.setLineEnd(""+rowSeparator_tFileInputDelimited_4[0]);
						
	        				csvReadertFileInputDelimited_4.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_4.setEscapeChar(csvReadertFileInputDelimited_4.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_4 > 0){
						for(totalLinetFileInputDelimited_4=0;totalLinetFileInputDelimited_4 < 1; totalLinetFileInputDelimited_4++){
							csvReadertFileInputDelimited_4.readNext();
						}
						csvReadertFileInputDelimited_4.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_4.readNext()) {
							
								rowtFileInputDelimited_4=csvReadertFileInputDelimited_4.getValues();
								if(!(rowtFileInputDelimited_4.length == 1 && ("\015").equals(rowtFileInputDelimited_4[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_4++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_4 = totalLinetFileInputDelimited_4 - footer_tFileInputDelimited_4   < 0? 0 : totalLinetFileInputDelimited_4 - footer_tFileInputDelimited_4 ;
	            		if(lastLinetFileInputDelimited_4 > 0){
	                		lastLinetFileInputDelimited_4 = lastLinetFileInputDelimited_4 < lastLineTemptFileInputDelimited_4 ? lastLinetFileInputDelimited_4 : lastLineTemptFileInputDelimited_4; 
	            		}else {
	                		lastLinetFileInputDelimited_4 = lastLineTemptFileInputDelimited_4;
	            		}
	         
			          	csvReadertFileInputDelimited_4.close();
				        if(filename_tFileInputDelimited_4 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_4=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_4, fieldSeparator_tFileInputDelimited_4[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_4=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_4),fieldSeparator_tFileInputDelimited_4[0], context.encodage);
						}
						csvReadertFileInputDelimited_4.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_4[0] != '\n') && (rowSeparator_tFileInputDelimited_4[0] != '\r') )	
	        				csvReadertFileInputDelimited_4.setLineEnd(""+rowSeparator_tFileInputDelimited_4[0]);
						
							csvReadertFileInputDelimited_4.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_4.setEscapeChar(csvReadertFileInputDelimited_4.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_4 != 0){
			        	for(currentLinetFileInputDelimited_4=0;currentLinetFileInputDelimited_4 < 1;currentLinetFileInputDelimited_4++){
			        		csvReadertFileInputDelimited_4.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_4.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_4 != 0 && csvReadertFileInputDelimited_4!=null && csvReadertFileInputDelimited_4.readNext() ) { 
	        		rowstate_tFileInputDelimited_4.reset();
	        
		        	rowtFileInputDelimited_4=csvReadertFileInputDelimited_4.getValues();
		        	
					
	        			if(rowtFileInputDelimited_4.length == 1 && ("\015").equals(rowtFileInputDelimited_4[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_4++;
	            
		            if(lastLinetFileInputDelimited_4 > -1 && currentLinetFileInputDelimited_4 > lastLinetFileInputDelimited_4) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_4++;
	            	if (limittFileInputDelimited_4 > 0 && outputLinetFileInputDelimited_4 > limittFileInputDelimited_4) {
	                	break;
	            	}  
	                                                                      
					
	    							row4 = null;			
								
	    							row4 = null;			
								
								boolean whetherReject_tFileInputDelimited_4 = false;
								row4 = new row4Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_4_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_4_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_4.length == 1 && ("\015").equals(rowtFileInputDelimited_4[0])){//empty line when row separator is '\n'
					
							row4.ContractId = null;
					
							row4.PaperlessBilling = null;
					
							row4.Contract = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_4 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_4 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_4 < rowtFileInputDelimited_4.length){
						
						
							
								
									if(rowtFileInputDelimited_4[columnIndexWithD_tFileInputDelimited_4].length() > 0) {
										try {
									
										row4.ContractId = ParserUtils.parseTo_Integer(rowtFileInputDelimited_4[columnIndexWithD_tFileInputDelimited_4]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_4) {
globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",ex_tFileInputDelimited_4.getMessage());
											rowstate_tFileInputDelimited_4.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ContractId", "row4", rowtFileInputDelimited_4[columnIndexWithD_tFileInputDelimited_4], ex_tFileInputDelimited_4), ex_tFileInputDelimited_4));
										}
    								}else{
    									
											
												row4.ContractId = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row4.ContractId = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_4 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_4 < rowtFileInputDelimited_4.length){
						
						
							
									row4.PaperlessBilling = rowtFileInputDelimited_4[columnIndexWithD_tFileInputDelimited_4];
									
							
						
						}else{
						
							
								row4.PaperlessBilling = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_4 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_4 < rowtFileInputDelimited_4.length){
						
						
							
									row4.Contract = rowtFileInputDelimited_4[columnIndexWithD_tFileInputDelimited_4];
									
							
						
						}else{
						
							
								row4.Contract = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_4.getException()!=null) {
										throw rowstate_tFileInputDelimited_4.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_4 = true;
        							
                							System.err.println(e.getMessage());
                							row4 = null;
                						
            							globalMap.put("tFileInputDelimited_4_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_4 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_4 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_4";

	

 


	tos_count_tFileInputDelimited_4++;

/**
 * [tFileInputDelimited_4 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_4";

	

 



/**
 * [tFileInputDelimited_4 process_data_begin ] stop
 */
// Start of branch "row4"
if(row4 != null) { 



	
	/**
	 * [tAdvancedHash_row4 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row4"
						
						);
					}
					


			   
			   

					row4Struct row4_HashRow = new row4Struct();
		   	   	   
				
				row4_HashRow.ContractId = row4.ContractId;
				
				row4_HashRow.PaperlessBilling = row4.PaperlessBilling;
				
				row4_HashRow.Contract = row4.Contract;
				
			tHash_Lookup_row4.put(row4_HashRow);
			
            




 


	tos_count_tAdvancedHash_row4++;

/**
 * [tAdvancedHash_row4 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row4 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 process_data_end ] stop
 */

} // End of branch "row4"




	
	/**
	 * [tFileInputDelimited_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_4";

	

 



/**
 * [tFileInputDelimited_4 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_4 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_4";

	


				nb_line_tFileInputDelimited_4++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_4 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_4!=null){
    					csvReadertFileInputDelimited_4.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_4!=null){
    				globalMap.put("tFileInputDelimited_4_NB_LINE",nb_line_tFileInputDelimited_4);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_4", true);
end_Hash.put("tFileInputDelimited_4", System.currentTimeMillis());




/**
 * [tFileInputDelimited_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

tHash_Lookup_row4.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row4");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row4", true);
end_Hash.put("tAdvancedHash_row4", System.currentTimeMillis());




/**
 * [tAdvancedHash_row4 end ] stop
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
	 * [tFileInputDelimited_4 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_4";

	

 



/**
 * [tFileInputDelimited_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row4 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row4";

	

 



/**
 * [tAdvancedHash_row4 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_4_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer PaymentModeID;

				public Integer getPaymentModeID () {
					return this.PaymentModeID;
				}
				
			    public String PaymentMethod;

				public String getPaymentMethod () {
					return this.PaymentMethod;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.PaymentMethod == null) ? 0 : this.PaymentMethod.hashCode());
					
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
		final row5Struct other = (row5Struct) obj;
		
						if (this.PaymentMethod == null) {
							if (other.PaymentMethod != null)
								return false;
						
						} else if (!this.PaymentMethod.equals(other.PaymentMethod))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

		other.PaymentModeID = this.PaymentModeID;
	            other.PaymentMethod = this.PaymentMethod;
	            
	}

	public void copyKeysDataTo(row5Struct other) {

		other.PaymentMethod = this.PaymentMethod;
	            	
	}



	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.PaymentMethod = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.PaymentMethod = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.PaymentMethod,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.PaymentMethod,dos);
					
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
		
						this.PaymentModeID = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.PaymentModeID = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.PaymentModeID, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.PaymentModeID, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("PaymentModeID="+String.valueOf(PaymentModeID));
		sb.append(",PaymentMethod="+PaymentMethod);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.PaymentMethod, other.PaymentMethod);
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
public void tFileInputDelimited_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_5_SUBPROCESS_STATE", 0);

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



		row5Struct row5 = new row5Struct();




	
	/**
	 * [tAdvancedHash_row5 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row5", false);
		start_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row5");
					}
				
		int tos_count_tAdvancedHash_row5 = 0;
		

			   		// connection name:row5
			   		// source node:tFileInputDelimited_5 - inputs:(after_tFileInputDelimited_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_3 - inputs:(row1,row2,row3,row4,row5) outputs:(out1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_5", false);
		start_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_5";

	
		int tos_count_tFileInputDelimited_5 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_5 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_5 = 0;
				int footer_tFileInputDelimited_5 = 0;
				int totalLinetFileInputDelimited_5 = 0;
				int limittFileInputDelimited_5 = -1;
				int lastLinetFileInputDelimited_5 = -1;	
				
				char fieldSeparator_tFileInputDelimited_5[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_5 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_5[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_5 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_5 = /** Start field tFileInputDelimited_5:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_PAYMENT_MODE.csv"/** End field tFileInputDelimited_5:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_5 = null;
	
				try{
					
						String[] rowtFileInputDelimited_5=null;
						int currentLinetFileInputDelimited_5 = 0;
	        			int outputLinetFileInputDelimited_5 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_5 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_5 = 0;
			if(footer_value_tFileInputDelimited_5 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_5=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_5, fieldSeparator_tFileInputDelimited_5[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_5=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_5),fieldSeparator_tFileInputDelimited_5[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_5.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_5[0] != '\n') && (rowSeparator_tFileInputDelimited_5[0] != '\r') )
	        			csvReadertFileInputDelimited_5.setLineEnd(""+rowSeparator_tFileInputDelimited_5[0]);
						
	        				csvReadertFileInputDelimited_5.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_5.setEscapeChar(csvReadertFileInputDelimited_5.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_5 > 0){
						for(totalLinetFileInputDelimited_5=0;totalLinetFileInputDelimited_5 < 1; totalLinetFileInputDelimited_5++){
							csvReadertFileInputDelimited_5.readNext();
						}
						csvReadertFileInputDelimited_5.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_5.readNext()) {
							
								rowtFileInputDelimited_5=csvReadertFileInputDelimited_5.getValues();
								if(!(rowtFileInputDelimited_5.length == 1 && ("\015").equals(rowtFileInputDelimited_5[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_5++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_5 = totalLinetFileInputDelimited_5 - footer_tFileInputDelimited_5   < 0? 0 : totalLinetFileInputDelimited_5 - footer_tFileInputDelimited_5 ;
	            		if(lastLinetFileInputDelimited_5 > 0){
	                		lastLinetFileInputDelimited_5 = lastLinetFileInputDelimited_5 < lastLineTemptFileInputDelimited_5 ? lastLinetFileInputDelimited_5 : lastLineTemptFileInputDelimited_5; 
	            		}else {
	                		lastLinetFileInputDelimited_5 = lastLineTemptFileInputDelimited_5;
	            		}
	         
			          	csvReadertFileInputDelimited_5.close();
				        if(filename_tFileInputDelimited_5 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_5=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_5, fieldSeparator_tFileInputDelimited_5[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_5=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_5),fieldSeparator_tFileInputDelimited_5[0], context.encodage);
						}
						csvReadertFileInputDelimited_5.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_5[0] != '\n') && (rowSeparator_tFileInputDelimited_5[0] != '\r') )	
	        				csvReadertFileInputDelimited_5.setLineEnd(""+rowSeparator_tFileInputDelimited_5[0]);
						
							csvReadertFileInputDelimited_5.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_5.setEscapeChar(csvReadertFileInputDelimited_5.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_5 != 0){
			        	for(currentLinetFileInputDelimited_5=0;currentLinetFileInputDelimited_5 < 1;currentLinetFileInputDelimited_5++){
			        		csvReadertFileInputDelimited_5.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_5.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_5 != 0 && csvReadertFileInputDelimited_5!=null && csvReadertFileInputDelimited_5.readNext() ) { 
	        		rowstate_tFileInputDelimited_5.reset();
	        
		        	rowtFileInputDelimited_5=csvReadertFileInputDelimited_5.getValues();
		        	
					
	        			if(rowtFileInputDelimited_5.length == 1 && ("\015").equals(rowtFileInputDelimited_5[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_5++;
	            
		            if(lastLinetFileInputDelimited_5 > -1 && currentLinetFileInputDelimited_5 > lastLinetFileInputDelimited_5) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_5++;
	            	if (limittFileInputDelimited_5 > 0 && outputLinetFileInputDelimited_5 > limittFileInputDelimited_5) {
	                	break;
	            	}  
	                                                                      
					
	    							row5 = null;			
								
	    							row5 = null;			
								
								boolean whetherReject_tFileInputDelimited_5 = false;
								row5 = new row5Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_5_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_5_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_5.length == 1 && ("\015").equals(rowtFileInputDelimited_5[0])){//empty line when row separator is '\n'
					
							row5.PaymentModeID = null;
					
							row5.PaymentMethod = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_5 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_5 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_5 < rowtFileInputDelimited_5.length){
						
						
							
								
									if(rowtFileInputDelimited_5[columnIndexWithD_tFileInputDelimited_5].length() > 0) {
										try {
									
										row5.PaymentModeID = ParserUtils.parseTo_Integer(rowtFileInputDelimited_5[columnIndexWithD_tFileInputDelimited_5]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_5) {
globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",ex_tFileInputDelimited_5.getMessage());
											rowstate_tFileInputDelimited_5.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"PaymentModeID", "row5", rowtFileInputDelimited_5[columnIndexWithD_tFileInputDelimited_5], ex_tFileInputDelimited_5), ex_tFileInputDelimited_5));
										}
    								}else{
    									
											
												row5.PaymentModeID = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row5.PaymentModeID = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_5 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_5 < rowtFileInputDelimited_5.length){
						
						
							
									row5.PaymentMethod = rowtFileInputDelimited_5[columnIndexWithD_tFileInputDelimited_5];
									
							
						
						}else{
						
							
								row5.PaymentMethod = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_5.getException()!=null) {
										throw rowstate_tFileInputDelimited_5.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_5 = true;
        							
                							System.err.println(e.getMessage());
                							row5 = null;
                						
            							globalMap.put("tFileInputDelimited_5_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_5 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_5 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_5";

	

 


	tos_count_tFileInputDelimited_5++;

/**
 * [tFileInputDelimited_5 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_5";

	

 



/**
 * [tFileInputDelimited_5 process_data_begin ] stop
 */
// Start of branch "row5"
if(row5 != null) { 



	
	/**
	 * [tAdvancedHash_row5 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row5"
						
						);
					}
					


			   
			   

					row5Struct row5_HashRow = new row5Struct();
		   	   	   
				
				row5_HashRow.PaymentModeID = row5.PaymentModeID;
				
				row5_HashRow.PaymentMethod = row5.PaymentMethod;
				
			tHash_Lookup_row5.put(row5_HashRow);
			
            




 


	tos_count_tAdvancedHash_row5++;

/**
 * [tAdvancedHash_row5 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row5 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 process_data_end ] stop
 */

} // End of branch "row5"




	
	/**
	 * [tFileInputDelimited_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_5";

	

 



/**
 * [tFileInputDelimited_5 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_5 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_5";

	


				nb_line_tFileInputDelimited_5++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_5 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_5!=null){
    					csvReadertFileInputDelimited_5.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_5!=null){
    				globalMap.put("tFileInputDelimited_5_NB_LINE",nb_line_tFileInputDelimited_5);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_5", true);
end_Hash.put("tFileInputDelimited_5", System.currentTimeMillis());




/**
 * [tFileInputDelimited_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row5 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

tHash_Lookup_row5.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row5");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row5", true);
end_Hash.put("tAdvancedHash_row5", System.currentTimeMillis());




/**
 * [tAdvancedHash_row5 end ] stop
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
	 * [tFileInputDelimited_5 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_5";

	

 



/**
 * [tFileInputDelimited_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row5 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row5";

	

 



/**
 * [tAdvancedHash_row5 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_5_SUBPROCESS_STATE", 1);
	}
	


public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CustomerID;

				public String getCustomerID () {
					return this.CustomerID;
				}
				
			    public Integer LocationID;

				public Integer getLocationID () {
					return this.LocationID;
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
				
			    public Integer NumberOfReferrals;

				public Integer getNumberOfReferrals () {
					return this.NumberOfReferrals;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CustomerID == null) ? 0 : this.CustomerID.hashCode());
					
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
		final row7Struct other = (row7Struct) obj;
		
						if (this.CustomerID == null) {
							if (other.CustomerID != null)
								return false;
						
						} else if (!this.CustomerID.equals(other.CustomerID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row7Struct other) {

		other.CustomerID = this.CustomerID;
	            other.LocationID = this.LocationID;
	            other.Gender = this.Gender;
	            other.Age = this.Age;
	            other.Married = this.Married;
	            other.NumberOfDependents = this.NumberOfDependents;
	            other.NumberOfReferrals = this.NumberOfReferrals;
	            
	}

	public void copyKeysDataTo(row7Struct other) {

		other.CustomerID = this.CustomerID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.CustomerID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CustomerID,dos);
					
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
		
						this.LocationID = readInteger(dis,ois);
					
						this.Gender = readString(dis,ois);
					
						this.Age = readInteger(dis,ois);
					
						this.Married = readString(dis,ois);
					
						this.NumberOfDependents = readInteger(dis,ois);
					
						this.NumberOfReferrals = readInteger(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.LocationID = readInteger(dis,objectIn);
					
						this.Gender = readString(dis,objectIn);
					
						this.Age = readInteger(dis,objectIn);
					
						this.Married = readString(dis,objectIn);
					
						this.NumberOfDependents = readInteger(dis,objectIn);
					
						this.NumberOfReferrals = readInteger(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.LocationID, dos, oos);
					
						writeString(this.Gender, dos, oos);
					
					writeInteger(this.Age, dos, oos);
					
						writeString(this.Married, dos, oos);
					
					writeInteger(this.NumberOfDependents, dos, oos);
					
					writeInteger(this.NumberOfReferrals, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.LocationID, dos, objectOut);
					
						writeString(this.Gender, dos, objectOut);
					
					writeInteger(this.Age, dos, objectOut);
					
						writeString(this.Married, dos, objectOut);
					
					writeInteger(this.NumberOfDependents, dos, objectOut);
					
					writeInteger(this.NumberOfReferrals, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CustomerID="+CustomerID);
		sb.append(",LocationID="+String.valueOf(LocationID));
		sb.append(",Gender="+Gender);
		sb.append(",Age="+String.valueOf(Age));
		sb.append(",Married="+Married);
		sb.append(",NumberOfDependents="+String.valueOf(NumberOfDependents));
		sb.append(",NumberOfReferrals="+String.valueOf(NumberOfReferrals));
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CustomerID, other.CustomerID);
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
public void tFileInputDelimited_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_7_SUBPROCESS_STATE", 0);

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



		row7Struct row7 = new row7Struct();




	
	/**
	 * [tAdvancedHash_row7 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row7", false);
		start_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row7");
					}
				
		int tos_count_tAdvancedHash_row7 = 0;
		

			   		// connection name:row7
			   		// source node:tFileInputDelimited_7 - inputs:(after_tFileInputDelimited_1) outputs:(row7,row7) | target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
			   		// linked node: tMap_1 - inputs:(out1,row7,row6) outputs:(customers)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row7Struct>getLookup(matchingModeEnum_row7);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row7 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_7", false);
		start_Hash.put("tFileInputDelimited_7", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_7";

	
		int tos_count_tFileInputDelimited_7 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_7 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_7 = 0;
				int footer_tFileInputDelimited_7 = 0;
				int totalLinetFileInputDelimited_7 = 0;
				int limittFileInputDelimited_7 = -1;
				int lastLinetFileInputDelimited_7 = -1;	
				
				char fieldSeparator_tFileInputDelimited_7[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_7 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_7[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_7 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_7 = /** Start field tFileInputDelimited_7:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_CUSTOMER.csv"/** End field tFileInputDelimited_7:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_7 = null;
	
				try{
					
						String[] rowtFileInputDelimited_7=null;
						int currentLinetFileInputDelimited_7 = 0;
	        			int outputLinetFileInputDelimited_7 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_7 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_7 = 0;
			if(footer_value_tFileInputDelimited_7 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_7=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_7, fieldSeparator_tFileInputDelimited_7[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_7=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_7),fieldSeparator_tFileInputDelimited_7[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_7.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_7[0] != '\n') && (rowSeparator_tFileInputDelimited_7[0] != '\r') )
	        			csvReadertFileInputDelimited_7.setLineEnd(""+rowSeparator_tFileInputDelimited_7[0]);
						
	        				csvReadertFileInputDelimited_7.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_7.setEscapeChar(csvReadertFileInputDelimited_7.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_7 > 0){
						for(totalLinetFileInputDelimited_7=0;totalLinetFileInputDelimited_7 < 1; totalLinetFileInputDelimited_7++){
							csvReadertFileInputDelimited_7.readNext();
						}
						csvReadertFileInputDelimited_7.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_7.readNext()) {
							
								rowtFileInputDelimited_7=csvReadertFileInputDelimited_7.getValues();
								if(!(rowtFileInputDelimited_7.length == 1 && ("\015").equals(rowtFileInputDelimited_7[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_7++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_7 = totalLinetFileInputDelimited_7 - footer_tFileInputDelimited_7   < 0? 0 : totalLinetFileInputDelimited_7 - footer_tFileInputDelimited_7 ;
	            		if(lastLinetFileInputDelimited_7 > 0){
	                		lastLinetFileInputDelimited_7 = lastLinetFileInputDelimited_7 < lastLineTemptFileInputDelimited_7 ? lastLinetFileInputDelimited_7 : lastLineTemptFileInputDelimited_7; 
	            		}else {
	                		lastLinetFileInputDelimited_7 = lastLineTemptFileInputDelimited_7;
	            		}
	         
			          	csvReadertFileInputDelimited_7.close();
				        if(filename_tFileInputDelimited_7 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_7=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_7, fieldSeparator_tFileInputDelimited_7[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_7=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_7),fieldSeparator_tFileInputDelimited_7[0], context.encodage);
						}
						csvReadertFileInputDelimited_7.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_7[0] != '\n') && (rowSeparator_tFileInputDelimited_7[0] != '\r') )	
	        				csvReadertFileInputDelimited_7.setLineEnd(""+rowSeparator_tFileInputDelimited_7[0]);
						
							csvReadertFileInputDelimited_7.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_7.setEscapeChar(csvReadertFileInputDelimited_7.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_7 != 0){
			        	for(currentLinetFileInputDelimited_7=0;currentLinetFileInputDelimited_7 < 1;currentLinetFileInputDelimited_7++){
			        		csvReadertFileInputDelimited_7.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_7.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_7 != 0 && csvReadertFileInputDelimited_7!=null && csvReadertFileInputDelimited_7.readNext() ) { 
	        		rowstate_tFileInputDelimited_7.reset();
	        
		        	rowtFileInputDelimited_7=csvReadertFileInputDelimited_7.getValues();
		        	
					
	        			if(rowtFileInputDelimited_7.length == 1 && ("\015").equals(rowtFileInputDelimited_7[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_7++;
	            
		            if(lastLinetFileInputDelimited_7 > -1 && currentLinetFileInputDelimited_7 > lastLinetFileInputDelimited_7) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_7++;
	            	if (limittFileInputDelimited_7 > 0 && outputLinetFileInputDelimited_7 > limittFileInputDelimited_7) {
	                	break;
	            	}  
	                                                                      
					
	    							row7 = null;			
								
	    							row7 = null;			
								
								boolean whetherReject_tFileInputDelimited_7 = false;
								row7 = new row7Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_7_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_7_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_7.length == 1 && ("\015").equals(rowtFileInputDelimited_7[0])){//empty line when row separator is '\n'
					
							row7.CustomerID = null;
					
							row7.LocationID = null;
					
							row7.Gender = null;
					
							row7.Age = null;
					
							row7.Married = null;
					
							row7.NumberOfDependents = null;
					
							row7.NumberOfReferrals = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_7 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_7 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
									row7.CustomerID = rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7];
									
							
						
						}else{
						
							
								row7.CustomerID = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_7 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
								
									if(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7].length() > 0) {
										try {
									
										row7.LocationID = ParserUtils.parseTo_Integer(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_7) {
globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE",ex_tFileInputDelimited_7.getMessage());
											rowstate_tFileInputDelimited_7.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"LocationID", "row7", rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7], ex_tFileInputDelimited_7), ex_tFileInputDelimited_7));
										}
    								}else{
    									
											
												row7.LocationID = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row7.LocationID = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_7 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
									row7.Gender = rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7];
									
							
						
						}else{
						
							
								row7.Gender = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_7 = 3;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
								
									if(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7].length() > 0) {
										try {
									
										row7.Age = ParserUtils.parseTo_Integer(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_7) {
globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE",ex_tFileInputDelimited_7.getMessage());
											rowstate_tFileInputDelimited_7.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"Age", "row7", rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7], ex_tFileInputDelimited_7), ex_tFileInputDelimited_7));
										}
    								}else{
    									
											
												row7.Age = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row7.Age = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_7 = 4;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
									row7.Married = rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7];
									
							
						
						}else{
						
							
								row7.Married = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_7 = 5;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
								
									if(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7].length() > 0) {
										try {
									
										row7.NumberOfDependents = ParserUtils.parseTo_Integer(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_7) {
globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE",ex_tFileInputDelimited_7.getMessage());
											rowstate_tFileInputDelimited_7.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"NumberOfDependents", "row7", rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7], ex_tFileInputDelimited_7), ex_tFileInputDelimited_7));
										}
    								}else{
    									
											
												row7.NumberOfDependents = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row7.NumberOfDependents = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_7 = 6;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_7 < rowtFileInputDelimited_7.length){
						
						
							
								
									if(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7].length() > 0) {
										try {
									
										row7.NumberOfReferrals = ParserUtils.parseTo_Integer(rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_7) {
globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE",ex_tFileInputDelimited_7.getMessage());
											rowstate_tFileInputDelimited_7.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"NumberOfReferrals", "row7", rowtFileInputDelimited_7[columnIndexWithD_tFileInputDelimited_7], ex_tFileInputDelimited_7), ex_tFileInputDelimited_7));
										}
    								}else{
    									
											
												row7.NumberOfReferrals = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row7.NumberOfReferrals = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_7.getException()!=null) {
										throw rowstate_tFileInputDelimited_7.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_7 = true;
        							
                							System.err.println(e.getMessage());
                							row7 = null;
                						
            							globalMap.put("tFileInputDelimited_7_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_7 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_7 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_7";

	

 


	tos_count_tFileInputDelimited_7++;

/**
 * [tFileInputDelimited_7 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_7";

	

 



/**
 * [tFileInputDelimited_7 process_data_begin ] stop
 */
// Start of branch "row7"
if(row7 != null) { 



	
	/**
	 * [tAdvancedHash_row7 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row7"
						
						);
					}
					


			   
			   

					row7Struct row7_HashRow = new row7Struct();
		   	   	   
				
				row7_HashRow.CustomerID = row7.CustomerID;
				
				row7_HashRow.LocationID = row7.LocationID;
				
				row7_HashRow.Gender = row7.Gender;
				
				row7_HashRow.Age = row7.Age;
				
				row7_HashRow.Married = row7.Married;
				
				row7_HashRow.NumberOfDependents = row7.NumberOfDependents;
				
				row7_HashRow.NumberOfReferrals = row7.NumberOfReferrals;
				
			tHash_Lookup_row7.put(row7_HashRow);
			
            




 


	tos_count_tAdvancedHash_row7++;

/**
 * [tAdvancedHash_row7 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row7 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 process_data_end ] stop
 */

} // End of branch "row7"




	
	/**
	 * [tFileInputDelimited_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_7";

	

 



/**
 * [tFileInputDelimited_7 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_7 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_7";

	


				nb_line_tFileInputDelimited_7++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_7 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_7!=null){
    					csvReadertFileInputDelimited_7.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_7!=null){
    				globalMap.put("tFileInputDelimited_7_NB_LINE",nb_line_tFileInputDelimited_7);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_7", true);
end_Hash.put("tFileInputDelimited_7", System.currentTimeMillis());




/**
 * [tFileInputDelimited_7 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row7 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

tHash_Lookup_row7.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row7");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row7", true);
end_Hash.put("tAdvancedHash_row7", System.currentTimeMillis());




/**
 * [tAdvancedHash_row7 end ] stop
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
	 * [tFileInputDelimited_7 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_7";

	

 



/**
 * [tFileInputDelimited_7 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row7 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row7";

	

 



/**
 * [tAdvancedHash_row7 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_7_SUBPROCESS_STATE", 1);
	}
	


public static class row6Struct implements routines.system.IPersistableComparableLookupRow<row6Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jExtractFactTable = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public Integer ServiceID;

				public Integer getServiceID () {
					return this.ServiceID;
				}
				
			    public String ServiceHash;

				public String getServiceHash () {
					return this.ServiceHash;
				}
				
			    public String PhoneService;

				public String getPhoneService () {
					return this.PhoneService;
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
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ServiceHash == null) ? 0 : this.ServiceHash.hashCode());
					
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
		final row6Struct other = (row6Struct) obj;
		
						if (this.ServiceHash == null) {
							if (other.ServiceHash != null)
								return false;
						
						} else if (!this.ServiceHash.equals(other.ServiceHash))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row6Struct other) {

		other.ServiceID = this.ServiceID;
	            other.ServiceHash = this.ServiceHash;
	            other.PhoneService = this.PhoneService;
	            other.MultipleLines = this.MultipleLines;
	            other.InternetService = this.InternetService;
	            other.InternetType = this.InternetType;
	            other.OnlineSecurity = this.OnlineSecurity;
	            other.OnlineBackup = this.OnlineBackup;
	            other.DeviceProtectionPlan = this.DeviceProtectionPlan;
	            other.PremiumTechSupport = this.PremiumTechSupport;
	            other.StreamingTV = this.StreamingTV;
	            other.StreamingMovies = this.StreamingMovies;
	            other.StreamingMusic = this.StreamingMusic;
	            other.UnlimitedData = this.UnlimitedData;
	            
	}

	public void copyKeysDataTo(row6Struct other) {

		other.ServiceHash = this.ServiceHash;
	            	
	}



	private Integer readInteger(DataInputStream dis, ObjectInputStream ois) throws IOException{
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
	
	private Integer readInteger(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		Integer intReturn;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
			intReturn = unmarshaller.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, DataOutputStream dos,org.jboss.marshalling.Marshaller marshaller ) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jExtractFactTable.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jExtractFactTable.length == 0) {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jExtractFactTable = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jExtractFactTable, 0, length, utf8Charset);
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
	
	private String readString(DataInputStream dis, ObjectInputStream ois) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			dis.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			byte[] byteArray = new byte[length];
			unmarshaller.read(byteArray);
			strReturn = new String(byteArray, utf8Charset);
		}
		return strReturn;
	}
	
	private void writeString(String str, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
	}

	private void writeString(String str, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.ServiceHash = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jExtractFactTable) {

        	try {

        		int length = 0;
		
					this.ServiceHash = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ServiceHash,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.ServiceHash,dos);
					
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
		
						this.ServiceID = readInteger(dis,ois);
					
						this.PhoneService = readString(dis,ois);
					
						this.MultipleLines = readString(dis,ois);
					
						this.InternetService = readString(dis,ois);
					
						this.InternetType = readString(dis,ois);
					
						this.OnlineSecurity = readString(dis,ois);
					
						this.OnlineBackup = readString(dis,ois);
					
						this.DeviceProtectionPlan = readString(dis,ois);
					
						this.PremiumTechSupport = readString(dis,ois);
					
						this.StreamingTV = readString(dis,ois);
					
						this.StreamingMovies = readString(dis,ois);
					
						this.StreamingMusic = readString(dis,ois);
					
						this.UnlimitedData = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.ServiceID = readInteger(dis,objectIn);
					
						this.PhoneService = readString(dis,objectIn);
					
						this.MultipleLines = readString(dis,objectIn);
					
						this.InternetService = readString(dis,objectIn);
					
						this.InternetType = readString(dis,objectIn);
					
						this.OnlineSecurity = readString(dis,objectIn);
					
						this.OnlineBackup = readString(dis,objectIn);
					
						this.DeviceProtectionPlan = readString(dis,objectIn);
					
						this.PremiumTechSupport = readString(dis,objectIn);
					
						this.StreamingTV = readString(dis,objectIn);
					
						this.StreamingMovies = readString(dis,objectIn);
					
						this.StreamingMusic = readString(dis,objectIn);
					
						this.UnlimitedData = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
					writeInteger(this.ServiceID, dos, oos);
					
						writeString(this.PhoneService, dos, oos);
					
						writeString(this.MultipleLines, dos, oos);
					
						writeString(this.InternetService, dos, oos);
					
						writeString(this.InternetType, dos, oos);
					
						writeString(this.OnlineSecurity, dos, oos);
					
						writeString(this.OnlineBackup, dos, oos);
					
						writeString(this.DeviceProtectionPlan, dos, oos);
					
						writeString(this.PremiumTechSupport, dos, oos);
					
						writeString(this.StreamingTV, dos, oos);
					
						writeString(this.StreamingMovies, dos, oos);
					
						writeString(this.StreamingMusic, dos, oos);
					
						writeString(this.UnlimitedData, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					writeInteger(this.ServiceID, dos, objectOut);
					
						writeString(this.PhoneService, dos, objectOut);
					
						writeString(this.MultipleLines, dos, objectOut);
					
						writeString(this.InternetService, dos, objectOut);
					
						writeString(this.InternetType, dos, objectOut);
					
						writeString(this.OnlineSecurity, dos, objectOut);
					
						writeString(this.OnlineBackup, dos, objectOut);
					
						writeString(this.DeviceProtectionPlan, dos, objectOut);
					
						writeString(this.PremiumTechSupport, dos, objectOut);
					
						writeString(this.StreamingTV, dos, objectOut);
					
						writeString(this.StreamingMovies, dos, objectOut);
					
						writeString(this.StreamingMusic, dos, objectOut);
					
						writeString(this.UnlimitedData, dos, objectOut);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}
    }


    
    public boolean supportMarshaller(){
        return true;
    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ServiceID="+String.valueOf(ServiceID));
		sb.append(",ServiceHash="+ServiceHash);
		sb.append(",PhoneService="+PhoneService);
		sb.append(",MultipleLines="+MultipleLines);
		sb.append(",InternetService="+InternetService);
		sb.append(",InternetType="+InternetType);
		sb.append(",OnlineSecurity="+OnlineSecurity);
		sb.append(",OnlineBackup="+OnlineBackup);
		sb.append(",DeviceProtectionPlan="+DeviceProtectionPlan);
		sb.append(",PremiumTechSupport="+PremiumTechSupport);
		sb.append(",StreamingTV="+StreamingTV);
		sb.append(",StreamingMovies="+StreamingMovies);
		sb.append(",StreamingMusic="+StreamingMusic);
		sb.append(",UnlimitedData="+UnlimitedData);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ServiceHash, other.ServiceHash);
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
public void tFileInputDelimited_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_6_SUBPROCESS_STATE", 0);

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



		row6Struct row6 = new row6Struct();




	
	/**
	 * [tAdvancedHash_row6 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row6", false);
		start_Hash.put("tAdvancedHash_row6", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row6");
					}
				
		int tos_count_tAdvancedHash_row6 = 0;
		

			   		// connection name:row6
			   		// source node:tFileInputDelimited_6 - inputs:(after_tFileInputDelimited_1) outputs:(row6,row6) | target node:tAdvancedHash_row6 - inputs:(row6) outputs:()
			   		// linked node: tMap_1 - inputs:(out1,row7,row6) outputs:(customers)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row6 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row6Struct>getLookup(matchingModeEnum_row6);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row6", tHash_Lookup_row6);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row6 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_6", false);
		start_Hash.put("tFileInputDelimited_6", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_6";

	
		int tos_count_tFileInputDelimited_6 = 0;
		
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_6 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_6 = 0;
				int footer_tFileInputDelimited_6 = 0;
				int totalLinetFileInputDelimited_6 = 0;
				int limittFileInputDelimited_6 = -1;
				int lastLinetFileInputDelimited_6 = -1;	
				
				char fieldSeparator_tFileInputDelimited_6[] = null;
				
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_6 = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
			
				char rowSeparator_tFileInputDelimited_6[] = null;
			
				//support passing value (property: Row Separator) by 'context.rs' or 'globalMap.get("rs")'. 
				if ( ((String)"\n").length() > 0 ){
					rowSeparator_tFileInputDelimited_6 = ((String)"\n").toCharArray();
				}else {
					throw new IllegalArgumentException("Row Separator must be assigned a char."); 
				}
			
				Object filename_tFileInputDelimited_6 = /** Start field tFileInputDelimited_6:FILENAME */context.dataFolder + TalendDate.getDate("YYYYMMDD") + "/" + "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_SERVICE.csv"/** End field tFileInputDelimited_6:FILENAME */;		
				com.talend.csv.CSVReader csvReadertFileInputDelimited_6 = null;
	
				try{
					
						String[] rowtFileInputDelimited_6=null;
						int currentLinetFileInputDelimited_6 = 0;
	        			int outputLinetFileInputDelimited_6 = 0;
						try {//TD110 begin
							if(filename_tFileInputDelimited_6 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_6 = 0;
			if(footer_value_tFileInputDelimited_6 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer shouldn't be bigger than 0.");
			}
		
								csvReadertFileInputDelimited_6=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_6, fieldSeparator_tFileInputDelimited_6[0], context.encodage);
							}else{
								csvReadertFileInputDelimited_6=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_6),fieldSeparator_tFileInputDelimited_6[0], context.encodage);
		        			}
					
					
					csvReadertFileInputDelimited_6.setTrimWhitespace(false);
					if ( (rowSeparator_tFileInputDelimited_6[0] != '\n') && (rowSeparator_tFileInputDelimited_6[0] != '\r') )
	        			csvReadertFileInputDelimited_6.setLineEnd(""+rowSeparator_tFileInputDelimited_6[0]);
						
	        				csvReadertFileInputDelimited_6.setQuoteChar('"');
						
	            				csvReadertFileInputDelimited_6.setEscapeChar(csvReadertFileInputDelimited_6.getQuoteChar());
							      
		
			
						if(footer_tFileInputDelimited_6 > 0){
						for(totalLinetFileInputDelimited_6=0;totalLinetFileInputDelimited_6 < 1; totalLinetFileInputDelimited_6++){
							csvReadertFileInputDelimited_6.readNext();
						}
						csvReadertFileInputDelimited_6.setSkipEmptyRecords(true);
			            while (csvReadertFileInputDelimited_6.readNext()) {
							
								rowtFileInputDelimited_6=csvReadertFileInputDelimited_6.getValues();
								if(!(rowtFileInputDelimited_6.length == 1 && ("\015").equals(rowtFileInputDelimited_6[0]))){//empty line when row separator is '\n'
							
	                
	                		totalLinetFileInputDelimited_6++;
	                
							
								}
							
	                
			            }
	            		int lastLineTemptFileInputDelimited_6 = totalLinetFileInputDelimited_6 - footer_tFileInputDelimited_6   < 0? 0 : totalLinetFileInputDelimited_6 - footer_tFileInputDelimited_6 ;
	            		if(lastLinetFileInputDelimited_6 > 0){
	                		lastLinetFileInputDelimited_6 = lastLinetFileInputDelimited_6 < lastLineTemptFileInputDelimited_6 ? lastLinetFileInputDelimited_6 : lastLineTemptFileInputDelimited_6; 
	            		}else {
	                		lastLinetFileInputDelimited_6 = lastLineTemptFileInputDelimited_6;
	            		}
	         
			          	csvReadertFileInputDelimited_6.close();
				        if(filename_tFileInputDelimited_6 instanceof java.io.InputStream){
				 			csvReadertFileInputDelimited_6=new com.talend.csv.CSVReader((java.io.InputStream)filename_tFileInputDelimited_6, fieldSeparator_tFileInputDelimited_6[0], context.encodage);
		        		}else{
							csvReadertFileInputDelimited_6=new com.talend.csv.CSVReader(String.valueOf(filename_tFileInputDelimited_6),fieldSeparator_tFileInputDelimited_6[0], context.encodage);
						}
						csvReadertFileInputDelimited_6.setTrimWhitespace(false);
						if ( (rowSeparator_tFileInputDelimited_6[0] != '\n') && (rowSeparator_tFileInputDelimited_6[0] != '\r') )	
	        				csvReadertFileInputDelimited_6.setLineEnd(""+rowSeparator_tFileInputDelimited_6[0]);
						
							csvReadertFileInputDelimited_6.setQuoteChar('"');
						
	        				csvReadertFileInputDelimited_6.setEscapeChar(csvReadertFileInputDelimited_6.getQuoteChar());
							  
	        		}
	        
			        if(limittFileInputDelimited_6 != 0){
			        	for(currentLinetFileInputDelimited_6=0;currentLinetFileInputDelimited_6 < 1;currentLinetFileInputDelimited_6++){
			        		csvReadertFileInputDelimited_6.readNext();
			        	}
			        }
			        csvReadertFileInputDelimited_6.setSkipEmptyRecords(true);
	        
	    		} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",e.getMessage());
					
						
						System.err.println(e.getMessage());
					
	    		}//TD110 end
	        
			    
	        	while ( limittFileInputDelimited_6 != 0 && csvReadertFileInputDelimited_6!=null && csvReadertFileInputDelimited_6.readNext() ) { 
	        		rowstate_tFileInputDelimited_6.reset();
	        
		        	rowtFileInputDelimited_6=csvReadertFileInputDelimited_6.getValues();
		        	
					
	        			if(rowtFileInputDelimited_6.length == 1 && ("\015").equals(rowtFileInputDelimited_6[0])){//empty line when row separator is '\n'
	        				continue;
	        			}
					
	        	
	        	
	        		currentLinetFileInputDelimited_6++;
	            
		            if(lastLinetFileInputDelimited_6 > -1 && currentLinetFileInputDelimited_6 > lastLinetFileInputDelimited_6) {
		                break;
	    	        }
	        	    outputLinetFileInputDelimited_6++;
	            	if (limittFileInputDelimited_6 > 0 && outputLinetFileInputDelimited_6 > limittFileInputDelimited_6) {
	                	break;
	            	}  
	                                                                      
					
	    							row6 = null;			
								
	    							row6 = null;			
								
								boolean whetherReject_tFileInputDelimited_6 = false;
								row6 = new row6Struct();
								try {			
									
				char fieldSeparator_tFileInputDelimited_6_ListType[] = null;
				//support passing value (property: Field Separator) by 'context.fs' or 'globalMap.get("fs")'. 
				if ( ((String)context.fileSeparator).length() > 0 ){
					fieldSeparator_tFileInputDelimited_6_ListType = ((String)context.fileSeparator).toCharArray();
				}else {			
					throw new IllegalArgumentException("Field Separator must be assigned a char."); 
				}
				if(rowtFileInputDelimited_6.length == 1 && ("\015").equals(rowtFileInputDelimited_6[0])){//empty line when row separator is '\n'
					
							row6.ServiceID = null;
					
							row6.ServiceHash = null;
					
							row6.PhoneService = null;
					
							row6.MultipleLines = null;
					
							row6.InternetService = null;
					
							row6.InternetType = null;
					
							row6.OnlineSecurity = null;
					
							row6.OnlineBackup = null;
					
							row6.DeviceProtectionPlan = null;
					
							row6.PremiumTechSupport = null;
					
							row6.StreamingTV = null;
					
							row6.StreamingMovies = null;
					
							row6.StreamingMusic = null;
					
							row6.UnlimitedData = null;
					
				}else{
					
	                int columnIndexWithD_tFileInputDelimited_6 = 0; //Column Index 
	                
						columnIndexWithD_tFileInputDelimited_6 = 0;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
								
									if(rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6].length() > 0) {
										try {
									
										row6.ServiceID = ParserUtils.parseTo_Integer(rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6]);
									
									
										} catch(java.lang.Exception ex_tFileInputDelimited_6) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",ex_tFileInputDelimited_6.getMessage());
											rowstate_tFileInputDelimited_6.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
												"ServiceID", "row6", rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6], ex_tFileInputDelimited_6), ex_tFileInputDelimited_6));
										}
    								}else{
    									
											
												row6.ServiceID = null;
											
    									
    								}
									
									
							
						
						}else{
						
							
								row6.ServiceID = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 1;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.ServiceHash = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.ServiceHash = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 2;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.PhoneService = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.PhoneService = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 3;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.MultipleLines = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.MultipleLines = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 4;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.InternetService = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.InternetService = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 5;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.InternetType = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.InternetType = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 6;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.OnlineSecurity = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.OnlineSecurity = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 7;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.OnlineBackup = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.OnlineBackup = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 8;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.DeviceProtectionPlan = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.DeviceProtectionPlan = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 9;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.PremiumTechSupport = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.PremiumTechSupport = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 10;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.StreamingTV = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.StreamingTV = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 11;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.StreamingMovies = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.StreamingMovies = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 12;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.StreamingMusic = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.StreamingMusic = null;
							
						
						}
						
						
					
						columnIndexWithD_tFileInputDelimited_6 = 13;
						
						
						
						if(columnIndexWithD_tFileInputDelimited_6 < rowtFileInputDelimited_6.length){
						
						
							
									row6.UnlimitedData = rowtFileInputDelimited_6[columnIndexWithD_tFileInputDelimited_6];
									
							
						
						}else{
						
							
								row6.UnlimitedData = null;
							
						
						}
						
						
					
				}
				
									
									if(rowstate_tFileInputDelimited_6.getException()!=null) {
										throw rowstate_tFileInputDelimited_6.getException();
									}
									
									
	    						} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE",e.getMessage());
							        whetherReject_tFileInputDelimited_6 = true;
        							
                							System.err.println(e.getMessage());
                							row6 = null;
                						
            							globalMap.put("tFileInputDelimited_6_ERROR_MESSAGE", e.getMessage());
            							
	    						}
	
							

 



/**
 * [tFileInputDelimited_6 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_6 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";

	

 


	tos_count_tFileInputDelimited_6++;

/**
 * [tFileInputDelimited_6 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";

	

 



/**
 * [tFileInputDelimited_6 process_data_begin ] stop
 */
// Start of branch "row6"
if(row6 != null) { 



	
	/**
	 * [tAdvancedHash_row6 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row6"
						
						);
					}
					


			   
			   

					row6Struct row6_HashRow = new row6Struct();
		   	   	   
				
				row6_HashRow.ServiceID = row6.ServiceID;
				
				row6_HashRow.ServiceHash = row6.ServiceHash;
				
				row6_HashRow.PhoneService = row6.PhoneService;
				
				row6_HashRow.MultipleLines = row6.MultipleLines;
				
				row6_HashRow.InternetService = row6.InternetService;
				
				row6_HashRow.InternetType = row6.InternetType;
				
				row6_HashRow.OnlineSecurity = row6.OnlineSecurity;
				
				row6_HashRow.OnlineBackup = row6.OnlineBackup;
				
				row6_HashRow.DeviceProtectionPlan = row6.DeviceProtectionPlan;
				
				row6_HashRow.PremiumTechSupport = row6.PremiumTechSupport;
				
				row6_HashRow.StreamingTV = row6.StreamingTV;
				
				row6_HashRow.StreamingMovies = row6.StreamingMovies;
				
				row6_HashRow.StreamingMusic = row6.StreamingMusic;
				
				row6_HashRow.UnlimitedData = row6.UnlimitedData;
				
			tHash_Lookup_row6.put(row6_HashRow);
			
            




 


	tos_count_tAdvancedHash_row6++;

/**
 * [tAdvancedHash_row6 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row6 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 process_data_end ] stop
 */

} // End of branch "row6"




	
	/**
	 * [tFileInputDelimited_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";

	

 



/**
 * [tFileInputDelimited_6 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_6 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";

	


				nb_line_tFileInputDelimited_6++;
			}
			
			}finally{
    			if(!(filename_tFileInputDelimited_6 instanceof java.io.InputStream)){
    				if(csvReadertFileInputDelimited_6!=null){
    					csvReadertFileInputDelimited_6.close();
    				}
    			}
    			if(csvReadertFileInputDelimited_6!=null){
    				globalMap.put("tFileInputDelimited_6_NB_LINE",nb_line_tFileInputDelimited_6);
    			}
				
			}
						  

 

ok_Hash.put("tFileInputDelimited_6", true);
end_Hash.put("tFileInputDelimited_6", System.currentTimeMillis());




/**
 * [tFileInputDelimited_6 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row6 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

tHash_Lookup_row6.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row6");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row6", true);
end_Hash.put("tAdvancedHash_row6", System.currentTimeMillis());




/**
 * [tAdvancedHash_row6 end ] stop
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
	 * [tFileInputDelimited_6 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_6";

	

 



/**
 * [tFileInputDelimited_6 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row6 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row6";

	

 



/**
 * [tAdvancedHash_row6 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_6_SUBPROCESS_STATE", 1);
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
        final jExtractFactTable jExtractFactTableClass = new jExtractFactTable();

        int exitCode = jExtractFactTableClass.runJobInTOS(args);

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
            java.io.InputStream inContext = jExtractFactTable.class.getClassLoader().getResourceAsStream("churn_project/jextractfacttable_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jExtractFactTable.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jExtractFactTable");
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
 *     407197 characters generated by Talend Open Studio for Data Integration 
 *     on the 31 décembre 2025 à 11:36:18 EET
 ************************************************************************************************/