package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

public class AcountResulMessage {
    public static Question<List<String>> titles() {
        return actor -> TextContent.of(AccountResult.MESSAGE).viewedBy(actor).asList();
    }
}
