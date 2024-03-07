package record;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;

class PlayWithRecord {

    private static final Logger LOGGER = Logger.getLogger(PlayWithRecord.class.getName());

    record Range(int begin, int end) implements Serializable {

        //Compact constructor. Useful during validation.
        Range {
            if (begin > end) {
                throw new IllegalStateException("End must be grater than begin");
            }
        }

//        You cannot create record without calling its canonical constructor.
//        Range(int end) {
//            this.begin = 0;
//            this.end = end;

//        It works!
//            Instead:
//            this(0, end);
//        }
    }

    void serializeRecord() {
        var recordRecord = new Range(20, 0);

        try(var outputStream = Files.newOutputStream(Path.of("files/range.dat"));
            var objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(recordRecord);
        } catch (IOException ex) {
            LOGGER.info("Exception: " + ex.getMessage());
        }
    }

    void deserialize() throws IOException, ClassNotFoundException {
        Object rangeRecord;

        try (var inputStream = Files.newInputStream(Path.of("files/range.dat"));
            var objectInputStream = new ObjectInputStream(inputStream)) {
            rangeRecord = objectInputStream.readObject();
            }
        LOGGER.info("Range record: " + rangeRecord);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Comment deserialize method and validation rules during serialization.
        new PlayWithRecord().serializeRecord();

        //Uncomment validation rules and comment serialization method.
        new PlayWithRecord().deserialize();
    }
}
