package it.csi.fpabil.fpabilbl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ListUtil {
	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE);

	

	public static<T> List<T> asList(T[] v) {
		if(v != null) {
			return Arrays.asList(v);
		}
		else
			return null;
	}


	@SuppressWarnings("unchecked")
	public static<T> List<T>  add(T[] v, T t) throws Exception{
		final String method = "add";
		Tracer.debug(LOG, ListUtil.class.getName(), method, "");
		if( t== null)
			throw new Exception("You cannot add null element");
		List<T> l = new ArrayList<T>();
		if(v != null) {
			for(T o : v) {
				Tracer.debug(LOG, ListUtil.class.getName(), method, "add old object " + o);
				l.add(o);
			}
		}
		l.add(t);
		Tracer.debug(LOG, ListUtil.class.getName(), method, "add new object " + t);
		Tracer.debug(LOG, ListUtil.class.getName(), method, "list size= " + l.size());
		
		return l;
	}
	
	public static<T> List<T> cloneAsList(T[] v) {
		List<T> l = null;
		if(v != null) {
			l = new ArrayList<T>();
			for(T e : v ) {
				l.add(e);
			}
		}
		return l;
	}
	
	
	public static<T> List<T>  add(List<T> v, T t) throws Exception{
		final String method = "add";
		Tracer.debug(LOG, ListUtil.class.getName(), method, "");
		if( t== null)
			throw new Exception("You cannot add null element");
		List<T> l = new ArrayList<T>();
		if(v != null) {
			for(T o : v) {
				Tracer.debug(LOG, ListUtil.class.getName(), method, "add old object " + o);
				l.add(o);
			}
		}
		l.add(t);
		Tracer.debug(LOG, ListUtil.class.getName(), method, "add new object " + t);
		Tracer.debug(LOG, ListUtil.class.getName(), method, "list size= " + l.size());
		return l;
	}


}
