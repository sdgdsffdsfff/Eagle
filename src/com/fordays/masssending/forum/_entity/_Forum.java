package com.fordays.masssending.forum._entity;



/**
 * Forum generated by hbm2java
 */


public class _Forum 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected long id;
     protected String name;
     protected String loginSite;
     protected Long loginPort;
     protected Long status;
     protected java.util.Set sections = new java.util.HashSet(0);
     protected java.util.Set accounts = new java.util.HashSet(0);

     // Constructors
   
    // Property accessors


    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    


    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    


    public String getLoginSite() {
        return this.loginSite;
    }
    
    public void setLoginSite(String loginSite) {
        this.loginSite = loginSite;
    }
    


    public Long getLoginPort() {
        return this.loginPort;
    }
    
    public void setLoginPort(Long loginPort) {
        this.loginPort = loginPort;
    }
    


    public Long getStatus() {
        return this.status;
    }
    
    public void setStatus(Long status) {
        this.status = status;
    }
    


    public java.util.Set getSections() {
        return this.sections;
    }
    
    public void setSections(java.util.Set sections) {
        this.sections = sections;
    }
    


    public java.util.Set getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(java.util.Set accounts) {
        this.accounts = accounts;
    }
    




  // The following is extra code specified in the hbm.xml files

  public Object clone()
  {
    Object o = null;
    try
    {
      o = super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return o;
}

private String thisAction="";
 public String getThisAction()
 {
     return thisAction;
 }


public void setThisAction(String thisAction)
 {
     this.thisAction=thisAction;
 }

private int index=0;
 public int getIndex()
 {
     return index;
 }


public void setIndex(int index)
 {
     this.index=index;
 }
 





  // end of extra code specified in the hbm.xml files


}


