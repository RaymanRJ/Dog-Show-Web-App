# Dog Show

***************************************************************************
				FINAL PROJECT

		Rayman Jamal
		991488809
		PROG 32758
		12/12/2018


***************************************************************************

	1. Set-Up MySQL
	2. Set-Up Google Maps
	
	3. Set-Up Server
	4. Improvements


***************************************************************************

1. Set-Up MySQL:


In the main folder ("RJ-FinalProject") there is a "Database-Setup" SQL file. 
This will create the needed database and tables to run this project.

 After 
this is done, navigate to the DAOStrings java file (in 
ca.sheridancollege.dao
package). The dbUserName and dbPassword fields must 
be changed. You must enter
the appropriate username and password to access 
the MySQL database on your machine.


***************************************************************************

2. Set-Up Google Maps:



-- You need to have a Googls Maps API Key for this to work --

In index.jsp, at the bottom there is a script tag. There is a comment above
to help you locate it. In the script tag, replace "API-KEY-ERE" with your 
API Key provided by Google.

If you do not have an API Key, this can be skipped. It will simply
load an error page in the Maps pane of the index page.

***************************************************************************

3. Set-Up Server:



This project requires one role to be pre-set in the Tomcat-Server. 


Navigate to the tomcat-users.xml file, and paste the following
 
into the <tomcat-users> block.

	

<role rolename="doghandler"/>

	
<user password="doghandler" roles="doghandler" username="doghandler"/>



Secondly, we must enable tomcat to use the certificate on our computer.

Navigate to the server.xml file and uncomment the <Connector port="8443"> 
block.

Also, change the certificateKeystoreFile attribute to:


	"${user.home}/.keystore"
	


The whole block of code should look as follows:


<Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"

               maxThreads="150" SSLEnabled="true">

        <SSLHostConfig>
            
		<Certificate certificateKeystoreFile="${user.home}/.keystore"

                         type="RSA" />
        
	</SSLHostConfig>
    
</Connector>


***************************************************************************

4. Improvements

----- One: Advertising Show

Immediately upon loading the project, you will be presented with a Splash Screen.
This holds the project's logo, location, and date information.

It is also navigable to and from every other part of the site, through
clicking the logo in the Nav bar.

----- Two: Edit and Delete

From the View All Dogs page, every dog is a hyperlink. Once clicked, it 
will lead to a spec-sheet of the dog that is editable (except for the
DogIDNumber field). Once edited, the dog will be updated in the database.

----- Three: Email

When a dog is added to the show, an email will be sent to the owner for
confirmation.

----- Four: Dog Handlers

Dog Handlers can be added to the show. To start with, there is only one
active user account (though a real site would have multiple). This user can add
dogs to show and view all their dogs.

----- Five: Adding Shows

When dogs are added to the database, they must select what days they will present.
This is viewable in the View All page, as well as to the Dog Handlers.


***************************************************************************
