import java.io.File;
import java.io.IOException;

import Entity.Address;
import Entity.Person;
import Entity.Student;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

public class Test {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
        Student student = new Student();

        mapper.writeValue(new File("student.json"), student);

    }
}