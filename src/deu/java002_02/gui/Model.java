package deu.java002_02.gui;

import java.util.ArrayList;

public class Model
{
	private ArrayList<View> m_registeredViews;

	public Model(View _view)
	{
		m_registeredViews = new ArrayList<View>();
		m_registeredViews.add(_view);
	}

	public void registerView(View _view)
	{
		if(m_registeredViews.contains(_view))
			return;
		
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
		return m_registeredViews.size();
	}
}
