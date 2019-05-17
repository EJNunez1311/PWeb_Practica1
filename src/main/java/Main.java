import org.jsoup.Jsoup;
import java.util.Scanner;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

        public class Main {
            public static void main(String[] args) throws IOException {
                System.out.println("Hola Mundo Java");
                Scanner scanner = new Scanner(System.in);
                char op;
                Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
                log(doc.title());
                Elements newsHeadlines = doc.select("#mp-itn b a");
                for (Element headline : newsHeadlines) {
                    log("%s\n\t%s",
                            headline.attr("title"), headline.absUrl("href"));
                }

            }

            private static void log(String msg, String... vals) {
                System.out.println(String.format(msg, vals));
            }
        }
