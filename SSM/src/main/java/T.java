import org.junit.jupiter.api.Test;
import service.BookService;
import utils.SpringUtils;

/**
 * @author by pepsi-wyl
 * @date 2022-03-02 20:27
 */

public class T {

    @Test
    public void t() {
//        System.out.println(SpringUtils.getApplicationContext().getBean("bookMapper", BookMapper.class).getBookList());
        System.out.println(SpringUtils.getApplicationContext().getBean("bookService", BookService.class).getBookList());
    }

}
