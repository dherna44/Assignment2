public class Student {
    String Fname;
    String LName;
    int id;
    String classYr;
    String eMail;
    String Address;
    String[] classStanding;

    public Student(String FNAME, String LNAME, int ID, String ClassYr, String EMAIL, String ADDRESS){ //use this.Fname etc for displayInfo()
        this.Fname = FNAME;
        this.LName = LNAME;
        this.id = ID;
        this.classYr = ClassYr;
        this.eMail = EMAIL;
        this.Address = ADDRESS;

        classStanding = new String[4];
    }

    public void setFname(String newFname)
    {
         this.Fname = newFname ;
    }

    public String getFname(){
        return this.Fname;
    }

    public void setLname(String newLname){
        this.LName = newLname;
    }

    public String getLName(){
        return this.LName;
    }


    public void setID(int iD){
        this.id = iD;
    }

    public int getID(){
        return id;
    }

    public void setClassYr(int place, String classYear){
        classStanding[place-1]=classYear;
    }

    public String getClassYr(int place){
        if(classStanding[place - 1]== null){
            return "Invalid Standing";
        }
        else {
            return classStanding[place-1];
        }
    }

    public void setEmail(String EMAIL){
        this.eMail = EMAIL;
    }

    public String getEMail(){
        return this.eMail;
    }

    public void setAddress(String ADDRESS){
        this.Address = ADDRESS;
    }

    public String getAddress(){
        return this.Address;
    }

    public String getClassStanding(){
        String getClassStanding = "Student Info: ";
        for (int index = 0; index < classStanding.length; index++){
            getClassStanding = getClassStanding + "Class Standing: "+(index+1);
        }
        return getClassStanding;
    }
    public void setVals(String Fname, String Lname, int id, String classYr, String eMail, String Address){
        this.Fname = Fname;
        this.LName = Lname;
        this.id = id;
        this.classYr = classYr;
        this.eMail = eMail;
        this.Address = Address;

    }
    public String getVals(){
        return ("First Name: "+this.getFname()+"\nLast Name: " +this.getLName()+ "\nPeopleSoftID: "+this.getID()+"" +
                "\nClass Standing: "+ this.getClassStanding()+"\nEmail"+ this.getEMail()+ "\nAddress: "+ this.getAddress());
    }





}


