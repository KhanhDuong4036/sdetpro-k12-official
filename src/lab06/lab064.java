package lab06;

import java.util.Arrays;

public class lab064 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String[] urlSplit = url.split("://");
        String domain = urlSplit[1];
        System.out.println("is https: " + urlSplit[0].equals("https"));
        String domainName = domain.substring(0, 6);
        System.out.println(domainName);
        String urlWithoutProtocol = url.replaceFirst("https://", "");
        String[] parts = urlWithoutProtocol.split("\\.");
        if (parts.length >= 2) {
            String topLevelDomain = parts[parts.length - 1];
            System.out.println("Top level Domain: " + topLevelDomain);
        }
    }
}
