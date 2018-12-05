import java.rmi.*;

public interface FileDownloadInterface extends Remote {
 public byte [] getFileFromServer(String fileName) throws Exception;
}
