# Hadoop-Data-Transformation

2.1.0_RDBMS/MySQL data transformation

•	updated_cdw_data – updated database

•	sql.txt - SQL server database, updated with LAST_UPDATED TIMESTAMP column added to cdw_sapp_customer and cdw_sapp_brunch tables, so it can have updated timestamps every time data is modified or added to these tables. 


2.1.1 – 2.1.2 - Java

2.1.1 - 2.1.2- Java/
•	Case_Study.zip - 



2.2.1 Data Extraction and Transportation with Sqoop
       
            2.2.1_Sqoop/
•	2.2.1_Data_Import_SQOOP.txt – Sqoop statements for Importing data from SQL server into HDFS 


2.2.2 Data Loading with Hive
            
            2.2.2_Hive/
•	222_Populate_External_Tables_with_HIVE.txt -  script with Hive statements to create External tables and link to the data imported into HDFS

•	222_Populate_Internal_Partitioned_Tables_with_HIVE.txt – script with Hive statements to create partitioned Internal tables and overwrite with data from respective External tables














2.2.3 Automating Sqoop and Hive processes from steps 2.2.1 and 2.2.2 with Oozie Workflow.

2.2.3_Oozie/
•	223_workflow.xml – oozie xml script for extracting and modifying data based on requirements with Sqoop, creating and populating tables with Hive using scripts. 
 
•	223_Populate_External_Tables_with_HIVE.txt – script with hive statements to drop, create and populate External tables with extracted data.


•	223_Populate_Internal_Partitioned_Tables_with_HIVE.txt - script with hive statements to create Internal Tables and populate with data from respective External ones. 

•	223_job.properties - configuration file, containing all parameters needed to run Oozie workflow.

•	223_coordinator.xml – Oozie workflow scheduler.





2.2.4 Process Optimization Module  Oozie (Sqoop and Hive optimized) 

2.2.4_Oozie/ 
•	224_workflow.xml – updated Oozie workflow script for extracting only new data using Sqoop Job and updating original tables with new data using Hive. 

•	224_sqoop_jobs.txt – script with Sqoop statements that needs to be run from terminal before running Oozie Workflow.

•	224_Populate_External_Tables_with_HIVE.txt - script with hive statements to drop if exists and create Incremental/External 224_branch_incremental, 224_customer_incremental, 224_creditcard_incremental tables.

•	224_Populate_Internal_Tables_with_HIVE.txt - script with hive statements to create and populate Base/Internal tables for 224_branch_base, 224_customer_base, 224_creditcard_base with data from incremental tables.


•	224_merge_new_BRANCH_data.txt- script with hive statements to update originals 224_branch_base table with new data.

•	224_merge_new_CUSTOMER_data.txt- script with hive statements to update originals 224_customer_base table with new data.


•	224_merge_new_CC_TIME_data.txt- script with hive statements to update originals 224_creditcard_base and 224_time_base tables with new data.

•	224_job.properties - configuration file, containing all parameters needed to run Oozie workflow.

•	224_coordinator.xml – Oozie workflow scheduler.





 
2.2.5 Data Visualization


225_Visualization_n1.txt and 225_Visualization_n2.txt- hive queries requested.
225_Visualization_n1.png and 225_Visualization_n2.png- the graph snapshots of hive queries requested.



