package html_ir;

public class Node {
	
	private String tag;
	private String text;
	private Node firstChild;
	private Node lastChild;
	private Node nextSibling;
	private Node PreviousSibling;
	private Node parent;

	public Node(String tag, String text) {
		this.tag = tag;
		this.text = text;
	}
	
	public void addChild(Node child) {
		if (firstChild != null) {
			lastChild.nextSibling = child;
			child.PreviousSibling = lastChild;
			lastChild = child;
		} else {
			firstChild = child;
			lastChild = child;
		}
		child.parent = this;
//			Node nextChild = firstChild;
//			while (nextChild.nextSibling != null)
//				nextChild = nextChild.nextSibling;
//			nextChild.nextSibling = child;
//		} else {
//			firstChild = child;

		
	}
	
	public void removeChild(Node child) {
		if (child.PreviousSibling != null)
			child.PreviousSibling.nextSibling = child.nextSibling;

		else 
			firstChild = child.nextSibling;
		if (child.nextSibling != null)
			child.nextSibling.PreviousSibling = child.PreviousSibling;
		else
			lastChild = child.PreviousSibling;
		child.nextSibling = null;
		child.PreviousSibling = null;
		child.parent = null;
//		if (firstChild == child) {
//			firstChild = firstChild.nextSibling;
//			if (firstChild == null)
//				lastChild = null;
//			Node currentChild = firstChild;
//			while (currentChild.nextSibling != child)
//				currentChild = currentChild.nextSibling;
//			if (currentChild.nextSibling.nextSibling == null)
//				lastChild = currentChild;
//			currentChild.nextSibling = currentChild.nextSibling.nextSibling;

	}
	
	public void remove() {
		if (parent != null)
			parent.removeChild(this);
	}
	
	
	public String toString() {
		if (text != null)
			return text;
		String result = "<" + tag + ">";
		Node child = firstChild;
		while (child != null) {
			result += child.toString();
			child = child.nextSibling;
		}
		result += "</" + tag + ">";
		return result;
	}

}
