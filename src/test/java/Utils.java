import java.lang.reflect.Field;

public class Utils {
    public static Object getFieldValue(String fieldName, Object objectName){
        Field defaultColorField = null;
        try {
            defaultColorField = objectName.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        defaultColorField.setAccessible(true);
        Object desiredValue = null;
        try {
            desiredValue = defaultColorField.get(objectName);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return desiredValue;
    }
}
