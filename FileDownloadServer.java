import java.rmi.*;
import java.rmi.registry.*;

public class FileDownloadServer{

  public static void main(String[] args) throws Exception {
    FileDownloadImplementation download = new FileDownloadImplementation(); //Object of type FileDownloadImplementation
    Registry startRegistry = LocateRegistry.createRegistry(1099); //Open registry for available ports
    Naming.rebind("DownloadFile", download); // bind object in the registry
    System.out.println("Server started successfully!!..");
  }
}
