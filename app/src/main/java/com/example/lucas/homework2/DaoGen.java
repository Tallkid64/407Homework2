package com.example.lucas.homework2;

/**
 * Created by Lucas on 3/11/2016.
 */
import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;


public class DaoGen {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.example.lucas.homework2"); //Scheme for GreenDAO ORM
        createDB(schema);
        new DaoGenerator().generateAll(schema, "./app/src/main/java/");
        //where you want to store the generated classes.
    }

    private static void createDB(Schema schema) {

        //Events
        Entity event = schema.addEntity("Event");
        event.addIdProperty();
        event.addStringProperty("name");
        event.addStringProperty("location");
        event.addStringProperty("startTime");
        event.addStringProperty("endTime");
        event.addStringProperty("date");
        event.addBooleanProperty("display");

    }

}