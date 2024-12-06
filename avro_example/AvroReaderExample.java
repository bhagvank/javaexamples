import org.apache.avro.file.DataFileReader;

import org.apache.avro.generic.GenericDatumReader;

import org.apache.avro.io.DatumReader;

import org.apache.avro.specific.SpecificDatumReader;

import org.javacodegeeks.avro.User;

import java.io.*;

public class AvroReaderExample {

 public static void main(String[] args) {

 File file = new File("users.avro");

 DatumReader<User> userDatumReader = new SpecificDatumReader<User>(User.class);

 try (DataFileReader<User> dataFileReader = new DataFileReader(file, userDatumReader)) {

 User user = null;

 while (dataFileReader.hasNext()) {

 user  = dataFileReader.next(user);

 System.out.println(user);

 }

 } catch (IOException e) {

 e.printStackTrace();

 }

 }
}
