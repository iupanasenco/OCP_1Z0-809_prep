package IO_NIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Model> models = new ArrayList<>();

    static {
        models.add(new Model(1L, "first model", Arrays.asList("blue", "beautiful")));
        models.add(new Model(2L, "second model", Arrays.asList("red", "ugly")));
    }

    public static void writeModelsToFile (File outFile) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new BufferedOutputStream( new FileOutputStream("src/IO_NIO/out.txt")))){
            for (Model model:
                    models) {
                objectOutputStream.writeObject(model);
            }
        }
        catch (IOException ioException){
            System.out.println("Object not written");
        }
    }

    public static List<Model> readModelsFromFile(File dataFile) {

        List<Model> models = new ArrayList<>();


        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream(dataFile)))
        {
            while (true){
                Object object = objectInputStream.readObject();
                models.add((Model)object);
            }
        }
        catch (IOException | ClassNotFoundException ioException){

        }
        return models;

    }

    public static void main(String[] args) {

        writeModelsToFile(new File("src/IO_NIO/out.txt"));
        System.out.println(readModelsFromFile(new File("src/IO_NIO/out.txt")));

    }

}
