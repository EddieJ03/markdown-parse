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
        System.out.println("test-file.md");
        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testGetLinks2() throws IOException {
        String contents = Files.readString(Path.of("test-file2.md"));
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file2.md");
        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testGetLinks3() throws IOException {
        String contents = Files.readString(Path.of("test-file3.md"));
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file3.md");
        assertEquals(this.strList, List.of());
    }
    

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file4.md");
        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file5.md");
        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks6() throws IOException {
        String contents = Files.readString(Path.of("test-file6.md"));
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file6.md");
        assertEquals(this.strList, List.of("page.com"));
    }

    @Test
    public void testGetLinks7() throws IOException {
        String contents = Files.readString(Path.of("test-file7.md"));
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file7.md");
        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);
        System.out.println("test-file8.md");
        assertEquals(this.strList, List.of());
    }

    @Test
    public void testBadCase() throws IOException {
        Path fileName = Path.of("test-bad-case.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);
        assertEquals(this.strList, List.of());
    }

    @Test
    public void snippet1() throws IOException {
        Path fileName = Path.of("snippet1.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);
        assertEquals(this.strList, List.of("`google.com", "google.com", "ucsd.edu"));
    }

    // @Test
    // public void snippet2() throws IOException {
    //     Path fileName = Path.of("snippet2.md");
    //     String contents = Files.readString(fileName);
    //     ArrayList<String> strList = MarkdownParse.getLinks(contents);
    //     assertEquals(strList, List.of("a.com", "a.com(())", "example.com"));
    // }

    // @Test
    // public void snippet3() throws IOException {
    //     Path fileName = Path.of("snippet3.md");
    //     String contents = Files.readString(fileName);
    //     ArrayList<String> strList = MarkdownParse.getLinks(contents);
    //     assertEquals(strList, List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"));
    // }
}

