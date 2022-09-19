QUESTION 24 Your company has an on-premises network that contains multiple servers.
The company plans to reduce the following administrative responsibilities of network administrators:
  Backing up application data
  Replacing failed server hardware
  Managing physical server security
  Updating server operating systems
  Managing permissions to shared documents
The company plans to migrate several servers to Azure virtual machines.
You need to identify which administrative responsibilities will be eliminated after the planned migration.
Which two responsibilities should you identify? Each correct answer presents a complete solution.
NOTE: Each correct selection is worth one point.
A.	Replacing failed server hardware
B.	Backing up application data
C.	Managing physical server security
D.	Updating server operating systems
E.	Managing permissions to shared documents
Correct Answer: AC
Section: Understand Cloud Concepts Explanation
Explanation/Reference:
Explanation:
Azure virtual machines run on Hyper-V physical servers.  The physical servers are owned and managed by Microsoft.  As an Azure customer, you have no access to the physical servers.  Microsoft manage the replacement of failed server hardware and the security of the physical servers so you don’t need to.
Incorrect Answers:
B: Microsoft have no control over the applications you run on the virtual machines.  Therefore, it is your responsibility to ensure that application data is backed up.
D: Microsoft do not manage the operating systems you run on the virtual machines.  Therefore, it is your responsibility to ensure that the operating systems are updated.
E: Microsoft have no control over the shared folders you host on the virtual machines.  Therefore, it is your responsibility to ensure that folder permissions are configured appropriately.

 
QUESTION 34 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Cloud Concepts Explanation
Explanation/Reference: Explanation:
Box 1: No
An Azure AD tenant can have multiple subscriptions but an Azure subscription can only be associated with one Azure AD tenant.
Box 2: Yes
Box 3: No
If your subscription expires, you lose access to all the other resources associated with the subscription. However, the Azure AD directory remains in Azure. You can associate and manage the directory using a different Azure subscription.
References:
https://docs.microsoft.com/en-us/azure/active-directory/fundamentals/active-directory-how-subscriptionsassociated-directory
QUESTION 35 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Cloud Concepts Explanation
Explanation/Reference:
References: https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/lock-resources

QUESTION 45 A support engineer plans to perform several Azure management tasks by using the Azure CLI. 
You install the CLI on a computer. 
You need to tell the support engineer which tools to use to run the CLI. 
Which two tools should you instruct the support engineer to use? Each correct answer presents a complete solution. 
NOTE: Each correct selection is worth one point.
A.	Command Prompt 
B.	Azure Resource Explorer 
C.	Windows PowerShell 
D.	Windows Defender Firewall 
E.	Network and Sharing Center 
Correct Answer: AC
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
For Windows the Azure CLI is installed via an MSI, which gives you access to the CLI through the Windows Command Prompt (CMD) or PowerShell.
References:
https://docs.microsoft.com/en-us/cli/azure/install-azure-cli-windows?view=azure-cli-latest
QUESTION 46 HOTSPOT
You need to manage Azure by using Azure Cloud Shell. 
Which Azure portal icon should you select? To answer, select the appropriate icon in the answer area. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
You can access Azure Cloud Shell in the Azure portal by clicking the icon.
Azure Cloud Shell is an interactive, authenticated, browser-accessible shell for managing Azure resources. It provides the flexibility of choosing the shell experience that best suits the way you work, either Bash or PowerShell.
Cloud Shell enables access to a browser-based command-line experience built with Azure management tasks in mind.
References: https://docs.microsoft.com/en-us/azure/cloud-shell/overview?view=azure-cli-latest
QUESTION 47
You plan to store 20 TB of data in Azure. The data will be accessed infrequently and visualized by using Microsoft Power BI. 
You need to recommend a storage solution for the data. 
Which two solutions should you recommend? Each correct answer presents a complete solution. 
NOTE: Each correct selection is worth one point. 
A.	Azure Data Lake 
B.	Azure Cosmos DB 
C.	Azure SQL Data Warehouse 
D.	Azure SQL Database 
E.	Azure Database for PostgreSQL 
Correct Answer: AC
Section: Understand Core Azure Services
QUESTION 51 You have a virtual machine named VM1 that runs Windows Server 2016. VM1 is in the East US Azure region. 
Which Azure service should you use from the Azure portal to view service failure notifications that can affect the availability of VM1?
A.	Azure Service Fabric 
B.	Azure Monitor 
C.	Azure virtual machines 
D.	Azure Advisor 
Correct Answer: C
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
In the Azure virtual machines page in the Azure portal, there is a named Maintenance Status.  This column will display service issues that could affect your virtual machine.  A service failure is rare but host server maintenance that could affect your virtual machines is more common.
Azure periodically updates its platform to improve the reliability, performance, and security of the host infrastructure for virtual machines. The purpose of these updates ranges from patching software components in the hosting environment to upgrading networking components or decommissioning hardware.
References: https://docs.microsoft.com/en-us/azure/virtual-machines/maintenance-and-updates
QUESTION 52
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
An Azure administrator plans to run a PowerShell script that creates Azure resources. 
You need to recommend which computer configuration to use to run the script. 
Solution: Run the script from a computer that runs Linux and has the Azure CLI tools installed. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: B
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
A PowerShell script is a file that contains PowerShell cmdlets and code. A PowerShell script needs to be run in PowerShell.
PowerShell can now be installed on Linux. However, the question states that the computer has Azure CLI tools, not PowerShell installed.  Therefore, this solution does not meet the goal.
References:
https://docs.microsoft.com/en-us/powershell/scripting/components/ise/how-to-write-and-run-scripts-in-thewindows-powershell-ise?view=powershell-6
QUESTION 53
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
An Azure administrator plans to run a PowerShell script that creates Azure resources. 
You need to recommend which computer configuration to use to run the script. 
Solution: Run the script from a computer that runs Chrome OS and uses Azure Cloud Shell. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
A PowerShell script is a file that contains PowerShell cmdlets and code. A PowerShell script needs to be run in PowerShell.
With the Azure Cloud Shell, you can run PowerShell cmdlets and scripts in a Web browser. You log in to the Azure Portal and select the Azure Cloud Shell option.  This will open a PowerShell session in the Web browser.  The Azure Cloud Shell has the necessary Azure PowerShell module installed.
Note: to run a PowerShell script in the Azure Cloud Shell, you need to change to the directory where the PowerShell script is stored.
References: https://docs.microsoft.com/en-us/azure/cloud-shell/quickstart-powershell
QUESTION 54
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
An Azure administrator plans to run a PowerShell script that creates Azure resources. 
You need to recommend which computer configuration to use to run the script. 
Solution: Run the script from a computer that runs macOS and has PowerShell Core 6.0 installed.  
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
A PowerShell script is a file that contains PowerShell cmdlets and code. A PowerShell script needs to be run in PowerShell.  
In this question, the computer has PowerShell Core 6.0 installed. Therefore, this solution does meet the goal.
Note: To create Azure resources using PowerShell, you would need to import the Azure PowerShell module which includes the PowerShell cmdlets required to create the resources.
References:
https://docs.microsoft.com/en-us/powershell/scripting/components/ise/how-to-write-and-run-scripts-in-thewindows-powershell-ise?view=powershell-6
QUESTION 56 HOTSPOT
You need to view a list of planned maintenance events that can affect the availability of an Azure subscription. 
Which blade should you use from the Azure portal? To answer, select the appropriate blade in the answer area. 
Hot Area: 
 
Correct Answer:  
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
On the Help and Support blade, there is a Service Health option.  If you click Service Health, a new blade opens.  The Service Health blade contains the Planned Maintenance link which opens a blade where you can view a list of planned maintenance events that can affect the availability of an Azure subscription.
QUESTION 57 DRAG DROP
Match the Azure service to the correct definition. 
Instructions: To answer, drag the appropriate Azure service from the column on the left to its description on the right. Each service may be used once, more than once, or not at all. 
NOTE: Each correct match is worth one point. 
Select and Place:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Box 1: Azure DevOps.
Azure DevOps is Microsoft’s primary software development and deployment platform.
DevOps influences the application lifecycle throughout its plan, develop, deliver and operate phases.
Box 2: Azure Advisor.
Advisor is a personalized cloud consultant that helps you follow best practices to optimize your Azure deployments. It analyzes your resource configuration and usage telemetry and then recommends solutions that can help you improve the cost effectiveness, performance, high availability, and security of your Azure resources.
Box 3: Azure Cognitive Services.
Azure Cognitive Services are APIs, SDKs, and services available to help developers build intelligent applications without having direct AI or data science skills or knowledge. Azure Cognitive Services enable developers to easily add cognitive features into their applications. The goal of Azure Cognitive Services is to help developers create applications that can see, hear, speak, understand, and even begin to reason. The catalog of services within Azure Cognitive Services can be categorized into five main pillars - Vision, Speech, Language, Web Search, and Decision.
Box 4. Azure Application Insights.
Azure Application Insights detects and diagnoses anomalies in web apps.
Application Insights, a feature of Azure Monitor, is an extensible Application Performance Management (APM) service for developers and DevOps professionals. Use it to monitor your live applications. It will automatically detect performance anomalies, and includes powerful analytics tools to help you diagnose issues and to understand what users actually do with your app.
References:
https://docs.microsoft.com/en-us/azure/azure-monitor/app/app-insights-overview https://azure.microsoft.com/en-gb/overview/what-is-devops/ https://docs.microsoft.com/en-us/azure/advisor/advisor-overview https://docs.microsoft.com/en-us/azure/cognitive-services/welcome
QUESTION 59 DRAG DROP
Match the Azure service to the correct description.
Instructions: To answer, drag the appropriate Azure service from the column on the left to its description on the right. Each service may be used once, more than once, or not at all.
NOTE: Each correct match is worth one point.
Select and Place:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
QUESTION 61
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure environment. You need to create a new Azure virtual machine from a tablet that runs the Android operating system. 
Solution: You use Bash in Azure Cloud Shell.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
With Azure Cloud Shell, you can create virtual machines using Bash or PowerShell.
Azure Cloud Shell is an interactive, authenticated, browser-accessible shell for managing Azure resources. It provides the flexibility of choosing the shell experience that best suits the way you work, either Bash or PowerShell.
Reference:
https://docs.microsoft.com/en-us/azure/cloud-shell/quickstart https://docs.microsoft.com/en-us/azure/cloud-shell/overview
QUESTION 62 HOTSPOT
You plan to create an Azure virtual machine.
You need to identify which storage service must be used to store the unmanaged data disks of the virtual machine.
What should you identify? To answer, select the appropriate service in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Azure containers are the backbone of the virtual disks platform for Azure IaaS. Both Azure OS and data disks are implemented as virtual disks where data is durably persisted in the Azure Storage platform and then delivered to the virtual machines for maximum performance. Azure Disks are persisted in Hyper-V VHD format and stored as a page blob in Azure Storage.
References: https://docs.microsoft.com/en-us/azure/storage/blobs/storage-blob-pageblob-overview
QUESTION 64 You plan to map a network drive from several computers that run Windows 10 to Azure Storage. 
You need to create a storage solution in Azure for the planned mapped drive. 
What should you create?
A.	an Azure SQL database 
B.	a virtual machine data disk 
C.	a Files service in a storage account 
D.	a Blobs service in a storage account 
Correct Answer: C
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
Azure Files is Microsoft's easy-to-use cloud file system. Azure file shares can be seamlessly used in Windows and Windows Server.
To use an Azure file share with Windows, you must either mount it, which means assigning it a drive letter or mount point path, or access it via its UNC path.
Unlike other SMB shares you may have interacted with, such as those hosted on a Windows Server, Linux
Samba server, or NAS device, Azure file shares do not currently support Kerberos authentication with your
Active Directory (AD) or Azure Active Directory (AAD) identity, although this is a feature we are working on. Instead, you must access your Azure file share with the storage account key for the storage account containing your Azure file share. A storage account key is an administrator key for a storage account, including administrator permissions to all files and folders within the file share you're accessing, and for all file shares and other storage resources (blobs, queues, tables, etc) contained within your storage account.
References:
https://docs.microsoft.com/en-us/azure/storage/files/storage-how-to-use-files-windows
QUESTION 69 Your company plans to deploy several million sensors that will upload data to Azure.
You need to identify which Azure resources must be created to support the planned solution.
Which two Azure resources should you identify? Each correct answer presents part of the solution.
NOTE: Each correct selection is worth one point.
A.	Azure Data Lake
B.	Azure Queue storage
C.	Azure File Storage
D.	Azure IoT Hub
E.	Azure Notification Hubs
Correct Answer: AD
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
IoT Hub (Internet of things Hub) provides data from millions of sensors.
IoT Hub is a managed service, hosted in the cloud, that acts as a central message hub for bi-directional communication between your IoT application and the devices it manages. You can use Azure IoT Hub to build IoT solutions with reliable and secure communications between millions of IoT devices and a cloud-hosted solution backend. You can connect virtually any device to IoT Hub.
There are two storage services IoT Hub can route messages to -- Azure Blob Storage and Azure Data Lake Storage Gen2 (ADLS Gen2) accounts. Azure Data Lake Storage accounts are hierarchical namespaceenabled storage accounts built on top of blob storage. Both of these use blobs for their storage.  
References: https://docs.microsoft.com/en-us/azure/iot-hub/about-iot-hub https://docs.microsoft.com/en-us/azure/iot-hub/iot-hub-devguide-messages-d2c
QUESTION 70
You have an Azure web app.
You need to manage the settings of the web app from an iPhone.
What are two Azure management tools that you can use? Each correct answer presents a complete solution.
NOTE: Each correct selection is worth one point.
A.	Azure CLI
B.	the Azure portal
C.	Azure Cloud Shell
D.	Windows PowerShell
E.	Azure Storage Explorer
Correct Answer: BC
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
The Azure portal is the web-based portal for managing Azure.  Being web-based, you can use the Azure portal on an iPhone.
Azure Cloud Shell is a web-based command line for managing Azure. You access the Azure Cloud Shell from the Azure portal. Being web-based, you can use the Azure Cloud Shell on an iPhone.
Incorrect Answers:
A: Azure CLI can be installed on MacOS but it cannot be installed on an iPhone.
D: Windows PowerShell can be installed on MacOS but it cannot be installed on an iPhone. E: Azure Storage Explorer is not used to manage Azure web apps.
References: http://www.deployazure.com/management/managing-azure-from-ipad/
QUESTION 72 HOTSPOT 
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Box 1: No
Azure resources deployed to a single resource group can be located in different regions. The resource group only contains metadata about the resources it contains.
When creating a resource group, you need to provide a location for that resource group. You may be wondering, "Why does a resource group need a location? And, if the resources can have different locations than the resource group, why does the resource group location matter at all?" The resource group stores metadata about the resources. When you specify a location for the resource group, you're specifying where that metadata is stored. For compliance reasons, you may need to ensure that your data is stored in a particular region.
Box 2: No
Tags for Resources are not inherited by default from their Resource Group
Box 3: Yes
A resource group can be used to scope access control for administrative actions.  By default, permissions set at the resource level are inherited by the resources in the resource group.
References: https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-group-overview
QUESTION 75 HOTSPOT 
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Box 1: No
Azure Advisor provides you with a consistent, consolidated view of recommendations for all your Azure resources. It integrates with Azure Security Center to bring you security recommendations. You can get security recommendations from the Security tab on the Advisor dashboard.  Examples of recommendations include restricting access to virtual machines by configuring Network Security Groups, enabling storage encryption, installing vulnerability assessment solutions.
However, Azure Advisor does not provide recommendations on how to improve the security of an Azure AD environment.
Box 2: Yes
Advisor helps you optimize and reduce your overall Azure spend by identifying idle and underutilized resources. You can get cost recommendations from the Cost tab on the Advisor dashboard.
Box 3: No.
Azure Advisor does not provide recommendations on how to configure network settings on Azure virtual machines.
References:
https://docs.microsoft.com/en-us/azure/advisor/advisor-security-recommendations https://docs.microsoft.com/en-us/azure/advisor/advisor-cost-recommendations


QUESTION 76
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure subscription named Subscription1. You sign in to the Azure portal and create a resource group named RG1.
From Azure documentation, you have the following command that creates a virtual machine named VM1.
az vm create --resource-group RG1 --name VM1 --image UbuntuLTS --generate-sshkeys
You need to create VM1 in Subscription1 by using the command.
Solution: From the Azure portal, launch Azure Cloud Shell and select PowerShell. Run the command in Cloud Shell.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
The command can be run in the Azure Cloud Shell. Although this question says you select PowerShell rather than Bash, the Az commands will work in PowerShell.  
The Azure Cloud Shell is a free interactive shell. It has common Azure tools preinstalled and configured to use with your account.
To open the Cloud Shell, just select Try it from the upper right corner of a code block. You can also launch Cloud Shell in a separate browser tab by going to https://shell.azure.com/bash.
Reference: https://docs.microsoft.com/en-us/azure/virtual-machines/linux/quick-create-cli


QUESTION 77
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure subscription named Subscription1. You sign in to the Azure portal and create a resource group named RG1.
From Azure documentation, you have the following command that creates a virtual machine named VM1.
az vm create --resource-group RG1 --name VM1 --image UbuntuLTS --generate-ssh-keys
You need to create VM1 in Subscription1 by using the command.
Solution: From a computer that runs Windows 10, install Azure CLI. From PowerShell, sign in to Azure and then run the command.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: B
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
The command can be run from PowerShell or the command prompt if you have the Azure CLI installed. However, it must be run on the Windows 10 computer, not in Azure.
References:
https://docs.microsoft.com/en-us/cli/azure/install-azure-cli-windows?view=azure-cli-latest


QUESTION 78
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure subscription named Subscription1. You sign in to the Azure portal and create a resource group named RG1.
From Azure documentation, you have the following command that creates a virtual machine named VM1.
az vm create --resource-group RG1 --name VM1 --image UbuntuLTS --generate-ssh-keys
You need to create VM1 in Subscription1 by using the command.
Solution: From a computer that runs Windows 10, install Azure CLI. From a command prompt, sign in to Azure and then run the command.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: B
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
The command can be run from PowerShell or the command prompt if you have the Azure CLI installed. However, it must be run on the Windows 10 computer, not in Azure.
References:
https://docs.microsoft.com/en-us/cli/azure/install-azure-cli-windows?view=azure-cli-latest
QUESTION 81 DRAG DROP
Match the Azure service to the correct description. 
Instructions: To answer, drag the appropriate Azure service from the column on the left to its description on the right. Each service may be used once, more than once, or not at all.
NOTE: Each correct selection is worth one point. 
Select and Place:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Box 1:
Azure Bot Services provides a digital online assistant that provides speech support.
Bots provide an experience that feels less like using a computer and more like dealing with a person - or at least an intelligent robot. They can be used to shift simple, repetitive tasks, such as taking a dinner reservation or gathering profile information, on to automated systems that may no longer require direct human intervention. Users converse with a bot using text, interactive cards, and speech. A bot interaction can be a quick question and answer, or it can be a sophisticated conversation that intelligently provides access to services.
Box 2:
Azure Machine Learning uses past trainings to provide predictions that have high probability.
Machine learning is a data science technique that allows computers to use existing data to forecast future behaviors, outcomes, and trends. By using machine learning, computers learn without being explicitly programmed.
Forecasts or predictions from machine learning can make apps and devices smarter. For example, when you shop online, machine learning helps recommend other products you might want based on what you've bought.
Box 3:
Azure Functions provides serverless computing functionalities.
Azure Functions is a serverless compute service that lets you run event-triggered code without having to explicitly provision or manage infrastructure.
Box 4:
IoT Hub (Internet of things Hub) provides data from millions of sensors.
IoT Hub is a managed service, hosted in the cloud, that acts as a central message hub for bi-directional communication between your IoT application and the devices it manages. You can use Azure IoT Hub to build IoT solutions with reliable and secure communications between millions of IoT devices and a cloud-hosted solution backend. You can connect virtually any device to IoT Hub.
References:
https://docs.microsoft.com/en-us/azure/bot-service/bot-service-overview-introduction?view=azure-bot-service-
4.0 https://docs.microsoft.com/en-us/azure/machine-learning/overview-what-is-azure-ml https://docs.microsoft.com/en-us/azure/azure-functions/ https://docs.microsoft.com/en-us/azure/iot-hub/about-iot-hub


QUESTION 82
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
An Azure administrator plans to run a PowerShell script that creates Azure resources. 
You need to recommend which computer configuration to use to run the script. 
Solution: Run the script from a computer that runs Windows 10 and has the Azure PowerShell module installed. 
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
A PowerShell script is a file that contains PowerShell cmdlets and code. A PowerShell script needs to be run in PowerShell.
In this question, the computer has the Azure PowerShell module installed. Therefore, this solution does meet the goal.
References:
https://docs.microsoft.com/en-us/powershell/scripting/components/ise/how-to-write-and-run-scripts-in-thewindows-powershell-ise?view=powershell-6


QUESTION 85
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure subscription named Subscription1. You sign in to the Azure portal and create a resource group named RG1.
From Azure documentation, you have the following command that creates a virtual machine named VM1.
az vm create --resource-group RG1 --name VM1 --image UbuntuLTS --generate-sshkeys
You need to create VM1 in Subscription1 by using the command.
Solution: From the Azure portal, launch Azure Cloud Shell and select Bash. Run the command in Cloud Shell.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
The command can be run in the Azure Cloud Shell.  
The Azure Cloud Shell is a free interactive shell. It has common Azure tools preinstalled and configured to use with your account.
To open the Cloud Shell, just select Try it from the upper right corner of a code block. You can also launch Cloud Shell in a separate browser tab by going to https://shell.azure.com/bash.
References: https://docs.microsoft.com/en-us/azure/virtual-machines/linux/quick-create-cli
QUESTION 86
Your company has several business units. 
Each business unit requires 20 different Azure resources for daily operation. All the business units require the same type of Azure resources. 
You need to recommend a solution to automate the creation of the Azure resources. 
What should you include in the recommendations?
A.	Azure Resource Manager templates 
B.	virtual machine scale sets 
C.	the Azure API Management service 
D.	management groups 
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
You can use Azure Resource Manager templates to automate the creation of the Azure resources.  Deploying resource through templates is known as ‘Infrastructure as code’.
To implement infrastructure as code for your Azure solutions, use Azure Resource Manager templates. The template is a JavaScript Object Notation (JSON) file that defines the infrastructure and configuration for your project. The template uses declarative syntax, which lets you state what you intend to deploy without having to write the sequence of programming commands to create it. In the template, you specify the resources to deploy and the properties for those resources.
References: https://docs.microsoft.com/en-us/azure/azure-resource-manager/templates/overview
QUESTION 87 DRAG DROP
Match the Azure service to the correct definition. 
Instructions: To answer, drag the appropriate Azure service from the column on the left to its description on the right. Each service may be used once, more than once, or not at all. 
NOTE: Each correct selection is worth one point. 
Select and Place:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Box 1:
Azure Functions provides the platform for serverless code.
Azure Functions is a serverless compute service that lets you run event-triggered code without having to explicitly provision or manage infrastructure.
Box 2:
Azure Databricks is a big analysis service for machine learning.
Azure Databricks is an Apache Spark-based analytics platform.  The platform consists of several components including ‘MLib’.  Mlib is a Machine Learning library consisting of common learning algorithms and utilities, including classification, regression, clustering, collaborative filtering, dimensionality reduction, as well as underlying optimization primitives.
Box 3:
Azure Application Insights detects and diagnoses anomalies in web apps.
Application Insights, a feature of Azure Monitor, is an extensible Application Performance Management (APM) service for developers and DevOps professionals. Use it to monitor your live applications. It will automatically detect performance anomalies, and includes powerful analytics tools to help you diagnose issues and to understand what users actually do with your app.
Box 4:
Azure App Service hosts web apps.
Azure App Service is an HTTP-based service for hosting web applications, REST APIs, and mobile back ends.
You can develop in your favorite language, be it .NET, .NET Core, Java, Ruby, Node.js, PHP, or Python. Applications run and scale with ease on both Windows and Linux-based environments.
References: https://docs.microsoft.com/en-us/azure/azure-functions/
https://docs.microsoft.com/en-us/azure/azure-databricks/what-is-azure-databricks#apache-spark-basedanalytics-platform https://docs.microsoft.com/en-us/azure/azure-monitor/app/app-insights-overview https://docs.microsoft.com/en-us/azure/app-service/overview
QUESTION 89 Which Azure service should you use to collect events from multiple resources into a centralized repository?
A.	Azure Event Hubs 
B.	Azure Analysis Services 
C.	Azure Monitor 
D.	Azure Stream Analytics
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
Azure Event Hubs is a big data streaming platform and event ingestion service. It can receive and process millions of events per second. Data sent to an event hub can be transformed and stored by using any real-time analytics provider or batching/storage adapters.
Azure Event Hubs can be used to ingest, buffer, store, and process your stream in real time to get actionable insights. Event Hubs uses a partitioned consumer model, enabling multiple applications to process the stream concurrently and letting you control the speed of processing.
Azure Event Hubs can be used to capture your data in near-real time in an Azure Blob storage or Azure Data Lake Storage for long-term retention or micro-batch processing.
References: https://docs.microsoft.com/en-us/azure/event-hubs/event-hubs-about


QUESTION 90
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure environment. You need to create a new Azure virtual machine from a tablet that runs the Android operating system. 
Solution: You use PowerShell in Azure Cloud Shell. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
Azure Cloud Shell is a browser-based shell experience to manage and develop Azure resources.
Cloud Shell offers a browser-accessible, pre-configured shell experience for managing Azure resources without the overhead of installing, versioning, and maintaining a machine yourself.
Being browser-based, Azure Cloud Shell can be run on a browser from a tablet that runs the Android operating system.
References: https://docs.microsoft.com/en-us/azure/cloud-shell/features


QUESTION 91
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure environment. You need to create a new Azure virtual machine from a tablet that runs the Android operating system. 
Solution: You use the PowerApps portal.
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: B
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
PowerApps lets you quickly build business applications with little or no code.  It is not used to create Azure virtual machines. Therefore, this solution does not meet the goal.
PowerApps Portals allow organizations to create websites which can be shared with users external to their organization either anonymously or through the login provider of their choice like LinkedIn, Microsoft Account, other commercial login providers.
References: https://powerapps.microsoft.com/en-us/blog/introducing-powerapps-portals-powerful-low-code-websites-forexternal-users/


QUESTION 92
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
You have an Azure environment. You need to create a new Azure virtual machine from a tablet that runs the Android operating system. 
Solution: You use the Azure portal. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
The Azure portal is a web-based, unified console that provides an alternative to command-line tools. With the Azure portal, you can manage your Azure subscription using a graphical user interface. You can build, manage, and monitor everything from simple web apps to complex cloud deployments. Create custom dashboards for an organized view of resources. Configure accessibility options for an optimal experience.
Being web-based, the Azure portal can be run on a browser from a tablet that runs the Android operating system.
References: https://docs.microsoft.com/en-us/azure/azure-portal/azure-portal-overview
QUESTION 93 This question requires that you evaluate the underlined text to determine if it is correct.
Azure Databricks is an Apache Spark-based analytics service.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed.” If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed.
B.	Azure Data Factory
C.	Azure DevOps
D.	Azure HDInsight
Correct Answer: A
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
Azure Databricks is an Apache Spark-based analytics platform.  The platform consists of several components including ‘MLib’.  Mlib is a Machine Learning library consisting of common learning algorithms and utilities, including classification, regression, clustering, collaborative filtering, dimensionality reduction, as well as underlying optimization primitives.
References: https://docs.microsoft.com/en-us/azure/azure-databricks/what-is-azure-databricks#apache-spark-basedanalytics-platform
QUESTION 94 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Core Azure Services Explanation
Explanation/Reference: Explanation:
Box 1: Yes
Azure Monitor maximizes the availability and performance of your applications and services by delivering a comprehensive solution for collecting, analyzing, and acting on telemetry from your cloud and on-premises environments.
Box 2: Yes
Alerts in Azure Monitor proactively notify you of critical conditions and potentially attempt to take corrective action.
Box 3: Yes
Azure Monitor uses Target Resource, which is the scope and signals available for alerting. A target can be any Azure resource. Example targets: a virtual machine, a storage account, a virtual machine scale set, a Log Analytics workspace, or an Application Insights resource.
References: https://docs.microsoft.com/en-us/azure/azure-monitor/overview https://docs.microsoft.com/en-us/azure/azure-monitor/platform/alerts-overview
QUESTION 97
This question requires that you evaluate the underlined text to determine if it is correct.
An Availability Zone in Azure has physically separate locations across two continents.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed.” If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed.
B.	within a single Azure region
C.	within multiple Azure regions
D.	within a single Azure datacenter
Correct Answer: B
Section: Understand Core Azure Services Explanation
Explanation/Reference:
Explanation:
Availability Zones is a high-availability offering that protects your applications and data from datacenter failures. Availability Zones are unique physical locations within an Azure region.
References: https://docs.microsoft.com/en-us/azure/availability-zones/az-overview


QUESTION 98 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Core Azure Services
Explanation
Explanation/Reference: Explanation:
Box 1: Yes
There are different replication options available with a storage account.  The ‘minimum’ replication option is Locally Redundant Storage (LRS).  With LRS, data is replicated synchronously three times within the primary region.
Box 2: No
Data is not backed up automatically to another Azure Data Center although it can be depending on the replication option configured for the account.  Locally Redundant Storage (LRS) is the default which maintains three copies of the data in the data center.
Geo-redundant storage (GRS) has cross-regional replication to protect against regional outages. Data is replicated synchronously three times in the primary region, then replicated asynchronously to the secondary region.
Box 3: No
The limits are much higher than that. The current storage limit is 2 PB for US and Europe, and 500 TB for all other regions (including the UK) with no limit on the number of files.
Reference: https://docs.microsoft.com/en-us/azure/storage/common/storage-account-overview
QUESTION 99
HOTSPOT 
You plan to implement several security services for an Azure environment. You need to identify which Azure services must be used to meet the following security requirements: 
  Monitor threats by using sensors
  Enforce Azure Multi-Factor Authentication (MFA) based on a condition 
Which Azure service should you identify for each requirement? To answer, select the appropriate options in the answer area. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: 
To monitor threats by using sensors, you would use Azure Advanced Threat Protection (ATP).
Azure Advanced Threat Protection (ATP) is a cloud-based security solution that leverages your on-premises Active Directory signals to identify, detect, and investigate advanced threats, compromised identities, and malicious insider actions directed at your organization.
Sensors are software packages you install on your servers to upload information to Azure ATP.
Box 2:
To enforce MFA based on a condition, you would use Azure Active Directory Identity Protection. Azure AD Identity Protection helps you manage the roll-out of Azure Multi-Factor Authentication (MFA) registration by configuring a Conditional Access policy to require MFA registration no matter what modern authentication app you are signing in to.
References: https://docs.microsoft.com/en-us/azure-advanced-threat-protection/what-is-atp
https://docs.microsoft.com/en-us/azure/active-directory/identity-protection/howto-identity-protection-configuremfa-policy
QUESTION 100 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: Yes
Azure Service Health consists of three components: Azure Status, Azure Service Heath and Azure Resource Health.
Azure service health provides a personalized view of the health of the Azure services and regions you're using. This is the best place to look for service impacting communications about outages, planned maintenance activities, and other health advisories because the authenticated Azure Service Health experience knows which services and resources you currently use.
To view the health of all other services available in Azure, you would use the Azure Status component of Azure Service Health.  Azure status informs you of service outages in Azure on the Azure Status page. The page is a global view of the health of all Azure services across all Azure regions.
Box 2: Yes
The best way to use Service Health is to set up Service Health alerts to notify you via your preferred communication channels when service issues, planned maintenance, or other changes may affect the Azure services and regions you use.
Box 3: No
You can use Resource Health to view the health of a virtual machine.  However, you cannot use Resource Health to prevent a service failure affecting the virtual machine.
Azure resource health provides information about the health of your individual cloud resources such as a specific virtual machine instance. 
References:
https://docs.microsoft.com/en-us/azure/service-health/overview


QUESTION 102 This question requires that you evaluate the underlined text to determine if it is correct. 
Azure Key Vault is used to store secrets for Azure Active Directory (Azure AD) user accounts.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	Azure Active Directory (Azure AD) administrative accounts
C.	Personally Identifiable Information (PII)
D.	server applications
Correct Answer: D
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Centralizing storage of application secrets in Azure Key Vault allows you to control their distribution. Key Vault greatly reduces the chances that secrets may be accidentally leaked. When using Key Vault, application developers no longer need to store security information in their application. Not having to store security information in applications eliminates the need to make this information part of the code. For example, an application may need to connect to a database. Instead of storing the connection string in the app's code, you can store it securely in Key Vault.
References:
https://docs.microsoft.com/en-us/azure/key-vault/key-vault-overview https://docs.microsoft.com/en-us/learn/modules/manage-secrets-with-azure-key-vault/


QUESTION 103 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: No
Authorization to access Azure resources can be provided by other identity providers by using federation.  A commonly used example of this is to federate your on-premises Active Directory environment with Azure AD and use this federation for authentication and authorization.
Box 2: Yes
As described above, third-party cloud services and on-premises Active Directory can be used to access Azure resources.  This is known as ‘federation’.
Federation is a collection of domains that have established trust. The level of trust may vary, but typically includes authentication and almost always includes authorization. A typical federation might include a number of organizations that have established trust for shared access to a set of resources.
Box 3: Yes
Azure Active Directory (Azure AD) is a centralized identity provider in the cloud. This is the primary built-in authentication and authorization service to provide secure access to Azure resources.
References:
https://docs.microsoft.com/en-us/azure/active-directory/hybrid/whatis-fed https://docs.microsoft.com/en-us/azure/active-directory/develop/authentication-scenarios


QUESTION 104 Your company plans to automate the deployment of servers to Azure. 
Your manager is concerned that you may expose administrative credentials during the deployment. 
You need to recommend an Azure solution that encrypts the administrative credentials during the deployment. 
What should you include in the recommendation? 
A.	Azure Key Vault 
B.	Azure Information Protection 
C.	Azure Security Center 
D.	Azure Multi-Factor Authentication (MFA)
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Key Vault is a secure store for storage various types of sensitive information. In this question, we would store the administrative credentials in the Key Vault.  With this solution, there is no need to store the administrative credentials as plain text in the deployment scripts.
All information stored in the Key Vault is encrypted.
Azure Key Vault can be used to Securely store and tightly control access to tokens, passwords, certificates, API keys, and other secrets.
Secrets and keys are safeguarded by Azure, using industry-standard algorithms, key lengths, and hardware security modules (HSMs). The HSMs used are Federal Information Processing Standards (FIPS) 140-2 Level 2 validated.
Access to a key vault requires proper authentication and authorization before a caller (user or application) can get access. Authentication establishes the identity of the caller, while authorization determines the operations that they are allowed to perform.
References:
https://docs.microsoft.com/en-us/azure/key-vault/key-vault-overview


QUESTION 105 You plan to deploy several Azure virtual machines.
You need to control the ports that devices on the Internet can use to access the virtual machines.
What should you use?
A.	a network security group (NSG)
B.	an Azure Active Directory (Azure AD) role
C.	an Azure Active Directory group
D.	an Azure key vault
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust
Explanation
Explanation/Reference:
Explanation:
A network security group works like a firewall.  You can attach a network security group to a virtual network and/or individual subnets within the virtual network.  You can also attach a network security group to a network interface assigned to a virtual machine.  You can use multiple network security groups within a virtual network to restrict traffic between resources such as virtual machines and subnets.
You can filter network traffic to and from Azure resources in an Azure virtual network with a network security group. A network security group contains security rules that allow or deny inbound network traffic to, or outbound network traffic from, several types of Azure resources.
References:
https://docs.microsoft.com/en-us/azure/virtual-network/security-overview
QUESTION 106 HOTSPOT
To complete the sentence, select the appropriate option in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
You can configure a lock on a resource group to prevent the accidental deletion of the resource group.  The lock applies to everyone, including global administrators.  If you want to delete the resource group, the lock must be removed first.
As an administrator, you may need to lock a subscription, resource group, or resource to prevent other users in your organization from accidentally deleting or modifying critical resources. You can set the lock level
to CanNotDelete or ReadOnly. In the portal, the locks are called Delete and Read-only respectively.
  CanNotDelete means authorized users can still read and modify a resource, but they can't delete the resource.
  ReadOnly means authorized users can read a resource, but they can't delete or update the resource.
Applying this lock is similar to restricting all authorized users to the permissions granted by the Reader role.
Reference: https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-group-lock-resources
QUESTION 107 This question requires that you evaluate the underlined text to determine if it is correct. 
Azure Germany can be used by legal residents of Germany only. 
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct. 
A.	no change is needed 
B.	only enterprises that are registered in Germany 
C.	only enterprises that purchase their azure licenses from a partner based in Germany  D. any user or enterprise that requires its data to reside in Germany 
Correct Answer: D
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Germany is available to eligible customers and partners globally who intend to do business in the EU/ EFTA, including the United Kingdom.
Azure Germany offers a separate instance of Microsoft Azure services from within German datacenters. The datacenters are in two locations, Frankfurt/Main and Magdeburg. This placement ensures that customer data remains in Germany and that the datacenters connect to each other through a private network. All customer data is exclusively stored in those datacenters. A designated German company--the German data trustee-controls access to customer data and the systems and infrastructure that hold customer data.
References: https://docs.microsoft.com/en-us/azure/germany/germany-welcome?toc=%2fazure%2fgermany%2ftoc.json https://docs.microsoft.com/en-us/azure/germany/germany-overview-data-trustee


QUESTION 108 This question requires that you evaluate the underlined text to determine if it is correct. 
After you create a virtual machine, you need to modify the network security group (NSG) to allow connections to TCP port 8080 on the virtual machine.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct.  
A.	No change is needed 
B.	virtual network gateway 
C.	virtual network  
D.	route table 
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
When you create a virtual machine, the default setting is to create a Network Security Group attached to the network interface assigned to a virtual machine.
A network security group works like a firewall.  You can attach a network security group to a virtual network and/or individual subnets within the virtual network.  You can also attach a network security group to a network interface assigned to a virtual machine.  You can use multiple network security groups within a virtual network to restrict traffic between resources such as virtual machines and subnets.
You can filter network traffic to and from Azure resources in an Azure virtual network with a network security group. A network security group contains security rules that allow or deny inbound network traffic to, or outbound network traffic from, several types of Azure resources.
In this question, we need to add a rule to the network security group to allow the connection to the virtual machine on port 8080.
References:
https://docs.microsoft.com/en-us/azure/virtual-network/security-overview
QUESTION 109
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your Azure environment contains multiple Azure virtual machines. 
You need to ensure that a virtual machine named VM1 is accessible from the Internet over HTTP.
Solution: You modify a network security group (NSG).
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
A network security group works like a firewall.  You can attach a network security group to a virtual network and/or individual subnets within the virtual network.  You can also attach a network security group to a network interface assigned to a virtual machine.  You can use multiple network security groups within a virtual network to restrict traffic between resources such as virtual machines and subnets.
You can filter network traffic to and from Azure resources in an Azure virtual network with a network security group. A network security group contains security rules that allow or deny inbound network traffic to, or outbound network traffic from, several types of Azure resources.
In this question, we need to add a rule to the network security group to allow the connection to the virtual machine on port 80 (HTTP).
References: https://docs.microsoft.com/en-us/azure/virtual-network/security-overview


QUESTION 110 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust
Explanation
Explanation/Reference: Explanation:
Box 1: Yes
The tool you would use to sync the accounts is Azure AD Connect. The Azure Active Directory Connect synchronization services (Azure AD Connect sync) is a main component of Azure AD Connect. It takes care of all the operations that are related to synchronize identity data between your on-premises environment and Azure AD.
Box 2: Yes
As described above, third-party cloud services and on-premises Active Directory can be used to access Azure resources.  This is known as ‘federation’.
Federation is a collection of domains that have established trust. The level of trust may vary, but typically includes authentication and almost always includes authorization. A typical federation might include a number of organizations that have established trust for shared access to a set of resources.
Box 3: Yes
Azure Active Directory (Azure AD) is a centralized identity provider in the cloud. This is the primary built-in authentication and authorization service to provide secure access to Azure resources.
References:
https://docs.microsoft.com/en-us/azure/active-directory/hybrid/how-to-connect-sync-whatis https://docs.microsoft.com/en-us/azure/active-directory/hybrid/whatis-fed https://docs.microsoft.com/en-us/azure/active-directory/develop/authentication-scenarios


QUESTION 111 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: No
Azure Active Directory (Azure AD) is a cloud-based service.  It does not require domain controllers on virtual machines.
Box 2: Yes
Azure Active Directory (Azure AD) is a centralized identity provider in the cloud. This is the primary built-in authentication and authorization service to provide secure access to Azure resources and Microsoft 365.
Box 3: No
User accounts in Azure Active Directory can be assigned multiple licenses for different Azure or Microsoft 365 services.

  
  QUESTION 112
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your Azure environment contains multiple Azure virtual machines. 
You need to ensure that a virtual machine named VM1 is accessible from the Internet over HTTP.
Solution: You modify a DDoS protection plan. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: B
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
DDoS is a form of attack on a network resource.  A DDoS protection plan is used to protect against DDoS attacks; it does not provide connectivity to a virtual machine.
To ensure that a virtual machine named VM1 is accessible from the Internet over HTTP, you need to modify a network security group or Azure Firewall.
References:
https://docs.microsoft.com/en-us/azure/virtual-network/ddos-protection-overview


QUESTION 113
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your Azure environment contains multiple Azure virtual machines. 
You need to ensure that a virtual machine named VM1 is accessible from the Internet over HTTP.
Solution: You modify an Azure firewall. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Firewall is a managed, cloud-based network security service that protects your Azure Virtual Network resources. It's a fully stateful firewall as a service with built-in high availability and unrestricted cloud scalability.
In this question, we need to add a rule to Azure Firewall to allow the connection to the virtual machine on port 80 (HTTP).
References:
https://docs.microsoft.com/en-us/azure/firewall/overview


QUESTION 114
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your Azure environment contains multiple Azure virtual machines. 
You need to ensure that a virtual machine named VM1 is accessible from the Internet over HTTP.
Solution: You modify an Azure Traffic Manager profile. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: B
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Traffic Manager is a DNS-based load balancing solution.  It is not used to ensure that a virtual machine named VM1 is accessible from the Internet over HTTP.
To ensure that a virtual machine named VM1 is accessible from the Internet over HTTP, you need to modify a network security group or Azure Firewall.
In this question, we need to add a rule to a network security group or Azure Firewall to allow the connection to the virtual machine on port 80 (HTTP).
References:
https://docs.microsoft.com/en-us/azure/traffic-manager/traffic-manager-overview


QUESTION 116 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: No
It is not true that you must deploy a federation solution or sync on-premises identities to the cloud.  You can have a cloud-only environment and use MFA.
Box 2: No
Picture identification and passport numbers are not valid MFA authentication methods.  Valid methods include: Password, Microsoft Authenticator App, SMS and Voice call.
Box 3:
You can configure MFA to be required for administrator accounts only or you can configure MFA for any user account.
References:
https://docs.microsoft.com/en-us/azure/active-directory/authentication/howto-mfa-getstarted https://docs.microsoft.com/en-us/azure/active-directory/authentication/concept-authentication-methods


QUESTION 117
You need to ensure that when Azure Active Directory (Azure AD) users connect to Azure AD from the Internet by using an anonymous IP address, the users are prompted automatically to change their password. 
Which Azure service should you use?
A.	Azure AD Connect Health 
B.	Azure AD Privileged Identity Management 
C.	Azure Advanced Threat Protection (ATP) 
D.	Azure AD Identity Protection 
Correct Answer: D
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure AD Identity Protection includes two risk policies: sign-in risk policy and user risk policy. A sign-in risk represents the probability that a given authentication request isn’t authorized by the identity owner.
There are several types of risk detection.  One of them is Anonymous IP Address. This risk detection type indicates sign-ins from an anonymous IP address (for example, Tor browser or anonymous VPN). These IP addresses are typically used by actors who want to hide their login telemetry (IP address, location, device, etc.) for potentially malicious intent.
You can configure the sign-in risk policy to require that users change their password.
References: https://docs.microsoft.com/en-us/azure/active-directory/identity-protection/howto-sign-in-risk-policy https://docs.microsoft.com/en-us/azure/active-directory/identity-protection/concept-identity-protection-risks


QUESTION 118 DRAG DROP
Match the term to the correct definition. 
Instructions: To answer, drag the appropriate term from the column on the left to its description on the right. Each term may be used once, more than once, or not at all. 
NOTE: Each correct match is worth one point. 
Select and Place:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: ISO
ISO is the International Organization for Standardization.  Companies can be certified to ISO standards, for example ISO 9001 or 27001 are commonly used in IT companies.
Box 2: NIST
The National Institute of Standards and Technology (NIST) is a physical sciences laboratory, and a nonregulatory agency of the United States Department of Commerce.
Box 3: GDPR
GDPR is the General Data Protection Regulations.  This standard was adopted across Europe in May 2018 and replaces the now deprecated Data Protection Directive.
The General Data Protection Regulation (EU) (GDPR) is a regulation in EU law on data protection and privacy in the European Union (EU) and the European Economic Area (EEA). It also addresses the transfer of personal data outside the EU and EEA areas. The GDPR aims primarily to give control to individuals over their personal data and to simplify the regulatory environment for international business by unifying the regulation within the EU.
Box 4: Azure Government
US government agencies or their partners interested in cloud services that meet government security and compliance requirements, can be confident that Microsoft Azure Government provides world-class security, protection, and compliance services. Azure Government delivers a dedicated cloud enabling government agencies and their partners to transform mission-critical workloads to the cloud. Azure Government services handle data that is subject to certain government regulations and requirements, such as FedRAMP, NIST 800.171 (DIB), ITAR, IRS 1075, DoD L4, and CJIS. In order to provide you with the highest level of security and compliance, Azure Government uses physically isolated datacenters and networks (located in U.S. only).
References:
https://en.wikipedia.org/wiki/National_Institute_of_Standards_and_Technology https://en.wikipedia.org/wiki/General_Data_Protection_Regulation https://docs.microsoft.com/en-us/azure/azure-government/documentation-government-welcome


QUESTION 120 To what should an application connect to retrieve security tokens?
A.	an Azure Storage account 
B.	Azure Active Directory (Azure AD) 
C.	a certificate store 
D.	an Azure key vault 
Correct Answer: B
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure AD authenticates users and provides access tokens. An access token is a security token that is issued by an authorization server. It contains information about the user and the app for which the token is intended, which can be used to access Web APIs and other protected resources.
Instead of creating apps that each maintain their own username and password information, which incurs a high administrative burden when you need to add or remove users across multiple apps, apps can delegate that responsibility to a centralized identity provider.
Azure Active Directory (Azure AD) is a centralized identity provider in the cloud. Delegating authentication and authorization to it enables scenarios such as Conditional Access policies that require a user to be in a specific location, the use of multi-factor authentication, as well as enabling a user to sign in once and then be automatically signed in to all of the web apps that share the same centralized directory. This capability is referred to as Single Sign On (SSO).
References:
https://docs.microsoft.com/en-us/azure/active-directory/develop/authentication-scenarios


QUESTION 121 This question requires that you evaluate the underlined text to determine if it is correct. 
Resource groups provide organizations with the ability to manage the compliance of Azure resources across multiple subscriptions. 
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct. 
A.	No change is needed 
B.	Management groups 
C.	Azure policies  
D.	Azure App Service plans 
Correct Answer: C
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure policies can be used to define requirements for resource properties during deployment and for already existing resources. Azure Policy controls properties such as the types or locations of resources.
Azure Policy is a service in Azure that you use to create, assign, and manage policies. These policies enforce different rules and effects over your resources, so those resources stay compliant with your corporate standards and service level agreements. Azure Policy meets this need by evaluating your resources for noncompliance with assigned policies. All data stored by Azure Policy is encrypted at rest.
For example, you can have a policy to allow only a certain SKU size of virtual machines in your environment. Once this policy is implemented, new and existing resources are evaluated for compliance. With the right type of policy, existing resources can be brought into compliance.
References:
https://docs.microsoft.com/en-us/azure/governance/policy/overview


QUESTION 122 Your network contains an Active Directory forest. The forest contains 5,000 user accounts. 
Your company plans to migrate all network resources to Azure and to decommission the on-premises data center. 
You need to recommend a solution to minimize the impact on users after the planned migration. 
What should you recommend?
A.	Implement Azure Multi-Factor Authentication (MFA) 
B.	Sync all the Active Directory user accounts to Azure Active Directory (Azure AD) 
C.	Instruct all users to change their password 
D.	Create a guest user account in Azure Active Directory (Azure AD) for each user 
Correct Answer: B
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
To migrate to Azure and decommission the on-premises data center, you would need to create the 5,000 user accounts in Azure Active Directory.  The easy way to do this is to sync all the Active Directory user accounts to Azure Active Directory (Azure AD).  You can even sync their passwords to further minimize the impact on users.
The tool you would use to sync the accounts is Azure AD Connect. The Azure Active Directory Connect synchronization services (Azure AD Connect sync) is a main component of Azure AD Connect. It takes care of all the operations that are related to synchronize identity data between your on-premises environment and Azure AD.
References:
https://docs.microsoft.com/en-us/azure/active-directory/hybrid/how-to-connect-sync-whatis


QUESTION 123 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: Yes
You can send Azure AD activity logs to Azure Monitor logs to enable rich visualizations, monitoring and alerting on the connected data.
All data collected by Azure Monitor fits into one of two fundamental types, metrics and logs (including Azure AD activity logs). Activity logs record when resources are created or modified. Metrics tell you how the resource is performing and the resources that it's consuming.
Box 2: Yes
Azure Monitor can consolidate log entries from multiple Azure resources, subscriptions, and tenants into one location for analysis together.
Box 3: Yes
You can create alerts in Azure Monitor. 
Alerts in Azure Monitor proactively notify you of critical conditions and potentially attempt to take corrective action. Alert rules based on metrics provide near real time alerting based on numeric values, while rules based on logs allow for complex logic across data from multiple sources.
References:
https://docs.microsoft.com/en-us/azure/active-directory/reports-monitoring/concept-activity-logs-azure-monitor https://docs.microsoft.com/en-us/azure/azure-monitor/overview


QUESTION 124 HOTSPOT
To complete the sentence, select the appropriate option in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
You would use the Azure Activity Log, not Access Control to view which user turned off a specific virtual machine during the last 14 days.
Activity logs are kept for 90 days. You can query for any range of dates, as long as the starting date isn't more than 90 days in the past.
In this question, we would create a filter to display shutdown operations on the virtual machine in the last 14 days.
Reference: https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-group-audit


QUESTION 125 Which service provides network traffic filtering across multiple Azure subscriptions and virtual networks?
A.	Azure Firewall
B.	an application security group
C.	Azure DDoS protection
D.	a network security group (NSG)
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
You can restrict traffic to multiple virtual networks in multiple subscriptions with a single Azure firewall.
Azure Firewall is a managed, cloud-based network security service that protects your Azure Virtual Network resources. It's a fully stateful firewall as a service with built-in high availability and unrestricted cloud scalability. You can centrally create, enforce, and log application and network connectivity policies across subscriptions and virtual networks. Azure Firewall uses a static public IP address for your virtual network resources allowing outside firewalls to identify traffic originating from your virtual network.
References:
https://docs.microsoft.com/en-us/azure/firewall/overview


QUESTION 126 HOTSPOT 
You create a resource group named RG1 in Azure Resource Manager. 
You need to prevent the accidental deletion of the resources in RG1.
Which setting should you use? To answer, select the appropriate setting in the answer area. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
You can configure a lock on a resource group to prevent the accidental deletion.
As an administrator, you may need to lock a subscription, resource group, or resource to prevent other users in your organization from accidentally deleting or modifying critical resources. You can set the lock level to CanNotDelete or ReadOnly. In the portal, the locks are called Delete and Read-only respectively.
  CanNotDelete means authorized users can still read and modify a resource, but they can't delete the resource.
  ReadOnly means authorized users can read a resource, but they can't delete or update the resource.
Applying this lock is similar to restricting all authorized users to the permissions granted by the Reader role.
Reference: https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-group-lock-resources


QUESTION 127 Which Azure service should you use to store certificates?
A.	Azure Security Center
B.	an Azure Storage account
C.	Azure Key Vault
D.	Azure Information Protection
Correct Answer: C
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Key Vault is a secure store for storage various types of sensitive information including passwords and certificates.
Azure Key Vault can be used to Securely store and tightly control access to tokens, passwords, certificates, API keys, and other secrets.
Secrets and keys are safeguarded by Azure, using industry-standard algorithms, key lengths, and hardware security modules (HSMs). The HSMs used are Federal Information Processing Standards (FIPS) 140-2 Level 2 validated.
Access to a key vault requires proper authentication and authorization before a caller (user or application) can get access. Authentication establishes the identity of the caller, while authorization determines the operations that they are allowed to perform.
References:
https://docs.microsoft.com/en-us/azure/key-vault/key-vault-overview


QUESTION 128
You have a resource group named RG1.
You plan to create virtual networks and app services in RG1.
You need to prevent the creation of virtual machines only in RG1.
What should you use?
A.	a lock
B.	an Azure role
C.	a tag
D.	an Azure policy
Correct Answer: D
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure policies can be used to define requirements for resource properties during deployment and for already existing resources. Azure Policy controls properties such as the types or locations of resources.
Azure Policy is a service in Azure that you use to create, assign, and manage policies. These policies enforce different rules and effects over your resources, so those resources stay compliant with your corporate standards and service level agreements. 
In this question, we would create an Azure policy assigned to the resource group that denies the creation of virtual machines in the resource group.
You could place a read-only lock on the resource group. However, that would prevent the creation of any resources in the resource group, not virtual machines only.  Therefore, an Azure Policy is a better solution.
Reference:
https://docs.microsoft.com/en-us/azure/governance/policy/overview


QUESTION 129
What can Azure Information Protection encrypt?
A.	network traffic
B.	documents and email messages
C.	an Azure Storage account
D.	an Azure SQL database
Correct Answer: B
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Information Protection can encrypt documents and emails.
Azure Information Protection is a cloud-based solution that helps an organization to classify and optionally, protect its documents and emails by applying labels. Labels can be applied automatically by administrators who define rules and conditions, manually by users, or a combination where users are given recommendations.
The protection technology uses Azure Rights Management (often abbreviated to Azure RMS). This technology is integrated with other Microsoft cloud services and applications, such as Office 365 and Azure Active Directory. 
This protection technology uses encryption, identity, and authorization policies. Similarly to the labels that are applied, protection that is applied by using Rights Management stays with the documents and emails, independently of the location – inside or outside your organization, networks, file servers, and applications.
References: https://docs.microsoft.com/en-us/azure/information-protection/what-is-information-protection https://docs.microsoft.com/en-us/azure/information-protection/quickstart-label-dnf-protectedemail


QUESTION 130 What should you use to evaluate whether your company’s Azure environment meets regulatory requirements?
A.	the Knowledge Center website
B.	the Advisor blade from the Azure portal
C.	Compliance Manager from the Service Trust Portal
D.	the Solutions blade from the Azure portal
Correct Answer: C
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Compliance Manager in the Service Trust Portal is a workflow-based risk assessment tool that helps you track, assign, and verify your organization's regulatory compliance activities related to Microsoft Cloud services, such as Microsoft 365, Dynamics 365, and Azure.
Reference: https://docs.microsoft.com/en-us/microsoft-365/compliance/get-started-with-service-trust-portal?view=o365worldwide


QUESTION 131 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: No
Azure Advisor does not generate a list of virtual machines that ARE protected by Azure Backup.  Azure Advisor does however, generate a list of virtual that ARE NOT protected by Azure Backup. You can view a list of virtual machines that are protected by Azure Backup by viewing the Protected Items in the Azure Recovery Services Vault.
Box 2: No
If you implement the security recommendations, you company’s score will increase, not decrease.
Box 3: No
There is no requirement to implement the security recommendations provided by Azure Advisor.  The recommendations are just that, ‘recommendations’. They are not ‘requirements’.
References: https://azure.microsoft.com/en-gb/blog/advisor-backup-recommendations/ https://docs.microsoft.com/en-us/azure/advisor/advisor-overview https://microsoft.github.io/AzureTipsAndTricks/blog/tip173.html


QUESTION 132 HOTSPOT
To complete the sentence, select the appropriate option in the answer area. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure Information Protection is used to automatically add a watermark to Microsoft Word documents that contain credit card information.
You use Azure Information Protection labels to apply classification to documents and emails. When you do this, the classification is identifiable regardless of where the data is stored or with whom it’s shared. The labels can include visual markings such as a header, footer, or watermark.
Labels can be applied automatically by administrators who define rules and conditions, manually by users, or a combination where users are given recommendations.  In this question, we would configure a label to be automatically applied to Microsoft Word documents that contain credit card information. The label would then add the watermark to the documents.
Reference:
https://docs.microsoft.com/en-us/azure/information-protection/what-is-information-protection https://docs.microsoft.com/en-us/azure/information-protection/infoprotect-quick-start-tutorial


QUESTION 133 This question requires that you evaluate the underlined text to determine if it is correct. 
From Azure Monitor, you can view which user turned off a specific virtual machine during the last 14 days. Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct. 
A.	No change is needed
B.	Azure Event Hubs
C.	Azure Activity Log
D.	Azure Service Health
Correct Answer: C
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
You would use the Azure Activity Log, not Azure Monitor to view which user turned off a specific virtual machine during the last 14 days.
Activity logs are kept for 90 days. You can query for any range of dates, as long as the starting date isn't more than 90 days in the past.
In this question, we would create a filter to display shutdown operations on the virtual machine in the last 14 days.
References:
https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-group-audit


QUESTION 134 HOTSPOT
To complete the sentence, select the appropriate option in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
The VNet will be marked as ‘Non-compliant’ when the policy is assigned.  However, it will not be deleted and will continue to function normally.
Azure Policy is a service in Azure that you use to create, assign, and manage policies. These policies enforce different rules and effects over your resources, so those resources stay compliant with your corporate standards and service level agreements.
If there are any existing resources that aren't compliant with a new policy assignment, they appear under Noncompliant resources.
References: https://docs.microsoft.com/en-us/azure/governance/policy/overview https://docs.microsoft.com/en-us/azure/governance/policy/assign-policy-portal


QUESTION 135 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Box 1: No
Azure firewall does not encrypt network traffic.  It is used to block or allow traffic based on source/destination IP address, source/destination ports and protocol.
Box 2: No
A network security group does not encrypt network traffic.  It works in a similar way to a firewall in that it is used to block or allow traffic based on source/destination IP address, source/destination ports and protocol.
Box 3: No
The question is rather vague as it would depend on the configuration of the host on the Internet. Windows
Server does come with a VPN client and it also supports other encryption methods such IPSec encryption or SSL/TLS so it could encrypt the traffic if the Internet host was configured to require or accept the encryption. 
However, the VM could not encrypt the traffic to an Internet host that is not configured to require the encryption.
Reference: https://docs.microsoft.com/en-us/azure/security/azure-security-data-encryption-best-practices#protect-data-intransit


QUESTION 136 Your company has an Azure subscription that contains resources in several regions. 
A company policy states that administrators must only be allowed to create additional Azure resources in a region in the country where their office is located. 
You need to create the Azure resource that must be used to meet the policy requirement. 
What should you create?
A.	a read-only lock 
B.	an Azure policy 
C.	a management group 
D.	a reservation 
Correct Answer: B
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Azure policies can be used to define requirements for resource properties during deployment and for already existing resources. Azure Policy controls properties such as the types or locations of resources.
Azure Policy is a service in Azure that you use to create, assign, and manage policies. These policies enforce different rules and effects over your resources, so those resources stay compliant with your corporate standards and service level agreements. Azure Policy meets this need by evaluating your resources for noncompliance with assigned policies. All data stored by Azure Policy is encrypted at rest.
Azure Policy offers several built-in policies that are available by default. In this question, we would use the ‘Allowed Locations’ policy to define the locations where resources can be deployed.
References:
https://docs.microsoft.com/en-us/azure/governance/policy/overview
QUESTION 137 This question requires that you evaluate the underlined text to determine if it is correct.
From Azure Cloud Shell, you can track your company’s regulatory standards and regulations, such as ISO 27001.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed.” If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed.
B.	the Microsoft Cloud Partner Portal
C.	Compliance Manager
D.	the Trust Center
Correct Answer: C
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Microsoft Compliance Manager (Preview) is a free workflow-based risk assessment tool that lets you track, assign, and verify regulatory compliance activities related to Microsoft cloud services. Azure Cloud Shell, on the other hand, is an interactive, authenticated, browser-accessible shell for managing Azure resources.
References: https://docs.microsoft.com/en-us/microsoft-365/compliance/compliance-manager-overview https://docs.microsoft.com/en-us/azure/cloud-shell/overview


QUESTION 138 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Azure AD join only applies to Windows 10 devices.
References:
https://docs.microsoft.com/en-us/azure/active-directory-domain-services/manage-group-policy https://docs.microsoft.com/en-us/azure/active-directory/devices/azureadjoin-plan
QUESTION 139 This question requires that you evaluate the underlined text to determine if it is correct.
The Microsoft Online Services Privacy Statement explains what data Microsoft processes, how Microsoft processes the data, and the purpose of processing the data.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed.” If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed.
B.	Microsoft Online Services Terms
C.	Microsoft Online Service Level Agreement
D.	Online Subscription Agreement for Microsoft Azure
Correct Answer: A
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
The Microsoft Privacy Statement explains what personal data Microsoft processes, how Microsoft processes the data, and the purpose of processing the data
References:
https://privacy.microsoft.com/en-us/privacystatement


QUESTION 140 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference: Explanation:
Box 1: Yes
Azure Security Center is a unified infrastructure security management system that strengthens the security posture of your data centers, and provides advanced threat protection across your hybrid workloads in the cloud - whether they're in Azure or not - as well as on premises.
Box 2: No
Only two features: Continuous assessment and security recommendations, and Azure secure score, are free.
Box 3: Yes
The advanced monitoring capabilities in Security Center also let you track and manage compliance and governance over time. The overall compliance provides you with a measure of how much your subscriptions are compliant with policies associated with your workload.
References:
https://docs.microsoft.com/en-us/azure/security-center/security-center-intro


QUESTION 141 HOTSPOT
To complete the sentence, select the appropriate option in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
Authentication, not authorization is the process of verifying a user’s credentials.
The difference between authentication and authorization is:
  Authentication is proving your identity, proving that you are who you say you are. The most common example of this is logging in to a system by providing credentials such as a username and password.   Authorization is what you’re allowed to do once you’ve been authenticated. For example, what resources you’re allowed to access and what you can do with those resources.

    
    QUESTION 142 You need to configure an Azure solution that meets the following requirements: 
  Secures websites from attacks 
  Generates reports that contain details of attempted attacks 
What should you include in the solution?
A.	Azure Firewall
B.	a network security group (NSG)
C.	Azure Information Protection
D.	DDoS protection
Correct Answer: D
Section: Understand Security, Privacy, Compliance and Trust Explanation
Explanation/Reference:
Explanation:
DDoS is a type of attack that tries to exhaust application resources. The goal is to affect the application’s availability and its ability to handle legitimate requests.  DDoS attacks can be targeted at any endpoint that is publicly reachable through the internet.
Azure has two DDoS service offerings that provide protection from network attacks: DDoS Protection Basic and DDoS Protection Standard.
DDoS Basic protection is integrated into the Azure platform by default and at no extra cost.
You have the option of paying for DDoS Standard. It has several advantages over the basic service, including logging, alerting, and telemetry.  DDoS Standard can generate reports that contain details of attempted attacks as required in this question.
References:
https://docs.microsoft.com/en-us/azure/security/fundamentals/ddos-best-practices


QUESTION 143
You attempt to create several managed Microsoft SQL Server instances in an Azure environment and receive a message that you must increase your Azure subscription limits. 
What should you do to increase the limits?
A.	Create a service health alert 
B.	Upgrade your support plan 
C.	Modify an Azure policy 
D.	Create a new support request 
Correct Answer: D
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
Many Azure resource have quote limits.  The purpose of the quota limits is to help you control your Azure costs.  However, it is common to require an increase to the default quota.
You can request a quota limit increase by opening a support request.  In the support request, select ‘Service and subscription limits (quotas)’ for the Issue type, select your subscription and the service you want to increase the quota for.  For this question, you would select ‘SQL Database Managed Instance’ as the quote type.
References: https://docs.microsoft.com/en-us/azure/sql-database/sql-database-managed-instance-resourcelimits#obtaining-a-larger-quota-for-sql-managed-instance


QUESTION 144 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: No
Azure Free Account gives you 12 months access to the most popular free services.  It also gives you a credit (150 GBP or 200 USD) to use on any Azure service for up to 30 days.
Box 2: Yes
All free accounts expire after 12 months.
Box 3: No
You can only create one free Azure account per Microsoft account.
References:
https://azure.microsoft.com/en-gb/free/


QUESTION 145 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
You can assign additional account administrators in the Azure Portal.
Box 2: No
You need an Azure Active Directory account to manage a subscription, not a Microsoft account.
An account is created in the Azure Active Directory when you create the subscription.  Further accounts can be created in the Azure Active Directory to manage the subscription.
Box 3: No
Resource groups are logical containers for Azure resources.  However, resource groups do not contain subscriptions. Subscriptions contain resource groups.
References:
https://docs.microsoft.com/en-us/office365/enterprise/subscriptions-licenses-accounts-and-tenants-formicrosoft-cloud-offerings


QUESTION 146
Your company has 10 offices. You plan to generate several billing reports from the Azure portal. Each report will contain the Azure resource utilization of each office. 
Which Azure Resource Manager feature should you use before you generate the reports? 
A.	tags 
B.	templates 
C.	locks 
D.	policies 
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
You can use resource tags to ‘label’ Azure resources.  Tags are metadata elements attached to resources. Tags consist of pairs of key/value strings.  In this question, we would tag each resource with a tag to identify each office.  For example: Location = Office1.  When all Azure resources are tagged, you can generate reports to list all resources based on the value of the tag.  For example: All resources used by Office1.
References:
https://docs.microsoft.com/en-us/azure/cloud-adoption-framework/decision-guides/resource-tagging/


QUESTION 147 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
Microsoft guarantee at least 99.9% availability of the Azure Active Directory Premium edition services. The services are considered available in the following scenarios:
  Users are able to login to the service, login to the Access Panel, access applications on the Access Panel and reset passwords.
  IT administrators are able to create, read, write and delete entries in the directory or provision or deprovision users to applications in the directory.
Box 2: No
No SLA is provided for the Free tier of Azure Active Directory.
Box 3: Yes
You can claim credit if the availability falls below the SLA. The amount of credit depends on the availability.  For example: You can claim 25% credit if the availability is less than 99.9%, 50% credit for less than 99% and 100% for less than 95% availability.
References:
https://azure.microsoft.com/en-gb/support/legal/sla/active-directory/v1_0/


QUESTION 148 HOTSPOT
To complete the sentence, select the appropriate option in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
If the SLA for an Azure service is not met, you receive credits for that service and that service only.  The credits are deducted from your monthly bill for that service.  If you stopped using the service where the SLA was not met, your account would remain in credit for that service.  The credits would not be applied to any other services that you may be using.
Service Credits apply only to fees paid for the particular Service, Service Resource, or Service tier for which a
Service Level has not been met. In cases where Service Levels apply to individual Service Resources or to separate Service tiers, Service Credits apply only to fees paid for the affected Service Resource or Service tier, as applicable. The Service Credits awarded in any billing month for a particular Service or Service Resource will not, under any circumstance, exceed your monthly service fees for that Service or Service Resource, as applicable, in the billing month.
References:
https://azure.microsoft.com/en-gb/support/legal/sla/analysis-services/v1_0/


QUESTION 149 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Public Preview means that the service is in public beta and can be tried out by anyone with an Azure subscription. Services in public preview are often offered at a discount price.  
Box 1: No
Services in private preview can be viewed in the regular Azure portal.  However, you need to be signed up for the feature in private preview before you can view it.  Access to private preview features is usually by invitation only.
Box 2: Yes
You can use services in public preview in production environments.  However, you should be aware that the service may have faults, is not subject to an SLA and may be withdrawn without notice.
Box 3: No
Public previews are excluded from SLAs and in some cases, no support is offered.
References:
https://www.neowin.net/news/several-more-azure-services-now-available-in-private-public-preview/


QUESTION 150 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: No
An Azure free account comes with a ‘basic’ support plan, not a ‘standard’ support plan.
Box 2: Yes
You can purchase the Professional Direct, Standard, and Developer support plans with the Microsoft Customer Agreement. You can also purchase the Professional and Standard support plans with the Enterprise Agreement.
Box 3: No
Users with any type of Azure subscription (pay-as-you-go, Enterprise Agreement, Microsoft Customer Agreement etc.) can get support from the MSDN forums.
References:
https://azure.microsoft.com/en-us/support/plans/


QUESTION 151
Your company plans to migrate to Azure. The company has several departments. All the Azure resources used by each department will be managed by a department administrator. 
What are two possible techniques to segment Azure for the departments? Each correct answer presents a complete solution.
NOTE: Each correct selection is worth one point.
A.	multiple subscriptions 
B.	multiple Azure Active Directory (Azure AD) directories 
C.	multiple regions 
D.	multiple resource groups 
Correct Answer: AD
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
An Azure subscription is a container for Azure resources.  It is also a boundary for permissions to resources and for billing.  You are charged monthly for all resources in a subscription.  A single Azure tenant (Azure Active Directory) can contain multiple Azure subscriptions.  
A resource group is a container that holds related resources for an Azure solution. The resource group can include all the resources for the solution, or only those resources that you want to manage as a group.
To enable each department administrator to manage the Azure resources used by that department, you will need to create a separate subscription per department.  You can then assign each department administrator as an administrator for the subscription to enable them to manage all resources in that subscription. https://docs.microsoft.com/en-us/azure/cost-management-billing/manage/create-subscription
https://docs.microsoft.com/en-us/azure/cost-management-billing/manage/add-change-subscriptionadministrator


QUESTION 152 This question requires that you evaluate the underlined text to determine if it is correct. 
If Microsoft plans to end support for an Azure service that does NOT have a successor service, Microsoft will provide notification at least 12 months before.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct. 
A.	No change is needed.
B.	6 months
C.	90 days
D.	30 days
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Modern Lifecycle Policy covers products and services that are serviced and supported continuously.  For products governed by the Modern Lifecycle Policy, Microsoft will provide a minimum of 12 months' notification prior to ending support if no successor product or service is offered—excluding free services or preview releases.
Reference:
https://support.microsoft.com/en-us/help/30881


QUESTION 153 HOTSPOT 
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: No
You need to be an administrator of the billing account that has the subscription to be able to transfer the subscription.  This could be a Billing Administrator or Global Administrator.  A subscription owner can manage all resources and permissions within the subscription but cannot transfer ownership of the subscription.
Box 2: Yes
You can convert a free trial subscription to Pay-As-You-Go.  This is common practice for people who wish to continue using the Azure services when the free trial period expires.
Box 3: Yes
You can remove the spending limit, but you can’t increase or decrease it.
The spending limit in Azure prevents spending over your credit amount. All new customers who sign up for an Azure free account or subscription types that include credits over multiple months have the spending limit turned on by default. The spending limit is equal to the amount of credit and it can’t be changed. For example, if you signed up for Azure free account, your spending limit is $200 and you can't change it to $500. However, you can remove the spending limit. So, you either have no limit, or you have a limit equal to the amount of credit.
Reference:
https://docs.microsoft.com/en-us/azure/billing/billing-add-change-azure-subscription-administrator https://docs.microsoft.com/en-us/azure/billing/billing-upgrade-azure-subscription https://docs.microsoft.com/en-us/azure/billing/billing-spending-limit


QUESTION 154 HOTSPOT 
For each of the following statements, select Yes if the statement is true. Otherwise, select No. NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
A reservation is where you commit to pay for a resource (for example a virtual machine) for one or three years.  This gives you a discounted price on the resource for the reservation period.  
Box 2: No
There are other factors that influence the cost of a virtual machine such as the virtual hard disks attached to the virtual machine.  You could have multiple virtual machines with the same ‘size’ (B2S in this case) but with different virtual hard disk configurations.
Box 3: Yes
When a virtual machine is stopped (deallocated), the virtual machine is unloaded/dismounted from the physical server in Azure.  In this state, you are not charged for the virtual machine itself.  However, you are still charged for the storage costs of the virtual hard disks attached to the virtual machine.
If the virtual machine is stopped but not deallocated (this happens if you shut down the virtual machine from the operating system of the virtual machine), the virtual machine is still mounted on the physical server in Azure and you are charged for the virtual machine itself as well as the storage costs.  To ensure that a virtual machine is ‘stopped (deallocated)’, you need to stop the virtual machine in the Azure portal.
Reference: https://azure.microsoft.com/en-us/reservations/ https://docs.microsoft.com/en-us/azure/virtual-machines/linux/b-series-burstable
https://blogs.technet.microsoft.com/uspartner_ts2team/2014/10/10/azure-virtual-machines-stopping-versusstopping-deallocating/


QUESTION 155
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution.
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen.
Your company has an Azure subscription that contains the following unused resources:
  20 user accounts in Azure Active Directory (Azure AD)
  Five groups in Azure AD
  10 public IP addresses
  10 network interfaces
You need to reduce the Azure costs for the company.
Solution: You remove the unused network interfaces.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
You are not charged for unused network interfaces. Therefore, deleting unused network interfaces will not reduce the Azure costs for the company.
References: https://docs.microsoft.com/en-us/azure/advisor/advisor-cost-recommendations#reduce-costs-by-deleting-orreconfiguring-idle-virtual-network-gateways


QUESTION 156
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution.
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen.
Your company has an Azure subscription that contains the following unused resources:
  20 user accounts in Azure Active Directory (Azure AD)
  Five groups in Azure AD
  10 public IP addresses
  10 network interfaces
You need to reduce the Azure costs for the company.
Solution: You remove the unused public IP addresses.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
You are charged for public IP addresses.  Therefore, deleting unused public IP addresses will reduce the Azure costs.
References: https://docs.microsoft.com/en-us/azure/advisor/advisor-cost-recommendations#reduce-costs-by-deleting-orreconfiguring-idle-virtual-network-gateways


QUESTION 157
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution.
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen.
Your company has an Azure subscription that contains the following unused resources:
  20 user accounts in Azure Active Directory (Azure AD)
  Five groups in Azure AD
  10 public IP addresses
  10 network interfaces
You need to reduce the Azure costs for the company.
Solution: You remove the unused user accounts.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
You are not charged for user accounts. Therefore, deleting unused user accounts will not reduce the Azure costs for the company.
References:
https://docs.microsoft.com/en-us/azure/advisor/advisor-cost-recommendations#reduce-costs-by-deleting-orreconfiguring-idle-virtual-network-gateways


QUESTION 158
HOTSPOT
How should you calculate the monthly uptime percentage? To answer, select the appropriate options in the answer area.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
"Maximum Available Minutes" is the total accumulated minutes during a billing month .
"Downtime" is the total accumulated minutes that are part of Maximum Available Minutes where a system is unavailable.
"Monthly Uptime Percentage" for a service is calculated as Maximum Available Minutes less Downtime divided by Maximum Available Minutes x 100. 
Monthly Uptime Percentage is represented by the following formula:
Monthly Uptime % = (Maximum Available Minutes-Downtime) / Maximum Available Minutes x 100.
References:
https://azure.microsoft.com/en-au/support/legal/sla/cloud-services/v1_0/
QUESTION 159 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: No
Resource groups are logical containers for Azure resources. You do not pay for resource groups.
Box 2: No
Data ingress over a VPN is data ‘coming in’ to Azure over the VPN.  You are not charged data transfer costs for data ingress.
Box 3: Yes
Data egress over a VPN is data ‘going out’ of Azure over the VPN.  You are charged for data egress.
References: https://docs.microsoft.com/en-us/azure/azure-resource-manager/manage-resource-groups-portal https://azure.microsoft.com/en-us/pricing/details/bandwidth/ https://azure.microsoft.com/en-us/pricing/details/bandwidth/
QUESTION 160 This question requires that you evaluate the underlined text to determine if it is correct. 
A support plan solution that gives you best practice information, health status and notifications, and 24/7 access to billing information at the lowest possible cost is a Standard support plan.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	Developer
C.	Basic
D.	Premier
Correct Answer: C
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
A basic support plan provides:
  24x7 access to billing and subscription support, online self-help, documentation, whitepapers, and support forums
  Best practices: Access to full set of Azure Advisor recommendations
  Health Status and Notifications: Access to personalized Service Health Dashboard & Health API
References:
https://azure.microsoft.com/en-us/support/plans/


QUESTION 161 In which Azure support plans can you open a new support request?
A.	Premier and Professional Direct only
B.	Premier, Professional Direct, and Standard only
C.	Premier, Professional Direct, Standard, and Developer only
D.	Premier, Professional Direct, Standard, Developer, and Basic
Correct Answer: C
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
You can open support cases in the following plans: Premier, Professional Direct, Standard, and Developer only.
You cannot open support cases in the Basic support plan.
References:
https://azure.microsoft.com/en-us/support/plans/


QUESTION 162 This question requires that you evaluate the underlined text to determine if it is correct.
You can create an Azure support request from support.microsoft.com.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed.” If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed.
B.	the Azure portal
C.	the Knowledge Center
D.	the Security & Compliance admin center
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
You can create an Azure support request from the Help and Support blade in the Azure portal or from the context menu of an Azure resource in the Support + Troubleshooting section.
References:
https://docs.microsoft.com/en-us/azure/azure-supportability/how-to-create-azure-support-request
QUESTION 163
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution.
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen.
Your company has an Azure subscription that contains the following unused resources:
  20 user accounts in Azure Active Directory (Azure AD)
  Five groups in Azure AD
  10 public IP addresses
  10 network interfaces
You need to reduce the Azure costs for the company.
Solution: You remove the unused groups.
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation: 
You are not charged for Azure Active Directory Groups.  Therefore, deleting unused groups will not reduce your Azure costs.
References: https://docs.microsoft.com/en-us/azure/advisor/advisor-cost-recommendations#reduce-costs-by-deleting-orreconfiguring-idle-virtual-network-gateways
QUESTION 164 This question requires that you evaluate the underlined text to determine if it is correct. 
The Azure Standard support plan is the lowest cost option to receive 24x7 access to support engineers by phone.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	Developer
C.	Basic
D.	Professional Direct
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Basic support plan is free so is therefore the cheapest.  The Developer support plan is the cheapest paidfor support plan.  The order of support plans in terms of cost ranging from the cheapest to most expensive is: Basic, Developer, Standard, Professional Direct, Premier.
However, 24/7 access to technical support by email and phone is only available for Standard, Professional Direct, Premier plans.
References:
https://azure.microsoft.com/en-gb/support/plans/
QUESTION 165 This question requires that you evaluate the underlined text to determine if it is correct.
All Azure services that are in public preview are provided without any documentation.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	only configurable from Azure CLI
C.	excluded from the Service Level Agreements
D.	only configurable from the Azure portal
Correct Answer: C
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
Preview features are made available to you on the condition that you accept additional terms which supplement the regular Azure terms.  The supplemental terms state:
“PREVIEWS ARE PROVIDED "AS-IS," "WITH ALL FAULTS," AND "AS AVAILABLE," AND ARE EXCLUDED FROM THE SERVICE LEVEL AGREEMENTS AND LIMITED WARRANTY.”
References:
https://azure.microsoft.com/en-gb/support/legal/preview-supplemental-terms/
QUESTION 166 What is guaranteed in an Azure Service Level Agreement (SLA) for virtual machines?
A.	uptime
B.	feature availability
C.	bandwidth
D.	performance
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The SLA for virtual machines guarantees ‘uptime’. The amount of uptime guaranteed depends on factors such as whether the VMs are in an availability set or availability zone if there is more than one VM, the distribution of the VMs if there is more than one or the disk type if it is a single VM.
The SLA for Virtual Machines states:
  For all Virtual Machines that have two or more instances deployed across two or more Availability Zones in the same Azure region, we guarantee you will have Virtual Machine Connectivity to at least one instance at least 99.99% of the time.
  For all Virtual Machines that have two or more instances deployed in the same Availability Set or in the same Dedicated Host Group, we guarantee you will have Virtual Machine Connectivity to at least one instance at least 99.95% of the time.
  For any Single Instance Virtual Machine using Premium SSD or Ultra Disk for all Operating System Disks and Data Disks, we guarantee you will have Virtual Machine Connectivity of at least 99.9%.
References: https://azure.microsoft.com/en-us/support/legal/sla/summary/ https://azure.microsoft.com/en-us/support/legal/sla/virtual-machines/v1_9/
QUESTION 167 This question requires that you evaluate the underlined text to determine if it is correct. 
An Azure service is available to all Azure customers when it is in public preview.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct. 
A.	No change is needed.
B.	private preview
C.	development
D.	an Enterprise Agreement (EA) subscription
Correct Answer: A
Section: Understand Azure Pricing and Support
Explanation
Explanation/Reference:
Explanation:
Public Preview means that the service is in public beta and can be tried out by anyone with an Azure subscription. Services in public preview are often offered at a discount price.  
Public previews are excluded from SLAs and in some cases, no support is offered.
Incorrect Answers:
B: Services in private preview are available only to selected people who has signed up to the private preview program.
C: Services in development are not available to the public.
D: Services provided under an Enterprise Agreement (EA) subscription are available only to the subscription owner.
References:
https://www.neowin.net/news/several-more-azure-services-now-available-in-private-public-preview/


QUESTION 168
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your company plans to purchase an Azure subscription.
The company’s support policy states that the Azure environment must provide an option to access support engineers by phone or email.  
You need to recommend which support plan meets the support policy requirement. 
Solution: Recommend a Basic support plan. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Basic support plan does not have any technical support for engineers.
Access to Support Engineers via email or phone is available in the following support plans: Premier, Professional Direct and standard.
References:
https://azure.microsoft.com/en-gb/support/plans/


QUESTION 169
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your company plans to purchase an Azure subscription. 
The company’s support policy states that the Azure environment must provide an option to access support engineers by phone or email.  
You need to recommend which support plan meets the support policy requirement. 
Solution: Recommend a Standard support plan. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Standard, Professional Direct, and Premier support plans have technical support for engineers via email and phone.
References:
https://azure.microsoft.com/en-gb/support/plans/


QUESTION 170
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your company plans to purchase an Azure subscription.
The company’s support policy states that the Azure environment must provide an option to access support engineers by phone or email.  
You need to recommend which support plan meets the support policy requirement. 
Solution: Recommend a Premier support plan. 
Does this meet the goal?
A.	Yes 
B.	No 
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Standard, Professional Direct, and Premier support plans have technical support for engineers via email and phone.
References:
https://azure.microsoft.com/en-gb/support/plans/


QUESTION 171 Your company plans to request an architectural review of an Azure environment from Microsoft. 
The company currently has a Basic support plan. 
You need to recommend a new support plan for the company. The solution must minimize costs. 
Which support plan should you recommend?
A.	Premier 
B.	Developer 
C.	Professional Direct 
D.	Standard 
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Premier support plan provides customer specific architectural support such as design reviews, performance tuning, configuration and implementation assistance delivered by Microsoft Azure technical specialists.
References:
https://azure.microsoft.com/en-gb/support/plans/


QUESTION 172 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
Most services go to private preview then public preview before being released to general availability.
The private preview is only available to certain Azure customers for evaluation purposes. The public preview is available to all Azure customers.
Box 2: No
Azure services in public preview can be managed using the regular management tools: Azure Portal, Azure CLI and PowerShell.
Box 3: No
Services in private or public preview are usually offered at reduced costs.  However, the costs increase, not decrease when the services are released to general availability.

  
  QUESTION 173 What is required to use Azure Cost Management? 
A.	a Dev/Test subscription 
B.	Software Assurance 
C.	an Enterprise Agreement (EA) 
D.	a pay-as-you-go subscription 
Correct Answer: C
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
Azure customers with an Azure Enterprise Agreement (EA), Microsoft Customer Agreement (MCA), or Microsoft Partner Agreement (MPA) can use Azure Cost Management.
Cost management is the process of effectively planning and controlling costs involved in your business. Cost management tasks are normally performed by finance, management, and app teams. Azure Cost
Management + Billing helps organizations plan with cost in mind. It also helps to analyze costs effectively and take action to optimize cloud spending.
References: https://docs.microsoft.com/en-gb/azure/cost-management/overview-cost-mgt


QUESTION 174 This question requires that you evaluate the underlined text to determine if it is correct. 
Your Azure trial account expired last week. You are now unable to create additional Azure Active Directory (Azure AD) user accounts. 
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed”. If the statement is incorrect, select the answer choice that makes the statement correct. 
A.	No change is needed 
B.	start an existing Azure virtual machine 
C.	access your data stored in Azure 
D.	access the Azure portal 
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
A stopped (deallocated) VM is offline and not mounted on an Azure host server.  Starting a VM mounts the VM on a host server before the VM starts.  As soon as the VM is mounted, it becomes chargeable.  For this reason, you are unable to start a VM after a trial has expired.
Incorrect Answers:
A: You are not charged for Azure Active Directory user accounts so you can continue to create accounts.
C: You can access data that is already stored in Azure.
D: You can access the Azure Portal.  You can also reactivate and upgrade the expired subscription in the portal.

  
  QUESTION 175
Note: This question is part of a series of questions that present the same scenario. Each question in the series contains a unique solution that might meet the stated goals. Some question sets might have more than one correct solution, while others might not have a correct solution. 
After you answer a question in this section, you will NOT be able to return to it. As a result, these questions will not appear in the review screen. 
Your company plans to purchase an Azure subscription. 
The company’s support policy states that the Azure environment must provide an option to access support engineers by phone or email. 
You need to recommend which support plan meets the support policy requirement. 
Solution: Recommend a Professional Direct support plan. 
Does this meet the goal?
A.	Yes
B.	No
Correct Answer: A
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
The Basic support plan does not have any technical support for engineers.
The Developer support plan has only technical support for engineers via email.
The Standard, Professional Direct, and Premier support plans have technical support for engineers via email and phone.
References:
https://azure.microsoft.com/en-gb/support/plans/


QUESTION 176
Your company has 10 departments.
The company plans to implement an Azure environment.
You need to ensure that each department can use a different payment option for the Azure services it consumes.
What should you create for each department?
A.	a reservation
B.	a subscription
C.	a resource group
D.	a container instance
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
There are different payment options in Azure including pay-as-you-go (PAYG), Enterprise Agreement (EA), and Microsoft Customer Agreement (MCA) accounts.
Your Azure costs are ‘per subscription’. You are charged monthly for all resources in a subscription. Therefore, to use different payment options per department, you will need to create a separate subscription per department.  You can create multiple subscriptions in a single Azure Active Directory tenant.
Incorrect Answers:
A: A reservation is where you commit to a resource (for example a virtual machine) for one or three years. This gives you a discounted price on the resource for the reservation period.  Reservations do not provide a way to use different payment options per department.
C: A resource group is a logical container for Azure resources. You can view the total cost of all the resources in a resource group. However, resource groups do not provide a way to use different payment options per department.
D: A container instance is an Azure resource used to run an application.  Container instances do not provide a way to use different payment options per department.
References:
https://docs.microsoft.com/en-us/azure/cost-management-billing/manage/create-subscription


QUESTION 177 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
An Azure free account has a spending limit. This is currently 200 USD or 150 GBP.
Box 2: No
Azure free account has a 5 GB blob storage limit and a 5 GB file storage limit.
Box 3: No
Azure free account has a limit of 10 web, mobile or API apps
References: https://azure.microsoft.com/en-us/free/ https://azure.microsoft.com/en-us/free/free-account-faq/ https://docs.microsoft.com/en-us/azure/billing/billing-avoid-charges-free-account


QUESTION 178 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
Box 1: No
Most services go to private preview then public preview before being released to general availability.  The private preview is only available to certain Azure customers for evaluation purposes.
Box 2: Yes
Public Preview means that the service is in public beta and can be tried out by anyone with an Azure subscription. Services in public preview are often offered at a discount price.  Public previews are excluded from SLAs and in some cases, no support is offered.
Box 3: No
An Azure service in general availability is available to all Azure customers, not just a subset of the customers.
References: https://azure-overview.com/Home/Faq


QUESTION 179 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
You can use the same account to manage multiple subscriptions.  You can create an additional subscription for your account in the Azure portal. You may want an additional subscription to avoid hitting subscription limits, to create separate environments for security, or to isolate data for compliance reasons.
Box 2: No
You cannot merge two subscriptions into a single subscription.  However, you can move some Azure resources from one subscription to another.  You can also transfer ownership of a subscription and change the billing type for a subscription.
Box 3: Yes
A company can have multiple subscriptions and store resources in the different subscriptions.  However, a resource instance can exist in only one subscription.
Reference:
https://docs.microsoft.com/en-us/azure/cost-management-billing/manage/create-subscription


QUESTION 180 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
SLA’s vary based on the resource type and the location distribution of the resource.  However, the minimum uptime for all Azure services is 99.9 percent.
Box 2: Yes
The SLA guaranteed uptime is increased (usually to 99.95 percent) when resources are deployed across multiple regions.
Box 3: No
The number of subscriptions is unrelated to uptime SLA’s.  You can deploy resources to multiple regions under a single subscription or you can have multiple subscriptions with resources deployed to the same region.
References:
https://azure.microsoft.com/en-us/support/legal/sla/summary/


QUESTION 181 Which statement accurately describes the Modern Lifecycle Policy for Azure services?
A.	Microsoft provides mainstream support for a service for five years.
B.	Microsoft provides a minimum of 12 months’ notice before ending support for a service.
C.	After a service is made generally available, Microsoft provides support for the service for a minimum of four years.
D.	When a service is retired, you can purchase extended support for the service for up to five years.
Correct Answer: B
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
For products governed by the Modern Lifecycle Policy, Microsoft will provide a minimum of 12 months' notification prior to ending support if no successor product or service is offered—excluding free services or preview releases.
References:
https://support.microsoft.com/en-us/help/30881/modern-lifecycle-policy


QUESTION 182 HOTSPOT
You need to request that Microsoft increase a subscription quota limit for your company. 
Which blade should you use from the Azure portal? To answer, select the appropriate blade in the answer area. 
Hot Area:
 
Correct Answer:  
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Request a standard quota increase from Help + support
References:
https://docs.microsoft.com/en-us/azure/azure-portal/supportability/per-vm-quota-requests


QUESTION 183 This question requires that you evaluate the underlined text to determine if it is correct.
You can use Advisor recommendations in Azure to send email alerts when the cost of the current billing period for an Azure subscription exceeds a specified limit.
Instructions: Review the underlined text. If it makes the statement correct, select “No change is needed.” If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed.
B.	Access control (IAM)
C.	Budget alerts
D.	Compliance
Correct Answer: C
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
Budget alerts notify you when spending, based on usage or cost, reaches or exceeds the amount defined in the alert condition of the budget. Cost Management budgets are created using the Azure portal or the Azure Consumption API.
References:
https://docs.microsoft.com/en-us/azure/cost-management-billing/costs/cost-mgt-alerts-monitor-usage-spending
QUESTION 184 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
References: https://azure.microsoft.com/en-us/support/legal/preview-supplemental-terms/
QUESTION 185 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: Yes
With Azure ExpressRoute, all inbound data transfer is free of charge.
Box 2: No
Inbound data traffic is free but outbound data traffic is not.
Box 3: Yes
References:
https://azure.microsoft.com/en-us/pricing/details/expressroute/ https://azure.microsoft.com/en-us/pricing/details/bandwidth/
QUESTION 186 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No.
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation:
Box 1: No
The price of Azure storage varies by region.  If you use the Azure storage pricing page, you can select different regions and see how the price changes per region.
Box 2: No
You are charged for read and write operations in general-purpose v2 storage accounts.  
Box 3: No
You would be charge for the read operations of the source storage account and write operations in the destination storage account.
References: https://docs.microsoft.com/en-us/azure/storage/common/storage-account-overview https://azure.microsoft.com/en-gb/pricing/details/storage/blobs/
QUESTION 187 HOTSPOT
To complete the sentence, select the appropriate option in the answer area.
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference:
Explanation:
You can move a VM and its associated resources to a different subscription by using the Azure portal. Moving between subscriptions can be handy if you originally created a VM in a personal subscription and now want to move it to your company's subscription to continue your work. You do not need to start the VM in order to move it and it should continue to run during the move.
References: https://docs.microsoft.com/en-us/azure/virtual-machines/windows/move-vm
QUESTION 188 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point. 
Hot Area:
 
Correct Answer: 
 
Section: Understand Azure Pricing and Support Explanation
Explanation/Reference: Explanation: Box 1: No
Resource groups are logical containers for Azure resources. You do not pay for resource groups.
Box 2: No
Data ingress over a VPN is data ‘coming in’ to Azure over the VPN.  You are not charged data transfer costs for data ingress.
Box 3: Yes
Data egress over a VPN is data ‘going out’ of Azure over the VPN.  You are charged for data egress.
Reference: https://docs.microsoft.com/en-us/azure/azure-resource-manager/manage-resource-groups-portal https://azure.microsoft.com/en-us/pricing/details/bandwidth/
QUESTION 191 This question requires that you evaluate the underlined text to determine if it is correct.
Azure policies provide a common platform for deploying objects to a cloud infrastructure and for implementing consistency across the Azure environment.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	Resource groups provide
C.	Azure Resource Manager provides
D.	Management groups provide
Correct Answer: C
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 192 This question requires that you evaluate the underlined text to determine if it is correct.
You have several virtual machines in an Azure subscription. You create a new subscription. The virtual machines cannot be moved to the new subscription.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	The virtual machines can be moved to the new subscription
C.	The virtual machines can be moved to the new subscription only if they are all in the same resource group D. The virtual machines can be moved to the new subscription only if they run Windows Server 2016
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
Explanation/Reference:
QUESTION 194 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 196 This question requires that you evaluate the underlined text to determine if it is correct.
When you need to delegate permissions to several Azure virtual machines simultaneously, you must deploy the Azure virtual machines to the same Azure region.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	by using the same Azure Resource Manager template
C.	to the same resource group
D.	to the same availability zone
Correct Answer: C
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 197 This question requires that you evaluate the underlined text to determine if it is correct.
If a resource group named RG1 has a delete lock, only a member of the global administrators group can delete RG1.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	the delete lock must be removed before an administrator
C.	an Azure policy must be modified before an administrator
D.	an Azure tag must be added before an administrator
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 198
This question requires that you evaluate the underlined text to determine if it is correct.
Your company implements Azure policies to automatically add a watermark to Microsoft Word documents that contain credit card information.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	DDoS protection
C.	Azure Information Protection
D.	Azure Active Directory (Azure AD) Identity Protection
Correct Answer: C
Section: Mixed questions Explanation
Explanation/Reference:
Reference: 
https://docs.microsoft.com/en-us/azure/information-protection/infoprotect-quick-start-tutorial
QUESTION 199 This question requires that you evaluate the underlined text to determine if it is correct.
You have an Azure virtual network named VNET1 in a resource group named RG1.
You assign an Azure policy specifying that virtual networks are not an allowed resource type in RG1. VNET1 is deleted automatically.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	is moved automatically to another resource group
C.	continues to function normally
D.	is now a read-only object
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
Reference:
https://docs.microsoft.com/en-us/azure/governance/policy/overview
QUESTION 200 This question requires that you evaluate the underlined text to determine if it is correct.
Authorization is the process of verifying a user's credentials.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	Authentication
C.	Federation
D.	Ticketing
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 201 This question requires that you evaluate the underlined text to determine if it is correct.
You deploy an Azure resource. The resource becomes unavailable for an extended period due to a service outage. Microsoft will automatically refund your bank account.
Instructions: Review the underlined text. If it makes the statement correct, select "No change is needed". If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	automatically migrate the resource to another subscription
C.	automatically credit your account
D.	send you a coupon code that you can redeem for Azure credits
Correct Answer: C
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 202
A company has the requirement to have an automated process in place which would upload logs to an Azure SQL database every week. Reports would then be generated from the SQL database. Which of the following would you use for this requirement?
A.	The AzCopy tool
B.	Azure Data Factory
C.	Azure HDInsight
D.	Data Migration Assistant
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
Explanation:
You can use the Azure Data Factory to create a pipeline that can be used to copy data. Below is an excerpt from the Microsoft documentation on the connector for SQL server. 
Reference:
https://docs.microsoft.com/en-us/azure/data-factory/connector-sql-server
QUESTION 203
A company is planning on deploying an application onto Azure. The application will be based on the .Net core programming language. The application would be hosted using Azure Web apps. Below is part of the various requirements for the application:
  Gives the ability for the testing team to view the different components of an application and see the calls being made between the different application components
  Helps business analyse how many users actually return to the application
  Ensuring IT administrators get alerts based on critical conditions being met in the application.
Which of the following service would be best suited for fulfilling the requirement of "Helps business analyse how many users actually return to the application"?
A.	Application Insights
B.	Azure Service Health
C.	Azure Advisor
D.	Azure Policies
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
Reference:
https://docs.microsoft.com/en-us/azure/azure-monitor/app/usage-retention
QUESTION 204
A company has setup an Azure subscription and an Azure tenant. They have purchased Premium P2 licenses. There are different departments that have different requirements for managing identities.
 
Which of the following would you suggest for the Logistics department?
A.	Managed Service Identity
B.	Identity Protection
C.	Privileged Identity Management
D.	Azure AD Connect
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
Explanation:
This is clearly given in the Microsoft documentation wherein the Privileged Identity Management feature would fulfil this requirement.
Reference:
https://docs.microsoft.com/en-us/azure/active-directory/managed-identities-azureresources/overview
QUESTION 205
A company has developed a web service that is made available on a virtual machine deployed to a subnet in the Virtual network.
An API Management service has been deployed, which will provide access to the API service hosted on the Virtual Machine.
Consultant companies must be able to connect to the API over the Internet.
Below is the configuration of the API management gateway instance.
 
Based on the configuration, would the API be available to the consultants over the Internet?
A.	Yes
B.	No
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
Reference: https://docs.microsoft.com/en-us/azure/api-management/api-management-using-with-vnet
QUESTION 206 A company wants to deploy an application to Azure. The application has the below requirements:
  Give the ability to install and provide access to the full .Net framework
  Allow administrative access to the operating system
  Provide a level of redundancy if an Azure region fails
You decide to deploy 2 Azure Virtual Machines in 2 separate regions. And then you create a Traffic Manager Profile.
Does this solution meet the requirement?
A.	Yes
B.	No
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
Explanation:
Yes, this will meet all the requirements. Since you are using Azure Virtual Machines, IT administrators can get the required access. You can also then get the required access to the underlying software including the .Net framework.
Using a Traffic Manager profile along with the failover routing policy can ensure the requirement for redundancy is fulfilled.
Reference:
https://docs.microsoft.com/en-us/azure/traffic-manager/traffic-manager-overview
QUESTION 207
A team has an Azure CosmosDB account. A solution needs to be in place to generate an alert from Azure Log Analytics when a query request charge exceeds 40 units more than 10 times during a 10-minute window.
Which of the following would you recommend? (Choose two.)
A.	Create a search query to identify when the requestCharge_s exceeds 40.
B.	Create a search query to identify when the requestCharge_s exceeds 10.
C.	Create a search query to identify when the duration_s exceeds 10.
D.	Configure a period of 10 and a frequency of 10.
Correct Answer: AD
Section: Mixed questions Explanation
Explanation/Reference:
Reference:
https://docs.microsoft.com/en-us/azure/cosmos-db/logging
QUESTION 208
Our team needs to deploy a Virtual machine that will host a SQL Server. The Virtual machine will have 2 data disks, one for the log file and the other for the data files. You need to recommend a caching policy for each disk.
Which of the following would you recommend for the data disk containing the logs?
A.	None
B.	ReadOnly C. WriteOnly
D. ReadWrite
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 209
A company has setup an Azure subscription and an Azure tenant. You need to provide the development team to be able to start and stop Virtual Machines. The access needs to be granted on specific occasions only.
You need to ensure the permission gets assigned and use the principle of least privilege. You also need to minimize costs.
Which of the following security feature would you use for the requirement?
A.	Conditional Access policy
B.	Azure Policies
C.	Just in time VM access
D.	Privileged Identity Management
Correct Answer: D
Section: Mixed questions Explanation
Explanation/Reference:
Explanation: 
With Privileged Identity Management, you can implement just in time privileges for Azure resources.
QUESTION 210
A company has deployed several applications across Windows and Linux Virtual machines in Azure. Log Analytics are being used to send the required data for alerting purposes for the Virtual Machines.
You need to recommend which tables need to be queried for security related queries.
Which of the following would you query for events from Windows Event Logs?
A.	Azure Activity
B.	Azure Diagnostics
C.	Event
D.	Syslog
Correct Answer: C
Section: Mixed questions Explanation
Explanation/Reference:
Reference: https://docs.microsoft.com/en-us/azure/azure-monitor/platform/data-sources-windows-events
QUESTION 211 A company has the following on-premise data stores.
  A Microsoft SQL Server 2012 database.
  A Microsoft SQL Server 2008 database.
  The data needs to be migrated to Azure.
Requirement 1 - The data in the Microsoft SQL Server 2012 database needs to be migrated to an Azure SQL database.
Requirement 2 - The data in a table in the Microsoft SQL Server 2008 database needs to be migrated to an Azure CosmosDB account that uses the SQL API.
Which of the following should be used to accomplish Requirement2?
A.	AzCopy
B.	Azure CosmosDB Data Migration tool
C.	Data Management Gateway
D.	Data Migration Assistant
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
Reference: https://docs.microsoft.com/en-us/azure/cosmos-db/import-data QUESTION 212 A company is planning on deploying an Azure Web App to 2 regions.
One of the key requirements is to ensure that the web app is always running if an Azure region fails. You need to ensure deployment costs are minimized.
Which of the following service would you include in the deployment of the solution?
A.	Azure Functions
B.	Azure Traffic Manager
C.	Azure Application Gateway
D.	Azure Load Balancer
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
Reference: https://docs.microsoft.com/en-us/azure/traffic-manager/traffic-manager-overview
QUESTION 213
A company is planning on deploying a stateless based application based on microservices using the Azure Service Fabric service.
You need to design the infrastructure that would be required in the Azure Service Fabric service. 
Which of the following should you consider? (Choose two.)
A.	The number of node types in the cluster
B.	The properties for each node type
C.	The network connectivity
D.	The service tier
Correct Answer: AB
Section: Mixed questions Explanation
Explanation/Reference:
Explanation: https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-cluster-capacity
QUESTION 214 HOTSPOT
For each of the following statements, select Yes if the statement is true. Otherwise, select No. 
NOTE: Each correct selection is worth one point.
Hot Area:
 
Correct Answer: 
 
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 215 HOTSPOT
Several support engineers plan to manage Azure by using the computers shown in the following table:
 
You need to identify which Azure management tools can be used from each computer. What should you identify for each computer? To answer, select the appropriate options in the answer area. NOTE: Each correct selection is worth one point
Hot Area:
 
Correct Answer: 
 
Section: Mixed questions Explanation
Explanation/Reference:


QUESTION 216 Which Azure service should you use to correlate events from multiple resources into a centralized repository?
A.	Azure Event Hubs
B.	Azure Analysis Services
C.	Azure Monitor
D.	Azure Log Analytics
Correct Answer: D
Section: Mixed questions Explanation
Explanation/Reference:

QUESTION 218 This question requires that you evaluate the underlined text to determine if it is correct.
Data that is stored in the Archive access tier of an Azure Storage account can be accessed at any time by using azcopy.exe.
Instructions: Review the bold text. If it makes the statement correct, select "No change is needed.'' If the statement is incorrect, select the answer choice that makes the statement correct.
A.	No change is needed
B.	can only be read by using Azure Backup
C.	must be restored before the data can be accessed
D.	must be rehydrated before the data can be accessed
Correct Answer: A
Section: Mixed questions Explanation
Explanation/Reference:
QUESTION 220
An Azure administrator plans to run a PowerShell script that creates Azure resources. You need to recommend which computer configuration to use to run the script.
Which three computers can run the script? Each correct answer presents a complete solution.
NOTE: Each correct selection is worth one point.
A.	a computer that runs macOS and has PowerShell Core 6.0 installed
B.	a computer that runs Windows 10 and has the Azure PowerShell module installed
C.	a computer that runs Chrome OS and uses Azure Cloud Shell
D.	a computer that runs Linux and has the Azure CLI tools installed
Correct Answer: ABC
Section: Mixed questions Explanation
Explanation/Reference:


QUESTION 221
Your Azure environment contains multiple Azure virtual machines.
You need to ensure that a virtual machine named VM1 is accessible from the Internet over HTTP.
What are two possible solutions? Each correct answer presents a complete solution.
A.	You modify a DDoS protection plan.
B.	You modify an Azure firewall.
C.	You modify an Azure Traffic Manager profile.
D.	Modify a network security group (NSG)
Correct Answer: BD
Section: Mixed questions Explanation
Explanation/Reference:


QUESTION 222 Which task can you perform by using Azure Advisor?
A.	Integrate Active Directory and Azure Active Directory (Azure AD).
B.	Estimate the costs of an Azure solution.
C.	Confirm that Azure subscription security follows best practices.
D.	Evaluate which on-premises resources can be migrated to Azure.
Correct Answer: B
Section: Mixed questions Explanation
Explanation/Reference:
Reference: https://blog.pragmaticworks.com/what-is-azure-advi-sor#:~:text=Microsoft%20defines%20Azure%20Advisor% 20as,solutions%20based%20on%20that%20data
