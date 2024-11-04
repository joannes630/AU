class URL {
    private class Node {
        String url;
        Node prev;
        Node next;

        Node(String url) {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }

    private Node current;

    // Visit a new page (adds it to the history)
    public void visit(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode; // Move current pointer to the new page
    }

    // Go back in history
    public String goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.url;
        }
        return "No previous page"; // Already at the beginning of the history
    }

    // Go forward in history
    public String goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.url;
        }
        return "No next page"; // Already at the end of the history
    }

    // Get the current page
    public String getCurrentPage() {
        return current != null ? current.url : "No pages in history";
    }
}

public class UrlList {
    public static void main(String[] args) {
        URL url = new URL();
        
        url.visit("www.yahoo.com");
        url.visit("www.cnn.com");
        url.visit("www.twitter.com");
        
        System.out.println(url.getCurrentPage());
        System.out.println(url.goBack());
        System.out.println(url.goBack());
        System.out.println(url.goForward());
    }
}
