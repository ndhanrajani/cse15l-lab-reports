import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;

    public String handleRequest(URI url) {
        System.out.println(url);
        if (url.getPath().equals("/")) {
            return String.format("Search: %d", num);
        } else if (url.getPath().equals("/")) {
            num += 1;
            return String.format("Search completed!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("count")) {
                    num += Integer.parseInt(parameters[1]);
                    return String.format("A new search was added by %s! A total of %d searches have been done!", parameters[1], num);
                }
            }
            return "Oops! Something went wrong. Please try again.";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("That is not a valid search.");
            return;
        }

        if(args[0].equals("20")){
            System.out.println("Something went wrong. Please try again.");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
