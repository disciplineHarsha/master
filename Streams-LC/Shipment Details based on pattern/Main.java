import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
		List<String> lines=Collections.EMPTY_LIST;
		//lines=Files.newBufferedReader(Paths.get("in.txt"),StandardCharsets.UTF_8);
		try {
			lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);
            for(int i=0;i<lines.size();i++){
                String[] split=lines.get(i).split(",");
                Pattern p=Pattern.compile(".*(5)(5).*(5)(5)");
                
                if(p.matcher(split[1]).find()){
                    System.out.println(split[0]);
                }
            }
            
			
		}
        catch(Exception e){
            e.printStackTrace();
        }
		
		
		

	}

}
