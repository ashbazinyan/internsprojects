<%@page import="java.util.Map"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.HashMap"%>

<%!

public Map<String, String> getCurrencyCode(){

	Map<String, String> dataMap = new TreeMap<String,String>();
	
	dataMap.put("NULL","");
	dataMap.put("032","032");
	dataMap.put("036","036");
	dataMap.put("116","116");
	dataMap.put("124","124");
	dataMap.put("203","203");
	dataMap.put("208","208");
	dataMap.put("348","348");
	dataMap.put("356","356");
	dataMap.put("392","392");
	dataMap.put("410","410");
	dataMap.put("428","428");
	dataMap.put("440 ","440");
	dataMap.put("484","484");
	dataMap.put("554","554");
	dataMap.put("578","578");
	dataMap.put("643","643");
	dataMap.put("702","702");
	dataMap.put("710","710"); 
	dataMap.put("752","752");
	dataMap.put("756","756");
	dataMap.put("826","826");
	dataMap.put("840","840");
	dataMap.put("901","901");
	dataMap.put("949","949"); 
	dataMap.put("978","978");
	dataMap.put("985","985");
	dataMap.put("986","986");
	dataMap.put("BAD VALUE","999");
	
	return dataMap;
}

public Map<String, String> getCustomerLanguage() {

	Map<String, String> dataMap =  new TreeMap<String,String>();
	
	dataMap.put("NULL","");
	dataMap.put("bg","bg");
	dataMap.put("br","br");
	dataMap.put("ca","ca");
	dataMap.put("co","co");
	dataMap.put("cs","cs");
	dataMap.put("cy","cy");
	dataMap.put("cs","cs");
	dataMap.put("da","da");
	dataMap.put("de","de");
	dataMap.put("el","el");
	dataMap.put("en","en");
	dataMap.put("es","es");
	dataMap.put("eu","eu");
	dataMap.put("fi","fi");
	dataMap.put("fo","fo");
	dataMap.put("fr","fr");
	dataMap.put("ga","ga");
	dataMap.put("gd","gd");
	dataMap.put("gl","gl");
	dataMap.put("hi","hi");
	dataMap.put("hu","hu");
	dataMap.put("it","it");
	dataMap.put("ja","ja");
	dataMap.put("ko","ko");
	dataMap.put("nl","nl");
	dataMap.put("no","no");
	dataMap.put("oc","oc");
	dataMap.put("pl","pl");
	dataMap.put("pt","pt");
	dataMap.put("ro","ro");
	dataMap.put("ru","ru");
	dataMap.put("sk","sk");
	dataMap.put("sv","sv");
	dataMap.put("zh","zh");
	dataMap.put("BAD VALUE","xx");
		
	return new TreeMap<String, String>(dataMap);
}
%>

<%
request.setAttribute("currencyCodeList", getCurrencyCode());
request.setAttribute("customerLanguageList", getCustomerLanguage());
%>