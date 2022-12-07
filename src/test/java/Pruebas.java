import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pruebas {
    @Test
    public void testPalabraMasLarga() {
        Editor ed = new Editor();
        ed.cargarEditor("editor.txt");
        try {
            System.out.println(ed.palabraMasLarga());
        } catch (EmptyCollectionException e) {
            throw new RuntimeException(e);
        }
    }
}
