public class Item {
    
private int location;
private String description;

public  Item(int l, String  des){

    this.location=l;
    this.description= des;
}

public int getLocation()
{
    return location;
}
public void setLocation(int newLocation)
{
    this.location=newLocation;
}
public String getDescription(){
    return  this.description;
}
public void setDescription(String newDescription){
    this.description= newDescription;
}
 }

