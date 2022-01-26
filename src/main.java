import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC","8 GB","1 TB","3.6 GHz");
		Computer server = ComputerFactory.getComputer("SERVER","4 GB","250 GB","2 GHz");
		System.out.println("***Factory pattern functionality**********");
		System.out.println("Factory PC Configration: "+pc);
		System.out.println("Factory Server Configration: "+server);
		System.out.println("******************************************");
		
		   SerializableSingleton serializablesingleton1  = SerializableSingleton.getInstance();

	        try {
	            // Serialize singleton object to a file.
	            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
	            out.writeObject(serializablesingleton1);
	            out.close();

	            // Deserialize singleton object from the file
	            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
	            SerializableSingleton serializablesingleton2 = (SerializableSingleton) in.readObject();
	            in.close();
	            System.out.println("***Singleton pattern functionality********");
	            System.out.println("hashCode1: " + serializablesingleton1.hashCode());
	            System.out.println("hashCode2: " + serializablesingleton2.hashCode());
	            System.out.println("******************************************");
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        }
		
	}

}