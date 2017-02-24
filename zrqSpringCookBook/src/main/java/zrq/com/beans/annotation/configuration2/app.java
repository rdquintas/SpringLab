package zrq.com.beans.annotation.configuration2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class app {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

		TextEditor te = ctx.getBean(TextEditor.class);

		te.spellCheck();
	}
}