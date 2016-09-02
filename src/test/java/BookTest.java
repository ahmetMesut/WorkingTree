import com.ahmetmesut.singlesponsibility.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BookTest {
    Book book;

    @Before
    public void init(){
        book = new Book();
    }

    @Test
    public void testGetTitle(){
       assertThat(book.getTitle(),is(equalTo("A Great Book")));
    }
    @Test
    public void testGetAuthor(){
        assertThat(book.getAuthor(),is(equalTo("Author name")));
    }
}
