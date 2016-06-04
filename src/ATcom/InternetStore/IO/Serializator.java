package ATcom.InternetStore.IO;

import ATcom.InternetStore.DataBaseCore.Laptop;

import java.io.*;
import java.util.List;

/**
 * Created by Gwindblaid on 03.06.2016.
 */
public class Serializator {

	public void serializator(List data) {
		String filePath = "C:\\Users\\Gwindblaid\\Desktop\\CourseProject\\files\\File.data";
		File file = new File(filePath);
		ObjectOutputStream outstream = null;
		try {
			FileOutputStream fos = new FileOutputStream(file);
			if (fos != null) {
				outstream = new ObjectOutputStream(fos);
				outstream.writeObject(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (NotSerializableException e) {
			System.out.println("Class doesn't support serialization");
		} catch (IOException e) {
			System.err.println("e");
		} finally {
			try {
				if (outstream != null) {
					outstream.close();
				}
			} catch (IOException e) {
				System.err.println("Stream closer error");
			}
		}
	}

	public List<Laptop> deserializator() throws InvalidObjectException {
		String filePath = "C:\\Users\\Gwindblaid\\Desktop\\CourseProject\\files\\File.data";
		File file = new File(filePath);
		ObjectInputStream objectInputStream = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			List<Laptop>  data = (List<Laptop>) objectInputStream.readObject();
			return data;
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found");
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				if (objectInputStream != null) {
					objectInputStream.close();
				}
			} catch (IOException e) {
				System.err.println("Stream closed error");
			}
		}
		throw new InvalidObjectException("Object doesn't be restore");
	}
}
