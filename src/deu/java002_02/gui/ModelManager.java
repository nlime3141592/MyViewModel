package deu.java002_02.gui;

import java.util.HashMap;

public class ModelManager
{
	private static ModelManager s_m_manager;
	
	public static ModelManager getInstance()
	{
		if(s_m_manager == null)
			s_m_manager = new ModelManager();
		
		return s_m_manager;
	}
	
	private ModelManager()
	{
		m_modelMap = new HashMap<String, Model>();
	}
	
	private HashMap<String, Model> m_modelMap;

	public Model getModel(String _modelClassName)
	{
		if(!m_modelMap.containsKey(_modelClassName))
			return null;
	
		Model model = m_modelMap.get(_modelClassName);
		return model;
	}

	public boolean addModel(String _modelClassName, Model _model)
	{
		if(m_modelMap.containsKey(_modelClassName))
			return false;

		m_modelMap.put(_modelClassName, _model);
		return true;
	}
}
