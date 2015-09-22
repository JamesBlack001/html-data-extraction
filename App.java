import java.io.DataInputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class App{
	public static void main(String[] args) throws Exception{
		String html = "", tmp = "";

		if (args.length == 0 ){
			System.out.println("must enter some data as an argument");
		}
		else{
			URL url;
			for (String item : args) {
				url = new URL(item);
	    	URLConnection urlConnection = url.openConnection();
	    	DataInputStream dis = new DataInputStream(urlConnection.getInputStream());
	    	
	    	tmp = dis.readUTF();
	    	html += tmp;
	    	dis.close();
			}
			
	    //

	    html = html.replaceAll("\\s+", " ");//gets rid of unneccesary whitespace
	    Pattern p = Pattern.compile("<title>(.*?)</title>");
	    Matcher m = p.matcher(html);
	    while (m.find() == true) {
	      System.out.println(m.group(1));
	    }
	    Pattern p2 = Pattern.compile("<meta name=\"description\" content=\"(.*?)\"");
	    Matcher m2 = p2.matcher(html);
	    while (m2.find() == true) {
	    	if(m2.group(1).compareTo("") == 0){
	    		System.out.println("This content is empty");
	    	}
	    	else{
	    		System.out.println(m2.group(1));
	    	}
	    }
		  for (String item : args) {
		  	url = new URL(item);
		  	
		  	String host = url.getHost();
		    
		    Pattern p3 = Pattern.compile(item);
		    Matcher m3 = p3.matcher(html);

		    while (m3.find() == true) {
		    	if(m3.group(1).compareTo("") == 0){
		    		System.out.println("This content is empty");
		    	}
		    	else{
		    		System.out.println("This content is NOT empty");
		    		//System.out.println(m2.group(1));
		    	}
	    	}

	    	Pattern p4 = Pattern.compile(host);
		    Matcher m4 = p4.matcher(html);

		    while (m4.find() == true) {
		    	if(m4.group(1).compareTo("") == 0){
		    		System.out.println("This content is empty");
		    	}
		    	else{
		    		System.out.println("This content is NOT empty");
		    		//System.out.println(m2.group(1));
		    	}
	    	}


	    	Pattern p5 = Pattern.compile("java.com");
		    Matcher m5 = p5.matcher(html);

		    while (m5.find() == true) {
		    	if(m5.group(0).compareTo("") == 0){
		    		System.out.println("This content is empty");
		    	}
		    	else{
		    		System.out.println("This content is NOT empty");
		    		System.out.println(m5.group(0));
		    	}
	    	}

	    	



		    
	    }
	    //System.out.println(html);

		}

		/*int i = 0;
		while(args.length != 0 && i < args.length ){
			System.out.println(args[i]);
			i++;
		}	
		*/	
	}
	/**
	 * [makeConnection description]
	 * @param  url the url of the site to get html for
	 * @return the HTML for the site
	 */
	public static void getHTML(String stringUrl){

		//System.out.println(url);
		
    //
/*
    DataInputStream stream = new DataInputStream(urlConnection.getInputStream());
    String html = "", tmp = "";
    while ((tmp = stream.readUTF()) != null) {
      html += " " + tmp;
    }
    stream.close();
    */
   return;
    
	}
}

// request data from the URL,
// parse the data,
// display the information to the user