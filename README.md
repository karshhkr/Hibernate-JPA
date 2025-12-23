📘 Hibernate Crash Course
A beginner-friendly Java project demonstrating how to integrate Hibernate ORM with a MySQL database using Maven. This crash course covers entity mapping, configuration, and session management — perfect for interview prep or GitHub portfolio.
🚀 How to Run
1- Clone the repo
git clone https://github.com/your-username/hibernate-crash-course.git
cd hibernate-crash-course

2- Configure MySQL
- Create a database named student.
- Update hibernate.cfg.xml with your DB credentials.
- 
3- 	Build the projectt
mvn clean install

4 - Run the application
mvn exec:java -Dexec.mainClass="com.lcwd.hibernate.App"

🧠 What You'll Learn
- Hibernate configuration using XML
- Entity creation and mapping (Student.java)
- SessionFactory setup (HibernateUtil.java)
- Basic CRUD operations
- Maven dependency management

🔧 Technologies Used
Java 8             Core language
Hibernate ORM      Object-relational mapping
MySQL              Relational database
Maven              Build and dependency tool


📌 Notes
- hibernate.cfg.out.xml is an alternate config file for experimentation.
- AppTest.java is a placeholder for unit tests — feel free to expand.

