package DMS.expenditure;
public abstract class Feed {
    public double feed;
    
    public Feed(double feed){
    this.feed = feed;
    }
    public void setFeed(double feed){
    this.feed = feed;
    }
    
    public double getFeed(){return feed;}
    
    abstract void TotalCost();
}
