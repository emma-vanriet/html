package html_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HtmlTest {

	@Test
	void test() {
		Node html = new Node(null, "html");
		Node head = new Node(null, "head");
		Node title = new Node(null, "title");
		Node titleText = new Node("JLearner", null);
		html.addChild(head);
		head.addChild(title);
		title.addChild(titleText);
		Node script = new Node("script", null);
		head.addChild(script);
//		head.removeChild(script);
		script.remove();
		head.addChild(script);
		Node scriptText = new Node(null, "alert('Hello world!'");
		script.addChild(scriptText);
		Node nonsense = new Node("nonsense", null);
		head.addChild(nonsense);
//		head.removeChild(nonsense);
		nonsense.remove();
		
		
		
		Node body = new Node(null, "body");
		html.addChild(body);
		Node h1 = new Node(null, "h1");
		Node h1Text = new Node("JLearner", null);
		h1.addChild(h1Text);
		Node p = new Node(null, "p");
		p.addChild(new Node("Please ", null));
		Node b = new Node(null, "b");
		b.addChild(new Node("practice", null));
		p.addChild(b);
		p.addChild(new Node(".", null));
		body.addChild(h1);
		body.addChild(p);
		
//		assertEquals(
//				"<html>" +
//				"<head>" +
//				"<title>JLearner</title>" +
//				"<script>alert('Hello world!')</script>" +
//				"</head>" +
//				"</html>",
//				html.toString());
//		
	}

}
