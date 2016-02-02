import java.io.IOException;
import java.util.Scanner;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class UnigramMapper extends Mapper<NullWritable, BytesWritable, Text, IntWritable> {
	
	Text authorName;

	public void map(NullWritable nullKey, Text fileText, Context context)
			throws IOException, InterruptedException {
		
		fileText.toString().split("");

		//parse file header
		
		//clean up words
		
		//create key value pairs
		
	}

}
