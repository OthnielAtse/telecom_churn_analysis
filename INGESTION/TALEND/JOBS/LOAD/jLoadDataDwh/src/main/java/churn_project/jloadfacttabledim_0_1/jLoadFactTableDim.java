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


package churn_project.jloadfacttabledim_0_1;

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
 




	//the import part of tJava_1
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: jLoadFactTableDim Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 8.0.1.20211109_1610
 * @status 
 */
public class jLoadFactTableDim implements TalendJob {

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
	private final String jobName = "jLoadFactTableDim";
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
				jLoadFactTableDim.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(jLoadFactTableDim.this, new Object[] { e , currentComponent, globalMap});
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

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStart_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStart_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tSetGlobalVar_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tSetGlobalVar_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tChronometerStop_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tChronometerStop_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
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
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBInput_7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
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
			
			public void tAdvancedHash_row6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row7_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_row8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStart_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tSetGlobalVar_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tChronometerStop_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

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
	





public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

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
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tChronometerStart_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
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
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStart_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 0);

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
	 * [tChronometerStart_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStart_1", false);
		start_Hash.put("tChronometerStart_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStart_1";

	
		int tos_count_tChronometerStart_1 = 0;
		

	
	
	Long currentTimetChronometerStart_1 = System.currentTimeMillis();
	
	globalMap.put("tChronometerStart_1",currentTimetChronometerStart_1);
	globalMap.put("tChronometerStart_1_STARTTIME", currentTimetChronometerStart_1);
 



/**
 * [tChronometerStart_1 begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 


	tos_count_tChronometerStart_1++;

/**
 * [tChronometerStart_1 main ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStart_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStart_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 

ok_Hash.put("tChronometerStart_1", true);
end_Hash.put("tChronometerStart_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBConnection_1Process(globalMap);



/**
 * [tChronometerStart_1 end ] stop
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
	 * [tChronometerStart_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStart_1";

	

 



/**
 * [tChronometerStart_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStart_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

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
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		


	
            String dbProperties_tDBConnection_1 = context.additionalParam;
            String url_tDBConnection_1 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database;
            
            if(dbProperties_tDBConnection_1 != null && !"".equals(dbProperties_tDBConnection_1.trim())) {
                url_tDBConnection_1 = url_tDBConnection_1 + "?" + dbProperties_tDBConnection_1;
            }
	String dbUser_tDBConnection_1 = context.user;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.password; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
        java.util.Enumeration<java.sql.Driver> drivers_tDBConnection_1 =  java.sql.DriverManager.getDrivers();
        java.util.Set<String> redShiftDriverNames_tDBConnection_1 = new java.util.HashSet<String>(java.util.Arrays
                .asList("com.amazon.redshift.jdbc.Driver","com.amazon.redshift.jdbc41.Driver","com.amazon.redshift.jdbc42.Driver"));
    while (drivers_tDBConnection_1.hasMoreElements()) {
        java.sql.Driver d_tDBConnection_1 = drivers_tDBConnection_1.nextElement();
        if (redShiftDriverNames_tDBConnection_1.contains(d_tDBConnection_1.getClass().getName())) {
            try {
                java.sql.DriverManager.deregisterDriver(d_tDBConnection_1);
                java.sql.DriverManager.registerDriver(d_tDBConnection_1);
            } catch (java.lang.Exception e_tDBConnection_1) {
globalMap.put("tDBConnection_1_ERROR_MESSAGE",e_tDBConnection_1.getMessage());
                    //do nothing
            }
        }
    }
	
			String sharedConnectionName_tDBConnection_1 = "CHURN_CUSTOMER_DWH";
			conn_tDBConnection_1 = SharedDBConnection.getDBConnection("org.postgresql.Driver",url_tDBConnection_1,dbUser_tDBConnection_1 , dbPwd_tDBConnection_1 , sharedConnectionName_tDBConnection_1);
			globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("schema_" + "tDBConnection_1",context.schemaDwh);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk3", 0, "ok");
				}
				tSetGlobalVar_1Process(globalMap);



/**
 * [tDBConnection_1 end ] stop
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
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tSetGlobalVar_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 0);

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
	 * [tSetGlobalVar_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tSetGlobalVar_1", false);
		start_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());
		
	
	currentComponent="tSetGlobalVar_1";

	
		int tos_count_tSetGlobalVar_1 = 0;
		

 



/**
 * [tSetGlobalVar_1 begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 main ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

globalMap.put("nomFichier", "CHURN_"+ TalendDate.getDate("YYYYMMDD") +"_FACT_TABLE.csv");
globalMap.put("nomFlux", "FACT_TABLE");
globalMap.put("cheminFichier", context.dataFolder+TalendDate.getDate("YYYYMMDD"));

 


	tos_count_tSetGlobalVar_1++;

/**
 * [tSetGlobalVar_1 main ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_begin ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 process_data_end ] stop
 */
	
	/**
	 * [tSetGlobalVar_1 end ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 

ok_Hash.put("tSetGlobalVar_1", true);
end_Hash.put("tSetGlobalVar_1", System.currentTimeMillis());




/**
 * [tSetGlobalVar_1 end ] stop
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
	 * [tSetGlobalVar_1 finally ] start
	 */

	

	
	
	currentComponent="tSetGlobalVar_1";

	

 



/**
 * [tSetGlobalVar_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tSetGlobalVar_1_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

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
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				tDBCommit_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
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
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 0);

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
	 * [tDBCommit_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_1", false);
		start_Hash.put("tDBCommit_1", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_1";

	
		int tos_count_tDBCommit_1 = 0;
		

 



/**
 * [tDBCommit_1 begin ] stop
 */
	
	/**
	 * [tDBCommit_1 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

	java.sql.Connection conn_tDBCommit_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_1 != null && !conn_tDBCommit_1.isClosed())
	{
	
		try{
	
			
			conn_tDBCommit_1.commit();
			
	
		}finally{
			
			conn_tDBCommit_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    }
	
	}

 


	tos_count_tDBCommit_1++;

/**
 * [tDBCommit_1 main ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_1 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 

ok_Hash.put("tDBCommit_1", true);
end_Hash.put("tDBCommit_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tChronometerStop_1Process(globalMap);



/**
 * [tDBCommit_1 end ] stop
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
	 * [tDBCommit_1 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_1";

	

 



/**
 * [tDBCommit_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_1_SUBPROCESS_STATE", 1);
	}
	

public void tChronometerStop_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 0);

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
	 * [tChronometerStop_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tChronometerStop_1", false);
		start_Hash.put("tChronometerStop_1", System.currentTimeMillis());
		
	
	currentComponent="tChronometerStop_1";

	
		int tos_count_tChronometerStop_1 = 0;
		
	
	long timetChronometerStop_1;
	
		timetChronometerStop_1 = System.currentTimeMillis() - startTime;
		
	   		System.out.print("[ tChronometerStop_1 ]  ");
		
	  	System.out.println("" + "  " + timetChronometerStop_1 + " milliseconds");
	  	 
	
	Long currentTimetChronometerStop_1 = System.currentTimeMillis();
	globalMap.put("tChronometerStop_1", currentTimetChronometerStop_1);
	
	globalMap.put("tChronometerStop_1_STOPTIME", currentTimetChronometerStop_1);
	globalMap.put("tChronometerStop_1_DURATION", timetChronometerStop_1);
 



/**
 * [tChronometerStop_1 begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 main ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 


	tos_count_tChronometerStop_1++;

/**
 * [tChronometerStop_1 main ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_begin ] stop
 */
	
	/**
	 * [tChronometerStop_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 process_data_end ] stop
 */
	
	/**
	 * [tChronometerStop_1 end ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 

ok_Hash.put("tChronometerStop_1", true);
end_Hash.put("tChronometerStop_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk7", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tChronometerStop_1 end ] stop
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
	 * [tChronometerStop_1 finally ] start
	 */

	

	
	
	currentComponent="tChronometerStop_1";

	

 



/**
 * [tChronometerStop_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tChronometerStop_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

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
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		


System.out.println("-----------------------------------------------------------------------------");
System.out.println("JobName : " + jobName);
System.out.println("Nombre de lignes totale retournées : ");
System.out.println((Integer)globalMap.get("tDBOutput_1_NB_LINE"));

System.out.println("Nombre de lignes mise à jours : ");
System.out.println((Integer)globalMap.get("tDBOutput_7_NB_LINE_UPDATED"));

System.out.println("Nombre de insérées : ");
System.out.println((Integer)globalMap.get("tDBOutput_7_NB_LINE_INSERTED"));

System.out.println("Nombre de lignes supprimées : ");
System.out.println((Integer)globalMap.get("tDBOutput_7_NB_LINE_DELETED"));

System.out.println("Nombre de lignes rejetées : ");
System.out.println((Integer)globalMap.get("tDBOutput_7_NB_LINE_REJECTED"));


 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
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
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
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

	



java.io.File file_tFileExist_1 = new java.io.File(((String)globalMap.get("cheminFichier")) + "/"+((String)globalMap.get("nomFichier")));
if (!file_tFileExist_1.exists()) {
    globalMap.put("tFileExist_1_EXISTS",false);
}else{
	globalMap.put("tFileExist_1_EXISTS",true);
}

globalMap.put("tFileExist_1_FILENAME",((String)globalMap.get("cheminFichier")) + "/"+((String)globalMap.get("nomFichier")));


 


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

   			if (((Boolean)globalMap.get("tFileExist_1_EXISTS"))) {
   				
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
   			if (!((Boolean)globalMap.get("tFileExist_1_EXISTS"))) {
   				
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
	


public static class insertNewElementsStruct implements routines.system.IPersistableRow<insertNewElementsStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CUSTOMER_ID == null) ? 0 : this.CUSTOMER_ID.hashCode());
					
							result = prime * result + (int) this.OFFER_ID;
						
							result = prime * result + (int) this.CONTRACT_ID;
						
							result = prime * result + (int) this.PAYMENT_ID;
						
							result = prime * result + (int) this.SERVICE_ID;
						
							result = prime * result + (int) this.CHURN_ID;
						
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
		final insertNewElementsStruct other = (insertNewElementsStruct) obj;
		
						if (this.CUSTOMER_ID == null) {
							if (other.CUSTOMER_ID != null)
								return false;
						
						} else if (!this.CUSTOMER_ID.equals(other.CUSTOMER_ID))
						
							return false;
					
						if (this.OFFER_ID != other.OFFER_ID)
							return false;
					
						if (this.CONTRACT_ID != other.CONTRACT_ID)
							return false;
					
						if (this.PAYMENT_ID != other.PAYMENT_ID)
							return false;
					
						if (this.SERVICE_ID != other.SERVICE_ID)
							return false;
					
						if (this.CHURN_ID != other.CHURN_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(insertNewElementsStruct other) {

		other.CUSTOMER_ID = this.CUSTOMER_ID;
	            other.OFFER_ID = this.OFFER_ID;
	            other.CONTRACT_ID = this.CONTRACT_ID;
	            other.PAYMENT_ID = this.PAYMENT_ID;
	            other.SERVICE_ID = this.SERVICE_ID;
	            other.CHURN_ID = this.CHURN_ID;
	            other.AVG_MONTHLY_LONG_DISTANCE_CHARGES = this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
	            other.AVG_MONTHLY_GB_DOWNLOAD = this.AVG_MONTHLY_GB_DOWNLOAD;
	            other.MONTHLY_CHARGE = this.MONTHLY_CHARGE;
	            other.TOTAL_REVENUE = this.TOTAL_REVENUE;
	            other.TOTAL_CHARGES = this.TOTAL_CHARGES;
	            other.TOTAL_REFUNDS = this.TOTAL_REFUNDS;
	            other.TOTAL_EXTRA_DATA_CHARGES = this.TOTAL_EXTRA_DATA_CHARGES;
	            other.TOTAL_LONG_DISTANCE_CHARGES = this.TOTAL_LONG_DISTANCE_CHARGES;
	            other.TENURE_IN_MONTHS = this.TENURE_IN_MONTHS;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(insertNewElementsStruct other) {

		other.CUSTOMER_ID = this.CUSTOMER_ID;
	            	other.OFFER_ID = this.OFFER_ID;
	            	other.CONTRACT_ID = this.CONTRACT_ID;
	            	other.PAYMENT_ID = this.PAYMENT_ID;
	            	other.SERVICE_ID = this.SERVICE_ID;
	            	other.CHURN_ID = this.CHURN_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertNewElementsStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CUSTOMER_ID, other.CUSTOMER_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.OFFER_ID, other.OFFER_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CONTRACT_ID, other.CONTRACT_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.PAYMENT_ID, other.PAYMENT_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.SERVICE_ID, other.SERVICE_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CHURN_ID, other.CHURN_ID);
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

public static class InsertReject6Struct implements routines.system.IPersistableRow<InsertReject6Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
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
		final InsertReject6Struct other = (InsertReject6Struct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(InsertReject6Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(InsertReject6Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertReject6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
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

public static class insertServices5Struct implements routines.system.IPersistableRow<insertServices5Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertServices5Struct other) {

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

public static class InsertReject5Struct implements routines.system.IPersistableRow<InsertReject5Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
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
		final InsertReject5Struct other = (InsertReject5Struct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(InsertReject5Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(InsertReject5Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertReject5Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
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

public static class insertServices4Struct implements routines.system.IPersistableRow<insertServices4Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertServices4Struct other) {

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

public static class InsertReject4Struct implements routines.system.IPersistableRow<InsertReject4Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
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
		final InsertReject4Struct other = (InsertReject4Struct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(InsertReject4Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(InsertReject4Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertReject4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
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

public static class insertServices3Struct implements routines.system.IPersistableRow<insertServices3Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertServices3Struct other) {

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

public static class InsertReject3Struct implements routines.system.IPersistableRow<InsertReject3Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
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
		final InsertReject3Struct other = (InsertReject3Struct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(InsertReject3Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(InsertReject3Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertReject3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
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

public static class insertServices2Struct implements routines.system.IPersistableRow<insertServices2Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertServices2Struct other) {

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

public static class InsertReject2Struct implements routines.system.IPersistableRow<InsertReject2Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
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
		final InsertReject2Struct other = (InsertReject2Struct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(InsertReject2Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(InsertReject2Struct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertReject2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
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

public static class insertServices1Struct implements routines.system.IPersistableRow<insertServices1Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertServices1Struct other) {

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

public static class InsertRejectStruct implements routines.system.IPersistableRow<InsertRejectStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String LB_CHEMIN_FICHIER;

				public String getLB_CHEMIN_FICHIER () {
					return this.LB_CHEMIN_FICHIER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public int NUM_LIGNE_REJET;

				public int getNUM_LIGNE_REJET () {
					return this.NUM_LIGNE_REJET;
				}
				
			    public String LB_LIGNE_REJET;

				public String getLB_LIGNE_REJET () {
					return this.LB_LIGNE_REJET;
				}
				
			    public String LB_MESSAGE_REJET;

				public String getLB_MESSAGE_REJET () {
					return this.LB_MESSAGE_REJET;
				}
				
			    public String LB_NOM_FLUX;

				public String getLB_NOM_FLUX () {
					return this.LB_NOM_FLUX;
				}
				
			    public java.util.Date DT_REJET;

				public java.util.Date getDT_REJET () {
					return this.DT_REJET;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.LB_CHEMIN_FICHIER == null) ? 0 : this.LB_CHEMIN_FICHIER.hashCode());
					
						result = prime * result + ((this.LB_NOM_FICHIER == null) ? 0 : this.LB_NOM_FICHIER.hashCode());
					
							result = prime * result + (int) this.NUM_LIGNE_REJET;
						
						result = prime * result + ((this.LB_LIGNE_REJET == null) ? 0 : this.LB_LIGNE_REJET.hashCode());
					
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
		final InsertRejectStruct other = (InsertRejectStruct) obj;
		
						if (this.LB_CHEMIN_FICHIER == null) {
							if (other.LB_CHEMIN_FICHIER != null)
								return false;
						
						} else if (!this.LB_CHEMIN_FICHIER.equals(other.LB_CHEMIN_FICHIER))
						
							return false;
					
						if (this.LB_NOM_FICHIER == null) {
							if (other.LB_NOM_FICHIER != null)
								return false;
						
						} else if (!this.LB_NOM_FICHIER.equals(other.LB_NOM_FICHIER))
						
							return false;
					
						if (this.NUM_LIGNE_REJET != other.NUM_LIGNE_REJET)
							return false;
					
						if (this.LB_LIGNE_REJET == null) {
							if (other.LB_LIGNE_REJET != null)
								return false;
						
						} else if (!this.LB_LIGNE_REJET.equals(other.LB_LIGNE_REJET))
						
							return false;
					

		return true;
    }

	public void copyDataTo(InsertRejectStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            other.LB_MESSAGE_REJET = this.LB_MESSAGE_REJET;
	            other.LB_NOM_FLUX = this.LB_NOM_FLUX;
	            other.DT_REJET = this.DT_REJET;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(InsertRejectStruct other) {

		other.LB_CHEMIN_FICHIER = this.LB_CHEMIN_FICHIER;
	            	other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            	other.NUM_LIGNE_REJET = this.NUM_LIGNE_REJET;
	            	other.LB_LIGNE_REJET = this.LB_LIGNE_REJET;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.LB_CHEMIN_FICHIER = readString(dis);
					
					this.LB_NOM_FICHIER = readString(dis);
					
			        this.NUM_LIGNE_REJET = dis.readInt();
					
					this.LB_LIGNE_REJET = readString(dis);
					
					this.LB_MESSAGE_REJET = readString(dis);
					
					this.LB_NOM_FLUX = readString(dis);
					
					this.DT_REJET = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.LB_CHEMIN_FICHIER,dos);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// int
				
		            	dos.writeInt(this.NUM_LIGNE_REJET);
					
					// String
				
						writeString(this.LB_LIGNE_REJET,dos);
					
					// String
				
						writeString(this.LB_MESSAGE_REJET,dos);
					
					// String
				
						writeString(this.LB_NOM_FLUX,dos);
					
					// java.util.Date
				
						writeDate(this.DT_REJET,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("LB_CHEMIN_FICHIER="+LB_CHEMIN_FICHIER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",NUM_LIGNE_REJET="+String.valueOf(NUM_LIGNE_REJET));
		sb.append(",LB_LIGNE_REJET="+LB_LIGNE_REJET);
		sb.append(",LB_MESSAGE_REJET="+LB_MESSAGE_REJET);
		sb.append(",LB_NOM_FLUX="+LB_NOM_FLUX);
		sb.append(",DT_REJET="+String.valueOf(DT_REJET));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(InsertRejectStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.LB_CHEMIN_FICHIER, other.LB_CHEMIN_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_NOM_FICHIER, other.LB_NOM_FICHIER);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.NUM_LIGNE_REJET, other.NUM_LIGNE_REJET);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.LB_LIGNE_REJET, other.LB_LIGNE_REJET);
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

public static class insertServicesStruct implements routines.system.IPersistableRow<insertServicesStruct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			        this.MONTHLY_CHARGE = dis.readFloat();
					
			        this.TOTAL_REVENUE = dis.readFloat();
					
			        this.TOTAL_CHARGES = dis.readFloat();
					
			        this.TOTAL_REFUNDS = dis.readFloat();
					
			        this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			        this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			        this.TENURE_IN_MONTHS = dis.readInt();
					
					this.LB_NOM_FICHIER = readString(dis);
					
					this.DT_INSERTION = readDate(dis);
					
					this.LB_JOB_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
					// Float
				
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
					// Float
				
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					// float
				
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					// float
				
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					// int
				
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
					// String
				
						writeString(this.LB_NOM_FICHIER,dos);
					
					// java.util.Date
				
						writeDate(this.DT_INSERTION,dos);
					
					// String
				
						writeString(this.LB_JOB_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(insertServicesStruct other) {

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
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

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
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];

	
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

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

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

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


		tDBInput_1Process(globalMap);
		tDBInput_2Process(globalMap);
		tDBInput_3Process(globalMap);
		tDBInput_4Process(globalMap);
		tDBInput_5Process(globalMap);
		tDBInput_6Process(globalMap);
		tDBInput_7Process(globalMap);

		row1Struct row1 = new row1Struct();
insertServicesStruct insertServices = new insertServicesStruct();
insertServices1Struct insertServices1 = new insertServices1Struct();
insertServices2Struct insertServices2 = new insertServices2Struct();
insertServices3Struct insertServices3 = new insertServices3Struct();
insertServices4Struct insertServices4 = new insertServices4Struct();
insertServices5Struct insertServices5 = new insertServices5Struct();
insertNewElementsStruct insertNewElements = new insertNewElementsStruct();
InsertReject6Struct InsertReject6 = new InsertReject6Struct();
InsertReject5Struct InsertReject5 = new InsertReject5Struct();
InsertReject4Struct InsertReject4 = new InsertReject4Struct();
InsertReject3Struct InsertReject3 = new InsertReject3Struct();
InsertReject2Struct InsertReject2 = new InsertReject2Struct();
InsertRejectStruct InsertReject = new InsertRejectStruct();











	
	/**
	 * [tDBOutput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_7", false);
		start_Hash.put("tDBOutput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertNewElements");
					}
				
		int tos_count_tDBOutput_7 = 0;
		





String dbschema_tDBOutput_7 = null;
	dbschema_tDBOutput_7 = context.schemaDwh;
	

String tableName_tDBOutput_7 = null;
if(dbschema_tDBOutput_7 == null || dbschema_tDBOutput_7.trim().length() == 0) {
	tableName_tDBOutput_7 = ("FACT_CUSTOMER_CHURN");
} else {
	tableName_tDBOutput_7 = dbschema_tDBOutput_7 + "\".\"" + ("FACT_CUSTOMER_CHURN");
}

        int updateKeyCount_tDBOutput_7 = 6;
        if(updateKeyCount_tDBOutput_7 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_7 == 18 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_7 = 0;
int nb_line_update_tDBOutput_7 = 0;
int nb_line_inserted_tDBOutput_7 = 0;
int nb_line_deleted_tDBOutput_7 = 0;
int nb_line_rejected_tDBOutput_7 = 0;

int deletedCount_tDBOutput_7=0;
int updatedCount_tDBOutput_7=0;
int insertedCount_tDBOutput_7=0;
int rowsToCommitCount_tDBOutput_7=0;
int rejectedCount_tDBOutput_7=0;

boolean whetherReject_tDBOutput_7 = false;

java.sql.Connection conn_tDBOutput_7 = null;
String dbUser_tDBOutput_7 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_7 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_7 = context.user;

	final String decryptedPassword_tDBOutput_7 = context.password; 

    String dbPwd_tDBOutput_7 = decryptedPassword_tDBOutput_7;

    conn_tDBOutput_7 = java.sql.DriverManager.getConnection(url_tDBOutput_7,dbUser_tDBOutput_7,dbPwd_tDBOutput_7);
	
	resourceMap.put("conn_tDBOutput_7", conn_tDBOutput_7);
        conn_tDBOutput_7.setAutoCommit(false);
        int commitEvery_tDBOutput_7 = 10000;
        int commitCounter_tDBOutput_7 = 0;



int count_tDBOutput_7=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_7 = conn_tDBOutput_7.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_7 + "\" WHERE \"CUSTOMER_ID\" = ? AND \"OFFER_ID\" = ? AND \"CONTRACT_ID\" = ? AND \"PAYMENT_ID\" = ? AND \"SERVICE_ID\" = ? AND \"CHURN_ID\" = ?");
	    resourceMap.put("pstmt_tDBOutput_7", pstmt_tDBOutput_7);
	    String insert_tDBOutput_7 = "INSERT INTO \"" + tableName_tDBOutput_7 + "\" (\"CUSTOMER_ID\",\"OFFER_ID\",\"CONTRACT_ID\",\"PAYMENT_ID\",\"SERVICE_ID\",\"CHURN_ID\",\"AVG_MONTHLY_LONG_DISTANCE_CHARGES\",\"AVG_MONTHLY_GB_DOWNLOAD\",\"MONTHLY_CHARGE\",\"TOTAL_REVENUE\",\"TOTAL_CHARGES\",\"TOTAL_REFUNDS\",\"TOTAL_EXTRA_DATA_CHARGES\",\"TOTAL_LONG_DISTANCE_CHARGES\",\"TENURE_IN_MONTHS\",\"LB_NOM_FICHIER\",\"DT_INSERTION\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_7 = conn_tDBOutput_7.prepareStatement(insert_tDBOutput_7);
	    resourceMap.put("pstmtInsert_tDBOutput_7", pstmtInsert_tDBOutput_7);
	    String update_tDBOutput_7 = "UPDATE \"" + tableName_tDBOutput_7 + "\" SET \"AVG_MONTHLY_LONG_DISTANCE_CHARGES\" = ?,\"AVG_MONTHLY_GB_DOWNLOAD\" = ?,\"MONTHLY_CHARGE\" = ?,\"TOTAL_REVENUE\" = ?,\"TOTAL_CHARGES\" = ?,\"TOTAL_REFUNDS\" = ?,\"TOTAL_EXTRA_DATA_CHARGES\" = ?,\"TOTAL_LONG_DISTANCE_CHARGES\" = ?,\"TENURE_IN_MONTHS\" = ?,\"LB_NOM_FICHIER\" = ?,\"DT_INSERTION\" = ?,\"LB_JOB_NAME\" = ? WHERE \"CUSTOMER_ID\" = ? AND \"OFFER_ID\" = ? AND \"CONTRACT_ID\" = ? AND \"PAYMENT_ID\" = ? AND \"SERVICE_ID\" = ? AND \"CHURN_ID\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_7 = conn_tDBOutput_7.prepareStatement(update_tDBOutput_7);
	    resourceMap.put("pstmtUpdate_tDBOutput_7", pstmtUpdate_tDBOutput_7);
	    

 



/**
 * [tDBOutput_7 begin ] stop
 */




	
	/**
	 * [tDBOutput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_6", false);
		start_Hash.put("tDBOutput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject6");
					}
				
		int tos_count_tDBOutput_6 = 0;
		





String dbschema_tDBOutput_6 = null;
	dbschema_tDBOutput_6 = context.schemaDwh;
	

String tableName_tDBOutput_6 = null;
if(dbschema_tDBOutput_6 == null || dbschema_tDBOutput_6.trim().length() == 0) {
	tableName_tDBOutput_6 = ("DWH_REJET");
} else {
	tableName_tDBOutput_6 = dbschema_tDBOutput_6 + "\".\"" + ("DWH_REJET");
}

        int updateKeyCount_tDBOutput_6 = 4;
        if(updateKeyCount_tDBOutput_6 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_6 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_6 = 0;
int nb_line_update_tDBOutput_6 = 0;
int nb_line_inserted_tDBOutput_6 = 0;
int nb_line_deleted_tDBOutput_6 = 0;
int nb_line_rejected_tDBOutput_6 = 0;

int deletedCount_tDBOutput_6=0;
int updatedCount_tDBOutput_6=0;
int insertedCount_tDBOutput_6=0;
int rowsToCommitCount_tDBOutput_6=0;
int rejectedCount_tDBOutput_6=0;

boolean whetherReject_tDBOutput_6 = false;

java.sql.Connection conn_tDBOutput_6 = null;
String dbUser_tDBOutput_6 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_6 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_6 = context.user;

	final String decryptedPassword_tDBOutput_6 = context.password; 

    String dbPwd_tDBOutput_6 = decryptedPassword_tDBOutput_6;

    conn_tDBOutput_6 = java.sql.DriverManager.getConnection(url_tDBOutput_6,dbUser_tDBOutput_6,dbPwd_tDBOutput_6);
	
	resourceMap.put("conn_tDBOutput_6", conn_tDBOutput_6);
        conn_tDBOutput_6.setAutoCommit(false);
        int commitEvery_tDBOutput_6 = 10000;
        int commitCounter_tDBOutput_6 = 0;



int count_tDBOutput_6=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_6 = conn_tDBOutput_6.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_6 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_6", pstmt_tDBOutput_6);
	    String insert_tDBOutput_6 = "INSERT INTO \"" + tableName_tDBOutput_6 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_6 = conn_tDBOutput_6.prepareStatement(insert_tDBOutput_6);
	    resourceMap.put("pstmtInsert_tDBOutput_6", pstmtInsert_tDBOutput_6);
	    String update_tDBOutput_6 = "UPDATE \"" + tableName_tDBOutput_6 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_6 = conn_tDBOutput_6.prepareStatement(update_tDBOutput_6);
	    resourceMap.put("pstmtUpdate_tDBOutput_6", pstmtUpdate_tDBOutput_6);
	    

 



/**
 * [tDBOutput_6 begin ] stop
 */



	
	/**
	 * [tMap_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_7", false);
		start_Hash.put("tMap_7", System.currentTimeMillis());
		
	
	currentComponent="tMap_7";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertServices5");
					}
				
		int tos_count_tMap_7 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct>) 
					globalMap.get( "tHash_Lookup_row8" ))
					;					
					
	

row8Struct row8HashKey = new row8Struct();
row8Struct row8Default = new row8Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_7__Struct  {
	int var1;
}
Var__tMap_7__Struct Var__tMap_7 = new Var__tMap_7__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertNewElementsStruct insertNewElements_tmp = new insertNewElementsStruct();
InsertReject6Struct InsertReject6_tmp = new InsertReject6Struct();
// ###############################

        
        



        









 



/**
 * [tMap_7 begin ] stop
 */




	
	/**
	 * [tDBOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_5", false);
		start_Hash.put("tDBOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject5");
					}
				
		int tos_count_tDBOutput_5 = 0;
		





String dbschema_tDBOutput_5 = null;
	dbschema_tDBOutput_5 = context.schemaDwh;
	

String tableName_tDBOutput_5 = null;
if(dbschema_tDBOutput_5 == null || dbschema_tDBOutput_5.trim().length() == 0) {
	tableName_tDBOutput_5 = ("DWH_REJET");
} else {
	tableName_tDBOutput_5 = dbschema_tDBOutput_5 + "\".\"" + ("DWH_REJET");
}

        int updateKeyCount_tDBOutput_5 = 4;
        if(updateKeyCount_tDBOutput_5 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_5 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_5 = 0;
int nb_line_update_tDBOutput_5 = 0;
int nb_line_inserted_tDBOutput_5 = 0;
int nb_line_deleted_tDBOutput_5 = 0;
int nb_line_rejected_tDBOutput_5 = 0;

int deletedCount_tDBOutput_5=0;
int updatedCount_tDBOutput_5=0;
int insertedCount_tDBOutput_5=0;
int rowsToCommitCount_tDBOutput_5=0;
int rejectedCount_tDBOutput_5=0;

boolean whetherReject_tDBOutput_5 = false;

java.sql.Connection conn_tDBOutput_5 = null;
String dbUser_tDBOutput_5 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_5 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_5 = context.user;

	final String decryptedPassword_tDBOutput_5 = context.password; 

    String dbPwd_tDBOutput_5 = decryptedPassword_tDBOutput_5;

    conn_tDBOutput_5 = java.sql.DriverManager.getConnection(url_tDBOutput_5,dbUser_tDBOutput_5,dbPwd_tDBOutput_5);
	
	resourceMap.put("conn_tDBOutput_5", conn_tDBOutput_5);
        conn_tDBOutput_5.setAutoCommit(false);
        int commitEvery_tDBOutput_5 = 10000;
        int commitCounter_tDBOutput_5 = 0;



int count_tDBOutput_5=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_5 = conn_tDBOutput_5.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_5 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_5", pstmt_tDBOutput_5);
	    String insert_tDBOutput_5 = "INSERT INTO \"" + tableName_tDBOutput_5 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(insert_tDBOutput_5);
	    resourceMap.put("pstmtInsert_tDBOutput_5", pstmtInsert_tDBOutput_5);
	    String update_tDBOutput_5 = "UPDATE \"" + tableName_tDBOutput_5 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_5 = conn_tDBOutput_5.prepareStatement(update_tDBOutput_5);
	    resourceMap.put("pstmtUpdate_tDBOutput_5", pstmtUpdate_tDBOutput_5);
	    

 



/**
 * [tDBOutput_5 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertServices4");
					}
				
		int tos_count_tMap_6 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct>) 
					globalMap.get( "tHash_Lookup_row7" ))
					;					
					
	

row7Struct row7HashKey = new row7Struct();
row7Struct row7Default = new row7Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
	int var1;
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertServices5Struct insertServices5_tmp = new insertServices5Struct();
InsertReject5Struct InsertReject5_tmp = new InsertReject5Struct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */




	
	/**
	 * [tDBOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_4", false);
		start_Hash.put("tDBOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject4");
					}
				
		int tos_count_tDBOutput_4 = 0;
		





String dbschema_tDBOutput_4 = null;
	dbschema_tDBOutput_4 = context.schemaDwh;
	

String tableName_tDBOutput_4 = null;
if(dbschema_tDBOutput_4 == null || dbschema_tDBOutput_4.trim().length() == 0) {
	tableName_tDBOutput_4 = ("DWH_REJET");
} else {
	tableName_tDBOutput_4 = dbschema_tDBOutput_4 + "\".\"" + ("DWH_REJET");
}

        int updateKeyCount_tDBOutput_4 = 4;
        if(updateKeyCount_tDBOutput_4 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_4 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_4 = 0;
int nb_line_update_tDBOutput_4 = 0;
int nb_line_inserted_tDBOutput_4 = 0;
int nb_line_deleted_tDBOutput_4 = 0;
int nb_line_rejected_tDBOutput_4 = 0;

int deletedCount_tDBOutput_4=0;
int updatedCount_tDBOutput_4=0;
int insertedCount_tDBOutput_4=0;
int rowsToCommitCount_tDBOutput_4=0;
int rejectedCount_tDBOutput_4=0;

boolean whetherReject_tDBOutput_4 = false;

java.sql.Connection conn_tDBOutput_4 = null;
String dbUser_tDBOutput_4 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_4 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_4 = context.user;

	final String decryptedPassword_tDBOutput_4 = context.password; 

    String dbPwd_tDBOutput_4 = decryptedPassword_tDBOutput_4;

    conn_tDBOutput_4 = java.sql.DriverManager.getConnection(url_tDBOutput_4,dbUser_tDBOutput_4,dbPwd_tDBOutput_4);
	
	resourceMap.put("conn_tDBOutput_4", conn_tDBOutput_4);
        conn_tDBOutput_4.setAutoCommit(false);
        int commitEvery_tDBOutput_4 = 10000;
        int commitCounter_tDBOutput_4 = 0;



int count_tDBOutput_4=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_4 = conn_tDBOutput_4.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_4 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_4", pstmt_tDBOutput_4);
	    String insert_tDBOutput_4 = "INSERT INTO \"" + tableName_tDBOutput_4 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(insert_tDBOutput_4);
	    resourceMap.put("pstmtInsert_tDBOutput_4", pstmtInsert_tDBOutput_4);
	    String update_tDBOutput_4 = "UPDATE \"" + tableName_tDBOutput_4 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_4 = conn_tDBOutput_4.prepareStatement(update_tDBOutput_4);
	    resourceMap.put("pstmtUpdate_tDBOutput_4", pstmtUpdate_tDBOutput_4);
	    

 



/**
 * [tDBOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_5", false);
		start_Hash.put("tMap_5", System.currentTimeMillis());
		
	
	currentComponent="tMap_5";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertServices3");
					}
				
		int tos_count_tMap_5 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct>) 
					globalMap.get( "tHash_Lookup_row6" ))
					;					
					
	

row6Struct row6HashKey = new row6Struct();
row6Struct row6Default = new row6Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_5__Struct  {
	int var1;
}
Var__tMap_5__Struct Var__tMap_5 = new Var__tMap_5__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertServices4Struct insertServices4_tmp = new insertServices4Struct();
InsertReject4Struct InsertReject4_tmp = new InsertReject4Struct();
// ###############################

        
        



        









 



/**
 * [tMap_5 begin ] stop
 */




	
	/**
	 * [tDBOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_3", false);
		start_Hash.put("tDBOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject3");
					}
				
		int tos_count_tDBOutput_3 = 0;
		





String dbschema_tDBOutput_3 = null;
	dbschema_tDBOutput_3 = context.schemaDwh;
	

String tableName_tDBOutput_3 = null;
if(dbschema_tDBOutput_3 == null || dbschema_tDBOutput_3.trim().length() == 0) {
	tableName_tDBOutput_3 = ("DWH_REJET");
} else {
	tableName_tDBOutput_3 = dbschema_tDBOutput_3 + "\".\"" + ("DWH_REJET");
}

        int updateKeyCount_tDBOutput_3 = 4;
        if(updateKeyCount_tDBOutput_3 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_3 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_3 = 0;
int nb_line_update_tDBOutput_3 = 0;
int nb_line_inserted_tDBOutput_3 = 0;
int nb_line_deleted_tDBOutput_3 = 0;
int nb_line_rejected_tDBOutput_3 = 0;

int deletedCount_tDBOutput_3=0;
int updatedCount_tDBOutput_3=0;
int insertedCount_tDBOutput_3=0;
int rowsToCommitCount_tDBOutput_3=0;
int rejectedCount_tDBOutput_3=0;

boolean whetherReject_tDBOutput_3 = false;

java.sql.Connection conn_tDBOutput_3 = null;
String dbUser_tDBOutput_3 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_3 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_3 = context.user;

	final String decryptedPassword_tDBOutput_3 = context.password; 

    String dbPwd_tDBOutput_3 = decryptedPassword_tDBOutput_3;

    conn_tDBOutput_3 = java.sql.DriverManager.getConnection(url_tDBOutput_3,dbUser_tDBOutput_3,dbPwd_tDBOutput_3);
	
	resourceMap.put("conn_tDBOutput_3", conn_tDBOutput_3);
        conn_tDBOutput_3.setAutoCommit(false);
        int commitEvery_tDBOutput_3 = 10000;
        int commitCounter_tDBOutput_3 = 0;



int count_tDBOutput_3=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_3 = conn_tDBOutput_3.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_3 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_3", pstmt_tDBOutput_3);
	    String insert_tDBOutput_3 = "INSERT INTO \"" + tableName_tDBOutput_3 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(insert_tDBOutput_3);
	    resourceMap.put("pstmtInsert_tDBOutput_3", pstmtInsert_tDBOutput_3);
	    String update_tDBOutput_3 = "UPDATE \"" + tableName_tDBOutput_3 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_3 = conn_tDBOutput_3.prepareStatement(update_tDBOutput_3);
	    resourceMap.put("pstmtUpdate_tDBOutput_3", pstmtUpdate_tDBOutput_3);
	    

 



/**
 * [tDBOutput_3 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertServices2");
					}
				
		int tos_count_tMap_4 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct>) 
					globalMap.get( "tHash_Lookup_row5" ))
					;					
					
	

row5Struct row5HashKey = new row5Struct();
row5Struct row5Default = new row5Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
	int var1;
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertServices3Struct insertServices3_tmp = new insertServices3Struct();
InsertReject3Struct InsertReject3_tmp = new InsertReject3Struct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */




	
	/**
	 * [tDBOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_2", false);
		start_Hash.put("tDBOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject2");
					}
				
		int tos_count_tDBOutput_2 = 0;
		





String dbschema_tDBOutput_2 = null;
	dbschema_tDBOutput_2 = context.schemaDwh;
	

String tableName_tDBOutput_2 = null;
if(dbschema_tDBOutput_2 == null || dbschema_tDBOutput_2.trim().length() == 0) {
	tableName_tDBOutput_2 = ("DWH_REJET");
} else {
	tableName_tDBOutput_2 = dbschema_tDBOutput_2 + "\".\"" + ("DWH_REJET");
}

        int updateKeyCount_tDBOutput_2 = 4;
        if(updateKeyCount_tDBOutput_2 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_2 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_2 = 0;
int nb_line_update_tDBOutput_2 = 0;
int nb_line_inserted_tDBOutput_2 = 0;
int nb_line_deleted_tDBOutput_2 = 0;
int nb_line_rejected_tDBOutput_2 = 0;

int deletedCount_tDBOutput_2=0;
int updatedCount_tDBOutput_2=0;
int insertedCount_tDBOutput_2=0;
int rowsToCommitCount_tDBOutput_2=0;
int rejectedCount_tDBOutput_2=0;

boolean whetherReject_tDBOutput_2 = false;

java.sql.Connection conn_tDBOutput_2 = null;
String dbUser_tDBOutput_2 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_2 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_2 = context.user;

	final String decryptedPassword_tDBOutput_2 = context.password; 

    String dbPwd_tDBOutput_2 = decryptedPassword_tDBOutput_2;

    conn_tDBOutput_2 = java.sql.DriverManager.getConnection(url_tDBOutput_2,dbUser_tDBOutput_2,dbPwd_tDBOutput_2);
	
	resourceMap.put("conn_tDBOutput_2", conn_tDBOutput_2);
        conn_tDBOutput_2.setAutoCommit(false);
        int commitEvery_tDBOutput_2 = 10000;
        int commitCounter_tDBOutput_2 = 0;



int count_tDBOutput_2=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_2 = conn_tDBOutput_2.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_2 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_2", pstmt_tDBOutput_2);
	    String insert_tDBOutput_2 = "INSERT INTO \"" + tableName_tDBOutput_2 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(insert_tDBOutput_2);
	    resourceMap.put("pstmtInsert_tDBOutput_2", pstmtInsert_tDBOutput_2);
	    String update_tDBOutput_2 = "UPDATE \"" + tableName_tDBOutput_2 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_2 = conn_tDBOutput_2.prepareStatement(update_tDBOutput_2);
	    resourceMap.put("pstmtUpdate_tDBOutput_2", pstmtUpdate_tDBOutput_2);
	    

 



/**
 * [tDBOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertServices1");
					}
				
		int tos_count_tMap_3 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct>) 
					globalMap.get( "tHash_Lookup_row4" ))
					;					
					
	

row4Struct row4HashKey = new row4Struct();
row4Struct row4Default = new row4Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
	int var1;
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertServices2Struct insertServices2_tmp = new insertServices2Struct();
InsertReject2Struct InsertReject2_tmp = new InsertReject2Struct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */




	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"InsertReject");
					}
				
		int tos_count_tDBOutput_1 = 0;
		





String dbschema_tDBOutput_1 = null;
	dbschema_tDBOutput_1 = context.schemaDwh;
	

String tableName_tDBOutput_1 = null;
if(dbschema_tDBOutput_1 == null || dbschema_tDBOutput_1.trim().length() == 0) {
	tableName_tDBOutput_1 = ("DWH_REJET");
} else {
	tableName_tDBOutput_1 = dbschema_tDBOutput_1 + "\".\"" + ("DWH_REJET");
}

        int updateKeyCount_tDBOutput_1 = 4;
        if(updateKeyCount_tDBOutput_1 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_1 == 8 && true) {
                    System.err.println("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;
int nb_line_rejected_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
int rejectedCount_tDBOutput_1=0;

boolean whetherReject_tDBOutput_1 = false;

java.sql.Connection conn_tDBOutput_1 = null;
String dbUser_tDBOutput_1 = null;

	
    java.lang.Class.forName("org.postgresql.Driver");
    
        String url_tDBOutput_1 = "jdbc:postgresql://"+context.serverName+":"+context.port+"/"+context.database + "?" + context.additionalParam;
    dbUser_tDBOutput_1 = context.user;

	final String decryptedPassword_tDBOutput_1 = context.password; 

    String dbPwd_tDBOutput_1 = decryptedPassword_tDBOutput_1;

    conn_tDBOutput_1 = java.sql.DriverManager.getConnection(url_tDBOutput_1,dbUser_tDBOutput_1,dbPwd_tDBOutput_1);
	
	resourceMap.put("conn_tDBOutput_1", conn_tDBOutput_1);
        conn_tDBOutput_1.setAutoCommit(false);
        int commitEvery_tDBOutput_1 = 10000;
        int commitCounter_tDBOutput_1 = 0;



int count_tDBOutput_1=0;
	    java.sql.PreparedStatement pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement("SELECT COUNT(1) FROM \"" + tableName_tDBOutput_1 + "\" WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?");
	    resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    String insert_tDBOutput_1 = "INSERT INTO \"" + tableName_tDBOutput_1 + "\" (\"LB_CHEMIN_FICHIER\",\"LB_NOM_FICHIER\",\"NUM_LIGNE_REJET\",\"LB_LIGNE_REJET\",\"LB_MESSAGE_REJET\",\"LB_NOM_FLUX\",\"DT_REJET\",\"LB_JOB_NAME\") VALUES (?,?,?,?,?,?,?,?)";
	    java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
	    resourceMap.put("pstmtInsert_tDBOutput_1", pstmtInsert_tDBOutput_1);
	    String update_tDBOutput_1 = "UPDATE \"" + tableName_tDBOutput_1 + "\" SET \"LB_MESSAGE_REJET\" = ?,\"LB_NOM_FLUX\" = ?,\"DT_REJET\" = ?,\"LB_JOB_NAME\" = ? WHERE \"LB_CHEMIN_FICHIER\" = ? AND \"LB_NOM_FICHIER\" = ? AND \"NUM_LIGNE_REJET\" = ? AND \"LB_LIGNE_REJET\" = ?";
	    java.sql.PreparedStatement pstmtUpdate_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(update_tDBOutput_1);
	    resourceMap.put("pstmtUpdate_tDBOutput_1", pstmtUpdate_tDBOutput_1);
	    

 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"insertServices");
					}
				
		int tos_count_tMap_2 = 0;
		




// ###############################
// # Lookup's keys initialization
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct>) 
					globalMap.get( "tHash_Lookup_row3" ))
					;					
					
	

row3Struct row3HashKey = new row3Struct();
row3Struct row3Default = new row3Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
	int var1;
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
insertServices1Struct insertServices1_tmp = new insertServices1Struct();
InsertRejectStruct InsertReject_tmp = new InsertRejectStruct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
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
insertServicesStruct insertServices_tmp = new insertServicesStruct();
// ###############################

        
        



        









 



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
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = ((String)globalMap.get("cheminFichier")) + "/"+((String)globalMap.get("nomFichier"));
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(((String)globalMap.get("cheminFichier")) + "/"+((String)globalMap.get("nomFichier")), context.encodage,context.fileSeparator,"\n",true,1,0,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								throw e;
							
						}
					
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row1 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row1 = new row1Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row1.CustomerID = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.OfferID = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"OfferID", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.OfferID = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 2;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ContractID = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ContractID", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ContractID = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 3;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.PaymentModeID = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"PaymentModeID", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.PaymentModeID = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 4;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ServiceID = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ServiceID", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ServiceID = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 5;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.ChurnID = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ChurnID", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.ChurnID = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 6;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.AvgMonthlyLongDistanceCharges = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"AvgMonthlyLongDistanceCharges", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.AvgMonthlyLongDistanceCharges = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 7;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.AvgMonthlyGBDownload = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"AvgMonthlyGBDownload", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.AvgMonthlyGBDownload = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 8;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.MonthlyCharge = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"MonthlyCharge", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.MonthlyCharge = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 9;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.TotalCharges = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TotalCharges", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.TotalCharges = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 10;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.TotalRefunds = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TotalRefunds", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.TotalRefunds = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 11;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.TotalExtraDataCharges = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TotalExtraDataCharges", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.TotalExtraDataCharges = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 12;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.TotalLongDistanceCharges = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TotalLongDistanceCharges", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.TotalLongDistanceCharges = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 13;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.TotalRevenue = ParserUtils.parseTo_Float(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TotalRevenue", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.TotalRevenue = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_1 = 14;
					
						temp = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1);
						if(temp.length() > 0) {
							
								try {
								
    								row1.TenureInMonth = ParserUtils.parseTo_Integer(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_1) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",ex_tFileInputDelimited_1.getMessage());
									rowstate_tFileInputDelimited_1.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TenureInMonth", "row1", temp, ex_tFileInputDelimited_1), ex_tFileInputDelimited_1));
								}
    							
						} else {						
							
								
									row1.TenureInMonth = null;
								
							
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
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow2 = false;
       		  	    	
       		  	    	
 							row2Struct row2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_1) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_1 = false;
								
                        		    		    row2HashKey.CUSTOMER_ID = row1.CustomerID ;
                        		    		
	                        		    	Object exprKeyValue_row2__OFFER_ID = row1.OfferID ;
	                        		    	if(exprKeyValue_row2__OFFER_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row2HashKey.OFFER_ID = (int)(Integer) exprKeyValue_row2__OFFER_ID;
                        		    		}
                        		    		
	                        		    	Object exprKeyValue_row2__CONTRACT_ID = row1.ContractID ;
	                        		    	if(exprKeyValue_row2__CONTRACT_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row2HashKey.CONTRACT_ID = (int)(Integer) exprKeyValue_row2__CONTRACT_ID;
                        		    		}
                        		    		
	                        		    	Object exprKeyValue_row2__PAYMENT_ID = row1.PaymentModeID ;
	                        		    	if(exprKeyValue_row2__PAYMENT_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row2HashKey.PAYMENT_ID = (int)(Integer) exprKeyValue_row2__PAYMENT_ID;
                        		    		}
                        		    		
	                        		    	Object exprKeyValue_row2__SERVICE_ID = row1.ServiceID ;
	                        		    	if(exprKeyValue_row2__SERVICE_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row2HashKey.SERVICE_ID = (int)(Integer) exprKeyValue_row2__SERVICE_ID;
                        		    		}
                        		    		
	                        		    	Object exprKeyValue_row2__CHURN_ID = row1.ChurnID ;
	                        		    	if(exprKeyValue_row2__CHURN_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_1 = true;
	                        		    	} else {
                        		    			row2HashKey.CHURN_ID = (int)(Integer) exprKeyValue_row2__CHURN_ID;
                        		    		}
                        		    		

								
		                        	row2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_1) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row2.lookup( row2HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_1 || !tHash_Lookup_row2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_1 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row2 != null && tHash_Lookup_row2.getCount(row2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row2' and it contains more one result from keys :  row2.CUSTOMER_ID = '" + row2HashKey.CUSTOMER_ID + "', row2.OFFER_ID = '" + row2HashKey.OFFER_ID + "', row2.CONTRACT_ID = '" + row2HashKey.CONTRACT_ID + "', row2.PAYMENT_ID = '" + row2HashKey.PAYMENT_ID + "', row2.SERVICE_ID = '" + row2HashKey.SERVICE_ID + "', row2.CHURN_ID = '" + row2HashKey.CHURN_ID + "'");
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

insertServices = null;

if(!rejectedInnerJoin_tMap_1 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'insertServices'
// # Filter conditions 
if( rejectedInnerJoin_tMap_1 ) {
insertServices_tmp.CUSTOMER_ID = row1.CustomerID ;
insertServices_tmp.OFFER_ID = row1.OfferID ;
insertServices_tmp.CONTRACT_ID = row1.ContractID ;
insertServices_tmp.PAYMENT_ID = row1.PaymentModeID ;
insertServices_tmp.SERVICE_ID = row1.ServiceID ;
insertServices_tmp.CHURN_ID = row1.ChurnID ;
insertServices_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = row1.AvgMonthlyLongDistanceCharges ;
insertServices_tmp.AVG_MONTHLY_GB_DOWNLOAD = row1.AvgMonthlyGBDownload ;
insertServices_tmp.MONTHLY_CHARGE = row1.MonthlyCharge ;
insertServices_tmp.TOTAL_REVENUE = row1.TotalRevenue ;
insertServices_tmp.TOTAL_CHARGES = row1.TotalCharges ;
insertServices_tmp.TOTAL_REFUNDS = row1.TotalRefunds;
insertServices_tmp.TOTAL_EXTRA_DATA_CHARGES = row1.TotalExtraDataCharges  ;
insertServices_tmp.TOTAL_LONG_DISTANCE_CHARGES = row1.TotalLongDistanceCharges ;
insertServices_tmp.TENURE_IN_MONTHS = row1.TenureInMonth ;
insertServices_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier")) ;
insertServices_tmp.DT_INSERTION = TalendDate.getCurrentDate() ;
insertServices_tmp.LB_JOB_NAME = jobName;
insertServices = insertServices_tmp;
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
// Start of branch "insertServices"
if(insertServices != null) { 



	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertServices"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row3" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow3 = false;
       		  	    	
       		  	    	
 							row3Struct row3ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
	                        		    	Object exprKeyValue_row3__CHURN_ID = insertServices.CHURN_ID ;
	                        		    	if(exprKeyValue_row3__CHURN_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_2 = true;
	                        		    	} else {
                        		    			row3HashKey.CHURN_ID = (int)(Integer) exprKeyValue_row3__CHURN_ID;
                        		    		}
                        		    		

								
		                        	row3HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_2) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row3.lookup( row3HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_2 || !tHash_Lookup_row3.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row3 != null && tHash_Lookup_row3.getCount(row3HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row3' and it contains more one result from keys :  row3.CHURN_ID = '" + row3HashKey.CHURN_ID + "'");
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
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;
Var.var1 = Numeric.sequence("s1",1,1);// ###############################
        // ###############################
        // # Output tables

insertServices1 = null;
InsertReject = null;

if(!rejectedInnerJoin_tMap_2 ) {

// # Output table : 'insertServices1'
insertServices1_tmp.CUSTOMER_ID = insertServices.CUSTOMER_ID ;
insertServices1_tmp.OFFER_ID = insertServices.OFFER_ID ;
insertServices1_tmp.CONTRACT_ID = insertServices.CONTRACT_ID ;
insertServices1_tmp.PAYMENT_ID = insertServices.PAYMENT_ID ;
insertServices1_tmp.SERVICE_ID = insertServices.SERVICE_ID ;
insertServices1_tmp.CHURN_ID = insertServices.CHURN_ID ;
insertServices1_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = insertServices.AVG_MONTHLY_LONG_DISTANCE_CHARGES ;
insertServices1_tmp.AVG_MONTHLY_GB_DOWNLOAD = insertServices.AVG_MONTHLY_GB_DOWNLOAD ;
insertServices1_tmp.MONTHLY_CHARGE = insertServices.MONTHLY_CHARGE ;
insertServices1_tmp.TOTAL_REVENUE = insertServices.TOTAL_REVENUE ;
insertServices1_tmp.TOTAL_CHARGES = insertServices.TOTAL_CHARGES ;
insertServices1_tmp.TOTAL_REFUNDS = insertServices.TOTAL_REFUNDS ;
insertServices1_tmp.TOTAL_EXTRA_DATA_CHARGES = insertServices.TOTAL_EXTRA_DATA_CHARGES ;
insertServices1_tmp.TOTAL_LONG_DISTANCE_CHARGES = insertServices.TOTAL_LONG_DISTANCE_CHARGES ;
insertServices1_tmp.TENURE_IN_MONTHS = insertServices.TENURE_IN_MONTHS ;
insertServices1_tmp.LB_NOM_FICHIER = insertServices.LB_NOM_FICHIER ;
insertServices1_tmp.DT_INSERTION = insertServices.DT_INSERTION ;
insertServices1_tmp.LB_JOB_NAME = insertServices.LB_JOB_NAME ;
insertServices1 = insertServices1_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertReject'
// # Filter conditions 
if( rejectedInnerJoin_tMap_2 ) {
InsertReject_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("cheminFichier")) ;
InsertReject_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier"));
InsertReject_tmp.NUM_LIGNE_REJET = Var.var1 ;
InsertReject_tmp.LB_LIGNE_REJET = insertServices.CUSTOMER_ID + "|" + insertServices.OFFER_ID + "|" + insertServices.CONTRACT_ID + "|" + insertServices.PAYMENT_ID + "|" + insertServices.SERVICE_ID + "|" + insertServices.CHURN_ID + "|" + insertServices.AVG_MONTHLY_LONG_DISTANCE_CHARGES + "|" + insertServices.AVG_MONTHLY_GB_DOWNLOAD + "|" + insertServices.MONTHLY_CHARGE + "|" + insertServices.TOTAL_REVENUE + "|" + insertServices.TOTAL_CHARGES  + "|" + insertServices.TOTAL_REFUNDS  + "|" + insertServices.TOTAL_EXTRA_DATA_CHARGES + "|" +  insertServices.TOTAL_LONG_DISTANCE_CHARGES + "|" +  insertServices.TENURE_IN_MONTHS  + "|" + insertServices.LB_NOM_FICHIER  + "|" + insertServices.DT_INSERTION  + "|" + insertServices.LB_JOB_NAME ;
InsertReject_tmp.LB_MESSAGE_REJET = "Relation Violation WITH LOCATION_DIM ==>" + insertServices.CHURN_ID + " don't exist in LOCATION_DIM Table" ;
InsertReject_tmp.LB_NOM_FLUX = ((String)globalMap.get("nomFlux")) ;
InsertReject_tmp.DT_REJET = TalendDate.getCurrentDate() ;
InsertReject_tmp.LB_JOB_NAME = jobName;
InsertReject = InsertReject_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "insertServices1"
if(insertServices1 != null) { 



	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertServices1"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row4" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow4 = false;
       		  	    	
       		  	    	
 							row4Struct row4ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
	                        		    	Object exprKeyValue_row4__CONTRACT_ID = insertServices1.CONTRACT_ID ;
	                        		    	if(exprKeyValue_row4__CONTRACT_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_3 = true;
	                        		    	} else {
                        		    			row4HashKey.CONTRACT_ID = (int)(Integer) exprKeyValue_row4__CONTRACT_ID;
                        		    		}
                        		    		

								
		                        	row4HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_3) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row4.lookup( row4HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_3 || !tHash_Lookup_row4.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row4 != null && tHash_Lookup_row4.getCount(row4HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row4' and it contains more one result from keys :  row4.CONTRACT_ID = '" + row4HashKey.CONTRACT_ID + "'");
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
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;
Var.var1 = Numeric.sequence("s1",1,1);// ###############################
        // ###############################
        // # Output tables

insertServices2 = null;
InsertReject2 = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'insertServices2'
insertServices2_tmp.CUSTOMER_ID = insertServices1.CUSTOMER_ID ;
insertServices2_tmp.OFFER_ID = insertServices1.OFFER_ID ;
insertServices2_tmp.CONTRACT_ID = insertServices1.CONTRACT_ID ;
insertServices2_tmp.PAYMENT_ID = insertServices1.PAYMENT_ID ;
insertServices2_tmp.SERVICE_ID = insertServices1.SERVICE_ID ;
insertServices2_tmp.CHURN_ID = insertServices1.CHURN_ID ;
insertServices2_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = insertServices1.AVG_MONTHLY_LONG_DISTANCE_CHARGES ;
insertServices2_tmp.AVG_MONTHLY_GB_DOWNLOAD = insertServices1.AVG_MONTHLY_GB_DOWNLOAD ;
insertServices2_tmp.MONTHLY_CHARGE = insertServices1.MONTHLY_CHARGE ;
insertServices2_tmp.TOTAL_REVENUE = insertServices1.TOTAL_REVENUE ;
insertServices2_tmp.TOTAL_CHARGES = insertServices1.TOTAL_CHARGES ;
insertServices2_tmp.TOTAL_REFUNDS = insertServices1.TOTAL_REFUNDS ;
insertServices2_tmp.TOTAL_EXTRA_DATA_CHARGES = insertServices1.TOTAL_EXTRA_DATA_CHARGES ;
insertServices2_tmp.TOTAL_LONG_DISTANCE_CHARGES = insertServices1.TOTAL_LONG_DISTANCE_CHARGES ;
insertServices2_tmp.TENURE_IN_MONTHS = insertServices1.TENURE_IN_MONTHS ;
insertServices2_tmp.LB_NOM_FICHIER = insertServices1.LB_NOM_FICHIER ;
insertServices2_tmp.DT_INSERTION = insertServices1.DT_INSERTION ;
insertServices2_tmp.LB_JOB_NAME = insertServices1.LB_JOB_NAME ;
insertServices2 = insertServices2_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertReject2'
// # Filter conditions 
if( rejectedInnerJoin_tMap_3 ) {
InsertReject2_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("cheminFichier")) ;
InsertReject2_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier"));
InsertReject2_tmp.NUM_LIGNE_REJET = Var.var1 ;
InsertReject2_tmp.LB_LIGNE_REJET = insertServices1.CUSTOMER_ID + "|" + insertServices1.OFFER_ID + "|" + insertServices1.CONTRACT_ID + "|" + insertServices1.PAYMENT_ID + "|" + insertServices1.SERVICE_ID + "|" + insertServices1.CHURN_ID + "|" + insertServices1.AVG_MONTHLY_LONG_DISTANCE_CHARGES + "|" + insertServices1.AVG_MONTHLY_GB_DOWNLOAD + "|" + insertServices1.MONTHLY_CHARGE + "|" + insertServices1.TOTAL_REVENUE + "|" + insertServices1.TOTAL_CHARGES  + "|" + insertServices1.TOTAL_REFUNDS  + "|" + insertServices1.TOTAL_EXTRA_DATA_CHARGES + "|" +  insertServices1.TOTAL_LONG_DISTANCE_CHARGES + "|" +  insertServices1.TENURE_IN_MONTHS  + "|" + insertServices1.LB_NOM_FICHIER  + "|" + insertServices1.DT_INSERTION  + "|" + insertServices1.LB_JOB_NAME ;
InsertReject2_tmp.LB_MESSAGE_REJET = "Relation Violation WITH LOCATION_DIM ==>" + insertServices1.CONTRACT_ID + " don't exist in LOCATION_DIM Table" ;
InsertReject2_tmp.LB_NOM_FLUX = ((String)globalMap.get("nomFlux")) ;
InsertReject2_tmp.DT_REJET = TalendDate.getCurrentDate() ;
InsertReject2_tmp.LB_JOB_NAME = jobName;
InsertReject2 = InsertReject2_tmp;
} // closing filter/reject
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
// Start of branch "insertServices2"
if(insertServices2 != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertServices2"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row5" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow5 = false;
       		  	    	
       		  	    	
 							row5Struct row5ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
	                        		    	Object exprKeyValue_row5__PAYMENT_ID = insertServices2.PAYMENT_ID ;
	                        		    	if(exprKeyValue_row5__PAYMENT_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_4 = true;
	                        		    	} else {
                        		    			row5HashKey.PAYMENT_ID = (int)(Integer) exprKeyValue_row5__PAYMENT_ID;
                        		    		}
                        		    		

								
		                        	row5HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_4) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row5.lookup( row5HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_4 || !tHash_Lookup_row5.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row5 != null && tHash_Lookup_row5.getCount(row5HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row5' and it contains more one result from keys :  row5.PAYMENT_ID = '" + row5HashKey.PAYMENT_ID + "'");
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
        
Var__tMap_4__Struct Var = Var__tMap_4;
Var.var1 = Numeric.sequence("s1",1,1);// ###############################
        // ###############################
        // # Output tables

insertServices3 = null;
InsertReject3 = null;

if(!rejectedInnerJoin_tMap_4 ) {

// # Output table : 'insertServices3'
insertServices3_tmp.CUSTOMER_ID = insertServices1.CUSTOMER_ID ;
insertServices3_tmp.OFFER_ID = insertServices1.OFFER_ID ;
insertServices3_tmp.CONTRACT_ID = insertServices1.CONTRACT_ID ;
insertServices3_tmp.PAYMENT_ID = insertServices1.PAYMENT_ID ;
insertServices3_tmp.SERVICE_ID = insertServices1.SERVICE_ID ;
insertServices3_tmp.CHURN_ID = insertServices1.CHURN_ID ;
insertServices3_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = insertServices1.AVG_MONTHLY_LONG_DISTANCE_CHARGES ;
insertServices3_tmp.AVG_MONTHLY_GB_DOWNLOAD = insertServices1.AVG_MONTHLY_GB_DOWNLOAD ;
insertServices3_tmp.MONTHLY_CHARGE = insertServices1.MONTHLY_CHARGE ;
insertServices3_tmp.TOTAL_REVENUE = insertServices1.TOTAL_REVENUE ;
insertServices3_tmp.TOTAL_CHARGES = insertServices1.TOTAL_CHARGES ;
insertServices3_tmp.TOTAL_REFUNDS = insertServices1.TOTAL_REFUNDS ;
insertServices3_tmp.TOTAL_EXTRA_DATA_CHARGES = insertServices1.TOTAL_EXTRA_DATA_CHARGES ;
insertServices3_tmp.TOTAL_LONG_DISTANCE_CHARGES = insertServices1.TOTAL_LONG_DISTANCE_CHARGES ;
insertServices3_tmp.TENURE_IN_MONTHS = insertServices1.TENURE_IN_MONTHS ;
insertServices3_tmp.LB_NOM_FICHIER = insertServices1.LB_NOM_FICHIER ;
insertServices3_tmp.DT_INSERTION = insertServices1.DT_INSERTION ;
insertServices3_tmp.LB_JOB_NAME = insertServices1.LB_JOB_NAME ;
insertServices3 = insertServices3_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertReject3'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
InsertReject3_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("cheminFichier")) ;
InsertReject3_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier"));
InsertReject3_tmp.NUM_LIGNE_REJET = Var.var1 ;
InsertReject3_tmp.LB_LIGNE_REJET = insertServices2.CUSTOMER_ID + "|" + insertServices2.OFFER_ID + "|" + insertServices2.CONTRACT_ID + "|" + insertServices2.PAYMENT_ID + "|" + insertServices2.SERVICE_ID + "|" + insertServices2.CHURN_ID + "|" + insertServices2.AVG_MONTHLY_LONG_DISTANCE_CHARGES + "|" + insertServices2.AVG_MONTHLY_GB_DOWNLOAD + "|" + insertServices2.MONTHLY_CHARGE + "|" + insertServices2.TOTAL_REVENUE + "|" + insertServices2.TOTAL_CHARGES  + "|" + insertServices2.TOTAL_REFUNDS  + "|" + insertServices2.TOTAL_EXTRA_DATA_CHARGES + "|" +  insertServices2.TOTAL_LONG_DISTANCE_CHARGES + "|" +  insertServices2.TENURE_IN_MONTHS  + "|" + insertServices2.LB_NOM_FICHIER  + "|" + insertServices2.DT_INSERTION  + "|" + insertServices2.LB_JOB_NAME ;
InsertReject3_tmp.LB_MESSAGE_REJET = "Relation Violation WITH LOCATION_DIM ==>" + insertServices2.PAYMENT_ID + " don't exist in LOCATION_DIM Table" ;
InsertReject3_tmp.LB_NOM_FLUX = ((String)globalMap.get("nomFlux")) ;
InsertReject3_tmp.DT_REJET = TalendDate.getCurrentDate() ;
InsertReject3_tmp.LB_JOB_NAME = jobName;
InsertReject3 = InsertReject3_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "insertServices3"
if(insertServices3 != null) { 



	
	/**
	 * [tMap_5 main ] start
	 */

	

	
	
	currentComponent="tMap_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertServices3"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_5 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_5 = false;
		  boolean mainRowRejected_tMap_5 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row6" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow6 = false;
       		  	    	
       		  	    	
 							row6Struct row6ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_5) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_5 = false;
								
	                        		    	Object exprKeyValue_row6__OFFER_ID = insertServices3.OFFER_ID ;
	                        		    	if(exprKeyValue_row6__OFFER_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_5 = true;
	                        		    	} else {
                        		    			row6HashKey.OFFER_ID = (int)(Integer) exprKeyValue_row6__OFFER_ID;
                        		    		}
                        		    		

								
		                        	row6HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_5) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row6.lookup( row6HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_5 || !tHash_Lookup_row6.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_5 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row6 != null && tHash_Lookup_row6.getCount(row6HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row6' and it contains more one result from keys :  row6.OFFER_ID = '" + row6HashKey.OFFER_ID + "'");
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
        
Var__tMap_5__Struct Var = Var__tMap_5;
Var.var1 = Numeric.sequence("s1",1,1);// ###############################
        // ###############################
        // # Output tables

insertServices4 = null;
InsertReject4 = null;

if(!rejectedInnerJoin_tMap_5 ) {

// # Output table : 'insertServices4'
insertServices4_tmp.CUSTOMER_ID = insertServices3.CUSTOMER_ID ;
insertServices4_tmp.OFFER_ID = insertServices3.OFFER_ID ;
insertServices4_tmp.CONTRACT_ID = insertServices3.CONTRACT_ID ;
insertServices4_tmp.PAYMENT_ID = insertServices3.PAYMENT_ID ;
insertServices4_tmp.SERVICE_ID = insertServices3.SERVICE_ID ;
insertServices4_tmp.CHURN_ID = insertServices3.CHURN_ID ;
insertServices4_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = insertServices3.AVG_MONTHLY_LONG_DISTANCE_CHARGES ;
insertServices4_tmp.AVG_MONTHLY_GB_DOWNLOAD = insertServices3.AVG_MONTHLY_GB_DOWNLOAD ;
insertServices4_tmp.MONTHLY_CHARGE = insertServices3.MONTHLY_CHARGE ;
insertServices4_tmp.TOTAL_REVENUE = insertServices3.TOTAL_REVENUE ;
insertServices4_tmp.TOTAL_CHARGES = insertServices3.TOTAL_CHARGES ;
insertServices4_tmp.TOTAL_REFUNDS = insertServices3.TOTAL_REFUNDS ;
insertServices4_tmp.TOTAL_EXTRA_DATA_CHARGES = insertServices3.TOTAL_EXTRA_DATA_CHARGES ;
insertServices4_tmp.TOTAL_LONG_DISTANCE_CHARGES = insertServices3.TOTAL_LONG_DISTANCE_CHARGES ;
insertServices4_tmp.TENURE_IN_MONTHS = insertServices3.TENURE_IN_MONTHS ;
insertServices4_tmp.LB_NOM_FICHIER = insertServices3.LB_NOM_FICHIER ;
insertServices4_tmp.DT_INSERTION = insertServices3.DT_INSERTION ;
insertServices4_tmp.LB_JOB_NAME = insertServices3.LB_JOB_NAME ;
insertServices4 = insertServices4_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertReject4'
// # Filter conditions 
if( rejectedInnerJoin_tMap_5 ) {
InsertReject4_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("cheminFichier")) ;
InsertReject4_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier"));
InsertReject4_tmp.NUM_LIGNE_REJET = Var.var1 ;
InsertReject4_tmp.LB_LIGNE_REJET = insertServices3.CUSTOMER_ID + "|" + insertServices3.OFFER_ID + "|" + insertServices3.CONTRACT_ID + "|" + insertServices3.PAYMENT_ID + "|" + insertServices3.SERVICE_ID + "|" + insertServices3.CHURN_ID + "|" + insertServices3.AVG_MONTHLY_LONG_DISTANCE_CHARGES + "|" + insertServices3.AVG_MONTHLY_GB_DOWNLOAD + "|" + insertServices3.MONTHLY_CHARGE + "|" + insertServices3.TOTAL_REVENUE + "|" + insertServices3.TOTAL_CHARGES  + "|" + insertServices3.TOTAL_REFUNDS  + "|" + insertServices3.TOTAL_EXTRA_DATA_CHARGES + "|" +  insertServices3.TOTAL_LONG_DISTANCE_CHARGES + "|" +  insertServices3.TENURE_IN_MONTHS  + "|" + insertServices3.LB_NOM_FICHIER  + "|" + insertServices3.DT_INSERTION  + "|" + insertServices3.LB_JOB_NAME ;
InsertReject4_tmp.LB_MESSAGE_REJET = "Relation Violation WITH LOCATION_DIM ==>" + insertServices3.OFFER_ID + " don't exist in LOCATION_DIM Table" ;
InsertReject4_tmp.LB_NOM_FLUX = ((String)globalMap.get("nomFlux")) ;
InsertReject4_tmp.DT_REJET = TalendDate.getCurrentDate() ;
InsertReject4_tmp.LB_JOB_NAME = jobName;
InsertReject4 = InsertReject4_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_5 = false;










 


	tos_count_tMap_5++;

/**
 * [tMap_5 main ] stop
 */
	
	/**
	 * [tMap_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_begin ] stop
 */
// Start of branch "insertServices4"
if(insertServices4 != null) { 



	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertServices4"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6 = false;
		  boolean mainRowRejected_tMap_6 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row7" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow7 = false;
       		  	    	
       		  	    	
 							row7Struct row7ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_6) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_6 = false;
								
	                        		    	Object exprKeyValue_row7__SERVICE_ID = insertServices4.SERVICE_ID ;
	                        		    	if(exprKeyValue_row7__SERVICE_ID == null) {
	                        		    		hasCasePrimitiveKeyWithNull_tMap_6 = true;
	                        		    	} else {
                        		    			row7HashKey.SERVICE_ID = (int)(Integer) exprKeyValue_row7__SERVICE_ID;
                        		    		}
                        		    		

								
		                        	row7HashKey.hashCodeDirty = true;
                        		
	  					
	  							
	
		  							if(!hasCasePrimitiveKeyWithNull_tMap_6) { // G_TM_M_091
		  							
			  					
			  					
			  					
	  					
		  							tHash_Lookup_row7.lookup( row7HashKey );

	  							

	  							

			  						} // G_TM_M_091
			  						
			  					

 								
								  
								  if(hasCasePrimitiveKeyWithNull_tMap_6 || !tHash_Lookup_row7.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_6 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row7 != null && tHash_Lookup_row7.getCount(row7HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row7' and it contains more one result from keys :  row7.SERVICE_ID = '" + row7HashKey.SERVICE_ID + "'");
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
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6__Struct Var = Var__tMap_6;
Var.var1 = Numeric.sequence("s1",1,1);// ###############################
        // ###############################
        // # Output tables

insertServices5 = null;
InsertReject5 = null;

if(!rejectedInnerJoin_tMap_6 ) {

// # Output table : 'insertServices5'
insertServices5_tmp.CUSTOMER_ID = insertServices4.CUSTOMER_ID ;
insertServices5_tmp.OFFER_ID = insertServices4.OFFER_ID ;
insertServices5_tmp.CONTRACT_ID = insertServices4.CONTRACT_ID ;
insertServices5_tmp.PAYMENT_ID = insertServices4.PAYMENT_ID ;
insertServices5_tmp.SERVICE_ID = insertServices4.SERVICE_ID ;
insertServices5_tmp.CHURN_ID = insertServices4.CHURN_ID ;
insertServices5_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = insertServices4.AVG_MONTHLY_LONG_DISTANCE_CHARGES ;
insertServices5_tmp.AVG_MONTHLY_GB_DOWNLOAD = insertServices4.AVG_MONTHLY_GB_DOWNLOAD ;
insertServices5_tmp.MONTHLY_CHARGE = insertServices4.MONTHLY_CHARGE ;
insertServices5_tmp.TOTAL_REVENUE = insertServices4.TOTAL_REVENUE ;
insertServices5_tmp.TOTAL_CHARGES = insertServices4.TOTAL_CHARGES ;
insertServices5_tmp.TOTAL_REFUNDS = insertServices4.TOTAL_REFUNDS ;
insertServices5_tmp.TOTAL_EXTRA_DATA_CHARGES = insertServices4.TOTAL_EXTRA_DATA_CHARGES ;
insertServices5_tmp.TOTAL_LONG_DISTANCE_CHARGES = insertServices4.TOTAL_LONG_DISTANCE_CHARGES ;
insertServices5_tmp.TENURE_IN_MONTHS = insertServices4.TENURE_IN_MONTHS ;
insertServices5_tmp.LB_NOM_FICHIER = insertServices4.LB_NOM_FICHIER ;
insertServices5_tmp.DT_INSERTION = insertServices4.DT_INSERTION ;
insertServices5_tmp.LB_JOB_NAME = insertServices4.LB_JOB_NAME ;
insertServices5 = insertServices5_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertReject5'
// # Filter conditions 
if( rejectedInnerJoin_tMap_6 ) {
InsertReject5_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("cheminFichier")) ;
InsertReject5_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier"));
InsertReject5_tmp.NUM_LIGNE_REJET = Var.var1 ;
InsertReject5_tmp.LB_LIGNE_REJET = insertServices4.CUSTOMER_ID + "|" + insertServices4.OFFER_ID + "|" + insertServices4.CONTRACT_ID + "|" + insertServices4.PAYMENT_ID + "|" + insertServices4.SERVICE_ID + "|" + insertServices4.CHURN_ID + "|" + insertServices4.AVG_MONTHLY_LONG_DISTANCE_CHARGES + "|" + insertServices4.AVG_MONTHLY_GB_DOWNLOAD + "|" + insertServices4.MONTHLY_CHARGE + "|" + insertServices4.TOTAL_REVENUE + "|" + insertServices4.TOTAL_CHARGES  + "|" + insertServices4.TOTAL_REFUNDS  + "|" + insertServices4.TOTAL_EXTRA_DATA_CHARGES + "|" +  insertServices4.TOTAL_LONG_DISTANCE_CHARGES + "|" +  insertServices4.TENURE_IN_MONTHS  + "|" + insertServices4.LB_NOM_FICHIER  + "|" + insertServices4.DT_INSERTION  + "|" + insertServices4.LB_JOB_NAME ;
InsertReject5_tmp.LB_MESSAGE_REJET = "Relation Violation WITH LOCATION_DIM ==>" + insertServices4.CUSTOMER_ID + " don't exist in LOCATION_DIM Table" ;
InsertReject5_tmp.LB_NOM_FLUX = ((String)globalMap.get("nomFlux")) ;
InsertReject5_tmp.DT_REJET = TalendDate.getCurrentDate() ;
InsertReject5_tmp.LB_JOB_NAME = jobName;
InsertReject5 = InsertReject5_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6 = false;










 


	tos_count_tMap_6++;

/**
 * [tMap_6 main ] stop
 */
	
	/**
	 * [tMap_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_begin ] stop
 */
// Start of branch "insertServices5"
if(insertServices5 != null) { 



	
	/**
	 * [tMap_7 main ] start
	 */

	

	
	
	currentComponent="tMap_7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertServices5"
						
						);
					}
					

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_7 = false;
		

        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_7 = false;
		  boolean mainRowRejected_tMap_7 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "row8" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLooprow8 = false;
       		  	    	
       		  	    	
 							row8Struct row8ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_7) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_7 = false;
								
                        		    		    row8HashKey.CUSTOMER_ID = insertServices5.CUSTOMER_ID ;
                        		    		

								
		                        	row8HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_row8.lookup( row8HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_row8.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_7 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_row8 != null && tHash_Lookup_row8.getCount(row8HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'row8' and it contains more one result from keys :  row8.CUSTOMER_ID = '" + row8HashKey.CUSTOMER_ID + "'");
								} // G 071
							

							row8Struct row8 = null;
                    		  	 
							   
                    		  	 
	       		  	    	row8Struct fromLookup_row8 = null;
							row8 = row8Default;
										 
							
								 
							
							
								if (tHash_Lookup_row8 !=null && tHash_Lookup_row8.hasNext()) { // G 099
								
							
								
								fromLookup_row8 = tHash_Lookup_row8.next();

							
							
								} // G 099
							
							

							if(fromLookup_row8 != null) {
								row8 = fromLookup_row8;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_7__Struct Var = Var__tMap_7;
Var.var1 = Numeric.sequence("s1",1,1);// ###############################
        // ###############################
        // # Output tables

insertNewElements = null;
InsertReject6 = null;

if(!rejectedInnerJoin_tMap_7 ) {

// # Output table : 'insertNewElements'
insertNewElements_tmp.CUSTOMER_ID = insertServices5.CUSTOMER_ID ;
insertNewElements_tmp.OFFER_ID = insertServices5.OFFER_ID ;
insertNewElements_tmp.CONTRACT_ID = insertServices5.CONTRACT_ID ;
insertNewElements_tmp.PAYMENT_ID = insertServices5.PAYMENT_ID ;
insertNewElements_tmp.SERVICE_ID = insertServices5.SERVICE_ID ;
insertNewElements_tmp.CHURN_ID = insertServices5.CHURN_ID ;
insertNewElements_tmp.AVG_MONTHLY_LONG_DISTANCE_CHARGES = insertServices5.AVG_MONTHLY_LONG_DISTANCE_CHARGES ;
insertNewElements_tmp.AVG_MONTHLY_GB_DOWNLOAD = insertServices5.AVG_MONTHLY_GB_DOWNLOAD ;
insertNewElements_tmp.MONTHLY_CHARGE = insertServices5.MONTHLY_CHARGE ;
insertNewElements_tmp.TOTAL_REVENUE = insertServices5.TOTAL_REVENUE ;
insertNewElements_tmp.TOTAL_CHARGES = insertServices5.TOTAL_CHARGES ;
insertNewElements_tmp.TOTAL_REFUNDS = insertServices5.TOTAL_REFUNDS ;
insertNewElements_tmp.TOTAL_EXTRA_DATA_CHARGES = insertServices5.TOTAL_EXTRA_DATA_CHARGES ;
insertNewElements_tmp.TOTAL_LONG_DISTANCE_CHARGES = insertServices5.TOTAL_LONG_DISTANCE_CHARGES ;
insertNewElements_tmp.TENURE_IN_MONTHS = insertServices5.TENURE_IN_MONTHS ;
insertNewElements_tmp.LB_NOM_FICHIER = insertServices5.LB_NOM_FICHIER ;
insertNewElements_tmp.DT_INSERTION = insertServices5.DT_INSERTION ;
insertNewElements_tmp.LB_JOB_NAME = insertServices5.LB_JOB_NAME ;
insertNewElements = insertNewElements_tmp;
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'InsertReject6'
// # Filter conditions 
if( rejectedInnerJoin_tMap_7 ) {
InsertReject6_tmp.LB_CHEMIN_FICHIER = ((String)globalMap.get("cheminFichier")) ;
InsertReject6_tmp.LB_NOM_FICHIER = ((String)globalMap.get("nomFichier"));
InsertReject6_tmp.NUM_LIGNE_REJET = Var.var1 ;
InsertReject6_tmp.LB_LIGNE_REJET = insertServices5.CUSTOMER_ID + "|" + insertServices5.OFFER_ID + "|" + insertServices5.CONTRACT_ID + "|" + insertServices5.PAYMENT_ID + "|" + insertServices5.SERVICE_ID + "|" + insertServices5.CHURN_ID + "|" + insertServices5.AVG_MONTHLY_LONG_DISTANCE_CHARGES + "|" + insertServices5.AVG_MONTHLY_GB_DOWNLOAD + "|" + insertServices5.MONTHLY_CHARGE + "|" + insertServices5.TOTAL_REVENUE + "|" + insertServices5.TOTAL_CHARGES  + "|" + insertServices5.TOTAL_REFUNDS  + "|" + insertServices5.TOTAL_EXTRA_DATA_CHARGES + "|" +  insertServices5.TOTAL_LONG_DISTANCE_CHARGES + "|" +  insertServices5.TENURE_IN_MONTHS  + "|" + insertServices5.LB_NOM_FICHIER  + "|" + insertServices5.DT_INSERTION  + "|" + insertServices5.LB_JOB_NAME ;
InsertReject6_tmp.LB_MESSAGE_REJET = "Relation Violation WITH LOCATION_DIM ==>" + insertServices5.CUSTOMER_ID + " don't exist in LOCATION_DIM Table" ;
InsertReject6_tmp.LB_NOM_FLUX = ((String)globalMap.get("nomFlux")) ;
InsertReject6_tmp.DT_REJET = TalendDate.getCurrentDate() ;
InsertReject6_tmp.LB_JOB_NAME = jobName;
InsertReject6 = InsertReject6_tmp;
} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_7 = false;










 


	tos_count_tMap_7++;

/**
 * [tMap_7 main ] stop
 */
	
	/**
	 * [tMap_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_begin ] stop
 */
// Start of branch "insertNewElements"
if(insertNewElements != null) { 



	
	/**
	 * [tDBOutput_7 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"insertNewElements"
						
						);
					}
					



        whetherReject_tDBOutput_7 = false;
                    if(insertNewElements.CUSTOMER_ID == null) {
pstmt_tDBOutput_7.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_7.setString(1, insertNewElements.CUSTOMER_ID);
}

                    pstmt_tDBOutput_7.setInt(2, insertNewElements.OFFER_ID);

                    pstmt_tDBOutput_7.setInt(3, insertNewElements.CONTRACT_ID);

                    pstmt_tDBOutput_7.setInt(4, insertNewElements.PAYMENT_ID);

                    pstmt_tDBOutput_7.setInt(5, insertNewElements.SERVICE_ID);

                    pstmt_tDBOutput_7.setInt(6, insertNewElements.CHURN_ID);

            int checkCount_tDBOutput_7 = -1;
            try (java.sql.ResultSet rs_tDBOutput_7 = pstmt_tDBOutput_7.executeQuery()) {
                while(rs_tDBOutput_7.next()) {
                    checkCount_tDBOutput_7 = rs_tDBOutput_7.getInt(1);
                }
            }
            if(checkCount_tDBOutput_7 > 0) {
                        if(insertNewElements.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
pstmtUpdate_tDBOutput_7.setNull(1, java.sql.Types.FLOAT);
} else {pstmtUpdate_tDBOutput_7.setFloat(1, insertNewElements.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
}

                        if(insertNewElements.AVG_MONTHLY_GB_DOWNLOAD == null) {
pstmtUpdate_tDBOutput_7.setNull(2, java.sql.Types.FLOAT);
} else {pstmtUpdate_tDBOutput_7.setFloat(2, insertNewElements.AVG_MONTHLY_GB_DOWNLOAD);
}

                        pstmtUpdate_tDBOutput_7.setFloat(3, insertNewElements.MONTHLY_CHARGE);

                        pstmtUpdate_tDBOutput_7.setFloat(4, insertNewElements.TOTAL_REVENUE);

                        pstmtUpdate_tDBOutput_7.setFloat(5, insertNewElements.TOTAL_CHARGES);

                        pstmtUpdate_tDBOutput_7.setFloat(6, insertNewElements.TOTAL_REFUNDS);

                        pstmtUpdate_tDBOutput_7.setFloat(7, insertNewElements.TOTAL_EXTRA_DATA_CHARGES);

                        pstmtUpdate_tDBOutput_7.setFloat(8, insertNewElements.TOTAL_LONG_DISTANCE_CHARGES);

                        pstmtUpdate_tDBOutput_7.setInt(9, insertNewElements.TENURE_IN_MONTHS);

                        if(insertNewElements.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_7.setNull(10, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_7.setString(10, insertNewElements.LB_NOM_FICHIER);
}

                        if(insertNewElements.DT_INSERTION != null) {
pstmtUpdate_tDBOutput_7.setTimestamp(11, new java.sql.Timestamp(insertNewElements.DT_INSERTION.getTime()));
} else {
pstmtUpdate_tDBOutput_7.setNull(11, java.sql.Types.TIMESTAMP);
}

                        if(insertNewElements.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_7.setNull(12, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_7.setString(12, insertNewElements.LB_JOB_NAME);
}

                        if(insertNewElements.CUSTOMER_ID == null) {
pstmtUpdate_tDBOutput_7.setNull(13 + count_tDBOutput_7, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_7.setString(13 + count_tDBOutput_7, insertNewElements.CUSTOMER_ID);
}

                        pstmtUpdate_tDBOutput_7.setInt(14 + count_tDBOutput_7, insertNewElements.OFFER_ID);

                        pstmtUpdate_tDBOutput_7.setInt(15 + count_tDBOutput_7, insertNewElements.CONTRACT_ID);

                        pstmtUpdate_tDBOutput_7.setInt(16 + count_tDBOutput_7, insertNewElements.PAYMENT_ID);

                        pstmtUpdate_tDBOutput_7.setInt(17 + count_tDBOutput_7, insertNewElements.SERVICE_ID);

                        pstmtUpdate_tDBOutput_7.setInt(18 + count_tDBOutput_7, insertNewElements.CHURN_ID);

                try {
					
                    int processedCount_tDBOutput_7 = pstmtUpdate_tDBOutput_7.executeUpdate();
                    updatedCount_tDBOutput_7 += processedCount_tDBOutput_7;
                    rowsToCommitCount_tDBOutput_7 += processedCount_tDBOutput_7;
                    nb_line_tDBOutput_7++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_7_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_7 = true;
                        nb_line_tDBOutput_7++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(insertNewElements.CUSTOMER_ID == null) {
pstmtInsert_tDBOutput_7.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_7.setString(1, insertNewElements.CUSTOMER_ID);
}

                        pstmtInsert_tDBOutput_7.setInt(2, insertNewElements.OFFER_ID);

                        pstmtInsert_tDBOutput_7.setInt(3, insertNewElements.CONTRACT_ID);

                        pstmtInsert_tDBOutput_7.setInt(4, insertNewElements.PAYMENT_ID);

                        pstmtInsert_tDBOutput_7.setInt(5, insertNewElements.SERVICE_ID);

                        pstmtInsert_tDBOutput_7.setInt(6, insertNewElements.CHURN_ID);

                        if(insertNewElements.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
pstmtInsert_tDBOutput_7.setNull(7, java.sql.Types.FLOAT);
} else {pstmtInsert_tDBOutput_7.setFloat(7, insertNewElements.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
}

                        if(insertNewElements.AVG_MONTHLY_GB_DOWNLOAD == null) {
pstmtInsert_tDBOutput_7.setNull(8, java.sql.Types.FLOAT);
} else {pstmtInsert_tDBOutput_7.setFloat(8, insertNewElements.AVG_MONTHLY_GB_DOWNLOAD);
}

                        pstmtInsert_tDBOutput_7.setFloat(9, insertNewElements.MONTHLY_CHARGE);

                        pstmtInsert_tDBOutput_7.setFloat(10, insertNewElements.TOTAL_REVENUE);

                        pstmtInsert_tDBOutput_7.setFloat(11, insertNewElements.TOTAL_CHARGES);

                        pstmtInsert_tDBOutput_7.setFloat(12, insertNewElements.TOTAL_REFUNDS);

                        pstmtInsert_tDBOutput_7.setFloat(13, insertNewElements.TOTAL_EXTRA_DATA_CHARGES);

                        pstmtInsert_tDBOutput_7.setFloat(14, insertNewElements.TOTAL_LONG_DISTANCE_CHARGES);

                        pstmtInsert_tDBOutput_7.setInt(15, insertNewElements.TENURE_IN_MONTHS);

                        if(insertNewElements.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_7.setNull(16, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_7.setString(16, insertNewElements.LB_NOM_FICHIER);
}

                        if(insertNewElements.DT_INSERTION != null) {
pstmtInsert_tDBOutput_7.setTimestamp(17, new java.sql.Timestamp(insertNewElements.DT_INSERTION.getTime()));
} else {
pstmtInsert_tDBOutput_7.setNull(17, java.sql.Types.TIMESTAMP);
}

                        if(insertNewElements.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_7.setNull(18, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_7.setString(18, insertNewElements.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_7 = pstmtInsert_tDBOutput_7.executeUpdate();
                    insertedCount_tDBOutput_7 += processedCount_tDBOutput_7;
                    rowsToCommitCount_tDBOutput_7 += processedCount_tDBOutput_7;
                    nb_line_tDBOutput_7++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_7_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_7 = true;
                        nb_line_tDBOutput_7++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_7++;
                if(commitEvery_tDBOutput_7 <= commitCounter_tDBOutput_7) {
                    if(rowsToCommitCount_tDBOutput_7 != 0){
                    	
                    }
                    conn_tDBOutput_7.commit();
                    if(rowsToCommitCount_tDBOutput_7 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_7 = 0;
                    }
                    commitCounter_tDBOutput_7=0;
                }

 


	tos_count_tDBOutput_7++;

/**
 * [tDBOutput_7 main ] stop
 */
	
	/**
	 * [tDBOutput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	

 



/**
 * [tDBOutput_7 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	

 



/**
 * [tDBOutput_7 process_data_end ] stop
 */

} // End of branch "insertNewElements"




// Start of branch "InsertReject6"
if(InsertReject6 != null) { 



	
	/**
	 * [tDBOutput_6 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject6"
						
						);
					}
					



        whetherReject_tDBOutput_6 = false;
                    if(InsertReject6.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_6.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(1, InsertReject6.LB_CHEMIN_FICHIER);
}

                    if(InsertReject6.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_6.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(2, InsertReject6.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_6.setInt(3, InsertReject6.NUM_LIGNE_REJET);

                    if(InsertReject6.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_6.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_6.setString(4, InsertReject6.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_6 = -1;
            try (java.sql.ResultSet rs_tDBOutput_6 = pstmt_tDBOutput_6.executeQuery()) {
                while(rs_tDBOutput_6.next()) {
                    checkCount_tDBOutput_6 = rs_tDBOutput_6.getInt(1);
                }
            }
            if(checkCount_tDBOutput_6 > 0) {
                        if(InsertReject6.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_6.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_6.setString(1, InsertReject6.LB_MESSAGE_REJET);
}

                        if(InsertReject6.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_6.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_6.setString(2, InsertReject6.LB_NOM_FLUX);
}

                        if(InsertReject6.DT_REJET != null) {
pstmtUpdate_tDBOutput_6.setTimestamp(3, new java.sql.Timestamp(InsertReject6.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_6.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject6.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_6.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_6.setString(4, InsertReject6.LB_JOB_NAME);
}

                        if(InsertReject6.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_6.setNull(5 + count_tDBOutput_6, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_6.setString(5 + count_tDBOutput_6, InsertReject6.LB_CHEMIN_FICHIER);
}

                        if(InsertReject6.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_6.setNull(6 + count_tDBOutput_6, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_6.setString(6 + count_tDBOutput_6, InsertReject6.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_6.setInt(7 + count_tDBOutput_6, InsertReject6.NUM_LIGNE_REJET);

                        if(InsertReject6.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_6.setNull(8 + count_tDBOutput_6, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_6.setString(8 + count_tDBOutput_6, InsertReject6.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_6 = pstmtUpdate_tDBOutput_6.executeUpdate();
                    updatedCount_tDBOutput_6 += processedCount_tDBOutput_6;
                    rowsToCommitCount_tDBOutput_6 += processedCount_tDBOutput_6;
                    nb_line_tDBOutput_6++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_6_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_6 = true;
                        nb_line_tDBOutput_6++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(InsertReject6.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_6.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_6.setString(1, InsertReject6.LB_CHEMIN_FICHIER);
}

                        if(InsertReject6.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_6.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_6.setString(2, InsertReject6.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_6.setInt(3, InsertReject6.NUM_LIGNE_REJET);

                        if(InsertReject6.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_6.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_6.setString(4, InsertReject6.LB_LIGNE_REJET);
}

                        if(InsertReject6.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_6.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_6.setString(5, InsertReject6.LB_MESSAGE_REJET);
}

                        if(InsertReject6.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_6.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_6.setString(6, InsertReject6.LB_NOM_FLUX);
}

                        if(InsertReject6.DT_REJET != null) {
pstmtInsert_tDBOutput_6.setTimestamp(7, new java.sql.Timestamp(InsertReject6.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_6.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject6.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_6.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_6.setString(8, InsertReject6.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_6 = pstmtInsert_tDBOutput_6.executeUpdate();
                    insertedCount_tDBOutput_6 += processedCount_tDBOutput_6;
                    rowsToCommitCount_tDBOutput_6 += processedCount_tDBOutput_6;
                    nb_line_tDBOutput_6++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_6_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_6 = true;
                        nb_line_tDBOutput_6++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_6++;
                if(commitEvery_tDBOutput_6 <= commitCounter_tDBOutput_6) {
                    if(rowsToCommitCount_tDBOutput_6 != 0){
                    	
                    }
                    conn_tDBOutput_6.commit();
                    if(rowsToCommitCount_tDBOutput_6 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_6 = 0;
                    }
                    commitCounter_tDBOutput_6=0;
                }

 


	tos_count_tDBOutput_6++;

/**
 * [tDBOutput_6 main ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	

 



/**
 * [tDBOutput_6 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	

 



/**
 * [tDBOutput_6 process_data_end ] stop
 */

} // End of branch "InsertReject6"




	
	/**
	 * [tMap_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 process_data_end ] stop
 */

} // End of branch "insertServices5"




// Start of branch "InsertReject5"
if(InsertReject5 != null) { 



	
	/**
	 * [tDBOutput_5 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject5"
						
						);
					}
					



        whetherReject_tDBOutput_5 = false;
                    if(InsertReject5.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(1, InsertReject5.LB_CHEMIN_FICHIER);
}

                    if(InsertReject5.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(2, InsertReject5.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_5.setInt(3, InsertReject5.NUM_LIGNE_REJET);

                    if(InsertReject5.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_5.setString(4, InsertReject5.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_5 = -1;
            try (java.sql.ResultSet rs_tDBOutput_5 = pstmt_tDBOutput_5.executeQuery()) {
                while(rs_tDBOutput_5.next()) {
                    checkCount_tDBOutput_5 = rs_tDBOutput_5.getInt(1);
                }
            }
            if(checkCount_tDBOutput_5 > 0) {
                        if(InsertReject5.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(1, InsertReject5.LB_MESSAGE_REJET);
}

                        if(InsertReject5.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(2, InsertReject5.LB_NOM_FLUX);
}

                        if(InsertReject5.DT_REJET != null) {
pstmtUpdate_tDBOutput_5.setTimestamp(3, new java.sql.Timestamp(InsertReject5.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_5.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject5.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(4, InsertReject5.LB_JOB_NAME);
}

                        if(InsertReject5.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_5.setNull(5 + count_tDBOutput_5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(5 + count_tDBOutput_5, InsertReject5.LB_CHEMIN_FICHIER);
}

                        if(InsertReject5.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_5.setNull(6 + count_tDBOutput_5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(6 + count_tDBOutput_5, InsertReject5.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_5.setInt(7 + count_tDBOutput_5, InsertReject5.NUM_LIGNE_REJET);

                        if(InsertReject5.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_5.setNull(8 + count_tDBOutput_5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_5.setString(8 + count_tDBOutput_5, InsertReject5.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_5 = pstmtUpdate_tDBOutput_5.executeUpdate();
                    updatedCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    rowsToCommitCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    nb_line_tDBOutput_5++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_5 = true;
                        nb_line_tDBOutput_5++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(InsertReject5.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(1, InsertReject5.LB_CHEMIN_FICHIER);
}

                        if(InsertReject5.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(2, InsertReject5.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_5.setInt(3, InsertReject5.NUM_LIGNE_REJET);

                        if(InsertReject5.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_5.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(4, InsertReject5.LB_LIGNE_REJET);
}

                        if(InsertReject5.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_5.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(5, InsertReject5.LB_MESSAGE_REJET);
}

                        if(InsertReject5.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_5.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(6, InsertReject5.LB_NOM_FLUX);
}

                        if(InsertReject5.DT_REJET != null) {
pstmtInsert_tDBOutput_5.setTimestamp(7, new java.sql.Timestamp(InsertReject5.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_5.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject5.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_5.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_5.setString(8, InsertReject5.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_5 = pstmtInsert_tDBOutput_5.executeUpdate();
                    insertedCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    rowsToCommitCount_tDBOutput_5 += processedCount_tDBOutput_5;
                    nb_line_tDBOutput_5++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_5_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_5 = true;
                        nb_line_tDBOutput_5++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_5++;
                if(commitEvery_tDBOutput_5 <= commitCounter_tDBOutput_5) {
                    if(rowsToCommitCount_tDBOutput_5 != 0){
                    	
                    }
                    conn_tDBOutput_5.commit();
                    if(rowsToCommitCount_tDBOutput_5 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_5 = 0;
                    }
                    commitCounter_tDBOutput_5=0;
                }

 


	tos_count_tDBOutput_5++;

/**
 * [tDBOutput_5 main ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	

 



/**
 * [tDBOutput_5 process_data_end ] stop
 */

} // End of branch "InsertReject5"




	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_end ] stop
 */

} // End of branch "insertServices4"




// Start of branch "InsertReject4"
if(InsertReject4 != null) { 



	
	/**
	 * [tDBOutput_4 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject4"
						
						);
					}
					



        whetherReject_tDBOutput_4 = false;
                    if(InsertReject4.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(1, InsertReject4.LB_CHEMIN_FICHIER);
}

                    if(InsertReject4.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(2, InsertReject4.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_4.setInt(3, InsertReject4.NUM_LIGNE_REJET);

                    if(InsertReject4.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_4.setString(4, InsertReject4.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_4 = -1;
            try (java.sql.ResultSet rs_tDBOutput_4 = pstmt_tDBOutput_4.executeQuery()) {
                while(rs_tDBOutput_4.next()) {
                    checkCount_tDBOutput_4 = rs_tDBOutput_4.getInt(1);
                }
            }
            if(checkCount_tDBOutput_4 > 0) {
                        if(InsertReject4.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(1, InsertReject4.LB_MESSAGE_REJET);
}

                        if(InsertReject4.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(2, InsertReject4.LB_NOM_FLUX);
}

                        if(InsertReject4.DT_REJET != null) {
pstmtUpdate_tDBOutput_4.setTimestamp(3, new java.sql.Timestamp(InsertReject4.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_4.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject4.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(4, InsertReject4.LB_JOB_NAME);
}

                        if(InsertReject4.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_4.setNull(5 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(5 + count_tDBOutput_4, InsertReject4.LB_CHEMIN_FICHIER);
}

                        if(InsertReject4.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_4.setNull(6 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(6 + count_tDBOutput_4, InsertReject4.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_4.setInt(7 + count_tDBOutput_4, InsertReject4.NUM_LIGNE_REJET);

                        if(InsertReject4.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_4.setNull(8 + count_tDBOutput_4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_4.setString(8 + count_tDBOutput_4, InsertReject4.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_4 = pstmtUpdate_tDBOutput_4.executeUpdate();
                    updatedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(InsertReject4.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_4.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(1, InsertReject4.LB_CHEMIN_FICHIER);
}

                        if(InsertReject4.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(2, InsertReject4.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_4.setInt(3, InsertReject4.NUM_LIGNE_REJET);

                        if(InsertReject4.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(4, InsertReject4.LB_LIGNE_REJET);
}

                        if(InsertReject4.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_4.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(5, InsertReject4.LB_MESSAGE_REJET);
}

                        if(InsertReject4.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_4.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(6, InsertReject4.LB_NOM_FLUX);
}

                        if(InsertReject4.DT_REJET != null) {
pstmtInsert_tDBOutput_4.setTimestamp(7, new java.sql.Timestamp(InsertReject4.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_4.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject4.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_4.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_4.setString(8, InsertReject4.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_4 = pstmtInsert_tDBOutput_4.executeUpdate();
                    insertedCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    rowsToCommitCount_tDBOutput_4 += processedCount_tDBOutput_4;
                    nb_line_tDBOutput_4++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_4_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_4 = true;
                        nb_line_tDBOutput_4++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_4++;
                if(commitEvery_tDBOutput_4 <= commitCounter_tDBOutput_4) {
                    if(rowsToCommitCount_tDBOutput_4 != 0){
                    	
                    }
                    conn_tDBOutput_4.commit();
                    if(rowsToCommitCount_tDBOutput_4 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_4 = 0;
                    }
                    commitCounter_tDBOutput_4=0;
                }

 


	tos_count_tDBOutput_4++;

/**
 * [tDBOutput_4 main ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	

 



/**
 * [tDBOutput_4 process_data_end ] stop
 */

} // End of branch "InsertReject4"




	
	/**
	 * [tMap_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 process_data_end ] stop
 */

} // End of branch "insertServices3"




// Start of branch "InsertReject3"
if(InsertReject3 != null) { 



	
	/**
	 * [tDBOutput_3 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject3"
						
						);
					}
					



        whetherReject_tDBOutput_3 = false;
                    if(InsertReject3.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(1, InsertReject3.LB_CHEMIN_FICHIER);
}

                    if(InsertReject3.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(2, InsertReject3.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_3.setInt(3, InsertReject3.NUM_LIGNE_REJET);

                    if(InsertReject3.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_3.setString(4, InsertReject3.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_3 = -1;
            try (java.sql.ResultSet rs_tDBOutput_3 = pstmt_tDBOutput_3.executeQuery()) {
                while(rs_tDBOutput_3.next()) {
                    checkCount_tDBOutput_3 = rs_tDBOutput_3.getInt(1);
                }
            }
            if(checkCount_tDBOutput_3 > 0) {
                        if(InsertReject3.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(1, InsertReject3.LB_MESSAGE_REJET);
}

                        if(InsertReject3.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(2, InsertReject3.LB_NOM_FLUX);
}

                        if(InsertReject3.DT_REJET != null) {
pstmtUpdate_tDBOutput_3.setTimestamp(3, new java.sql.Timestamp(InsertReject3.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_3.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject3.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(4, InsertReject3.LB_JOB_NAME);
}

                        if(InsertReject3.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_3.setNull(5 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(5 + count_tDBOutput_3, InsertReject3.LB_CHEMIN_FICHIER);
}

                        if(InsertReject3.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_3.setNull(6 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(6 + count_tDBOutput_3, InsertReject3.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_3.setInt(7 + count_tDBOutput_3, InsertReject3.NUM_LIGNE_REJET);

                        if(InsertReject3.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_3.setNull(8 + count_tDBOutput_3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_3.setString(8 + count_tDBOutput_3, InsertReject3.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_3 = pstmtUpdate_tDBOutput_3.executeUpdate();
                    updatedCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    rowsToCommitCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    nb_line_tDBOutput_3++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_3 = true;
                        nb_line_tDBOutput_3++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(InsertReject3.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(1, InsertReject3.LB_CHEMIN_FICHIER);
}

                        if(InsertReject3.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(2, InsertReject3.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_3.setInt(3, InsertReject3.NUM_LIGNE_REJET);

                        if(InsertReject3.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_3.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(4, InsertReject3.LB_LIGNE_REJET);
}

                        if(InsertReject3.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_3.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(5, InsertReject3.LB_MESSAGE_REJET);
}

                        if(InsertReject3.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_3.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(6, InsertReject3.LB_NOM_FLUX);
}

                        if(InsertReject3.DT_REJET != null) {
pstmtInsert_tDBOutput_3.setTimestamp(7, new java.sql.Timestamp(InsertReject3.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_3.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject3.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_3.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_3.setString(8, InsertReject3.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_3 = pstmtInsert_tDBOutput_3.executeUpdate();
                    insertedCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    rowsToCommitCount_tDBOutput_3 += processedCount_tDBOutput_3;
                    nb_line_tDBOutput_3++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_3_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_3 = true;
                        nb_line_tDBOutput_3++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_3++;
                if(commitEvery_tDBOutput_3 <= commitCounter_tDBOutput_3) {
                    if(rowsToCommitCount_tDBOutput_3 != 0){
                    	
                    }
                    conn_tDBOutput_3.commit();
                    if(rowsToCommitCount_tDBOutput_3 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_3 = 0;
                    }
                    commitCounter_tDBOutput_3=0;
                }

 


	tos_count_tDBOutput_3++;

/**
 * [tDBOutput_3 main ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	

 



/**
 * [tDBOutput_3 process_data_end ] stop
 */

} // End of branch "InsertReject3"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "insertServices2"




// Start of branch "InsertReject2"
if(InsertReject2 != null) { 



	
	/**
	 * [tDBOutput_2 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject2"
						
						);
					}
					



        whetherReject_tDBOutput_2 = false;
                    if(InsertReject2.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(1, InsertReject2.LB_CHEMIN_FICHIER);
}

                    if(InsertReject2.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(2, InsertReject2.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_2.setInt(3, InsertReject2.NUM_LIGNE_REJET);

                    if(InsertReject2.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_2.setString(4, InsertReject2.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_2 = -1;
            try (java.sql.ResultSet rs_tDBOutput_2 = pstmt_tDBOutput_2.executeQuery()) {
                while(rs_tDBOutput_2.next()) {
                    checkCount_tDBOutput_2 = rs_tDBOutput_2.getInt(1);
                }
            }
            if(checkCount_tDBOutput_2 > 0) {
                        if(InsertReject2.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_2.setString(1, InsertReject2.LB_MESSAGE_REJET);
}

                        if(InsertReject2.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_2.setString(2, InsertReject2.LB_NOM_FLUX);
}

                        if(InsertReject2.DT_REJET != null) {
pstmtUpdate_tDBOutput_2.setTimestamp(3, new java.sql.Timestamp(InsertReject2.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_2.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject2.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_2.setString(4, InsertReject2.LB_JOB_NAME);
}

                        if(InsertReject2.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_2.setNull(5 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_2.setString(5 + count_tDBOutput_2, InsertReject2.LB_CHEMIN_FICHIER);
}

                        if(InsertReject2.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_2.setNull(6 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_2.setString(6 + count_tDBOutput_2, InsertReject2.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_2.setInt(7 + count_tDBOutput_2, InsertReject2.NUM_LIGNE_REJET);

                        if(InsertReject2.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_2.setNull(8 + count_tDBOutput_2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_2.setString(8 + count_tDBOutput_2, InsertReject2.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_2 = pstmtUpdate_tDBOutput_2.executeUpdate();
                    updatedCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    rowsToCommitCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    nb_line_tDBOutput_2++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_2 = true;
                        nb_line_tDBOutput_2++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(InsertReject2.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_2.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_2.setString(1, InsertReject2.LB_CHEMIN_FICHIER);
}

                        if(InsertReject2.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_2.setString(2, InsertReject2.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_2.setInt(3, InsertReject2.NUM_LIGNE_REJET);

                        if(InsertReject2.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_2.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_2.setString(4, InsertReject2.LB_LIGNE_REJET);
}

                        if(InsertReject2.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_2.setString(5, InsertReject2.LB_MESSAGE_REJET);
}

                        if(InsertReject2.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_2.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_2.setString(6, InsertReject2.LB_NOM_FLUX);
}

                        if(InsertReject2.DT_REJET != null) {
pstmtInsert_tDBOutput_2.setTimestamp(7, new java.sql.Timestamp(InsertReject2.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_2.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject2.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_2.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_2.setString(8, InsertReject2.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_2 = pstmtInsert_tDBOutput_2.executeUpdate();
                    insertedCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    rowsToCommitCount_tDBOutput_2 += processedCount_tDBOutput_2;
                    nb_line_tDBOutput_2++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_2_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_2 = true;
                        nb_line_tDBOutput_2++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_2++;
                if(commitEvery_tDBOutput_2 <= commitCounter_tDBOutput_2) {
                    if(rowsToCommitCount_tDBOutput_2 != 0){
                    	
                    }
                    conn_tDBOutput_2.commit();
                    if(rowsToCommitCount_tDBOutput_2 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_2 = 0;
                    }
                    commitCounter_tDBOutput_2=0;
                }

 


	tos_count_tDBOutput_2++;

/**
 * [tDBOutput_2 main ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	

 



/**
 * [tDBOutput_2 process_data_end ] stop
 */

} // End of branch "InsertReject2"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */

} // End of branch "insertServices1"




// Start of branch "InsertReject"
if(InsertReject != null) { 



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"InsertReject"
						
						);
					}
					



        whetherReject_tDBOutput_1 = false;
                    if(InsertReject.LB_CHEMIN_FICHIER == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, InsertReject.LB_CHEMIN_FICHIER);
}

                    if(InsertReject.LB_NOM_FICHIER == null) {
pstmt_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(2, InsertReject.LB_NOM_FICHIER);
}

                    pstmt_tDBOutput_1.setInt(3, InsertReject.NUM_LIGNE_REJET);

                    if(InsertReject.LB_LIGNE_REJET == null) {
pstmt_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(4, InsertReject.LB_LIGNE_REJET);
}

            int checkCount_tDBOutput_1 = -1;
            try (java.sql.ResultSet rs_tDBOutput_1 = pstmt_tDBOutput_1.executeQuery()) {
                while(rs_tDBOutput_1.next()) {
                    checkCount_tDBOutput_1 = rs_tDBOutput_1.getInt(1);
                }
            }
            if(checkCount_tDBOutput_1 > 0) {
                        if(InsertReject.LB_MESSAGE_REJET == null) {
pstmtUpdate_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(1, InsertReject.LB_MESSAGE_REJET);
}

                        if(InsertReject.LB_NOM_FLUX == null) {
pstmtUpdate_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(2, InsertReject.LB_NOM_FLUX);
}

                        if(InsertReject.DT_REJET != null) {
pstmtUpdate_tDBOutput_1.setTimestamp(3, new java.sql.Timestamp(InsertReject.DT_REJET.getTime()));
} else {
pstmtUpdate_tDBOutput_1.setNull(3, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject.LB_JOB_NAME == null) {
pstmtUpdate_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(4, InsertReject.LB_JOB_NAME);
}

                        if(InsertReject.LB_CHEMIN_FICHIER == null) {
pstmtUpdate_tDBOutput_1.setNull(5 + count_tDBOutput_1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(5 + count_tDBOutput_1, InsertReject.LB_CHEMIN_FICHIER);
}

                        if(InsertReject.LB_NOM_FICHIER == null) {
pstmtUpdate_tDBOutput_1.setNull(6 + count_tDBOutput_1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(6 + count_tDBOutput_1, InsertReject.LB_NOM_FICHIER);
}

                        pstmtUpdate_tDBOutput_1.setInt(7 + count_tDBOutput_1, InsertReject.NUM_LIGNE_REJET);

                        if(InsertReject.LB_LIGNE_REJET == null) {
pstmtUpdate_tDBOutput_1.setNull(8 + count_tDBOutput_1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(8 + count_tDBOutput_1, InsertReject.LB_LIGNE_REJET);
}

                try {
					
                    int processedCount_tDBOutput_1 = pstmtUpdate_tDBOutput_1.executeUpdate();
                    updatedCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    nb_line_tDBOutput_1++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_1 = true;
                        nb_line_tDBOutput_1++;
                            System.err.print(e.getMessage());
                }
            } else {
                        if(InsertReject.LB_CHEMIN_FICHIER == null) {
pstmtInsert_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(1, InsertReject.LB_CHEMIN_FICHIER);
}

                        if(InsertReject.LB_NOM_FICHIER == null) {
pstmtInsert_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(2, InsertReject.LB_NOM_FICHIER);
}

                        pstmtInsert_tDBOutput_1.setInt(3, InsertReject.NUM_LIGNE_REJET);

                        if(InsertReject.LB_LIGNE_REJET == null) {
pstmtInsert_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(4, InsertReject.LB_LIGNE_REJET);
}

                        if(InsertReject.LB_MESSAGE_REJET == null) {
pstmtInsert_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(5, InsertReject.LB_MESSAGE_REJET);
}

                        if(InsertReject.LB_NOM_FLUX == null) {
pstmtInsert_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(6, InsertReject.LB_NOM_FLUX);
}

                        if(InsertReject.DT_REJET != null) {
pstmtInsert_tDBOutput_1.setTimestamp(7, new java.sql.Timestamp(InsertReject.DT_REJET.getTime()));
} else {
pstmtInsert_tDBOutput_1.setNull(7, java.sql.Types.TIMESTAMP);
}

                        if(InsertReject.LB_JOB_NAME == null) {
pstmtInsert_tDBOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(8, InsertReject.LB_JOB_NAME);
}

                try {
					
                    int processedCount_tDBOutput_1 = pstmtInsert_tDBOutput_1.executeUpdate();
                    insertedCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    rowsToCommitCount_tDBOutput_1 += processedCount_tDBOutput_1;
                    nb_line_tDBOutput_1++;
					
                } catch(java.lang.Exception e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
					
                    whetherReject_tDBOutput_1 = true;
                        nb_line_tDBOutput_1++;
                            System.err.print(e.getMessage());
                }
            }
    		    commitCounter_tDBOutput_1++;
                if(commitEvery_tDBOutput_1 <= commitCounter_tDBOutput_1) {
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    }
                    conn_tDBOutput_1.commit();
                    if(rowsToCommitCount_tDBOutput_1 != 0){
                    	
                    	rowsToCommitCount_tDBOutput_1 = 0;
                    }
                    commitCounter_tDBOutput_1=0;
                }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "InsertReject"




	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */

} // End of branch "insertServices"




	
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

	



            }
            }finally{
                if(!((Object)(((String)globalMap.get("cheminFichier")) + "/"+((String)globalMap.get("nomFichier"))) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
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
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row3 != null) {
						tHash_Lookup_row3.endGet();
					}
					globalMap.remove( "tHash_Lookup_row3" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertServices");
			  	}
			  	
 

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row4 != null) {
						tHash_Lookup_row4.endGet();
					}
					globalMap.remove( "tHash_Lookup_row4" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertServices1");
			  	}
			  	
 

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row5 != null) {
						tHash_Lookup_row5.endGet();
					}
					globalMap.remove( "tHash_Lookup_row5" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertServices2");
			  	}
			  	
 

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tMap_5 end ] start
	 */

	

	
	
	currentComponent="tMap_5";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row6 != null) {
						tHash_Lookup_row6.endGet();
					}
					globalMap.remove( "tHash_Lookup_row6" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertServices3");
			  	}
			  	
 

ok_Hash.put("tMap_5", true);
end_Hash.put("tMap_5", System.currentTimeMillis());




/**
 * [tMap_5 end ] stop
 */

	
	/**
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row7 != null) {
						tHash_Lookup_row7.endGet();
					}
					globalMap.remove( "tHash_Lookup_row7" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertServices4");
			  	}
			  	
 

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
 */

	
	/**
	 * [tMap_7 end ] start
	 */

	

	
	
	currentComponent="tMap_7";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_row8 != null) {
						tHash_Lookup_row8.endGet();
					}
					globalMap.remove( "tHash_Lookup_row8" );

					
					
				
// ###############################      





				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertServices5");
			  	}
			  	
 

ok_Hash.put("tMap_7", true);
end_Hash.put("tMap_7", System.currentTimeMillis());




/**
 * [tMap_7 end ] stop
 */

	
	/**
	 * [tDBOutput_7 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	



        if(pstmtUpdate_tDBOutput_7 != null){
            pstmtUpdate_tDBOutput_7.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_7");
        }
        if(pstmtInsert_tDBOutput_7 != null){
            pstmtInsert_tDBOutput_7.close();
            resourceMap.remove("pstmtInsert_tDBOutput_7");
        }
        if(pstmt_tDBOutput_7 != null) {
            pstmt_tDBOutput_7.close();
            resourceMap.remove("pstmt_tDBOutput_7");
        }
    resourceMap.put("statementClosed_tDBOutput_7", true);
			if(rowsToCommitCount_tDBOutput_7 != 0){
				
			}
			conn_tDBOutput_7.commit();
			if(rowsToCommitCount_tDBOutput_7 != 0){
				
				rowsToCommitCount_tDBOutput_7 = 0;
			}
			commitCounter_tDBOutput_7 = 0;
		
    	conn_tDBOutput_7 .close();
    	
    	resourceMap.put("finish_tDBOutput_7", true);
    	

	nb_line_deleted_tDBOutput_7=nb_line_deleted_tDBOutput_7+ deletedCount_tDBOutput_7;
	nb_line_update_tDBOutput_7=nb_line_update_tDBOutput_7 + updatedCount_tDBOutput_7;
	nb_line_inserted_tDBOutput_7=nb_line_inserted_tDBOutput_7 + insertedCount_tDBOutput_7;
	nb_line_rejected_tDBOutput_7=nb_line_rejected_tDBOutput_7 + rejectedCount_tDBOutput_7;
	
        globalMap.put("tDBOutput_7_NB_LINE",nb_line_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_UPDATED",nb_line_update_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_DELETED",nb_line_deleted_tDBOutput_7);
        globalMap.put("tDBOutput_7_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_7);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"insertNewElements");
			  	}
			  	
 

ok_Hash.put("tDBOutput_7", true);
end_Hash.put("tDBOutput_7", System.currentTimeMillis());




/**
 * [tDBOutput_7 end ] stop
 */




	
	/**
	 * [tDBOutput_6 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	



        if(pstmtUpdate_tDBOutput_6 != null){
            pstmtUpdate_tDBOutput_6.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_6");
        }
        if(pstmtInsert_tDBOutput_6 != null){
            pstmtInsert_tDBOutput_6.close();
            resourceMap.remove("pstmtInsert_tDBOutput_6");
        }
        if(pstmt_tDBOutput_6 != null) {
            pstmt_tDBOutput_6.close();
            resourceMap.remove("pstmt_tDBOutput_6");
        }
    resourceMap.put("statementClosed_tDBOutput_6", true);
			if(rowsToCommitCount_tDBOutput_6 != 0){
				
			}
			conn_tDBOutput_6.commit();
			if(rowsToCommitCount_tDBOutput_6 != 0){
				
				rowsToCommitCount_tDBOutput_6 = 0;
			}
			commitCounter_tDBOutput_6 = 0;
		
    	conn_tDBOutput_6 .close();
    	
    	resourceMap.put("finish_tDBOutput_6", true);
    	

	nb_line_deleted_tDBOutput_6=nb_line_deleted_tDBOutput_6+ deletedCount_tDBOutput_6;
	nb_line_update_tDBOutput_6=nb_line_update_tDBOutput_6 + updatedCount_tDBOutput_6;
	nb_line_inserted_tDBOutput_6=nb_line_inserted_tDBOutput_6 + insertedCount_tDBOutput_6;
	nb_line_rejected_tDBOutput_6=nb_line_rejected_tDBOutput_6 + rejectedCount_tDBOutput_6;
	
        globalMap.put("tDBOutput_6_NB_LINE",nb_line_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_UPDATED",nb_line_update_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_DELETED",nb_line_deleted_tDBOutput_6);
        globalMap.put("tDBOutput_6_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_6);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject6");
			  	}
			  	
 

ok_Hash.put("tDBOutput_6", true);
end_Hash.put("tDBOutput_6", System.currentTimeMillis());




/**
 * [tDBOutput_6 end ] stop
 */







	
	/**
	 * [tDBOutput_5 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



        if(pstmtUpdate_tDBOutput_5 != null){
            pstmtUpdate_tDBOutput_5.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_5");
        }
        if(pstmtInsert_tDBOutput_5 != null){
            pstmtInsert_tDBOutput_5.close();
            resourceMap.remove("pstmtInsert_tDBOutput_5");
        }
        if(pstmt_tDBOutput_5 != null) {
            pstmt_tDBOutput_5.close();
            resourceMap.remove("pstmt_tDBOutput_5");
        }
    resourceMap.put("statementClosed_tDBOutput_5", true);
			if(rowsToCommitCount_tDBOutput_5 != 0){
				
			}
			conn_tDBOutput_5.commit();
			if(rowsToCommitCount_tDBOutput_5 != 0){
				
				rowsToCommitCount_tDBOutput_5 = 0;
			}
			commitCounter_tDBOutput_5 = 0;
		
    	conn_tDBOutput_5 .close();
    	
    	resourceMap.put("finish_tDBOutput_5", true);
    	

	nb_line_deleted_tDBOutput_5=nb_line_deleted_tDBOutput_5+ deletedCount_tDBOutput_5;
	nb_line_update_tDBOutput_5=nb_line_update_tDBOutput_5 + updatedCount_tDBOutput_5;
	nb_line_inserted_tDBOutput_5=nb_line_inserted_tDBOutput_5 + insertedCount_tDBOutput_5;
	nb_line_rejected_tDBOutput_5=nb_line_rejected_tDBOutput_5 + rejectedCount_tDBOutput_5;
	
        globalMap.put("tDBOutput_5_NB_LINE",nb_line_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_UPDATED",nb_line_update_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_DELETED",nb_line_deleted_tDBOutput_5);
        globalMap.put("tDBOutput_5_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_5);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject5");
			  	}
			  	
 

ok_Hash.put("tDBOutput_5", true);
end_Hash.put("tDBOutput_5", System.currentTimeMillis());




/**
 * [tDBOutput_5 end ] stop
 */







	
	/**
	 * [tDBOutput_4 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



        if(pstmtUpdate_tDBOutput_4 != null){
            pstmtUpdate_tDBOutput_4.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_4");
        }
        if(pstmtInsert_tDBOutput_4 != null){
            pstmtInsert_tDBOutput_4.close();
            resourceMap.remove("pstmtInsert_tDBOutput_4");
        }
        if(pstmt_tDBOutput_4 != null) {
            pstmt_tDBOutput_4.close();
            resourceMap.remove("pstmt_tDBOutput_4");
        }
    resourceMap.put("statementClosed_tDBOutput_4", true);
			if(rowsToCommitCount_tDBOutput_4 != 0){
				
			}
			conn_tDBOutput_4.commit();
			if(rowsToCommitCount_tDBOutput_4 != 0){
				
				rowsToCommitCount_tDBOutput_4 = 0;
			}
			commitCounter_tDBOutput_4 = 0;
		
    	conn_tDBOutput_4 .close();
    	
    	resourceMap.put("finish_tDBOutput_4", true);
    	

	nb_line_deleted_tDBOutput_4=nb_line_deleted_tDBOutput_4+ deletedCount_tDBOutput_4;
	nb_line_update_tDBOutput_4=nb_line_update_tDBOutput_4 + updatedCount_tDBOutput_4;
	nb_line_inserted_tDBOutput_4=nb_line_inserted_tDBOutput_4 + insertedCount_tDBOutput_4;
	nb_line_rejected_tDBOutput_4=nb_line_rejected_tDBOutput_4 + rejectedCount_tDBOutput_4;
	
        globalMap.put("tDBOutput_4_NB_LINE",nb_line_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_UPDATED",nb_line_update_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_DELETED",nb_line_deleted_tDBOutput_4);
        globalMap.put("tDBOutput_4_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_4);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject4");
			  	}
			  	
 

ok_Hash.put("tDBOutput_4", true);
end_Hash.put("tDBOutput_4", System.currentTimeMillis());




/**
 * [tDBOutput_4 end ] stop
 */







	
	/**
	 * [tDBOutput_3 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



        if(pstmtUpdate_tDBOutput_3 != null){
            pstmtUpdate_tDBOutput_3.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_3");
        }
        if(pstmtInsert_tDBOutput_3 != null){
            pstmtInsert_tDBOutput_3.close();
            resourceMap.remove("pstmtInsert_tDBOutput_3");
        }
        if(pstmt_tDBOutput_3 != null) {
            pstmt_tDBOutput_3.close();
            resourceMap.remove("pstmt_tDBOutput_3");
        }
    resourceMap.put("statementClosed_tDBOutput_3", true);
			if(rowsToCommitCount_tDBOutput_3 != 0){
				
			}
			conn_tDBOutput_3.commit();
			if(rowsToCommitCount_tDBOutput_3 != 0){
				
				rowsToCommitCount_tDBOutput_3 = 0;
			}
			commitCounter_tDBOutput_3 = 0;
		
    	conn_tDBOutput_3 .close();
    	
    	resourceMap.put("finish_tDBOutput_3", true);
    	

	nb_line_deleted_tDBOutput_3=nb_line_deleted_tDBOutput_3+ deletedCount_tDBOutput_3;
	nb_line_update_tDBOutput_3=nb_line_update_tDBOutput_3 + updatedCount_tDBOutput_3;
	nb_line_inserted_tDBOutput_3=nb_line_inserted_tDBOutput_3 + insertedCount_tDBOutput_3;
	nb_line_rejected_tDBOutput_3=nb_line_rejected_tDBOutput_3 + rejectedCount_tDBOutput_3;
	
        globalMap.put("tDBOutput_3_NB_LINE",nb_line_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_UPDATED",nb_line_update_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_DELETED",nb_line_deleted_tDBOutput_3);
        globalMap.put("tDBOutput_3_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_3);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject3");
			  	}
			  	
 

ok_Hash.put("tDBOutput_3", true);
end_Hash.put("tDBOutput_3", System.currentTimeMillis());




/**
 * [tDBOutput_3 end ] stop
 */







	
	/**
	 * [tDBOutput_2 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



        if(pstmtUpdate_tDBOutput_2 != null){
            pstmtUpdate_tDBOutput_2.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_2");
        }
        if(pstmtInsert_tDBOutput_2 != null){
            pstmtInsert_tDBOutput_2.close();
            resourceMap.remove("pstmtInsert_tDBOutput_2");
        }
        if(pstmt_tDBOutput_2 != null) {
            pstmt_tDBOutput_2.close();
            resourceMap.remove("pstmt_tDBOutput_2");
        }
    resourceMap.put("statementClosed_tDBOutput_2", true);
			if(rowsToCommitCount_tDBOutput_2 != 0){
				
			}
			conn_tDBOutput_2.commit();
			if(rowsToCommitCount_tDBOutput_2 != 0){
				
				rowsToCommitCount_tDBOutput_2 = 0;
			}
			commitCounter_tDBOutput_2 = 0;
		
    	conn_tDBOutput_2 .close();
    	
    	resourceMap.put("finish_tDBOutput_2", true);
    	

	nb_line_deleted_tDBOutput_2=nb_line_deleted_tDBOutput_2+ deletedCount_tDBOutput_2;
	nb_line_update_tDBOutput_2=nb_line_update_tDBOutput_2 + updatedCount_tDBOutput_2;
	nb_line_inserted_tDBOutput_2=nb_line_inserted_tDBOutput_2 + insertedCount_tDBOutput_2;
	nb_line_rejected_tDBOutput_2=nb_line_rejected_tDBOutput_2 + rejectedCount_tDBOutput_2;
	
        globalMap.put("tDBOutput_2_NB_LINE",nb_line_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_UPDATED",nb_line_update_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_DELETED",nb_line_deleted_tDBOutput_2);
        globalMap.put("tDBOutput_2_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_2);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject2");
			  	}
			  	
 

ok_Hash.put("tDBOutput_2", true);
end_Hash.put("tDBOutput_2", System.currentTimeMillis());




/**
 * [tDBOutput_2 end ] stop
 */







	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



        if(pstmtUpdate_tDBOutput_1 != null){
            pstmtUpdate_tDBOutput_1.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_1");
        }
        if(pstmtInsert_tDBOutput_1 != null){
            pstmtInsert_tDBOutput_1.close();
            resourceMap.remove("pstmtInsert_tDBOutput_1");
        }
        if(pstmt_tDBOutput_1 != null) {
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
			}
			conn_tDBOutput_1.commit();
			if(rowsToCommitCount_tDBOutput_1 != 0){
				
				rowsToCommitCount_tDBOutput_1 = 0;
			}
			commitCounter_tDBOutput_1 = 0;
		
    	conn_tDBOutput_1 .close();
    	
    	resourceMap.put("finish_tDBOutput_1", true);
    	

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	


				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"InsertReject");
			  	}
			  	
 

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */









				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_7"
					     			globalMap.remove("tHash_Lookup_row8"); 
				     			
					     			//free memory for "tMap_6"
					     			globalMap.remove("tHash_Lookup_row7"); 
				     			
					     			//free memory for "tMap_5"
					     			globalMap.remove("tHash_Lookup_row6"); 
				     			
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_row5"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_row4"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_row3"); 
				     			
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
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tMap_5 finally ] start
	 */

	

	
	
	currentComponent="tMap_5";

	

 



/**
 * [tMap_5 finally ] stop
 */

	
	/**
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 finally ] stop
 */

	
	/**
	 * [tMap_7 finally ] start
	 */

	

	
	
	currentComponent="tMap_7";

	

 



/**
 * [tMap_7 finally ] stop
 */

	
	/**
	 * [tDBOutput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_7";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_7") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_7 = null;
                if ((pstmtUpdateToClose_tDBOutput_7 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_7")) != null) {
                    pstmtUpdateToClose_tDBOutput_7.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_7 = null;
                if ((pstmtInsertToClose_tDBOutput_7 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_7")) != null) {
                    pstmtInsertToClose_tDBOutput_7.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_7 = null;
                if ((pstmtToClose_tDBOutput_7 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_7")) != null) {
                    pstmtToClose_tDBOutput_7.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_7") == null){
            java.sql.Connection ctn_tDBOutput_7 = null;
            if((ctn_tDBOutput_7 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_7")) != null){
                try {
                    ctn_tDBOutput_7.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_7) {
                    String errorMessage_tDBOutput_7 = "failed to close the connection in tDBOutput_7 :" + sqlEx_tDBOutput_7.getMessage();
                    System.err.println(errorMessage_tDBOutput_7);
                }
            }
        }
    }
 



/**
 * [tDBOutput_7 finally ] stop
 */




	
	/**
	 * [tDBOutput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_6";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_6") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_6 = null;
                if ((pstmtUpdateToClose_tDBOutput_6 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_6")) != null) {
                    pstmtUpdateToClose_tDBOutput_6.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_6 = null;
                if ((pstmtInsertToClose_tDBOutput_6 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_6")) != null) {
                    pstmtInsertToClose_tDBOutput_6.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_6 = null;
                if ((pstmtToClose_tDBOutput_6 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_6")) != null) {
                    pstmtToClose_tDBOutput_6.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_6") == null){
            java.sql.Connection ctn_tDBOutput_6 = null;
            if((ctn_tDBOutput_6 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_6")) != null){
                try {
                    ctn_tDBOutput_6.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_6) {
                    String errorMessage_tDBOutput_6 = "failed to close the connection in tDBOutput_6 :" + sqlEx_tDBOutput_6.getMessage();
                    System.err.println(errorMessage_tDBOutput_6);
                }
            }
        }
    }
 



/**
 * [tDBOutput_6 finally ] stop
 */







	
	/**
	 * [tDBOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_5";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_5") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_5 = null;
                if ((pstmtUpdateToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_5")) != null) {
                    pstmtUpdateToClose_tDBOutput_5.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_5 = null;
                if ((pstmtInsertToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_5")) != null) {
                    pstmtInsertToClose_tDBOutput_5.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_5 = null;
                if ((pstmtToClose_tDBOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_5")) != null) {
                    pstmtToClose_tDBOutput_5.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_5") == null){
            java.sql.Connection ctn_tDBOutput_5 = null;
            if((ctn_tDBOutput_5 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_5")) != null){
                try {
                    ctn_tDBOutput_5.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_5) {
                    String errorMessage_tDBOutput_5 = "failed to close the connection in tDBOutput_5 :" + sqlEx_tDBOutput_5.getMessage();
                    System.err.println(errorMessage_tDBOutput_5);
                }
            }
        }
    }
 



/**
 * [tDBOutput_5 finally ] stop
 */







	
	/**
	 * [tDBOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_4";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_4") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_4 = null;
                if ((pstmtUpdateToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_4")) != null) {
                    pstmtUpdateToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_4 = null;
                if ((pstmtInsertToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_4")) != null) {
                    pstmtInsertToClose_tDBOutput_4.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_4 = null;
                if ((pstmtToClose_tDBOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_4")) != null) {
                    pstmtToClose_tDBOutput_4.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_4") == null){
            java.sql.Connection ctn_tDBOutput_4 = null;
            if((ctn_tDBOutput_4 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_4")) != null){
                try {
                    ctn_tDBOutput_4.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_4) {
                    String errorMessage_tDBOutput_4 = "failed to close the connection in tDBOutput_4 :" + sqlEx_tDBOutput_4.getMessage();
                    System.err.println(errorMessage_tDBOutput_4);
                }
            }
        }
    }
 



/**
 * [tDBOutput_4 finally ] stop
 */







	
	/**
	 * [tDBOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_3";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_3") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_3 = null;
                if ((pstmtUpdateToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_3")) != null) {
                    pstmtUpdateToClose_tDBOutput_3.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_3 = null;
                if ((pstmtInsertToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_3")) != null) {
                    pstmtInsertToClose_tDBOutput_3.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_3 = null;
                if ((pstmtToClose_tDBOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_3")) != null) {
                    pstmtToClose_tDBOutput_3.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_3") == null){
            java.sql.Connection ctn_tDBOutput_3 = null;
            if((ctn_tDBOutput_3 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_3")) != null){
                try {
                    ctn_tDBOutput_3.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_3) {
                    String errorMessage_tDBOutput_3 = "failed to close the connection in tDBOutput_3 :" + sqlEx_tDBOutput_3.getMessage();
                    System.err.println(errorMessage_tDBOutput_3);
                }
            }
        }
    }
 



/**
 * [tDBOutput_3 finally ] stop
 */







	
	/**
	 * [tDBOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_2";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_2") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_2 = null;
                if ((pstmtUpdateToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_2")) != null) {
                    pstmtUpdateToClose_tDBOutput_2.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_2 = null;
                if ((pstmtInsertToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_2")) != null) {
                    pstmtInsertToClose_tDBOutput_2.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_2 = null;
                if ((pstmtToClose_tDBOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_2")) != null) {
                    pstmtToClose_tDBOutput_2.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_2") == null){
            java.sql.Connection ctn_tDBOutput_2 = null;
            if((ctn_tDBOutput_2 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_2")) != null){
                try {
                    ctn_tDBOutput_2.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_2) {
                    String errorMessage_tDBOutput_2 = "failed to close the connection in tDBOutput_2 :" + sqlEx_tDBOutput_2.getMessage();
                    System.err.println(errorMessage_tDBOutput_2);
                }
            }
        }
    }
 



/**
 * [tDBOutput_2 finally ] stop
 */







	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    try {
    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_1 = null;
                if ((pstmtUpdateToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_1")) != null) {
                    pstmtUpdateToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_1 = null;
                if ((pstmtInsertToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_1")) != null) {
                    pstmtInsertToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
    } finally {
        if(resourceMap.get("finish_tDBOutput_1") == null){
            java.sql.Connection ctn_tDBOutput_1 = null;
            if((ctn_tDBOutput_1 = (java.sql.Connection)resourceMap.get("conn_tDBOutput_1")) != null){
                try {
                    ctn_tDBOutput_1.close();
                } catch (java.sql.SQLException sqlEx_tDBOutput_1) {
                    String errorMessage_tDBOutput_1 = "failed to close the connection in tDBOutput_1 :" + sqlEx_tDBOutput_1.getMessage();
                    System.err.println(errorMessage_tDBOutput_1);
                }
            }
        }
    }
 



/**
 * [tDBOutput_1 finally ] stop
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
	System.err.println("Le fichier " + ((String)globalMap.get("tFileExist_1_FILENAME")) +"  existe déjà dans le repertoire du jour ");
	
	globalMap.put("tDie_1_DIE_MESSAGE", "Le fichier " + ((String)globalMap.get("tFileExist_1_FILENAME")) +"  existe déjà dans le repertoire du jour ");
	globalMap.put("tDie_1_DIE_MESSAGES", "Le fichier " + ((String)globalMap.get("tFileExist_1_FILENAME")) +"  existe déjà dans le repertoire du jour ");
	
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
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public Float AVG_MONTHLY_LONG_DISTANCE_CHARGES;

				public Float getAVG_MONTHLY_LONG_DISTANCE_CHARGES () {
					return this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				}
				
			    public Float AVG_MONTHLY_GB_DOWNLOAD;

				public Float getAVG_MONTHLY_GB_DOWNLOAD () {
					return this.AVG_MONTHLY_GB_DOWNLOAD;
				}
				
			    public float MONTHLY_CHARGE;

				public float getMONTHLY_CHARGE () {
					return this.MONTHLY_CHARGE;
				}
				
			    public float TOTAL_REVENUE;

				public float getTOTAL_REVENUE () {
					return this.TOTAL_REVENUE;
				}
				
			    public float TOTAL_CHARGES;

				public float getTOTAL_CHARGES () {
					return this.TOTAL_CHARGES;
				}
				
			    public float TOTAL_REFUNDS;

				public float getTOTAL_REFUNDS () {
					return this.TOTAL_REFUNDS;
				}
				
			    public float TOTAL_EXTRA_DATA_CHARGES;

				public float getTOTAL_EXTRA_DATA_CHARGES () {
					return this.TOTAL_EXTRA_DATA_CHARGES;
				}
				
			    public float TOTAL_LONG_DISTANCE_CHARGES;

				public float getTOTAL_LONG_DISTANCE_CHARGES () {
					return this.TOTAL_LONG_DISTANCE_CHARGES;
				}
				
			    public int TENURE_IN_MONTHS;

				public int getTENURE_IN_MONTHS () {
					return this.TENURE_IN_MONTHS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CUSTOMER_ID == null) ? 0 : this.CUSTOMER_ID.hashCode());
					
							result = prime * result + (int) this.OFFER_ID;
						
							result = prime * result + (int) this.CONTRACT_ID;
						
							result = prime * result + (int) this.PAYMENT_ID;
						
							result = prime * result + (int) this.SERVICE_ID;
						
							result = prime * result + (int) this.CHURN_ID;
						
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
		
						if (this.CUSTOMER_ID == null) {
							if (other.CUSTOMER_ID != null)
								return false;
						
						} else if (!this.CUSTOMER_ID.equals(other.CUSTOMER_ID))
						
							return false;
					
						if (this.OFFER_ID != other.OFFER_ID)
							return false;
					
						if (this.CONTRACT_ID != other.CONTRACT_ID)
							return false;
					
						if (this.PAYMENT_ID != other.PAYMENT_ID)
							return false;
					
						if (this.SERVICE_ID != other.SERVICE_ID)
							return false;
					
						if (this.CHURN_ID != other.CHURN_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(row2Struct other) {

		other.CUSTOMER_ID = this.CUSTOMER_ID;
	            other.OFFER_ID = this.OFFER_ID;
	            other.CONTRACT_ID = this.CONTRACT_ID;
	            other.PAYMENT_ID = this.PAYMENT_ID;
	            other.SERVICE_ID = this.SERVICE_ID;
	            other.CHURN_ID = this.CHURN_ID;
	            other.AVG_MONTHLY_LONG_DISTANCE_CHARGES = this.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
	            other.AVG_MONTHLY_GB_DOWNLOAD = this.AVG_MONTHLY_GB_DOWNLOAD;
	            other.MONTHLY_CHARGE = this.MONTHLY_CHARGE;
	            other.TOTAL_REVENUE = this.TOTAL_REVENUE;
	            other.TOTAL_CHARGES = this.TOTAL_CHARGES;
	            other.TOTAL_REFUNDS = this.TOTAL_REFUNDS;
	            other.TOTAL_EXTRA_DATA_CHARGES = this.TOTAL_EXTRA_DATA_CHARGES;
	            other.TOTAL_LONG_DISTANCE_CHARGES = this.TOTAL_LONG_DISTANCE_CHARGES;
	            other.TENURE_IN_MONTHS = this.TENURE_IN_MONTHS;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row2Struct other) {

		other.CUSTOMER_ID = this.CUSTOMER_ID;
	            	other.OFFER_ID = this.OFFER_ID;
	            	other.CONTRACT_ID = this.CONTRACT_ID;
	            	other.PAYMENT_ID = this.PAYMENT_ID;
	            	other.SERVICE_ID = this.SERVICE_ID;
	            	other.CHURN_ID = this.CHURN_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
			        this.OFFER_ID = dis.readInt();
					
			        this.CONTRACT_ID = dis.readInt();
					
			        this.PAYMENT_ID = dis.readInt();
					
			        this.SERVICE_ID = dis.readInt();
					
			        this.CHURN_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
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
		
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = dis.readFloat();
           				}
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = dis.readFloat();
           				}
					
			            this.MONTHLY_CHARGE = dis.readFloat();
					
			            this.TOTAL_REVENUE = dis.readFloat();
					
			            this.TOTAL_CHARGES = dis.readFloat();
					
			            this.TOTAL_REFUNDS = dis.readFloat();
					
			            this.TOTAL_EXTRA_DATA_CHARGES = dis.readFloat();
					
			            this.TOTAL_LONG_DISTANCE_CHARGES = dis.readFloat();
					
			            this.TENURE_IN_MONTHS = dis.readInt();
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
           				} else {
           			    	this.AVG_MONTHLY_LONG_DISTANCE_CHARGES = objectIn.readFloat();
           				}
					
			            length = objectIn.readByte();
           				if (length == -1) {
           	    			this.AVG_MONTHLY_GB_DOWNLOAD = null;
           				} else {
           			    	this.AVG_MONTHLY_GB_DOWNLOAD = objectIn.readFloat();
           				}
					
			            this.MONTHLY_CHARGE = objectIn.readFloat();
					
			            this.TOTAL_REVENUE = objectIn.readFloat();
					
			            this.TOTAL_CHARGES = objectIn.readFloat();
					
			            this.TOTAL_REFUNDS = objectIn.readFloat();
					
			            this.TOTAL_EXTRA_DATA_CHARGES = objectIn.readFloat();
					
			            this.TOTAL_LONG_DISTANCE_CHARGES = objectIn.readFloat();
					
			            this.TENURE_IN_MONTHS = objectIn.readInt();
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
		            	dos.writeFloat(this.MONTHLY_CHARGE);
					
		            	dos.writeFloat(this.TOTAL_REVENUE);
					
		            	dos.writeFloat(this.TOTAL_CHARGES);
					
		            	dos.writeFloat(this.TOTAL_REFUNDS);
					
		            	dos.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
		            	dos.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
		            	dos.writeInt(this.TENURE_IN_MONTHS);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						if(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeFloat(this.AVG_MONTHLY_LONG_DISTANCE_CHARGES);
		            	}
					
						if(this.AVG_MONTHLY_GB_DOWNLOAD == null) {
							objectOut.writeByte(-1);
						} else {
							objectOut.writeByte(0);
							objectOut.writeFloat(this.AVG_MONTHLY_GB_DOWNLOAD);
		            	}
					
					objectOut.writeFloat(this.MONTHLY_CHARGE);
					
					objectOut.writeFloat(this.TOTAL_REVENUE);
					
					objectOut.writeFloat(this.TOTAL_CHARGES);
					
					objectOut.writeFloat(this.TOTAL_REFUNDS);
					
					objectOut.writeFloat(this.TOTAL_EXTRA_DATA_CHARGES);
					
					objectOut.writeFloat(this.TOTAL_LONG_DISTANCE_CHARGES);
					
					objectOut.writeInt(this.TENURE_IN_MONTHS);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",AVG_MONTHLY_LONG_DISTANCE_CHARGES="+String.valueOf(AVG_MONTHLY_LONG_DISTANCE_CHARGES));
		sb.append(",AVG_MONTHLY_GB_DOWNLOAD="+String.valueOf(AVG_MONTHLY_GB_DOWNLOAD));
		sb.append(",MONTHLY_CHARGE="+String.valueOf(MONTHLY_CHARGE));
		sb.append(",TOTAL_REVENUE="+String.valueOf(TOTAL_REVENUE));
		sb.append(",TOTAL_CHARGES="+String.valueOf(TOTAL_CHARGES));
		sb.append(",TOTAL_REFUNDS="+String.valueOf(TOTAL_REFUNDS));
		sb.append(",TOTAL_EXTRA_DATA_CHARGES="+String.valueOf(TOTAL_EXTRA_DATA_CHARGES));
		sb.append(",TOTAL_LONG_DISTANCE_CHARGES="+String.valueOf(TOTAL_LONG_DISTANCE_CHARGES));
		sb.append(",TENURE_IN_MONTHS="+String.valueOf(TENURE_IN_MONTHS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CUSTOMER_ID, other.CUSTOMER_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.OFFER_ID, other.OFFER_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CONTRACT_ID, other.CONTRACT_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.PAYMENT_ID, other.PAYMENT_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.SERVICE_ID, other.SERVICE_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.CHURN_ID, other.CHURN_ID);
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
public void tDBInput_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_1_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_1 - inputs:(after_tFileInputDelimited_1) outputs:(row2,row2) | target node:tAdvancedHash_row2 - inputs:(row2) outputs:()
			   		// linked node: tMap_1 - inputs:(row1,row2) outputs:(insertServices)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row2Struct> tHash_Lookup_row2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row2Struct>getLookup(matchingModeEnum_row2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row2", tHash_Lookup_row2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row2 begin ] stop
 */



	
	/**
	 * [tDBInput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_1", false);
		start_Hash.put("tDBInput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_1";

	
		int tos_count_tDBInput_1 = 0;
		
	
    
	
		    int nb_line_tDBInput_1 = 0;
		    java.sql.Connection conn_tDBInput_1 = null;
				String driverClass_tDBInput_1 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_1 = java.lang.Class.forName(driverClass_tDBInput_1);
				String dbUser_tDBInput_1 = context.user;
				
				
	final String decryptedPassword_tDBInput_1 = context.password; 
				
				String dbPwd_tDBInput_1 = decryptedPassword_tDBInput_1;
				
				String url_tDBInput_1 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_1 = java.sql.DriverManager.getConnection(url_tDBInput_1,dbUser_tDBInput_1,dbPwd_tDBInput_1);
		        
				conn_tDBInput_1.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_1 = conn_tDBInput_1.createStatement();

		    String dbquery_tDBInput_1 = "SELECT \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"CUSTOMER_ID\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"OFFER_ID\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"CONTRACT_ID\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"PAYMENT_ID\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"SERVICE_ID\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"CHURN_ID\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"AVG_MONTHLY_LONG_DISTANCE_CHARGES\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"AVG_MONTHLY_GB_DOWNLOAD\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"MONTHLY_CHARGE\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"TOTAL_REVENUE\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"TOTAL_CHARGES\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"TOTAL_REFUNDS\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"TOTAL_EXTRA_DATA_CHARGES\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"TOTAL_LONG_DISTANCE_CHARGES\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"TENURE_IN_MONTHS\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"FACT_CUSTOMER_CHURN\"";
		    

            	globalMap.put("tDBInput_1_QUERY",dbquery_tDBInput_1);
		    java.sql.ResultSet rs_tDBInput_1 = null;

		    try {
		    	rs_tDBInput_1 = stmt_tDBInput_1.executeQuery(dbquery_tDBInput_1);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_1 = rs_tDBInput_1.getMetaData();
		    	int colQtyInRs_tDBInput_1 = rsmd_tDBInput_1.getColumnCount();

		    String tmpContent_tDBInput_1 = null;
		    
		    
		    while (rs_tDBInput_1.next()) {
		        nb_line_tDBInput_1++;
		        
							if(colQtyInRs_tDBInput_1 < 1) {
								row2.CUSTOMER_ID = null;
							} else {
	                         		
        	row2.CUSTOMER_ID = routines.system.JDBCUtil.getString(rs_tDBInput_1, 1, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 2) {
								row2.OFFER_ID = 0;
							} else {
		                          
            row2.OFFER_ID = rs_tDBInput_1.getInt(2);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 3) {
								row2.CONTRACT_ID = 0;
							} else {
		                          
            row2.CONTRACT_ID = rs_tDBInput_1.getInt(3);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 4) {
								row2.PAYMENT_ID = 0;
							} else {
		                          
            row2.PAYMENT_ID = rs_tDBInput_1.getInt(4);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 5) {
								row2.SERVICE_ID = 0;
							} else {
		                          
            row2.SERVICE_ID = rs_tDBInput_1.getInt(5);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 6) {
								row2.CHURN_ID = 0;
							} else {
		                          
            row2.CHURN_ID = rs_tDBInput_1.getInt(6);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 7) {
								row2.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
							} else {
		                          
            row2.AVG_MONTHLY_LONG_DISTANCE_CHARGES = rs_tDBInput_1.getFloat(7);
            if(rs_tDBInput_1.wasNull()){
                    row2.AVG_MONTHLY_LONG_DISTANCE_CHARGES = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 8) {
								row2.AVG_MONTHLY_GB_DOWNLOAD = null;
							} else {
		                          
            row2.AVG_MONTHLY_GB_DOWNLOAD = rs_tDBInput_1.getFloat(8);
            if(rs_tDBInput_1.wasNull()){
                    row2.AVG_MONTHLY_GB_DOWNLOAD = null;
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 9) {
								row2.MONTHLY_CHARGE = 0;
							} else {
		                          
            row2.MONTHLY_CHARGE = rs_tDBInput_1.getFloat(9);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 10) {
								row2.TOTAL_REVENUE = 0;
							} else {
		                          
            row2.TOTAL_REVENUE = rs_tDBInput_1.getFloat(10);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 11) {
								row2.TOTAL_CHARGES = 0;
							} else {
		                          
            row2.TOTAL_CHARGES = rs_tDBInput_1.getFloat(11);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 12) {
								row2.TOTAL_REFUNDS = 0;
							} else {
		                          
            row2.TOTAL_REFUNDS = rs_tDBInput_1.getFloat(12);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 13) {
								row2.TOTAL_EXTRA_DATA_CHARGES = 0;
							} else {
		                          
            row2.TOTAL_EXTRA_DATA_CHARGES = rs_tDBInput_1.getFloat(13);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 14) {
								row2.TOTAL_LONG_DISTANCE_CHARGES = 0;
							} else {
		                          
            row2.TOTAL_LONG_DISTANCE_CHARGES = rs_tDBInput_1.getFloat(14);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 15) {
								row2.TENURE_IN_MONTHS = 0;
							} else {
		                          
            row2.TENURE_IN_MONTHS = rs_tDBInput_1.getInt(15);
            if(rs_tDBInput_1.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_1 < 16) {
								row2.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row2.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_1, 16, false);
		                    }
							if(colQtyInRs_tDBInput_1 < 17) {
								row2.DT_INSERTION = null;
							} else {
										
			row2.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_1, 17);
		                    }
							if(colQtyInRs_tDBInput_1 < 18) {
								row2.LB_JOB_NAME = null;
							} else {
	                         		
        	row2.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_1, 18, false);
		                    }
					


 



/**
 * [tDBInput_1 begin ] stop
 */
	
	/**
	 * [tDBInput_1 main ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 


	tos_count_tDBInput_1++;

/**
 * [tDBInput_1 main ] stop
 */
	
	/**
	 * [tDBInput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_begin ] stop
 */

	
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
		   	   	   
				
				row2_HashRow.CUSTOMER_ID = row2.CUSTOMER_ID;
				
				row2_HashRow.OFFER_ID = row2.OFFER_ID;
				
				row2_HashRow.CONTRACT_ID = row2.CONTRACT_ID;
				
				row2_HashRow.PAYMENT_ID = row2.PAYMENT_ID;
				
				row2_HashRow.SERVICE_ID = row2.SERVICE_ID;
				
				row2_HashRow.CHURN_ID = row2.CHURN_ID;
				
				row2_HashRow.AVG_MONTHLY_LONG_DISTANCE_CHARGES = row2.AVG_MONTHLY_LONG_DISTANCE_CHARGES;
				
				row2_HashRow.AVG_MONTHLY_GB_DOWNLOAD = row2.AVG_MONTHLY_GB_DOWNLOAD;
				
				row2_HashRow.MONTHLY_CHARGE = row2.MONTHLY_CHARGE;
				
				row2_HashRow.TOTAL_REVENUE = row2.TOTAL_REVENUE;
				
				row2_HashRow.TOTAL_CHARGES = row2.TOTAL_CHARGES;
				
				row2_HashRow.TOTAL_REFUNDS = row2.TOTAL_REFUNDS;
				
				row2_HashRow.TOTAL_EXTRA_DATA_CHARGES = row2.TOTAL_EXTRA_DATA_CHARGES;
				
				row2_HashRow.TOTAL_LONG_DISTANCE_CHARGES = row2.TOTAL_LONG_DISTANCE_CHARGES;
				
				row2_HashRow.TENURE_IN_MONTHS = row2.TENURE_IN_MONTHS;
				
				row2_HashRow.LB_NOM_FICHIER = row2.LB_NOM_FICHIER;
				
				row2_HashRow.DT_INSERTION = row2.DT_INSERTION;
				
				row2_HashRow.LB_JOB_NAME = row2.LB_JOB_NAME;
				
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



	
	/**
	 * [tDBInput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_1 end ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

	}
}finally{
	if (rs_tDBInput_1 != null) {
		rs_tDBInput_1.close();
	}
	if (stmt_tDBInput_1 != null) {
		stmt_tDBInput_1.close();
	}
	if(conn_tDBInput_1 != null && !conn_tDBInput_1.isClosed()) {
		
			conn_tDBInput_1.commit();
			
		
			conn_tDBInput_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_1_NB_LINE",nb_line_tDBInput_1);
 

ok_Hash.put("tDBInput_1", true);
end_Hash.put("tDBInput_1", System.currentTimeMillis());




/**
 * [tDBInput_1 end ] stop
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
	 * [tDBInput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_1";

	

 



/**
 * [tDBInput_1 finally ] stop
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
		

		globalMap.put("tDBInput_1_SUBPROCESS_STATE", 1);
	}
	


public static class row3Struct implements routines.system.IPersistableComparableLookupRow<row3Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int CHURN_ID;

				public int getCHURN_ID () {
					return this.CHURN_ID;
				}
				
			    public String CUSTOMER_STATUS;

				public String getCUSTOMER_STATUS () {
					return this.CUSTOMER_STATUS;
				}
				
			    public String CHURN_CATEGORY;

				public String getCHURN_CATEGORY () {
					return this.CHURN_CATEGORY;
				}
				
			    public String CHURN_REASON;

				public String getCHURN_REASON () {
					return this.CHURN_REASON;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.CHURN_ID;
						
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
		
						if (this.CHURN_ID != other.CHURN_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(row3Struct other) {

		other.CHURN_ID = this.CHURN_ID;
	            other.CUSTOMER_STATUS = this.CUSTOMER_STATUS;
	            other.CHURN_CATEGORY = this.CHURN_CATEGORY;
	            other.CHURN_REASON = this.CHURN_REASON;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row3Struct other) {

		other.CHURN_ID = this.CHURN_ID;
	            	
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.CHURN_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.CHURN_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.CHURN_ID);
					
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
		
						this.CUSTOMER_STATUS = readString(dis,ois);
					
						this.CHURN_CATEGORY = readString(dis,ois);
					
						this.CHURN_REASON = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.CUSTOMER_STATUS = readString(dis,objectIn);
					
						this.CHURN_CATEGORY = readString(dis,objectIn);
					
						this.CHURN_REASON = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.CUSTOMER_STATUS, dos, oos);
					
						writeString(this.CHURN_CATEGORY, dos, oos);
					
						writeString(this.CHURN_REASON, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.CUSTOMER_STATUS, dos, objectOut);
					
						writeString(this.CHURN_CATEGORY, dos, objectOut);
					
						writeString(this.CHURN_REASON, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("CHURN_ID="+String.valueOf(CHURN_ID));
		sb.append(",CUSTOMER_STATUS="+CUSTOMER_STATUS);
		sb.append(",CHURN_CATEGORY="+CHURN_CATEGORY);
		sb.append(",CHURN_REASON="+CHURN_REASON);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row3Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CHURN_ID, other.CHURN_ID);
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
public void tDBInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_2_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_2 - inputs:(after_tFileInputDelimited_1) outputs:(row3,row3) | target node:tAdvancedHash_row3 - inputs:(row3) outputs:()
			   		// linked node: tMap_2 - inputs:(insertServices,row3) outputs:(insertServices1,InsertReject)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row3 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row3Struct> tHash_Lookup_row3 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row3Struct>getLookup(matchingModeEnum_row3);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row3", tHash_Lookup_row3);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row3 begin ] stop
 */



	
	/**
	 * [tDBInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_2", false);
		start_Hash.put("tDBInput_2", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_2";

	
		int tos_count_tDBInput_2 = 0;
		
	
    
	
		    int nb_line_tDBInput_2 = 0;
		    java.sql.Connection conn_tDBInput_2 = null;
				String driverClass_tDBInput_2 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_2 = java.lang.Class.forName(driverClass_tDBInput_2);
				String dbUser_tDBInput_2 = context.user;
				
				
	final String decryptedPassword_tDBInput_2 = context.password; 
				
				String dbPwd_tDBInput_2 = decryptedPassword_tDBInput_2;
				
				String url_tDBInput_2 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_2 = java.sql.DriverManager.getConnection(url_tDBInput_2,dbUser_tDBInput_2,dbPwd_tDBInput_2);
		        
				conn_tDBInput_2.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_2 = conn_tDBInput_2.createStatement();

		    String dbquery_tDBInput_2 = "SELECT \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"CHURN_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"CUSTOMER_STATUS\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"CHURN_CATEGORY\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"CHURN_REASON\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"DWH_DIM_CHURN\"";
		    

            	globalMap.put("tDBInput_2_QUERY",dbquery_tDBInput_2);
		    java.sql.ResultSet rs_tDBInput_2 = null;

		    try {
		    	rs_tDBInput_2 = stmt_tDBInput_2.executeQuery(dbquery_tDBInput_2);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_2 = rs_tDBInput_2.getMetaData();
		    	int colQtyInRs_tDBInput_2 = rsmd_tDBInput_2.getColumnCount();

		    String tmpContent_tDBInput_2 = null;
		    
		    
		    while (rs_tDBInput_2.next()) {
		        nb_line_tDBInput_2++;
		        
							if(colQtyInRs_tDBInput_2 < 1) {
								row3.CHURN_ID = 0;
							} else {
		                          
            row3.CHURN_ID = rs_tDBInput_2.getInt(1);
            if(rs_tDBInput_2.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_2 < 2) {
								row3.CUSTOMER_STATUS = null;
							} else {
	                         		
        	row3.CUSTOMER_STATUS = routines.system.JDBCUtil.getString(rs_tDBInput_2, 2, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 3) {
								row3.CHURN_CATEGORY = null;
							} else {
	                         		
        	row3.CHURN_CATEGORY = routines.system.JDBCUtil.getString(rs_tDBInput_2, 3, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 4) {
								row3.CHURN_REASON = null;
							} else {
	                         		
        	row3.CHURN_REASON = routines.system.JDBCUtil.getString(rs_tDBInput_2, 4, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 5) {
								row3.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row3.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_2, 5, false);
		                    }
							if(colQtyInRs_tDBInput_2 < 6) {
								row3.DT_INSERTION = null;
							} else {
										
			row3.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_2, 6);
		                    }
							if(colQtyInRs_tDBInput_2 < 7) {
								row3.LB_JOB_NAME = null;
							} else {
	                         		
        	row3.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_2, 7, false);
		                    }
					


 



/**
 * [tDBInput_2 begin ] stop
 */
	
	/**
	 * [tDBInput_2 main ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 


	tos_count_tDBInput_2++;

/**
 * [tDBInput_2 main ] stop
 */
	
	/**
	 * [tDBInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_begin ] stop
 */

	
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
		   	   	   
				
				row3_HashRow.CHURN_ID = row3.CHURN_ID;
				
				row3_HashRow.CUSTOMER_STATUS = row3.CUSTOMER_STATUS;
				
				row3_HashRow.CHURN_CATEGORY = row3.CHURN_CATEGORY;
				
				row3_HashRow.CHURN_REASON = row3.CHURN_REASON;
				
				row3_HashRow.LB_NOM_FICHIER = row3.LB_NOM_FICHIER;
				
				row3_HashRow.DT_INSERTION = row3.DT_INSERTION;
				
				row3_HashRow.LB_JOB_NAME = row3.LB_JOB_NAME;
				
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



	
	/**
	 * [tDBInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_2 end ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

	}
}finally{
	if (rs_tDBInput_2 != null) {
		rs_tDBInput_2.close();
	}
	if (stmt_tDBInput_2 != null) {
		stmt_tDBInput_2.close();
	}
	if(conn_tDBInput_2 != null && !conn_tDBInput_2.isClosed()) {
		
			conn_tDBInput_2.commit();
			
		
			conn_tDBInput_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_2_NB_LINE",nb_line_tDBInput_2);
 

ok_Hash.put("tDBInput_2", true);
end_Hash.put("tDBInput_2", System.currentTimeMillis());




/**
 * [tDBInput_2 end ] stop
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
	 * [tDBInput_2 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_2";

	

 



/**
 * [tDBInput_2 finally ] stop
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
		

		globalMap.put("tDBInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class row4Struct implements routines.system.IPersistableComparableLookupRow<row4Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int CONTRACT_ID;

				public int getCONTRACT_ID () {
					return this.CONTRACT_ID;
				}
				
			    public String CONTRACT_TYPE;

				public String getCONTRACT_TYPE () {
					return this.CONTRACT_TYPE;
				}
				
			    public String PAPERLESS_BILLING;

				public String getPAPERLESS_BILLING () {
					return this.PAPERLESS_BILLING;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.CONTRACT_ID;
						
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
		
						if (this.CONTRACT_ID != other.CONTRACT_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(row4Struct other) {

		other.CONTRACT_ID = this.CONTRACT_ID;
	            other.CONTRACT_TYPE = this.CONTRACT_TYPE;
	            other.PAPERLESS_BILLING = this.PAPERLESS_BILLING;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row4Struct other) {

		other.CONTRACT_ID = this.CONTRACT_ID;
	            	
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.CONTRACT_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.CONTRACT_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.CONTRACT_ID);
					
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
		
						this.CONTRACT_TYPE = readString(dis,ois);
					
						this.PAPERLESS_BILLING = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.CONTRACT_TYPE = readString(dis,objectIn);
					
						this.PAPERLESS_BILLING = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.CONTRACT_TYPE, dos, oos);
					
						writeString(this.PAPERLESS_BILLING, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.CONTRACT_TYPE, dos, objectOut);
					
						writeString(this.PAPERLESS_BILLING, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("CONTRACT_ID="+String.valueOf(CONTRACT_ID));
		sb.append(",CONTRACT_TYPE="+CONTRACT_TYPE);
		sb.append(",PAPERLESS_BILLING="+PAPERLESS_BILLING);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row4Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CONTRACT_ID, other.CONTRACT_ID);
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
public void tDBInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_3_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_3 - inputs:(after_tFileInputDelimited_1) outputs:(row4,row4) | target node:tAdvancedHash_row4 - inputs:(row4) outputs:()
			   		// linked node: tMap_3 - inputs:(insertServices1,row4) outputs:(insertServices2,InsertReject2)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row4 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row4Struct> tHash_Lookup_row4 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row4Struct>getLookup(matchingModeEnum_row4);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row4", tHash_Lookup_row4);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row4 begin ] stop
 */



	
	/**
	 * [tDBInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_3", false);
		start_Hash.put("tDBInput_3", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_3";

	
		int tos_count_tDBInput_3 = 0;
		
	
    
	
		    int nb_line_tDBInput_3 = 0;
		    java.sql.Connection conn_tDBInput_3 = null;
				String driverClass_tDBInput_3 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_3 = java.lang.Class.forName(driverClass_tDBInput_3);
				String dbUser_tDBInput_3 = context.user;
				
				
	final String decryptedPassword_tDBInput_3 = context.password; 
				
				String dbPwd_tDBInput_3 = decryptedPassword_tDBInput_3;
				
				String url_tDBInput_3 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_3 = java.sql.DriverManager.getConnection(url_tDBInput_3,dbUser_tDBInput_3,dbPwd_tDBInput_3);
		        
				conn_tDBInput_3.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_3 = conn_tDBInput_3.createStatement();

		    String dbquery_tDBInput_3 = "SELECT \n  \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\".\"CONTRACT_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\".\"CONTRACT_TYPE\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\".\"PAPERLESS_BILLING\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"DWH_DIM_CONTRACT\"";
		    

            	globalMap.put("tDBInput_3_QUERY",dbquery_tDBInput_3);
		    java.sql.ResultSet rs_tDBInput_3 = null;

		    try {
		    	rs_tDBInput_3 = stmt_tDBInput_3.executeQuery(dbquery_tDBInput_3);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_3 = rs_tDBInput_3.getMetaData();
		    	int colQtyInRs_tDBInput_3 = rsmd_tDBInput_3.getColumnCount();

		    String tmpContent_tDBInput_3 = null;
		    
		    
		    while (rs_tDBInput_3.next()) {
		        nb_line_tDBInput_3++;
		        
							if(colQtyInRs_tDBInput_3 < 1) {
								row4.CONTRACT_ID = 0;
							} else {
		                          
            row4.CONTRACT_ID = rs_tDBInput_3.getInt(1);
            if(rs_tDBInput_3.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_3 < 2) {
								row4.CONTRACT_TYPE = null;
							} else {
	                         		
        	row4.CONTRACT_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_3, 2, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 3) {
								row4.PAPERLESS_BILLING = null;
							} else {
	                         		
        	row4.PAPERLESS_BILLING = routines.system.JDBCUtil.getString(rs_tDBInput_3, 3, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 4) {
								row4.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row4.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_3, 4, false);
		                    }
							if(colQtyInRs_tDBInput_3 < 5) {
								row4.DT_INSERTION = null;
							} else {
										
			row4.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_3, 5);
		                    }
							if(colQtyInRs_tDBInput_3 < 6) {
								row4.LB_JOB_NAME = null;
							} else {
	                         		
        	row4.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_3, 6, false);
		                    }
					


 



/**
 * [tDBInput_3 begin ] stop
 */
	
	/**
	 * [tDBInput_3 main ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 


	tos_count_tDBInput_3++;

/**
 * [tDBInput_3 main ] stop
 */
	
	/**
	 * [tDBInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_begin ] stop
 */

	
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
		   	   	   
				
				row4_HashRow.CONTRACT_ID = row4.CONTRACT_ID;
				
				row4_HashRow.CONTRACT_TYPE = row4.CONTRACT_TYPE;
				
				row4_HashRow.PAPERLESS_BILLING = row4.PAPERLESS_BILLING;
				
				row4_HashRow.LB_NOM_FICHIER = row4.LB_NOM_FICHIER;
				
				row4_HashRow.DT_INSERTION = row4.DT_INSERTION;
				
				row4_HashRow.LB_JOB_NAME = row4.LB_JOB_NAME;
				
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



	
	/**
	 * [tDBInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_3 end ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

	}
}finally{
	if (rs_tDBInput_3 != null) {
		rs_tDBInput_3.close();
	}
	if (stmt_tDBInput_3 != null) {
		stmt_tDBInput_3.close();
	}
	if(conn_tDBInput_3 != null && !conn_tDBInput_3.isClosed()) {
		
			conn_tDBInput_3.commit();
			
		
			conn_tDBInput_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_3_NB_LINE",nb_line_tDBInput_3);
 

ok_Hash.put("tDBInput_3", true);
end_Hash.put("tDBInput_3", System.currentTimeMillis());




/**
 * [tDBInput_3 end ] stop
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
	 * [tDBInput_3 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_3";

	

 



/**
 * [tDBInput_3 finally ] stop
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
		

		globalMap.put("tDBInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class row5Struct implements routines.system.IPersistableComparableLookupRow<row5Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int PAYMENT_ID;

				public int getPAYMENT_ID () {
					return this.PAYMENT_ID;
				}
				
			    public String PAYMENT_METHOD;

				public String getPAYMENT_METHOD () {
					return this.PAYMENT_METHOD;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.PAYMENT_ID;
						
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
		
						if (this.PAYMENT_ID != other.PAYMENT_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(row5Struct other) {

		other.PAYMENT_ID = this.PAYMENT_ID;
	            other.PAYMENT_METHOD = this.PAYMENT_METHOD;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row5Struct other) {

		other.PAYMENT_ID = this.PAYMENT_ID;
	            	
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.PAYMENT_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.PAYMENT_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.PAYMENT_ID);
					
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
		
						this.PAYMENT_METHOD = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.PAYMENT_METHOD = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.PAYMENT_METHOD, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.PAYMENT_METHOD, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("PAYMENT_ID="+String.valueOf(PAYMENT_ID));
		sb.append(",PAYMENT_METHOD="+PAYMENT_METHOD);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row5Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.PAYMENT_ID, other.PAYMENT_ID);
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
public void tDBInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_4_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_4 - inputs:(after_tFileInputDelimited_1) outputs:(row5,row5) | target node:tAdvancedHash_row5 - inputs:(row5) outputs:()
			   		// linked node: tMap_4 - inputs:(insertServices2,row5) outputs:(insertServices3,InsertReject3)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row5 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row5Struct> tHash_Lookup_row5 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row5Struct>getLookup(matchingModeEnum_row5);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row5", tHash_Lookup_row5);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row5 begin ] stop
 */



	
	/**
	 * [tDBInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_4", false);
		start_Hash.put("tDBInput_4", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_4";

	
		int tos_count_tDBInput_4 = 0;
		
	
    
	
		    int nb_line_tDBInput_4 = 0;
		    java.sql.Connection conn_tDBInput_4 = null;
				String driverClass_tDBInput_4 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_4 = java.lang.Class.forName(driverClass_tDBInput_4);
				String dbUser_tDBInput_4 = context.user;
				
				
	final String decryptedPassword_tDBInput_4 = context.password; 
				
				String dbPwd_tDBInput_4 = decryptedPassword_tDBInput_4;
				
				String url_tDBInput_4 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_4 = java.sql.DriverManager.getConnection(url_tDBInput_4,dbUser_tDBInput_4,dbPwd_tDBInput_4);
		        
				conn_tDBInput_4.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_4 = conn_tDBInput_4.createStatement();

		    String dbquery_tDBInput_4 = "SELECT \n  \""+context.schemaDwh+"\".\"DWH_DIM_PAYMENT\".\"PAYMENT_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_PAYMENT\".\"PAYMENT_METHOD\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_PAYMENT\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_PAYMENT\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_PAYMENT\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"DWH_DIM_PAYMENT\"";
		    

            	globalMap.put("tDBInput_4_QUERY",dbquery_tDBInput_4);
		    java.sql.ResultSet rs_tDBInput_4 = null;

		    try {
		    	rs_tDBInput_4 = stmt_tDBInput_4.executeQuery(dbquery_tDBInput_4);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_4 = rs_tDBInput_4.getMetaData();
		    	int colQtyInRs_tDBInput_4 = rsmd_tDBInput_4.getColumnCount();

		    String tmpContent_tDBInput_4 = null;
		    
		    
		    while (rs_tDBInput_4.next()) {
		        nb_line_tDBInput_4++;
		        
							if(colQtyInRs_tDBInput_4 < 1) {
								row5.PAYMENT_ID = 0;
							} else {
		                          
            row5.PAYMENT_ID = rs_tDBInput_4.getInt(1);
            if(rs_tDBInput_4.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_4 < 2) {
								row5.PAYMENT_METHOD = null;
							} else {
	                         		
        	row5.PAYMENT_METHOD = routines.system.JDBCUtil.getString(rs_tDBInput_4, 2, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 3) {
								row5.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row5.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_4, 3, false);
		                    }
							if(colQtyInRs_tDBInput_4 < 4) {
								row5.DT_INSERTION = null;
							} else {
										
			row5.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_4, 4);
		                    }
							if(colQtyInRs_tDBInput_4 < 5) {
								row5.LB_JOB_NAME = null;
							} else {
	                         		
        	row5.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_4, 5, false);
		                    }
					


 



/**
 * [tDBInput_4 begin ] stop
 */
	
	/**
	 * [tDBInput_4 main ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 


	tos_count_tDBInput_4++;

/**
 * [tDBInput_4 main ] stop
 */
	
	/**
	 * [tDBInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_begin ] stop
 */

	
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
		   	   	   
				
				row5_HashRow.PAYMENT_ID = row5.PAYMENT_ID;
				
				row5_HashRow.PAYMENT_METHOD = row5.PAYMENT_METHOD;
				
				row5_HashRow.LB_NOM_FICHIER = row5.LB_NOM_FICHIER;
				
				row5_HashRow.DT_INSERTION = row5.DT_INSERTION;
				
				row5_HashRow.LB_JOB_NAME = row5.LB_JOB_NAME;
				
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



	
	/**
	 * [tDBInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_4 end ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

	}
}finally{
	if (rs_tDBInput_4 != null) {
		rs_tDBInput_4.close();
	}
	if (stmt_tDBInput_4 != null) {
		stmt_tDBInput_4.close();
	}
	if(conn_tDBInput_4 != null && !conn_tDBInput_4.isClosed()) {
		
			conn_tDBInput_4.commit();
			
		
			conn_tDBInput_4.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_4_NB_LINE",nb_line_tDBInput_4);
 

ok_Hash.put("tDBInput_4", true);
end_Hash.put("tDBInput_4", System.currentTimeMillis());




/**
 * [tDBInput_4 end ] stop
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
	 * [tDBInput_4 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_4";

	

 



/**
 * [tDBInput_4 finally ] stop
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
		

		globalMap.put("tDBInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class row6Struct implements routines.system.IPersistableComparableLookupRow<row6Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int OFFER_ID;

				public int getOFFER_ID () {
					return this.OFFER_ID;
				}
				
			    public String OFFER;

				public String getOFFER () {
					return this.OFFER;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.OFFER_ID;
						
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
		
						if (this.OFFER_ID != other.OFFER_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(row6Struct other) {

		other.OFFER_ID = this.OFFER_ID;
	            other.OFFER = this.OFFER;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row6Struct other) {

		other.OFFER_ID = this.OFFER_ID;
	            	
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.OFFER_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.OFFER_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.OFFER_ID);
					
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
		
						this.OFFER = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.OFFER = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.OFFER, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.OFFER, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("OFFER_ID="+String.valueOf(OFFER_ID));
		sb.append(",OFFER="+OFFER);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row6Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.OFFER_ID, other.OFFER_ID);
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
public void tDBInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_5_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_5 - inputs:(after_tFileInputDelimited_1) outputs:(row6,row6) | target node:tAdvancedHash_row6 - inputs:(row6) outputs:()
			   		// linked node: tMap_5 - inputs:(insertServices3,row6) outputs:(insertServices4,InsertReject4)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row6 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row6Struct> tHash_Lookup_row6 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row6Struct>getLookup(matchingModeEnum_row6);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row6", tHash_Lookup_row6);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row6 begin ] stop
 */



	
	/**
	 * [tDBInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_5", false);
		start_Hash.put("tDBInput_5", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_5";

	
		int tos_count_tDBInput_5 = 0;
		
	
    
	
		    int nb_line_tDBInput_5 = 0;
		    java.sql.Connection conn_tDBInput_5 = null;
				String driverClass_tDBInput_5 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_5 = java.lang.Class.forName(driverClass_tDBInput_5);
				String dbUser_tDBInput_5 = context.user;
				
				
	final String decryptedPassword_tDBInput_5 = context.password; 
				
				String dbPwd_tDBInput_5 = decryptedPassword_tDBInput_5;
				
				String url_tDBInput_5 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_5 = java.sql.DriverManager.getConnection(url_tDBInput_5,dbUser_tDBInput_5,dbPwd_tDBInput_5);
		        
				conn_tDBInput_5.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_5 = conn_tDBInput_5.createStatement();

		    String dbquery_tDBInput_5 = "SELECT \n  \""+context.schemaDwh+"\".\"DWH_DIM_OFFER\".\"OFFER_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_OFFER\".\"OFFER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_OFFER\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_OFFER\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_OFFER\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"DWH_DIM_OFFER\"";
		    

            	globalMap.put("tDBInput_5_QUERY",dbquery_tDBInput_5);
		    java.sql.ResultSet rs_tDBInput_5 = null;

		    try {
		    	rs_tDBInput_5 = stmt_tDBInput_5.executeQuery(dbquery_tDBInput_5);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_5 = rs_tDBInput_5.getMetaData();
		    	int colQtyInRs_tDBInput_5 = rsmd_tDBInput_5.getColumnCount();

		    String tmpContent_tDBInput_5 = null;
		    
		    
		    while (rs_tDBInput_5.next()) {
		        nb_line_tDBInput_5++;
		        
							if(colQtyInRs_tDBInput_5 < 1) {
								row6.OFFER_ID = 0;
							} else {
		                          
            row6.OFFER_ID = rs_tDBInput_5.getInt(1);
            if(rs_tDBInput_5.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_5 < 2) {
								row6.OFFER = null;
							} else {
	                         		
        	row6.OFFER = routines.system.JDBCUtil.getString(rs_tDBInput_5, 2, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 3) {
								row6.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row6.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_5, 3, false);
		                    }
							if(colQtyInRs_tDBInput_5 < 4) {
								row6.DT_INSERTION = null;
							} else {
										
			row6.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_5, 4);
		                    }
							if(colQtyInRs_tDBInput_5 < 5) {
								row6.LB_JOB_NAME = null;
							} else {
	                         		
        	row6.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_5, 5, false);
		                    }
					


 



/**
 * [tDBInput_5 begin ] stop
 */
	
	/**
	 * [tDBInput_5 main ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 


	tos_count_tDBInput_5++;

/**
 * [tDBInput_5 main ] stop
 */
	
	/**
	 * [tDBInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_begin ] stop
 */

	
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
		   	   	   
				
				row6_HashRow.OFFER_ID = row6.OFFER_ID;
				
				row6_HashRow.OFFER = row6.OFFER;
				
				row6_HashRow.LB_NOM_FICHIER = row6.LB_NOM_FICHIER;
				
				row6_HashRow.DT_INSERTION = row6.DT_INSERTION;
				
				row6_HashRow.LB_JOB_NAME = row6.LB_JOB_NAME;
				
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



	
	/**
	 * [tDBInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_5 end ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

	}
}finally{
	if (rs_tDBInput_5 != null) {
		rs_tDBInput_5.close();
	}
	if (stmt_tDBInput_5 != null) {
		stmt_tDBInput_5.close();
	}
	if(conn_tDBInput_5 != null && !conn_tDBInput_5.isClosed()) {
		
			conn_tDBInput_5.commit();
			
		
			conn_tDBInput_5.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_5_NB_LINE",nb_line_tDBInput_5);
 

ok_Hash.put("tDBInput_5", true);
end_Hash.put("tDBInput_5", System.currentTimeMillis());




/**
 * [tDBInput_5 end ] stop
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
	 * [tDBInput_5 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_5";

	

 



/**
 * [tDBInput_5 finally ] stop
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
		

		globalMap.put("tDBInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class row7Struct implements routines.system.IPersistableComparableLookupRow<row7Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public int SERVICE_ID;

				public int getSERVICE_ID () {
					return this.SERVICE_ID;
				}
				
			    public String PHONE_SERVICE;

				public String getPHONE_SERVICE () {
					return this.PHONE_SERVICE;
				}
				
			    public String MULTIPLE_LINES;

				public String getMULTIPLE_LINES () {
					return this.MULTIPLE_LINES;
				}
				
			    public String INTERNET_SERVICE;

				public String getINTERNET_SERVICE () {
					return this.INTERNET_SERVICE;
				}
				
			    public String INTERNET_TYPE;

				public String getINTERNET_TYPE () {
					return this.INTERNET_TYPE;
				}
				
			    public String ONLINE_SECURITY;

				public String getONLINE_SECURITY () {
					return this.ONLINE_SECURITY;
				}
				
			    public String ONLINE_BACKUP;

				public String getONLINE_BACKUP () {
					return this.ONLINE_BACKUP;
				}
				
			    public String DEVICE_PROTECTION;

				public String getDEVICE_PROTECTION () {
					return this.DEVICE_PROTECTION;
				}
				
			    public String PREMIUM_TECH_SUPPORT;

				public String getPREMIUM_TECH_SUPPORT () {
					return this.PREMIUM_TECH_SUPPORT;
				}
				
			    public String STREAMING_TV;

				public String getSTREAMING_TV () {
					return this.STREAMING_TV;
				}
				
			    public String STREAMING_MOVIES;

				public String getSTREAMING_MOVIES () {
					return this.STREAMING_MOVIES;
				}
				
			    public String STREAMING_MUSIC;

				public String getSTREAMING_MUSIC () {
					return this.STREAMING_MUSIC;
				}
				
			    public String UNLIMITED_DATA;

				public String getUNLIMITED_DATA () {
					return this.UNLIMITED_DATA;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
							result = prime * result + (int) this.SERVICE_ID;
						
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
		
						if (this.SERVICE_ID != other.SERVICE_ID)
							return false;
					

		return true;
    }

	public void copyDataTo(row7Struct other) {

		other.SERVICE_ID = this.SERVICE_ID;
	            other.PHONE_SERVICE = this.PHONE_SERVICE;
	            other.MULTIPLE_LINES = this.MULTIPLE_LINES;
	            other.INTERNET_SERVICE = this.INTERNET_SERVICE;
	            other.INTERNET_TYPE = this.INTERNET_TYPE;
	            other.ONLINE_SECURITY = this.ONLINE_SECURITY;
	            other.ONLINE_BACKUP = this.ONLINE_BACKUP;
	            other.DEVICE_PROTECTION = this.DEVICE_PROTECTION;
	            other.PREMIUM_TECH_SUPPORT = this.PREMIUM_TECH_SUPPORT;
	            other.STREAMING_TV = this.STREAMING_TV;
	            other.STREAMING_MOVIES = this.STREAMING_MOVIES;
	            other.STREAMING_MUSIC = this.STREAMING_MUSIC;
	            other.UNLIMITED_DATA = this.UNLIMITED_DATA;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row7Struct other) {

		other.SERVICE_ID = this.SERVICE_ID;
	            	
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.SERVICE_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
			        this.SERVICE_ID = dis.readInt();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// int
				
		            	dos.writeInt(this.SERVICE_ID);
					
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
		
						this.PHONE_SERVICE = readString(dis,ois);
					
						this.MULTIPLE_LINES = readString(dis,ois);
					
						this.INTERNET_SERVICE = readString(dis,ois);
					
						this.INTERNET_TYPE = readString(dis,ois);
					
						this.ONLINE_SECURITY = readString(dis,ois);
					
						this.ONLINE_BACKUP = readString(dis,ois);
					
						this.DEVICE_PROTECTION = readString(dis,ois);
					
						this.PREMIUM_TECH_SUPPORT = readString(dis,ois);
					
						this.STREAMING_TV = readString(dis,ois);
					
						this.STREAMING_MOVIES = readString(dis,ois);
					
						this.STREAMING_MUSIC = readString(dis,ois);
					
						this.UNLIMITED_DATA = readString(dis,ois);
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
						this.PHONE_SERVICE = readString(dis,objectIn);
					
						this.MULTIPLE_LINES = readString(dis,objectIn);
					
						this.INTERNET_SERVICE = readString(dis,objectIn);
					
						this.INTERNET_TYPE = readString(dis,objectIn);
					
						this.ONLINE_SECURITY = readString(dis,objectIn);
					
						this.ONLINE_BACKUP = readString(dis,objectIn);
					
						this.DEVICE_PROTECTION = readString(dis,objectIn);
					
						this.PREMIUM_TECH_SUPPORT = readString(dis,objectIn);
					
						this.STREAMING_TV = readString(dis,objectIn);
					
						this.STREAMING_MOVIES = readString(dis,objectIn);
					
						this.STREAMING_MUSIC = readString(dis,objectIn);
					
						this.UNLIMITED_DATA = readString(dis,objectIn);
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
						writeString(this.PHONE_SERVICE, dos, oos);
					
						writeString(this.MULTIPLE_LINES, dos, oos);
					
						writeString(this.INTERNET_SERVICE, dos, oos);
					
						writeString(this.INTERNET_TYPE, dos, oos);
					
						writeString(this.ONLINE_SECURITY, dos, oos);
					
						writeString(this.ONLINE_BACKUP, dos, oos);
					
						writeString(this.DEVICE_PROTECTION, dos, oos);
					
						writeString(this.PREMIUM_TECH_SUPPORT, dos, oos);
					
						writeString(this.STREAMING_TV, dos, oos);
					
						writeString(this.STREAMING_MOVIES, dos, oos);
					
						writeString(this.STREAMING_MUSIC, dos, oos);
					
						writeString(this.UNLIMITED_DATA, dos, oos);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
						writeString(this.PHONE_SERVICE, dos, objectOut);
					
						writeString(this.MULTIPLE_LINES, dos, objectOut);
					
						writeString(this.INTERNET_SERVICE, dos, objectOut);
					
						writeString(this.INTERNET_TYPE, dos, objectOut);
					
						writeString(this.ONLINE_SECURITY, dos, objectOut);
					
						writeString(this.ONLINE_BACKUP, dos, objectOut);
					
						writeString(this.DEVICE_PROTECTION, dos, objectOut);
					
						writeString(this.PREMIUM_TECH_SUPPORT, dos, objectOut);
					
						writeString(this.STREAMING_TV, dos, objectOut);
					
						writeString(this.STREAMING_MOVIES, dos, objectOut);
					
						writeString(this.STREAMING_MUSIC, dos, objectOut);
					
						writeString(this.UNLIMITED_DATA, dos, objectOut);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("SERVICE_ID="+String.valueOf(SERVICE_ID));
		sb.append(",PHONE_SERVICE="+PHONE_SERVICE);
		sb.append(",MULTIPLE_LINES="+MULTIPLE_LINES);
		sb.append(",INTERNET_SERVICE="+INTERNET_SERVICE);
		sb.append(",INTERNET_TYPE="+INTERNET_TYPE);
		sb.append(",ONLINE_SECURITY="+ONLINE_SECURITY);
		sb.append(",ONLINE_BACKUP="+ONLINE_BACKUP);
		sb.append(",DEVICE_PROTECTION="+DEVICE_PROTECTION);
		sb.append(",PREMIUM_TECH_SUPPORT="+PREMIUM_TECH_SUPPORT);
		sb.append(",STREAMING_TV="+STREAMING_TV);
		sb.append(",STREAMING_MOVIES="+STREAMING_MOVIES);
		sb.append(",STREAMING_MUSIC="+STREAMING_MUSIC);
		sb.append(",UNLIMITED_DATA="+UNLIMITED_DATA);
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row7Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.SERVICE_ID, other.SERVICE_ID);
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
public void tDBInput_6Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_6_SUBPROCESS_STATE", 0);

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
			   		// source node:tDBInput_6 - inputs:(after_tFileInputDelimited_1) outputs:(row7,row7) | target node:tAdvancedHash_row7 - inputs:(row7) outputs:()
			   		// linked node: tMap_6 - inputs:(insertServices4,row7) outputs:(insertServices5,InsertReject5)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row7 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row7Struct> tHash_Lookup_row7 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row7Struct>getLookup(matchingModeEnum_row7);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row7", tHash_Lookup_row7);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row7 begin ] stop
 */



	
	/**
	 * [tDBInput_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_6", false);
		start_Hash.put("tDBInput_6", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_6";

	
		int tos_count_tDBInput_6 = 0;
		
	
    
	
		    int nb_line_tDBInput_6 = 0;
		    java.sql.Connection conn_tDBInput_6 = null;
				String driverClass_tDBInput_6 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_6 = java.lang.Class.forName(driverClass_tDBInput_6);
				String dbUser_tDBInput_6 = context.user;
				
				
	final String decryptedPassword_tDBInput_6 = context.password; 
				
				String dbPwd_tDBInput_6 = decryptedPassword_tDBInput_6;
				
				String url_tDBInput_6 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_6 = java.sql.DriverManager.getConnection(url_tDBInput_6,dbUser_tDBInput_6,dbPwd_tDBInput_6);
		        
				conn_tDBInput_6.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_6 = conn_tDBInput_6.createStatement();

		    String dbquery_tDBInput_6 = "SELECT \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"SERVICE_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"PHONE_SERVICE\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"MULTIPLE_LINES\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"INTERNET_SERVICE\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"INTERNET_TYPE\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"ONLINE_SECURITY\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"ONLINE_BACKUP\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"DEVICE_PROTECTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"PREMIUM_TECH_SUPPORT\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"STREAMING_TV\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"STREAMING_MOVIES\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"STREAMING_MUSIC\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"UNLIMITED_DATA\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"DWH_DIM_SERVICE\"";
		    

            	globalMap.put("tDBInput_6_QUERY",dbquery_tDBInput_6);
		    java.sql.ResultSet rs_tDBInput_6 = null;

		    try {
		    	rs_tDBInput_6 = stmt_tDBInput_6.executeQuery(dbquery_tDBInput_6);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_6 = rs_tDBInput_6.getMetaData();
		    	int colQtyInRs_tDBInput_6 = rsmd_tDBInput_6.getColumnCount();

		    String tmpContent_tDBInput_6 = null;
		    
		    
		    while (rs_tDBInput_6.next()) {
		        nb_line_tDBInput_6++;
		        
							if(colQtyInRs_tDBInput_6 < 1) {
								row7.SERVICE_ID = 0;
							} else {
		                          
            row7.SERVICE_ID = rs_tDBInput_6.getInt(1);
            if(rs_tDBInput_6.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_6 < 2) {
								row7.PHONE_SERVICE = null;
							} else {
	                         		
        	row7.PHONE_SERVICE = routines.system.JDBCUtil.getString(rs_tDBInput_6, 2, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 3) {
								row7.MULTIPLE_LINES = null;
							} else {
	                         		
        	row7.MULTIPLE_LINES = routines.system.JDBCUtil.getString(rs_tDBInput_6, 3, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 4) {
								row7.INTERNET_SERVICE = null;
							} else {
	                         		
        	row7.INTERNET_SERVICE = routines.system.JDBCUtil.getString(rs_tDBInput_6, 4, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 5) {
								row7.INTERNET_TYPE = null;
							} else {
	                         		
        	row7.INTERNET_TYPE = routines.system.JDBCUtil.getString(rs_tDBInput_6, 5, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 6) {
								row7.ONLINE_SECURITY = null;
							} else {
	                         		
        	row7.ONLINE_SECURITY = routines.system.JDBCUtil.getString(rs_tDBInput_6, 6, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 7) {
								row7.ONLINE_BACKUP = null;
							} else {
	                         		
        	row7.ONLINE_BACKUP = routines.system.JDBCUtil.getString(rs_tDBInput_6, 7, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 8) {
								row7.DEVICE_PROTECTION = null;
							} else {
	                         		
        	row7.DEVICE_PROTECTION = routines.system.JDBCUtil.getString(rs_tDBInput_6, 8, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 9) {
								row7.PREMIUM_TECH_SUPPORT = null;
							} else {
	                         		
        	row7.PREMIUM_TECH_SUPPORT = routines.system.JDBCUtil.getString(rs_tDBInput_6, 9, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 10) {
								row7.STREAMING_TV = null;
							} else {
	                         		
        	row7.STREAMING_TV = routines.system.JDBCUtil.getString(rs_tDBInput_6, 10, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 11) {
								row7.STREAMING_MOVIES = null;
							} else {
	                         		
        	row7.STREAMING_MOVIES = routines.system.JDBCUtil.getString(rs_tDBInput_6, 11, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 12) {
								row7.STREAMING_MUSIC = null;
							} else {
	                         		
        	row7.STREAMING_MUSIC = routines.system.JDBCUtil.getString(rs_tDBInput_6, 12, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 13) {
								row7.UNLIMITED_DATA = null;
							} else {
	                         		
        	row7.UNLIMITED_DATA = routines.system.JDBCUtil.getString(rs_tDBInput_6, 13, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 14) {
								row7.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row7.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_6, 14, false);
		                    }
							if(colQtyInRs_tDBInput_6 < 15) {
								row7.DT_INSERTION = null;
							} else {
										
			row7.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_6, 15);
		                    }
							if(colQtyInRs_tDBInput_6 < 16) {
								row7.LB_JOB_NAME = null;
							} else {
	                         		
        	row7.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_6, 16, false);
		                    }
					


 



/**
 * [tDBInput_6 begin ] stop
 */
	
	/**
	 * [tDBInput_6 main ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 


	tos_count_tDBInput_6++;

/**
 * [tDBInput_6 main ] stop
 */
	
	/**
	 * [tDBInput_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_begin ] stop
 */

	
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
		   	   	   
				
				row7_HashRow.SERVICE_ID = row7.SERVICE_ID;
				
				row7_HashRow.PHONE_SERVICE = row7.PHONE_SERVICE;
				
				row7_HashRow.MULTIPLE_LINES = row7.MULTIPLE_LINES;
				
				row7_HashRow.INTERNET_SERVICE = row7.INTERNET_SERVICE;
				
				row7_HashRow.INTERNET_TYPE = row7.INTERNET_TYPE;
				
				row7_HashRow.ONLINE_SECURITY = row7.ONLINE_SECURITY;
				
				row7_HashRow.ONLINE_BACKUP = row7.ONLINE_BACKUP;
				
				row7_HashRow.DEVICE_PROTECTION = row7.DEVICE_PROTECTION;
				
				row7_HashRow.PREMIUM_TECH_SUPPORT = row7.PREMIUM_TECH_SUPPORT;
				
				row7_HashRow.STREAMING_TV = row7.STREAMING_TV;
				
				row7_HashRow.STREAMING_MOVIES = row7.STREAMING_MOVIES;
				
				row7_HashRow.STREAMING_MUSIC = row7.STREAMING_MUSIC;
				
				row7_HashRow.UNLIMITED_DATA = row7.UNLIMITED_DATA;
				
				row7_HashRow.LB_NOM_FICHIER = row7.LB_NOM_FICHIER;
				
				row7_HashRow.DT_INSERTION = row7.DT_INSERTION;
				
				row7_HashRow.LB_JOB_NAME = row7.LB_JOB_NAME;
				
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



	
	/**
	 * [tDBInput_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_6 end ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

	}
}finally{
	if (rs_tDBInput_6 != null) {
		rs_tDBInput_6.close();
	}
	if (stmt_tDBInput_6 != null) {
		stmt_tDBInput_6.close();
	}
	if(conn_tDBInput_6 != null && !conn_tDBInput_6.isClosed()) {
		
			conn_tDBInput_6.commit();
			
		
			conn_tDBInput_6.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_6_NB_LINE",nb_line_tDBInput_6);
 

ok_Hash.put("tDBInput_6", true);
end_Hash.put("tDBInput_6", System.currentTimeMillis());




/**
 * [tDBInput_6 end ] stop
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
	 * [tDBInput_6 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_6";

	

 



/**
 * [tDBInput_6 finally ] stop
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
		

		globalMap.put("tDBInput_6_SUBPROCESS_STATE", 1);
	}
	


public static class row8Struct implements routines.system.IPersistableComparableLookupRow<row8Struct> {
    final static byte[] commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
    static byte[] commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String CUSTOMER_ID;

				public String getCUSTOMER_ID () {
					return this.CUSTOMER_ID;
				}
				
			    public int LOCATION_ID;

				public int getLOCATION_ID () {
					return this.LOCATION_ID;
				}
				
			    public String GENDER;

				public String getGENDER () {
					return this.GENDER;
				}
				
			    public int AGE;

				public int getAGE () {
					return this.AGE;
				}
				
			    public String MARRIED;

				public String getMARRIED () {
					return this.MARRIED;
				}
				
			    public int NUMBER_DEPENDENTS;

				public int getNUMBER_DEPENDENTS () {
					return this.NUMBER_DEPENDENTS;
				}
				
			    public int NUMBER_REFERRALS;

				public int getNUMBER_REFERRALS () {
					return this.NUMBER_REFERRALS;
				}
				
			    public String LB_NOM_FICHIER;

				public String getLB_NOM_FICHIER () {
					return this.LB_NOM_FICHIER;
				}
				
			    public java.util.Date DT_INSERTION;

				public java.util.Date getDT_INSERTION () {
					return this.DT_INSERTION;
				}
				
			    public String LB_JOB_NAME;

				public String getLB_JOB_NAME () {
					return this.LB_JOB_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.CUSTOMER_ID == null) ? 0 : this.CUSTOMER_ID.hashCode());
					
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
		final row8Struct other = (row8Struct) obj;
		
						if (this.CUSTOMER_ID == null) {
							if (other.CUSTOMER_ID != null)
								return false;
						
						} else if (!this.CUSTOMER_ID.equals(other.CUSTOMER_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row8Struct other) {

		other.CUSTOMER_ID = this.CUSTOMER_ID;
	            other.LOCATION_ID = this.LOCATION_ID;
	            other.GENDER = this.GENDER;
	            other.AGE = this.AGE;
	            other.MARRIED = this.MARRIED;
	            other.NUMBER_DEPENDENTS = this.NUMBER_DEPENDENTS;
	            other.NUMBER_REFERRALS = this.NUMBER_REFERRALS;
	            other.LB_NOM_FICHIER = this.LB_NOM_FICHIER;
	            other.DT_INSERTION = this.DT_INSERTION;
	            other.LB_JOB_NAME = this.LB_JOB_NAME;
	            
	}

	public void copyKeysDataTo(row8Struct other) {

		other.CUSTOMER_ID = this.CUSTOMER_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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
			if(length > commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length) {
				if(length < 1024 && commonByteArray_CHURN_PROJECT_jLoadFactTableDim.length == 0) {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[1024];
				} else {
   					commonByteArray_CHURN_PROJECT_jLoadFactTableDim = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length);
			strReturn = new String(commonByteArray_CHURN_PROJECT_jLoadFactTableDim, 0, length, utf8Charset);
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

	private java.util.Date readDate(DataInputStream dis, ObjectInputStream ois) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(DataInputStream dis, org.jboss.marshalling.Unmarshaller unmarshaller ) throws IOException{
		java.util.Date dateReturn = null;
		int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

	private void writeDate(java.util.Date date1, DataOutputStream dos, ObjectOutputStream oos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
	}
	
	private void writeDate(java.util.Date date1, DataOutputStream dos, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
	}

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readKeysData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_CHURN_PROJECT_jLoadFactTableDim) {

        	try {

        		int length = 0;
		
					this.CUSTOMER_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeKeysData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// String
				
						writeString(this.CUSTOMER_ID,dos);
					
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
		
			            this.LOCATION_ID = dis.readInt();
					
						this.GENDER = readString(dis,ois);
					
			            this.AGE = dis.readInt();
					
						this.MARRIED = readString(dis,ois);
					
			            this.NUMBER_DEPENDENTS = dis.readInt();
					
			            this.NUMBER_REFERRALS = dis.readInt();
					
						this.LB_NOM_FICHIER = readString(dis,ois);
					
						this.DT_INSERTION = readDate(dis,ois);
					
						this.LB_JOB_NAME = readString(dis,ois);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }
    
    public void readValuesData(DataInputStream dis, org.jboss.marshalling.Unmarshaller objectIn) {
        try {
			int length = 0;
		
			            this.LOCATION_ID = objectIn.readInt();
					
						this.GENDER = readString(dis,objectIn);
					
			            this.AGE = objectIn.readInt();
					
						this.MARRIED = readString(dis,objectIn);
					
			            this.NUMBER_DEPENDENTS = objectIn.readInt();
					
			            this.NUMBER_REFERRALS = objectIn.readInt();
					
						this.LB_NOM_FICHIER = readString(dis,objectIn);
					
						this.DT_INSERTION = readDate(dis,objectIn);
					
						this.LB_JOB_NAME = readString(dis,objectIn);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
		            	dos.writeInt(this.LOCATION_ID);
					
						writeString(this.GENDER, dos, oos);
					
		            	dos.writeInt(this.AGE);
					
						writeString(this.MARRIED, dos, oos);
					
		            	dos.writeInt(this.NUMBER_DEPENDENTS);
					
		            	dos.writeInt(this.NUMBER_REFERRALS);
					
						writeString(this.LB_NOM_FICHIER, dos, oos);
					
						writeDate(this.DT_INSERTION, dos, oos);
					
						writeString(this.LB_JOB_NAME, dos, oos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        	}

    }
    
    public void writeValuesData(DataOutputStream dos, org.jboss.marshalling.Marshaller objectOut){
                try {

		
					objectOut.writeInt(this.LOCATION_ID);
					
						writeString(this.GENDER, dos, objectOut);
					
					objectOut.writeInt(this.AGE);
					
						writeString(this.MARRIED, dos, objectOut);
					
					objectOut.writeInt(this.NUMBER_DEPENDENTS);
					
					objectOut.writeInt(this.NUMBER_REFERRALS);
					
						writeString(this.LB_NOM_FICHIER, dos, objectOut);
					
						writeDate(this.DT_INSERTION, dos, objectOut);
					
						writeString(this.LB_JOB_NAME, dos, objectOut);
					
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
		sb.append("CUSTOMER_ID="+CUSTOMER_ID);
		sb.append(",LOCATION_ID="+String.valueOf(LOCATION_ID));
		sb.append(",GENDER="+GENDER);
		sb.append(",AGE="+String.valueOf(AGE));
		sb.append(",MARRIED="+MARRIED);
		sb.append(",NUMBER_DEPENDENTS="+String.valueOf(NUMBER_DEPENDENTS));
		sb.append(",NUMBER_REFERRALS="+String.valueOf(NUMBER_REFERRALS));
		sb.append(",LB_NOM_FICHIER="+LB_NOM_FICHIER);
		sb.append(",DT_INSERTION="+String.valueOf(DT_INSERTION));
		sb.append(",LB_JOB_NAME="+LB_JOB_NAME);
	    sb.append("]");

	    return sb.toString();
    }

    /**
     * Compare keys
     */
    public int compareTo(row8Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.CUSTOMER_ID, other.CUSTOMER_ID);
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
public void tDBInput_7Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBInput_7_SUBPROCESS_STATE", 0);

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



		row8Struct row8 = new row8Struct();




	
	/**
	 * [tAdvancedHash_row8 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_row8", false);
		start_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"row8");
					}
				
		int tos_count_tAdvancedHash_row8 = 0;
		

			   		// connection name:row8
			   		// source node:tDBInput_7 - inputs:(after_tFileInputDelimited_1) outputs:(row8,row8) | target node:tAdvancedHash_row8 - inputs:(row8) outputs:()
			   		// linked node: tMap_7 - inputs:(insertServices5,row8) outputs:(insertNewElements,InsertReject6)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_row8 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<row8Struct> tHash_Lookup_row8 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<row8Struct>getLookup(matchingModeEnum_row8);
	   						   
		   	   	   globalMap.put("tHash_Lookup_row8", tHash_Lookup_row8);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_row8 begin ] stop
 */



	
	/**
	 * [tDBInput_7 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBInput_7", false);
		start_Hash.put("tDBInput_7", System.currentTimeMillis());
		
	
	currentComponent="tDBInput_7";

	
		int tos_count_tDBInput_7 = 0;
		
	
    
	
		    int nb_line_tDBInput_7 = 0;
		    java.sql.Connection conn_tDBInput_7 = null;
				String driverClass_tDBInput_7 = "org.postgresql.Driver";
			    java.lang.Class jdbcclazz_tDBInput_7 = java.lang.Class.forName(driverClass_tDBInput_7);
				String dbUser_tDBInput_7 = context.user;
				
				
	final String decryptedPassword_tDBInput_7 = context.password; 
				
				String dbPwd_tDBInput_7 = decryptedPassword_tDBInput_7;
				
				String url_tDBInput_7 = "jdbc:postgresql://" + context.serverName + ":" + context.port + "/" + context.database + "?" + context.additionalParam;
				
				conn_tDBInput_7 = java.sql.DriverManager.getConnection(url_tDBInput_7,dbUser_tDBInput_7,dbPwd_tDBInput_7);
		        
				conn_tDBInput_7.setAutoCommit(false);
			
		    
			java.sql.Statement stmt_tDBInput_7 = conn_tDBInput_7.createStatement();

		    String dbquery_tDBInput_7 = "SELECT \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"CUSTOMER_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"LOCATION_ID\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"GENDER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"AGE\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"MARRIED\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"NUMBER_DEPENDENTS\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"NUMBER_REFERRALS\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"LB_NOM_FICHIER\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"DT_INSERTION\", \n  \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\".\"LB_JOB_NAME\"\nFROM \""+context.schemaDwh+"\".\"DWH_DIM_CUSTOMER\"";
		    

            	globalMap.put("tDBInput_7_QUERY",dbquery_tDBInput_7);
		    java.sql.ResultSet rs_tDBInput_7 = null;

		    try {
		    	rs_tDBInput_7 = stmt_tDBInput_7.executeQuery(dbquery_tDBInput_7);
		    	java.sql.ResultSetMetaData rsmd_tDBInput_7 = rs_tDBInput_7.getMetaData();
		    	int colQtyInRs_tDBInput_7 = rsmd_tDBInput_7.getColumnCount();

		    String tmpContent_tDBInput_7 = null;
		    
		    
		    while (rs_tDBInput_7.next()) {
		        nb_line_tDBInput_7++;
		        
							if(colQtyInRs_tDBInput_7 < 1) {
								row8.CUSTOMER_ID = null;
							} else {
	                         		
        	row8.CUSTOMER_ID = routines.system.JDBCUtil.getString(rs_tDBInput_7, 1, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 2) {
								row8.LOCATION_ID = 0;
							} else {
		                          
            row8.LOCATION_ID = rs_tDBInput_7.getInt(2);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 3) {
								row8.GENDER = null;
							} else {
	                         		
        	row8.GENDER = routines.system.JDBCUtil.getString(rs_tDBInput_7, 3, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 4) {
								row8.AGE = 0;
							} else {
		                          
            row8.AGE = rs_tDBInput_7.getInt(4);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 5) {
								row8.MARRIED = null;
							} else {
	                         		
        	row8.MARRIED = routines.system.JDBCUtil.getString(rs_tDBInput_7, 5, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 6) {
								row8.NUMBER_DEPENDENTS = 0;
							} else {
		                          
            row8.NUMBER_DEPENDENTS = rs_tDBInput_7.getInt(6);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 7) {
								row8.NUMBER_REFERRALS = 0;
							} else {
		                          
            row8.NUMBER_REFERRALS = rs_tDBInput_7.getInt(7);
            if(rs_tDBInput_7.wasNull()){
                    throw new RuntimeException("Null value in non-Nullable column");
            }
		                    }
							if(colQtyInRs_tDBInput_7 < 8) {
								row8.LB_NOM_FICHIER = null;
							} else {
	                         		
        	row8.LB_NOM_FICHIER = routines.system.JDBCUtil.getString(rs_tDBInput_7, 8, false);
		                    }
							if(colQtyInRs_tDBInput_7 < 9) {
								row8.DT_INSERTION = null;
							} else {
										
			row8.DT_INSERTION = routines.system.JDBCUtil.getDate(rs_tDBInput_7, 9);
		                    }
							if(colQtyInRs_tDBInput_7 < 10) {
								row8.LB_JOB_NAME = null;
							} else {
	                         		
        	row8.LB_JOB_NAME = routines.system.JDBCUtil.getString(rs_tDBInput_7, 10, false);
		                    }
					


 



/**
 * [tDBInput_7 begin ] stop
 */
	
	/**
	 * [tDBInput_7 main ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 


	tos_count_tDBInput_7++;

/**
 * [tDBInput_7 main ] stop
 */
	
	/**
	 * [tDBInput_7 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"row8"
						
						);
					}
					


			   
			   

					row8Struct row8_HashRow = new row8Struct();
		   	   	   
				
				row8_HashRow.CUSTOMER_ID = row8.CUSTOMER_ID;
				
				row8_HashRow.LOCATION_ID = row8.LOCATION_ID;
				
				row8_HashRow.GENDER = row8.GENDER;
				
				row8_HashRow.AGE = row8.AGE;
				
				row8_HashRow.MARRIED = row8.MARRIED;
				
				row8_HashRow.NUMBER_DEPENDENTS = row8.NUMBER_DEPENDENTS;
				
				row8_HashRow.NUMBER_REFERRALS = row8.NUMBER_REFERRALS;
				
				row8_HashRow.LB_NOM_FICHIER = row8.LB_NOM_FICHIER;
				
				row8_HashRow.DT_INSERTION = row8.DT_INSERTION;
				
				row8_HashRow.LB_JOB_NAME = row8.LB_JOB_NAME;
				
			tHash_Lookup_row8.put(row8_HashRow);
			
            




 


	tos_count_tAdvancedHash_row8++;

/**
 * [tAdvancedHash_row8 main ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_row8 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 process_data_end ] stop
 */



	
	/**
	 * [tDBInput_7 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 process_data_end ] stop
 */
	
	/**
	 * [tDBInput_7 end ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

	}
}finally{
	if (rs_tDBInput_7 != null) {
		rs_tDBInput_7.close();
	}
	if (stmt_tDBInput_7 != null) {
		stmt_tDBInput_7.close();
	}
	if(conn_tDBInput_7 != null && !conn_tDBInput_7.isClosed()) {
		
			conn_tDBInput_7.commit();
			
		
			conn_tDBInput_7.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	}
	
}
globalMap.put("tDBInput_7_NB_LINE",nb_line_tDBInput_7);
 

ok_Hash.put("tDBInput_7", true);
end_Hash.put("tDBInput_7", System.currentTimeMillis());




/**
 * [tDBInput_7 end ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

tHash_Lookup_row8.endPut();

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"row8");
			  	}
			  	
 

ok_Hash.put("tAdvancedHash_row8", true);
end_Hash.put("tAdvancedHash_row8", System.currentTimeMillis());




/**
 * [tAdvancedHash_row8 end ] stop
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
	 * [tDBInput_7 finally ] start
	 */

	

	
	
	currentComponent="tDBInput_7";

	

 



/**
 * [tDBInput_7 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_row8 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_row8";

	

 



/**
 * [tAdvancedHash_row8 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBInput_7_SUBPROCESS_STATE", 1);
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
        final jLoadFactTableDim jLoadFactTableDimClass = new jLoadFactTableDim();

        int exitCode = jLoadFactTableDimClass.runJobInTOS(args);

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
            java.io.InputStream inContext = jLoadFactTableDim.class.getClassLoader().getResourceAsStream("churn_project/jloadfacttabledim_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = jLoadFactTableDim.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
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

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}




this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tFileExist_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tFileExist_1) {
globalMap.put("tFileExist_1_SUBPROCESS_STATE", -1);

e_tFileExist_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : jLoadFactTableDim");
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
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






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
 *     672007 characters generated by Talend Open Studio for Data Integration 
 *     on the 30 décembre 2025 à 22:41:59 EET
 ************************************************************************************************/