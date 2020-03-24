
import java.lang.reflect.Constructor;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;
import static org.junit.Assert.*;

public class ConstructorSignature {

    public Class[] args;

    public ConstructorSignature(Class... args) {
        this.args = args;
    }

    public Constructor findIn(Class cl) {
        try {
            return ReflectionUtils.requ