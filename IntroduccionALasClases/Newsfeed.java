package newsfeed;
public class Newsfeed {
    String[] trendingArticles;
    int[] views;
    double[] ratings;
    
public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
trendingArticles=initialArticles;
views=initialViews;
ratings=initialRatings;
}

public String getTopArticles(){
return trendingArticles[0];
}

public void viewArticles(int articleNumber){
views[articleNumber]=views[articleNumber]+1;
System.out.println("The article '"+trendingArticles[articleNumber]+"' has now been viewed '"+views[articleNumber]+"' times");
}

public void changeRating(int articleNumber, double newRating){
if(newRating>5 || newRating<0){
System.out.println("The rating must be between 0 and 5 stars");
}
else{
ratings[articleNumber]=newRating;
System.out.println("The article '"+trendingArticles[articleNumber]+"' is now rated "+ratings[articleNumber]+" stars");
}
    }
    public static void main(String[] args) {
    String[] robotArticles={"Oil New","Innovative Motors","Humans:Exterminate Or Not?","Organic Eye Implants","Path Finding in an Unknown World"};
    int[] robotViewers={87,32,13,11,7};
    double[] robotRatings={2.5,3.2,5.0,1.7,4.3};
    Newsfeed robotTimes= new Newsfeed(robotArticles, robotViewers, robotRatings);
    
    robotTimes.viewArticles(2);
    robotTimes.viewArticles(3);
    System.out.println("The top article is "+robotTimes.getTopArticles());
    robotTimes.changeRating(3, 5);
    }

}
