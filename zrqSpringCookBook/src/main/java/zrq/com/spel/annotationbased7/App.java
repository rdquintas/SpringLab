package zrq.com.spel.annotationbased7;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();

		// literal expressions
		Expression exp = parser.parseExpression("'Hello World'");
		String msg1 = exp.getValue(String.class);
		System.out.println(msg1);

		// method invocation
		Expression exp2 = parser.parseExpression("'Hello World'.length()");
		int msg2 = (Integer) exp2.getValue();
		System.out.println(msg2);

		// Mathematical operators
		Expression exp3 = parser.parseExpression("100 * 2");
		int msg3 = (Integer) exp3.getValue();
		System.out.println(msg3);

		// create an item object
		Item item = new Item("ricardo", 100);
		// test EL with item object
		StandardEvaluationContext itemContext = new StandardEvaluationContext(item);

		// display the value of item.name property
		Expression exp4 = parser.parseExpression("name");
		String msg4 = exp4.getValue(itemContext, String.class);
		System.out.println(msg4);

		// test if item.name == 'mkyong'
		Expression exp5 = parser.parseExpression("name == 'mkyong'");
		boolean msg5 = exp5.getValue(itemContext, Boolean.class);
		System.out.println(msg5);

	}
}
