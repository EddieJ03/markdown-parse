import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    List<String> strList;

    @Before
    public void setUpList() {
        strList = new ArrayList<>();
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        String contents = Files.readString(Path.of("test-file.md"));
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testGetLinks2() throws IOException {
        String contents = Files.readString(Path.of("test2-file.md"));
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks3() throws IOException {
        String contents = Files.readString(Path.of("test3-file.md"));
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("https://hello.com"));
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("test4-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }
}

