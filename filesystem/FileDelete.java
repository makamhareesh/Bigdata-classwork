import java.net.URI;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
public class FileDelete {

public static void main(String args[]) throws Exception{

    String uri = args[0];
    Configuration conf = new Configuration();
    FileSystem fs = FileSystem.get(URI.create(uri), conf);
try{
   fs.delete(new Path(uri), false); 
    }
finally{}

}

}
