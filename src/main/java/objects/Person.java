package objects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Person {
  public   int id;

    public Person(ResultSet resultSet) throws SQLException {
        this.id = Integer.parseInt(resultSet.getString("id"));
        this.name = resultSet.getString("name");
        this.adrees = resultSet.getString("adress");
        this.description = resultSet.getString("discription");
        this.date = resultSet.getString("date");
    }

    public Person(int id, String name, String adrees, String description, String date) {
        this.id = id;
        this.name = name;
        this.adrees = adrees;
        this.description = description;
        this.date = date;
    }

   public String name,adrees,description,date;
}
