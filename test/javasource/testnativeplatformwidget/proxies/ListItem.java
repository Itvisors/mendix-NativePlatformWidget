// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testnativeplatformwidget.proxies;

public class ListItem implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject listItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestNativePlatformWidget.ListItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ShowItems("ShowItems"),
		AllowEdit("AllowEdit"),
		Text1("Text1");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ListItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ListItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject listItemMendixObject)
	{
		if (listItemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!listItemMendixObject.isInstanceOf(entityName)) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.listItemMendixObject = listItemMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static testnativeplatformwidget.proxies.ListItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testnativeplatformwidget.proxies.ListItem(context, mendixObject);
	}

	public static testnativeplatformwidget.proxies.ListItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testnativeplatformwidget.proxies.ListItem.initialize(context, mendixObject);
	}

	public static java.util.List<testnativeplatformwidget.proxies.ListItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> testnativeplatformwidget.proxies.ListItem.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of ShowItems
	 */
	public final java.lang.Boolean getShowItems()
	{
		return getShowItems(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowItems
	 */
	public final java.lang.Boolean getShowItems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowItems.toString());
	}

	/**
	 * Set value of ShowItems
	 * @param showitems
	 */
	public final void setShowItems(java.lang.Boolean showitems)
	{
		setShowItems(getContext(), showitems);
	}

	/**
	 * Set value of ShowItems
	 * @param context
	 * @param showitems
	 */
	public final void setShowItems(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showitems)
	{
		getMendixObject().setValue(context, MemberNames.ShowItems.toString(), showitems);
	}

	/**
	 * @return value of AllowEdit
	 */
	public final java.lang.Boolean getAllowEdit()
	{
		return getAllowEdit(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowEdit
	 */
	public final java.lang.Boolean getAllowEdit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AllowEdit.toString());
	}

	/**
	 * Set value of AllowEdit
	 * @param allowedit
	 */
	public final void setAllowEdit(java.lang.Boolean allowedit)
	{
		setAllowEdit(getContext(), allowedit);
	}

	/**
	 * Set value of AllowEdit
	 * @param context
	 * @param allowedit
	 */
	public final void setAllowEdit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean allowedit)
	{
		getMendixObject().setValue(context, MemberNames.AllowEdit.toString(), allowedit);
	}

	/**
	 * @return value of Text1
	 */
	public final java.lang.String getText1()
	{
		return getText1(getContext());
	}

	/**
	 * @param context
	 * @return value of Text1
	 */
	public final java.lang.String getText1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text1.toString());
	}

	/**
	 * Set value of Text1
	 * @param text1
	 */
	public final void setText1(java.lang.String text1)
	{
		setText1(getContext(), text1);
	}

	/**
	 * Set value of Text1
	 * @param context
	 * @param text1
	 */
	public final void setText1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text1)
	{
		getMendixObject().setValue(context, MemberNames.Text1.toString(), text1);
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return listItemMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testnativeplatformwidget.proxies.ListItem that = (testnativeplatformwidget.proxies.ListItem) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
