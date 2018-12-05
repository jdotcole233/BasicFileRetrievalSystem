
import java.rmi.server.*;
import java.io.*;
import java.util.*;

public class FileDownloadImplementation extends UnicastRemoteObject implements FileDownloadInterface {

  //String filePath = "/Users/block/Desktop/Third Year/Distributed Systems - Dr.Govindha/RMIfolder/courseWork/courseWork1";
  String filePath = "C:\\Users\\Bhra Khoby\\Desktop\\BasicFileRetrievalSystem";

    public FileDownloadImplementation () throws Exception{
    super();
    }

    /*
    * Arguments: String fileName
    * return type: byte []
    * Reads the file name, opens the
    * file input stream, copies the data into
    * a byte array
    */
    public byte [] getFileFromServer(String fileName) throws Exception {
        File createFile = new File(filePath + "/" + fileName);

        FileInputStream fileinputcheck = new FileInputStream(createFile);
        byte[] filebytes = new byte[1024*1024]; //set byte array size to the bytes available in the file

        int size_read;
          while((size_read = fileinputcheck.read()) != -1){ //keep reading bytes of data until there is no more data to be read
          System.out.println("Transfering " + fileName + " From " + filePath);
          fileinputcheck.read(filebytes); //read bytes from input channel into the bytes array
          }
        System.out.println("Transfer completed ");
        return filebytes;
    }
}
