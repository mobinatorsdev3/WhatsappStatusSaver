# Dillinger
## CRUD using Room Database..
Room is a persistence library that provides an abstraction layer over the SQLite database to allow a more robust database. With the help of room, we can easily create the database and perform CRUD operations very easily. 

Components of Room
The three main components of the room are Entity, Database, and DAO.
Entity: Entity is a modal class that is annotated with @Entity. This class is having variables that will be our columns and the class is our table.
Database: It is an abstract class where we will be storing all our database entries which we can call Entities.
DAO: The full form of DAO is a Database access object which is an interface class with the help of it we can perform different operations in our database.
Adding dependency for using Room in build.gradle files

Navigate to the app > Gradle Scripts > build.gradle file and add the below dependencies in the dependencies section. 

Add below dependency for using room.  

implementation ‘androidx.room:room-runtime:2.2.5’

annotationProcessor ‘androidx.room:room-compiler:2.2.5’




Add below dependency for using lifecycle extensions for room.  

implementation ‘androidx.lifecycle:lifecycle-extensions:2.2.0’

annotationProcessor ‘androidx.lifecycle:lifecycle-compiler:2.2.0’