package deu.java002_02.gui;

import java.util.Iterator;
import java.util.Vector;

public abstract class Model
{
	/*
	 *  NOTE:
	 *  참조카운터 역할을 수행하는 View 벡터입니다.
	 */
	private boolean m_started;
	private Vector<View> m_registeredViews;

	public Model()
	{
		m_started = false;
		m_registeredViews = new Vector<View>();
	}

	public void registerView(View _view)
	{
		if(m_registeredViews.contains(_view))
			return;
		
		m_started = true;
		m_registeredViews.add(_view);
	}

	public void unregisterView(View _view)
	{
		if(!m_registeredViews.contains(_view))
			return;
		
		m_registeredViews.remove(_view);
	}

	public int getViewCount()
	{
		if(m_started)
			return m_registeredViews.size();
		else
			return -1;
	}

	public Iterator<View> getViewIterator()
	{
		return m_registeredViews.iterator();
	}
}
