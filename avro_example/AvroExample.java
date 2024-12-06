
import org.apache.avro.file.DataFileWriter;

import org.apache.avro.generic.GenericDatumWriter;

import org.apache.avro.io.DatumWriter;

import org.apache.avro.specific.SpecificDatumWriter;

import org.javacodegeeks.avro.User;

import java.io.*;

public class AvroExample {

 public static void main(String[] args) {

 User user = new User();

 user.setId(1);

 user.setName("John Doe");

 user.setEmail("john.doe@example.com");

 DatumWriter<User> userDatumWriter = new SpecificDatumWriter<>(User.class);

 try (DataFileWriter<User> dataFileWriter = new DataFileWriter<>(userDatumWriter)) {

 dataFileWriter.create(user.getSchema(), new File("users.avro"));

 dataFileWriter.append(user);

 } catch (IOException e) {

 e.printStackTrace();

 }

 }

}
