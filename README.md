# appengine-gradle-endpoints-examples

This is a very simple cloud endpoints example - one endpoint method call 
from an index.html - build with different gradle plugins for the java 
appengine standard environment.

There are currently two gradle plugins available for java / appengine development: 
* the old gradle-appengine-plugin (https://github.com/GoogleCloudPlatform/gradle-appengine-plugin)
* and the lastest app-gradle-plugin (https://github.com/GoogleCloudPlatform/app-gradle-plugin)

And a new version of endpoints are released, so we have here two versions 
 of endpoints:
* the old Cloud Endpoints (https://cloud.google.com/appengine/docs/java/endpoints/)
* the version 2.0 aka 'Google Cloud Endpoints Frameworks for App Engine (Java)' (https://cloud.google.com/endpoints/docs/frameworks/java/)

In my current project https://www.kontaktlinsen-preisvergleich.de I was 
using the gradle-appengine-plugin with the Cloud Endpoints - that worked 
fine and the configuration can be seen in this branch:
https://github.com/mpoehler/appengine-gradle-endpoints-examples/tree/gradle-appengine-plugin-endpoints-1.0
 
Then I started to migrate to Cloud Endpoints Version 2.0, that works too, 
you can find a working configuration in this branch:
https://github.com/mpoehler/appengine-gradle-endpoints-examples/tree/gradle-appengine-plugin-endpoints-2.0 

However I was not able to get either Endpoints Version 1.0 or 2.0 to work 
with the app-gradle-plugin. You'll find my latest approach in this branch: 
https://github.com/mpoehler/appengine-gradle-endpoints-examples/tree/app-gradle-plugin-endpoints-1.0


 