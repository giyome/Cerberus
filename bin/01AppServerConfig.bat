@echo off

rem #########################################################
rem #          Glassfish Configuration for Cerberus         #
rem #########################################################

CALL %CD%\00Config.bat

rem ###### Script start here ######

cd %MYPATH%

rem ### Starting server.
CALL %GLASSFISHPATH%asadmin start-domain

rem ### Configuring server.
CALL %GLASSFISHPATH%asadmin create-jvm-options --target server "-Dorg.cerberus.environment=prd"

rem ### Ressources and Connection Pool.
echo Deleting Resources and Connection Pool...
CALL %GLASSFISHPATH%asadmin delete-resource-ref --target server jdbc/cerberusprd
CALL %GLASSFISHPATH%asadmin delete-jdbc-connection-pool --cascade true cerberus
CALL %GLASSFISHPATH%asadmin delete-jdbc-resource jdbc/cerberusprd
echo Creating Resources and Connection Pool
CALL %GLASSFISHPATH%asadmin create-jdbc-connection-pool --datasourceclassname com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource --restype javax.sql.ConnectionPoolDataSource --steadypoolsize 2 --property user=%DTBUSER%:password=%DTBPASSWD%:ServerName=%DTBSRVHOST%:DatabaseName=%DTBNAME%:portNumber=%DTBSRVPORT% cerberus
CALL %GLASSFISHPATH%asadmin create-jdbc-resource --connectionpoolid cerberus jdbc/cerberusprd
CALL %GLASSFISHPATH%asadmin create-resource-ref --target server jdbc/cerberusprd

rem ### Security.
echo Creating Authentication configuration...
CALL %GLASSFISHPATH%asadmin create-auth-realm  --target server --classname com.sun.enterprise.security.auth.realm.jdbc.JDBCRealm --property jaas-context=jdbcRealm:datasource-jndi=jdbc/cerberusprd:user-table=User:user-name-column=Login:password-column=Password:group-table=UserGroup:group-name-column=GroupName:digest-algorithm=SHA-1 securityCerberus
CALL %GLASSFISHPATH%asadmin set server-config.security-service.default-realm=securityCerberus

rem ### Restarting instance.
CALL %GLASSFISHPATH%asadmin stop-domain
CALL %GLASSFISHPATH%asadmin start-domain

