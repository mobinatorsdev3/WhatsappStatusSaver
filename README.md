
# CRUD Operations



What is CRUD?
CRUD Meaning: CRUD is an acronym that comes from the world of computer programming and refers to the four functions that are considered necessary to implement a persistent storage application: create, read, update and delete. Persistent storage refers to any data storage device that retains power after the device is powered off, such as a hard disk or a solid-state drive. In contrast, random access memory and internal caching are two examples of volatile memory - they contain data that will be erased when they lose power.

Explaining CRUD Operations
Organizations that keep track of customer data, accounts, payment information, health data, and other records require data storage hardware and applications that provide persistent storage. This data is typically organized into a database, which is simply an organized collection of data that may be viewed electronically. There are many types of databases: hierarchical databases, graph databases, and object-oriented databases to name a few. The most commonly implemented type of database is a relational database, which consists of data tabled in rows and columns and connected to other tables with complementary information by a system of keywords that includes primary keys and foreign keys.

CRUD Databases and the Applications to Manage Them
The CRUD acronym identifies all of the major functions that are inherent to relational databases and the applications used to manage them, which include Oracle Database, Microsoft SQL Server, MySQL, and others.

Four CRUD Operations Components Explained
A relational database consists of tables with rows and columns. In a relational database, each row of a table is known as a tuple or a record. Each column of the table represents a specific attribute or field. The four CRUD functions can be called by users to perform different types of operations on selected data within the database. This could be accomplished using code or through a graphical user interface. Let's review each of the four components in-depth to fully appreciate their collective importance of facilitating database interactions.

Create
The create function allows users to create a new record in the database. In the SQL relational database application, the Create function is called INSERT. In Oracle HCM Cloud, it is called create. Remember that a record is a row and that columns are termed attributes. A user can create a new row and populate it with data that corresponds to each attribute, but only an administrator might be able to add new attributes to the table itself.

Read
The read function is similar to a search function. It allows users to search and retrieve specific records in the table and read their values. Users may be able to find desired records using keywords, or by filtering the data based on customized criteria. For example, a database of cars might enable users to type in "1996 Toyota Corolla", or it might provide options to filter search results by make, model and year.

Update
The update function is used to modify existing records that exist in the database. To fully change a record, users may have to modify information in multiple fields. For example, a restaurant that stores recipes for menu items in a database might have a table whose attributes are "dish", "cooking time", "cost" and "price". One day, the chef decides to replace an ingredient in the dish with something different. As a result, the existing record in the database must be changed and all of the attribute values changed to reflect the characteristics of the new dish. In both SQL and Oracle HCM cloud, the update function is simply called "Update".

Delete
The delete function allows users to remove records from a database that is no longer needed. Both SQL and Oracle HCM Cloud have a delete function that allows users to delete one or more records from the database. Some relational database applications may permit users to perform either a hard delete or a soft delete. A hard delete permanently removes records from the database, while a soft delete might simply update the status of a row to indicate that it has been deleted while leaving the data present and intact.