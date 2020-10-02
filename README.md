# VihangamYoga
The applications inside VihangamYoga are private and are for internal use.

Setup of the App
================

1.  Please clone the project from your branch from github.
2.  Build the application using gradle build.
3.  Make sure you have correct db details in application.properties files.


Running Backend Service from Commandline
========================================
1. Run these commands when running locally

   export RDS_HOSTNAME="127.0.0.1"
   export RDS_PORT=3306
   export RDS_DB_NAME="vy_database_test1"
   export RDS_USERNAME="root"
   export RDS_PASSWORD="
2. gradlew bootRun
