ReadMe Instructions for running Lab 2:

In the .zip file, there are two projects, Lab-2-backend and Lab-2-frontend, these must be open separately in IntelliJ.
If the project does not have the configuration set, select add configuration, add Play 2 App, insert the URL to open,
Lab-2-backend will be: http://localhost:9005, Lab-2-frontend will be: http://localhost:9001.

Once the configuration is added, the Lab-2-backend should be run. Before running the backend, ensure that the
application.conf file is properly setup in the Conf folder. Make sure these values are filled with proper information,
In the URL replace "test" with your DB name, and username, and password with your values.

db.default.url="jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
db.default.username=root
db.default.password=root

Now you can proceed with running the Lab-2-backend, this will create the tables in the database.
When asked in browser, the user should apply the script. Before continuing you must complete the mysqldump in order
to populate your mysql database with the necessary values and structure. We have included mysqldump files in
Lab-2-backend lib folder. There are three mysqldump files: auth_info.sql, conference_data.sql, and pub_info.sql.

Use the following commands to insert each table into the mysql database ensure you are in ./Lab-2-backend/lib directory
in terminal before running following commands.

1. Open terminal, if it shows when inserting mysql command: "mysql: command not found"
   you must define the path before proceeding:
    -Windows insert command:
        //
        set path=C:\Program Files\MySQL\MySQL Server 8.0\bin
        //
        -the path will be unique to your system, use the path where MySQL executable is stored on your device.
    -Mac insert command:
        //
        $vi ~/.bash_profile
        //
    -Add three line code:
        //
        #mysql
        PATH=$PATH:/usr/local/mysql/bin
        export
        //
        -the path will be unique to your system, use the path where MySQL executable is stored on your device.
    -Save this and input command:
        //
        $source ~/.bash_profile
        //

Now you are ready to insert the data from the mysqldump provided into mysql database.
    1. Input command: mysql -h localhost -uroot -p -D CS7340TEAMONELABTHREE <./pub_infoLab3.sql
    2. Input command: mysql -h localhost -uroot -p -D DatabaseName <./auth_info.sql
    3. Input command: mysql -h localhost -uroot -p -D DatabaseName <./conference_data.sql
    $mysqldump -uroot -p CS7340TEAMONELABTHREE pub_info> './pub_info.sql'
    $mysqldump -uroot -p CS7340TEAMONELABTHREE topicwithtitle> './topicwithtitle.sql'
    mysql -h localhost -uroot -p -D CS7340TEAMONELABTHREE <./pub_info.sql

    Note: DatabaseName should be replaced by the name of the database you have active that you want to insert the data
    into. You will be asked to enter the password associated with the root user as well.

